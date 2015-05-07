package com.lumiin.mytalk.dao;

import com.googlecode.objectify.Key;
import com.lumiin.mytalk.exception.DatabaseException;

import java.util.List;
import java.util.Map;


public abstract class AbstractGenericServiceImpl<TemplateDao extends GenericDao, T> {

	/**
	 * Method to return the domain dao
	 */
	protected abstract TemplateDao getTemplateDao();

	/**
	 * Method to set the domain dao
	 */
	protected abstract void setTemplateDao(TemplateDao templateDao);

	public void create(T t) {
		getTemplateDao().create(t);
	}

	public String createWithKey(T t) {
		return getTemplateDao().createWithKey(t);
	}

	public Long createWithID(T t) {
		return getTemplateDao().createWithID(t);
	}
	
	public Map<Key<T>, T> createListWithKeys(List<T> t){
		return getTemplateDao().createListWithKeys(t);
	}

	public void update(Class<T> clazz, Long id, T t) throws DatabaseException {
		getTemplateDao().update(clazz, id, t);
	}

	public void update(Class<T> clazz, String key, T t)
			throws DatabaseException {
		getTemplateDao().update(clazz, key, t);
	}

	public T getById(Class<T> clazz, Long id) throws DatabaseException {
		return getTemplateDao().getById(clazz, id);
	}

	public T getByKey(Class<T> clazz, String key) throws DatabaseException {
		return getTemplateDao().getByKey(clazz, key);
	}

	public List<T> list(Class<T> clazz) {
		return getTemplateDao().list(clazz);
	}
	
	public List<T> listOrdered(Class<T> clazz, String sortOrder, String fieldName){
		return getTemplateDao().listOrdered(clazz, sortOrder, fieldName);
	}

	public void delete(Class<T> clazz, Long id) throws DatabaseException {
		getTemplateDao().delete(clazz, id);
	}

	public void deleteByKey(Class<T> clazz, String key)
			throws DatabaseException {
		getTemplateDao().deleteByKey(clazz, key);
	}
}
