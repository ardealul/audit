package ro.repository.java;


import ro.model.java.*;

public class Repository {
    Arie calcAr = new Arie();
    Rezistenta rez = new Rezistenta();
    public double factorDeCorectieTemperatura(Apartament apartament){
        double corectieTemperatura=0;
        double whatINeed=0;
        for(Perete per : apartament.getListaPereti()){
            if(per.getTipPerete()== TipPerete.EXTERIOR||per.getTipPerete()==TipPerete.TERASA){

                corectieTemperatura=corectieTemperatura + (calcAr.calcArieOpacaPerete(per)/rez.rezistentaCorectata(per));
            }
            if(per.getTipPerete()== TipPerete.PIVNITA){
                corectieTemperatura=corectieTemperatura+ (calcAr.calcArieOpacaPerete(per)*0.39473)/rez.rezistentaCorectata(per);
            }
            if(per.getTipPerete()== TipPerete.POD){
                corectieTemperatura=corectieTemperatura+ (calcAr.calcArieOpacaPerete(per)*0.9210526)/rez.rezistentaCorectata(per);
            }
            if(per.getTipPerete()== TipPerete.SOL||per.getTipPerete()==TipPerete.CASASCARII){
                corectieTemperatura=corectieTemperatura+ (calcAr.calcArieOpacaPerete(per)*0.2631579)/rez.rezistentaCorectata(per);
            }

        }
        System.out.println(corectieTemperatura);
    return corectieTemperatura;
    }

    public double coeficientulGlobalIzolareTermica(Apartament apartament){
       double factorCorectieTemp = factorDeCorectieTemperatura(apartament);
        double corectieTemperatura =0;
        int nrPereti=0;

        for(Perete per : apartament.getListaPereti()){
            if(per.getTipPerete()==TipPerete.EXTERIOR){
                nrPereti++;
            }
        }
        if(nrPereti>=1){
            System.out.println((factorCorectieTemp/(apartament.getSuprafataUtila()*apartament.getInaltimea()))+0.34D*0.6D);
            return (factorCorectieTemp/(apartament.getSuprafataUtila()*apartament.getInaltimea()))+0.34D*0.6D;
        }else {return 0D;}
    }

    public double coeficientulDePierderiTermice(Apartament apartament){
        double coefticientulGlobIzTerm = coeficientulGlobalIzolareTermica(apartament);
        System.out.println(coefticientulGlobIzTerm*volumApartament(apartament));
        return coefticientulGlobIzTerm*volumApartament(apartament);
    }

    public double volumApartament(Apartament apartament){
        System.out.println(apartament.getInaltimea()*apartament.getSuprafataUtila());
        return apartament.getInaltimea()*apartament.getSuprafataUtila();
    }

    public double necesarDeCaldura (Apartament apartament){
        System.out.println(coeficientulDePierderiTermice(apartament)*38D);
        return coeficientulDePierderiTermice(apartament)*38D;//conteaza zona climatica, 20--18(18 e in cluj)
    }

    public double pierderiCalduraApartament(Apartament apartament){
        //=B87*(20-2)*186*24
        System.out.println((coeficientulDePierderiTermice(apartament)*(20D-2D)*186D*24D)/1000000D);
        return (coeficientulDePierderiTermice(apartament)*(20D-2D)*186D*24D)/1000000D;//186 numar zile incalzite/an 2 media temperaturilor intr-un an 24 ore pe zi
    }
    public double aporturiSurseInterne(Apartament apartament){
        //=4*B65*186*24
        System.out.println((4D*apartament.getSuprafataUtila()*186D*24D)/1000000D);
        return (4D*apartament.getSuprafataUtila()*186D*24D)/1000000D;
    }
    public double aporturiSolare(Apartament apartament){
        double returnData=0;
        for(Perete per: apartament.getListaPereti()){
            if(per.getTipPerete()==TipPerete.EXTERIOR){
            if(per.getListaFerestre()!=null||per.getListaUsa()!=null){
                for(Usa usa :per.getListaUsa()){
                    returnData = returnData+ usa.getLatime()*usa.getInaltime()*per.getPunctCardinal().getNumVal();
                }
                for(Fereastra fer:per.getListaFerestre()){
                    returnData  =  returnData+ fer.getLatime()*fer.getInaltime()*per.getPunctCardinal().getNumVal();
                }
            }
        }}
        returnData = (returnData*0.75D*0.9D*0.4D)/1000D;
        System.out.println(returnData);
        return returnData;
    }
    public double aporturideCalguraGq(Apartament apartament){
        System.out.println(aporturiSurseInterne(apartament)+aporturiSolare(apartament));
        return aporturiSurseInterne(apartament)+aporturiSolare(apartament);
    }
    public double necesarEnergieIncalzireQh(Apartament apartament){
        System.out.println(pierderiCalduraApartament(apartament)-1*aporturideCalguraGq(apartament));
        return pierderiCalduraApartament(apartament)-1*aporturideCalguraGq(apartament);
    }

}
