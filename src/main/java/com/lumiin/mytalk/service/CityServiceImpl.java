package com.lumiin.mytalk.service;


import com.lumiin.mytalk.dao.AbstractGenericServiceImpl;
import com.lumiin.mytalk.dao.CityDao;
import com.lumiin.mytalk.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CityServiceImpl extends AbstractGenericServiceImpl<CityDao, City> implements CityService {

	@Autowired
	CityDao dao;

	@Override
	protected CityDao getTemplateDao() {
		return dao;
	}

	@Override
	protected void setTemplateDao(CityDao dao) {
		this.dao = dao;
	}

//	@Override
//	public List<City> findByCountryCode(Long id) {
//		return getTemplateDao().findByCountryCode(id);
//	}

	@Override
	public City findByCityCode(String cityCode) {
		return getTemplateDao().findByCityCode(cityCode);
	}
}	