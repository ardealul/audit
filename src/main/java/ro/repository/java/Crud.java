package ro.repository.java;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Crud<E> {
	/**
	* @param id -the id of the entity to be returned id must not be null
	* @return the entity with the specified id or null - if there is no entity with
	the given id
	 * @throws IOException 
	 * @throws FileNotFoundException 
	*
	*/
	E findOne(int id) throws FileNotFoundException, IOException;
	/**
	* @return all entities
	 * @throws IOException 
	 * @throws FileNotFoundException 
	*/
	Iterable<E> findAll() throws FileNotFoundException, IOException;
	/**
	* @param entity entity must be not null
	* @return null- if the given entity is saved otherwise returns the entity (id
	already exists)
	 * @throws IOException 
	 * @throws FileNotFoundException 
	*
	*/
	E save(E entity) throws FileNotFoundException, IOException;
	/**
	* removes the entity with the specified id
	* 
	* @param id id must be not null
	* @return the removed entity or null if there is no entity with the given id
	* @throws IOException 
	* @throws FileNotFoundException 
	*
	*/
	E delete(int id) throws FileNotFoundException, IOException;
	/**
	* @param entity entity must not be null
	* @return null - if the entity is updated, otherwise returns the entity - (e.g id
	does not exist).
	 * @throws IOException 
	*
	*/
	E update(E entity) throws IOException;
}
