package ro.repository.java;

import ro.model.java.Perete;
import ro.model.java.Usa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsaRepository {
    List<Perete> pereteList = new ArrayList<>();

    public UsaRepository(List<Perete> pereteList) {
        this.pereteList = pereteList;
    }

    public Usa findOne(int idPerete, int idUsa) throws FileNotFoundException, IOException {
        for(Perete per : pereteList){
            if(per.getId()==idPerete){
                for(Usa fer :per.getListaUsa()){
                    if(fer.getId()==idUsa){
                        return fer;
                    }
                }
            }
        }
        return null;
    }


    public Usa save(Usa entity) throws FileNotFoundException, IOException {
        int i = 0;
        for(int j=0;j<pereteList.size();j++){
            
            if(pereteList.get(j).getId()==entity.getIdPerete()){
                i=j;
                if(pereteList.get(i).getListaUsa()!=null){
                for(int l=0;l<pereteList.get(j).getListaUsa().size();l++)
                if(pereteList.get(j).getListaUsa().get(l).getId()==entity.getId())
                    return entity;
            }
        }}
        pereteList.get(i).addUsa(entity);
        return null;
    }


    public Usa delete(int idPerete,int idUsa) throws FileNotFoundException, IOException {
        int i = 0;
        int k=0;
        Usa fere = null;
        for(int j=0;j<pereteList.size();j++){

            if(pereteList.get(j).getId()==idPerete){
                i=j;
                for(int l = 0;l<pereteList.get(j).getListaUsa().size();l++){
                    if(pereteList.get(j).getListaUsa().get(l).getId()==idUsa);
                    k=l;
                    pereteList.get(i).deleteUsa(pereteList.get(j).getListaUsa().get(l));
                }

            }
        }
        if(k!=0){

            return pereteList.get(i).getListaUsa().get(k);
        } else return null;
         }


    public Usa update(Usa entity) throws IOException {
        int i = 0;
        int k=0;
        for(int j=0;j<pereteList.size();j++){

            if(pereteList.get(j).getId()==entity.getIdPerete()){
                i=j;
                for(int l = 0;l<pereteList.get(j).getListaUsa().size();l++){
                    if(pereteList.get(j).getListaUsa().get(l).getId()==entity.getId());
                    k=l;
                    pereteList.get(i).getListaUsa().remove(k);
                    pereteList.get(i).getListaUsa().add(k,entity);
                    return null;
                }

            }
        }

         return entity;
    }
}
