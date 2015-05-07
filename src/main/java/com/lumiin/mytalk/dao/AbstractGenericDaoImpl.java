package com.lumiin.mytalk.dao;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.lumiin.mytalk.exception.DatabaseException;
import com.lumiin.mytalk.model.City;

import java.util.List;
import java.util.Map;

import static com.googlecode.objectify.ObjectifyService.ofy;


public abstract class AbstractGenericDaoImpl implements GenericDao {

	static {
		

		ObjectifyService.register(City.class);
		//super.init();
	}

	@Override
	public <T> void create(T t) {
		ofy().save().entity(t).now();
	}

	@Override
	public <T> String createWithKey(T t) {
		Key<T> key = ofy().save().entity(t).now();
		return key.getString();
	}

	@Override
	public <T> Map<Key<T>, T> createListWithKeys(List<T> t) {
		Map<Key<T>, T> map = ofy().save().entities(t).now();
		return map;
	}

	@Override
	public <T> Long createWithID(T t) {
		Key<T> key = ofy().save().entity(t).now();
		return key.getId();
	}

	@Override
	public <T> void update(Class<T> clazz, Long id, T t)
			throws DatabaseException {
		if (id == null) {
			throw new DatabaseException("ID cannot be null");
		}
		ofy().save().entity(t).now();
	}

	@Override
	public <T> void update(Class<T> clazz, String key, T t)
			throws DatabaseException {
		if (key == null) {
			throw new DatabaseException("ID cannot be null");
		}
		ofy().save().entity(t).now();
	}

	@Override
	public <T> T getById(Class<T> clazz, Long id) throws DatabaseException {
		if (id == null) {
			throw new DatabaseException("ID cannot be null");
		}
		return ofy().load().type(clazz).id(id).now();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getByKey(Class<T> clazz, String key) throws DatabaseException {
		if (key == null) {
			throw new DatabaseException("ID cannot be null");
		}
		return (T) ofy().load().group(clazz).key(Key.valueOf(key)).now();
	}

	@Override
	public <T> List<T> list(Class<T> clazz) {
		List<T> list = ofy().load().type(clazz).list();
		return list;
	}

	@Override
	public <T> List<T> listOrdered(Class<T> clazz, String sortOrder,
			String fieldName) {
		List<T> list = ofy().load().type(clazz).order(sortOrder + fieldName)
				.list();
		return list;
	}

	@Override
	public <T> void delete(Class<T> clazz, Long id) throws DatabaseException {
		if (id == null) {
			throw new DatabaseException("ID cannot be null");
		}
		ofy().delete().type(clazz).id(id).now();
	}

	@Override
	public <T> void deleteByKey(Class<T> clazz, String key)
			throws DatabaseException {
		if (key == null) {
			throw new DatabaseException("ID cannot be null");
		}
		ofy().delete().type(clazz).id(key).now();
	}
}
