package ro.repository.java;


import java.util.List;
import java.util.Objects;

public class ObjectInMemory<E> implements Crud<E> {
    private List<E> genericList;

    /**
     * Folosim un stream sa vedem daca avem obiectul acela in lista
     *
     * @param @id Functia
     *            primeste un id de tip primitiv int.
     * @return returneaza elementul daca e gasit, daca nu, returneaza null
     */

    @Override
    public E findOne(int id) {
        E result1 = this.genericList.stream().filter(x -> x.hashCode() == Objects.hash(id)).findFirst().orElse(null);
        return result1;
    }

    /**
     * @return daca avem elemente in lista, returneaza lista, daca nu, returneaza
     *         null
     */

    @Override
    public Iterable<E> findAll() {
        if (this.genericList != null)
            return this.genericList;
        else
            return null;
    }

    /**
     * @param @entity o entitate ca argument
     * @returneaza null daca s-a putut salva, adica nu mai este altcineva cu acelas
     *             id, sau returneaza persoana cu acelas id daca s-a putut gasi
     */
    @Override
    public E save(E entity) {System.out.println(entity);
        if (genericList.contains(entity)) {
            return entity;
        } else {
            this.genericList.add(entity);
            return null;
        }
    }

    /**
     * we delete a person with the given id, if found, delete, if not found "person
     * not found"
     *
     * @returns entity if found, null if not in List
     */
    @Override
    public E delete(int id) {
        E result1 = this.genericList.stream().filter(x -> x.hashCode() == Objects.hash(id)).findFirst().orElse(null);
        if (result1 != null) {
            E coppy = result1;
            genericList.remove(result1);
            return coppy;
        } else
            return null;

    }

    public ObjectInMemory(List<E> genericList) {
        this.genericList = genericList;
    }

    /**
     * Update by delete and add to position :D
     *
     * @return null if entity found and updated, the entity, if it was not
     *         found("entity not found")
     */
    @Override
    public E update(E entity) {
        int posStuff = 0;
        boolean isInList = false;
        for (int i = 0; i < this.genericList.size(); i++) {
            if ((entity).hashCode() == this.genericList.get(i).hashCode()) {
                posStuff = i;
                isInList = true;
            }
        }
        if (isInList == true) {
            this.genericList.remove(posStuff);
            this.genericList.add(posStuff, entity);
            return null;
        } else
            return entity;
    }
}
