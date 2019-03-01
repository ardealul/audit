package ro.repository.java;

import ro.model.java.Perete;
import ro.model.java.Strat;
import ro.model.java.TipPerete;

public class Rezistenta {
    public double calcRezistentaTransferTermic(Perete perete){
        double sumaStraturi=0;
        double returnData =0;
        for(Strat strat : perete.getListaStraturi()){
            sumaStraturi = sumaStraturi+ strat.getGrosimea()/strat.getConductivitatea();
        }
        if(perete.getTipPerete()== TipPerete.EXTERIOR){
            returnData = 1D/8D + sumaStraturi+ (1D/24D);
        }
        if(perete.getTipPerete()==TipPerete.PIVNITA){
          //  System.out.println("is in pivnita");
            returnData = 1D/6D + sumaStraturi + 1D/12D;
        }
        if(perete.getTipPerete()==TipPerete.POD){
            returnData = 1D/8D + sumaStraturi + 1D/12D;
        }
        if(perete.getTipPerete()==TipPerete.TERASA){
            returnData = 1D/8D+sumaStraturi+1D/24D;
        }
        if(perete.getTipPerete()==TipPerete.CASASCARII){
            returnData = 1D/8D + sumaStraturi + 1D/12D;
        }
        if(perete.getTipPerete()==TipPerete.SOL){
            returnData = 1D/6D+sumaStraturi;
        }
        System.out.println(returnData);
        return returnData;
    }
public double rezistentaCorectata(Perete perete){
        double rezistentaTansferTermic = calcRezistentaTransferTermic(perete);
        double returnData=0;
        if(perete.getTipPerete()==TipPerete.POD||perete.getTipPerete()==TipPerete.PIVNITA||perete.getTipPerete()==TipPerete.TERASA||perete.getTipPerete()==TipPerete.SOL){
            System.out.println(0.8*rezistentaTansferTermic);
            return 0.8* rezistentaTansferTermic;

        }else {
            System.out.println(0.7*rezistentaTansferTermic);
            return 0.7*rezistentaTansferTermic;}
}
}
