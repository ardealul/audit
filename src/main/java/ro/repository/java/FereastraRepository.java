package ro.repository.java;

import ro.model.java.Fereastra;
import ro.model.java.Perete;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FereastraRepository  {
    List<Perete> pereteList = new ArrayList<>();

    public FereastraRepository(List<Perete> pereteList) {
        this.pereteList = pereteList;
    }

    public Fereastra findOne(int idPerete, int idFereastra) throws FileNotFoundException, IOException {
        for(Perete per : pereteList){
            if(per.getId()==idPerete){
                for(Fereastra fer :per.getListaFerestre()){
                    if(fer.getId()==idFereastra){
                        return fer;
                    }
                }
            }
        }
        return null;
    }
//sonar lint

    public Fereastra save(Fereastra entity) throws FileNotFoundException, IOException {
        int i = 0;
        for(int j=0;j<pereteList.size();j++){
            
            if(pereteList.get(j).getId()==entity.getIdPerete()){
                i=j;
                if(pereteList.get(i).getListaFerestre()!=null){
                for(int l=0;l<pereteList.get(j).getListaFerestre().size();l++)
                if(pereteList.get(j).getListaFerestre().get(l).getId()==entity.getId())
                    return entity;
            }
        }}
        pereteList.get(i).addFereastra(entity);
        return null;
    }


    public Fereastra delete(int idPerete,int idFereastra) throws FileNotFoundException, IOException {
        int i = 0;
        int k=0;
        Fereastra fere = null;
        for(int j=0;j<pereteList.size();j++){

            if(pereteList.get(j).getId()==idPerete){
                i=j;
                for(int l = 0;l<pereteList.get(j).getListaFerestre().size();l++){
                    if(pereteList.get(j).getListaFerestre().get(l).getId()==idFereastra);
                    k=l;
                    pereteList.get(i).deleteFereastra(pereteList.get(j).getListaFerestre().get(l));
                }

            }
        }
        if(k!=0){

            return pereteList.get(i).getListaFerestre().get(k);
        } else return null;
         }


    public Fereastra update(Fereastra entity) throws IOException {
        int i = 0;
        int k=0;
        for(int j=0;j<pereteList.size();j++){

            if(pereteList.get(j).getId()==entity.getIdPerete()){
                i=j;
                for(int l = 0;l<pereteList.get(j).getListaFerestre().size();l++){
                    if(pereteList.get(j).getListaFerestre().get(l).getId()==entity.getId());
                    k=l;
                    pereteList.get(i).getListaFerestre().remove(k);
                    pereteList.get(i).getListaFerestre().add(k,entity);
                    return null;
                }

            }
        }

         return entity;
    }
}
