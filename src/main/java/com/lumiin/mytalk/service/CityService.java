package com.lumiin.mytalk.service;

import com.lumiin.mytalk.dao.CityDao;
import com.lumiin.mytalk.dao.GenericService;
import com.lumiin.mytalk.model.City;
import org.springframework.stereotype.Service;

@Service
public interface CityService extends GenericService<CityDao, City> {
	//public List<City> findByCountryCode(Long id);
	public City findByCityCode(String cityCode);
}
