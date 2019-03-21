package ro.repository.java;

import ro.model.java.Fereastra;
import ro.model.java.Perete;
import ro.model.java.Strat;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StratRepository {
    List<Perete> pereteList = new ArrayList<>();

    public StratRepository(List<Perete> pereteList) {
        this.pereteList = pereteList;
    }

    public Strat findOne(int idPerete, int idStrat) throws FileNotFoundException, IOException {
        for(Perete per : pereteList){
            if(per.getId()==idPerete){
                for(Strat str :per.getListaStraturi()){
                    if(str.getId()==idStrat){
                        return str;
                    }
                }
            }
        }
        return null;
    }


    public Strat save(Strat entity) throws FileNotFoundException, IOException {
        int i = 0;
        for(int j=0;j<pereteList.size();j++){

            if(pereteList.get(j).getId()==entity.getId()){
                i=j;
                if(pereteList.get(i).getListaStraturi()!=null){
                    for(int l=0;l<pereteList.get(j).getListaStraturi().size();l++)
                        if(pereteList.get(j).getListaStraturi().get(l).getId()==entity.getId())
                            return entity;
                }
            }}
        pereteList.get(i).addStrat(entity);
        return null;
    }


    public Strat delete(int idPerete,int idStrat) throws FileNotFoundException, IOException {
        int i = 0;
        int k=0;
        Fereastra fere = null;
        for(int j=0;j<pereteList.size();j++){

            if(pereteList.get(j).getId()==idPerete){
                i=j;
                for(int l = 0;l<pereteList.get(j).getListaStraturi().size();l++){
                    if(pereteList.get(j).getListaStraturi().get(l).getId()==idStrat);
                    k=l;
                    pereteList.get(i).deleteStrat(pereteList.get(j).getListaStraturi().get(l));
                }

            }
        }
        if(k!=0){

            return pereteList.get(i).getListaStraturi().get(k);
        } else return null;
    }


    public Strat update(Strat entity) throws IOException {
        int i = 0;
        int k=0;
        for(int j=0;j<pereteList.size();j++){

            if(pereteList.get(j).getId()==entity.getId()){
                i=j;
                for(int l = 0;l<pereteList.get(j).getListaStraturi().size();l++){
                    if(pereteList.get(j).getListaStraturi().get(l).getId()==entity.getId());
                    k=l;
                    pereteList.get(i).getListaStraturi().remove(k);
                    pereteList.get(i).getListaStraturi().add(k,entity);
                    return null;
                }

            }
        }

        return entity;
    }
}
