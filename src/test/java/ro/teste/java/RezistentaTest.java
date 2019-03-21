package ro.teste.java;


import ro.model.java.Perete;
import ro.model.java.PunctCardinal;
import ro.model.java.Strat;
import ro.model.java.TipPerete;
import ro.repository.java.Rezistenta;

import java.util.ArrayList;
import java.util.List;



class RezistentaTest {
      //  @Test
    public void TestRezistenta(){
            Perete per = new Perete();
            per.setTipPerete(TipPerete.EXTERIOR);
            Rezistenta rez = new Rezistenta();
            List<Strat> straturi = new ArrayList<Strat>();

            straturi.add(new Strat("myStrat","asdw",3,2,2));
            straturi.add(new Strat("myStrat","asdw",3,1,1));
            per.setListaStraturi(straturi);
            System.out.println(rez.calcRezistentaTransferTermic(per));
                System.out.println(rez.rezistentaCorectata(per));
                PunctCardinal card=PunctCardinal.N;
            System.out.println(PunctCardinal.N.getNumVal());

        }

}