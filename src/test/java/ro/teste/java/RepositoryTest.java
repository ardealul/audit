package ro.teste.java;


//import org.junit.jupiter.api.Test;
import ro.model.java.Perete;
import ro.model.java.PunctCardinal;
import ro.model.java.TipPerete;
import ro.repository.java.PereteRepository;

import java.util.ArrayList;
import java.util.List;



class RepositoryTest {
   // @Test
    public void TestRepository(){
        List<Perete> listaPer = new ArrayList<Perete>();

        PereteRepository crud = new PereteRepository(listaPer);
       /* Repository rep= new Repository();
        List<Fereastra> listaFer = new ArrayList<Fereastra>();
        listaFer.add(new Fereastra(2,3));
        List<Usa> listaUsi = new ArrayList<Usa>();
        listaUsi.add(new Usa(3,5));
        List<Strat> listaStraturi = new ArrayList<Strat>();
        listaStraturi.add(new Strat("sadsa","sadsa",3.0,2.0,3));
        List<Perete> listaPer = new ArrayList<Perete>();
        listaPer.add(new Perete(1,20D,23D, PunctCardinal.N,listaFer,listaUsi,listaStraturi,TipPerete.EXTERIOR));
        List<Pardoseala> listPardoseala = new ArrayList<Pardoseala>();
        listPardoseala.add(new Pardoseala(3,5));
        Apartament apartament = new Apartament(2.0,3.0,listPardoseala,listaPer,Zona.ZONA1);
        System.out.println(rep.aporturiSolare(apartament));
        System.out.println(rep.factorDeCorectieTemperatura(apartament));*/
      listaPer.add(new Perete(1,20D,23D, PunctCardinal.N, TipPerete.EXTERIOR));
        System.out.println(crud.findOne(1));
    }

}