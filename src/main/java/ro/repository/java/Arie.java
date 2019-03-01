package ro.repository.java;

import ro.model.java.Fereastra;
import ro.model.java.Perete;
import ro.model.java.Usa;

public class Arie {
    public double calcArieOpacaPerete(Perete perete){
        double ariePerete = perete.getInaltime()*perete.getLatime();
        double arieFereastaUsa=0;
        for(Fereastra f : perete.getListaFerestre()){
            arieFereastaUsa = arieFereastaUsa + f.getInaltime()*f.getLatime();
        }
        for(Usa usa : perete.getListaUsa()){
        arieFereastaUsa = arieFereastaUsa+ usa.getInaltime()*usa.getLatime();
        }
        System.out.println(ariePerete-arieFereastaUsa);
        return ariePerete-arieFereastaUsa;
    }
}
