package ro.repository.java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PereteRepository <Perete> implements Crud<Perete> {
    List<Perete> pereteList = new ArrayList<Perete>();

    @Override
    public Perete findOne(int id) {
        ObjectInMemory<Perete> crud = new ObjectInMemory<Perete>(pereteList);
        return  crud.findOne(id);
    }

    @Override
    public Iterable<Perete> findAll(){
        ObjectInMemory<Perete> crud = new ObjectInMemory<Perete>(pereteList);
        return crud.findAll();
    }

    @Override
    public Perete save(Perete entity) {
        ObjectInMemory<Perete> crud = new ObjectInMemory<Perete>(pereteList);
        return crud.save((Perete) entity);
    }

    public PereteRepository(List<Perete> pereteList) {
        this.pereteList = pereteList;
    }

    @Override
    public Perete delete(int id)  {
        ObjectInMemory<Perete> crud = new ObjectInMemory<Perete>(pereteList);
        return  crud.delete(id);
    }

    @Override
    public Perete update(Perete entity)  {
        ObjectInMemory<Perete> crud = new ObjectInMemory<Perete>(pereteList);
        return  crud.update((Perete) entity);
    }
}
