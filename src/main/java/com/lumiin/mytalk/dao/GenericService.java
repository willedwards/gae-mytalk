package com.lumiin.mytalk.dao;

import com.googlecode.objectify.Key;
import com.lumiin.mytalk.exception.DatabaseException;

import java.util.List;
import java.util.Map;


public interface GenericService<ModelDao, T> {
	public void create(T t);
	public String createWithKey(T t);
	public Long createWithID(T t);
	public Map<Key<T>, T> createListWithKeys(List<T> t);
	public void update(Class<T> clazz, Long id, T t) throws DatabaseException;
	public void update(Class<T> clazz, String key, T t) throws DatabaseException;
	public T getById(Class<T> clazz, Long id) throws DatabaseException;
	public T getByKey(Class<T> clazz, String key) throws DatabaseException;
	public List<T> list(Class<T> clazz);
	public List<T> listOrdered(Class<T> clazz, String sortOrder, String fieldName);
	public void delete(Class<T> clazz, Long id) throws DatabaseException;
	public void deleteByKey(Class<T> clazz, String key) throws DatabaseException;
}
