package ro.repository.java;

import ro.model.java.Apartament;
import ro.model.java.Fereastra;
import ro.model.java.Perete;
import ro.model.java.Usa;

public class CrudRepository {
    Apartament apartament;

    public CrudRepository(Apartament apartament) {
        this.apartament = apartament;
    }

    public Perete findPerete(int id) {
        Perete perete = null;
        for (Perete per : this.apartament.getListaPereti()) {
            if (per.getId() == id) {
                perete = per;
            }
        }
        return perete;
    }

    public Perete savePerete(Perete perete) {
        Perete per = findPerete(perete.getId());
        if (per == null) {
            this.apartament.getListaPereti().add(perete);
            return null;
        } else return perete;
    }

    public Perete deletePerete(int id) {
        if (findPerete(id) != null) {
            apartament.getListaPereti().remove(findPerete(id));
            return findPerete(id);
        } else return null;
    }

    public Perete updatePerete(Perete perete) {
        if (findPerete(perete.getId()) != null) {
            apartament.getListaPereti().remove(perete);
            apartament.addPerete(perete);
            return perete;
        }
        return null;
    }

    public Fereastra findFereastra(int idPerete, int idFereastra) {
        Fereastra fereastra=null;
        for (int i = 0; i < apartament.getListaPereti().size(); i++) {
            if (apartament.getListaPereti().get(i).getId() == idPerete) {
                for (int j = 0; j<apartament.getListaPereti().get(i).getListaFerestre().size() ; j++){
                    if (apartament.getListaPereti().get(i).getListaFerestre().get(j).getId() == idFereastra) {
                        fereastra=apartament.getListaPereti().get(i).getListaFerestre().get(j);
                        return fereastra;
                    }
                }
            }
        }
        return fereastra;
    }
    public Fereastra saveFereastra(int idPerete, Fereastra fereastra){
        Fereastra fer=null;
       for(int i=0;i<apartament.getListaPereti().size();i++){
           if(apartament.getListaPereti().get(i).getId()==idPerete){
               for(int j=0;j<apartament.getListaPereti().get(i).getListaFerestre().size();j++){
                   if(apartament.getListaPereti().get(i).getListaFerestre().get(j).getId()==fereastra.getId()){
                       fer = fereastra;
                       apartament.getListaPereti().get(i).getListaFerestre().add(fereastra);
                       return null;
                   }

               }
           }
       }
   return fereastra;
    }
    public Fereastra deleteFereastra(int idPerete, int idFereastra){
        Fereastra fer=null;
        int idPerete1 = 0;
        for(int i=0;i<apartament.getListaPereti().size();i++){
            if(apartament.getListaPereti().get(i).getId()==idPerete){
                for(int j=0;j<apartament.getListaPereti().get(i).getListaFerestre().size();j++){
                    if(apartament.getListaPereti().get(i).getListaFerestre().get(j).getId()==idFereastra){
                       idPerete1 = i;
                        fer = apartament.getListaPereti().get(i).getListaFerestre().get(j);
                    }

                }
            }
        }
        if(fer!=null){
            apartament.getListaPereti().get(idPerete1).getListaFerestre().remove(fer);
        }
        return fer;
    }
    public Fereastra updateFereastra(int idPerete, Fereastra fereastra){
        Fereastra fer=null;
        int idPerete1 = 0;
        for(int i=0;i<apartament.getListaPereti().size();i++){
            if(apartament.getListaPereti().get(i).getId()==idPerete){
                for(int j=0;j<apartament.getListaPereti().get(i).getListaFerestre().size();j++){
                    if(apartament.getListaPereti().get(i).getListaFerestre().get(j).getId()==fereastra.getId()){
                        idPerete1 = i;
                        fer = apartament.getListaPereti().get(i).getListaFerestre().get(j);
                    }

                }
            }
        }
        if(fer!=null){

            apartament.getListaPereti().get(idPerete1).getListaFerestre().remove(fereastra);
            apartament.getListaPereti().get(idPerete1).getListaFerestre().add(fereastra);
        }
        return fer;
    }
    public Usa findUsa(int idPerete, int idUsa) {
        Usa usa=null;
        for (int i = 0; i < apartament.getListaPereti().size(); i++) {
            if (apartament.getListaPereti().get(i).getId() == idPerete) {
                for (int j = 0; j<apartament.getListaPereti().get(i).getListaUsa().size() ; j++){
                    if (apartament.getListaPereti().get(i).getListaUsa().get(j).getId() == idUsa) {
                        usa=apartament.getListaPereti().get(i).getListaUsa().get(j);
                        return usa;
                    }
                }
            }
        }
        return usa;
    }
    public Usa saveUsa(int idPerete, Usa usa){
        Usa usa1=null;
        for(int i=0;i<apartament.getListaPereti().size();i++){
            if(apartament.getListaPereti().get(i).getId()==idPerete){
                for(int j=0;j<apartament.getListaPereti().get(i).getListaUsa().size();j++){
                    if(apartament.getListaPereti().get(i).getListaUsa().get(j).getId()==usa.getId()){
                        usa1 = usa;
                        apartament.getListaPereti().get(i).getListaUsa().add(usa);
                        return null;
                    }

                }
            }
        }
        return usa;
    }
    public Usa deleteUsa(int idPerete, int idUsa){
        Usa usa=null;
        int idUsa1 = 0;
        for(int i=0;i<apartament.getListaPereti().size();i++){
            if(apartament.getListaPereti().get(i).getId()==idPerete){
                for(int j=0;j<apartament.getListaPereti().get(i).getListaUsa().size();j++){
                    if(apartament.getListaPereti().get(i).getListaUsa().get(j).getId()==idUsa){
                        idUsa1 = i;
                        usa = apartament.getListaPereti().get(i).getListaUsa().get(j);
                    }

                }
            }
        }
        if(usa!=null){
            apartament.getListaPereti().get(idUsa1).getListaFerestre().remove(usa);
        }
        return usa;
    }
    public Usa updateUsa(int idPerete, Usa usa){
        Usa usa1=null;
        int idUsa1 = 0;
        for(int i=0;i<apartament.getListaPereti().size();i++){
            if(apartament.getListaPereti().get(i).getId()==idPerete){
                for(int j=0;j<apartament.getListaPereti().get(i).getListaUsa().size();j++){
                    if(apartament.getListaPereti().get(i).getListaUsa().get(j).getId()==usa.getId()){
                        idUsa1 = i;
                        usa1 = apartament.getListaPereti().get(i).getListaUsa().get(j);
                    }

                }
            }
        }
        if(usa!=null){

            apartament.getListaPereti().get(idUsa1).getListaUsa().remove(usa1);
            apartament.getListaPereti().get(idUsa1).getListaUsa().add(usa);
        }
        return usa;
    }
}