package com.lumiin.mytalk.dao;

import com.lumiin.mytalk.model.City;
import org.springframework.stereotype.Service;


@Service
public interface CityDao extends GenericDao{
	//public List<City> findByCountryCode(Long id);
	public City findByCityCode(String cityCode);
	public City findByCityName(String cityName);
}

