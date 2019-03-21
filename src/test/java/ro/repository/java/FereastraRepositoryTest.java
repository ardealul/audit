package ro.repository.java;

//import org.junit.jupiter.api.Test;
import ro.model.java.Fereastra;
import ro.model.java.Perete;
import ro.model.java.PunctCardinal;
import ro.model.java.TipPerete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;

class FereastraRepositoryTest {
  //  @Test
    public void TestRepository() throws IOException {
        List<Perete> pereteList = new ArrayList<>();
        pereteList.add(new Perete (1,10,10, PunctCardinal.E, TipPerete.PIVNITA));
        pereteList.add(new Perete (2,10,10, PunctCardinal.E, TipPerete.PIVNITA));
        FereastraRepository crud = new FereastraRepository(pereteList);
        crud.save(new Fereastra(1,1,10,20));
        System.out.println(pereteList);
        crud.save(new Fereastra(2,1,11,21));
        System.out.println(pereteList);
        System.out.println(crud.findOne(1,1));
        crud.delete(2,1);
        System.out.println(pereteList);
        crud.update(new Fereastra(1,1,22,10));
        System.out.println(pereteList);




    }
}