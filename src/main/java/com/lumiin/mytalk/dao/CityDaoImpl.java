package com.lumiin.mytalk.dao;

import com.lumiin.mytalk.model.City;
import org.springframework.stereotype.Component;

import static com.googlecode.objectify.ObjectifyService.ofy;


//@Repository("cityDao")
@Component
public class CityDaoImpl extends AbstractGenericDaoImpl implements CityDao {

//	@Override
//	public List<City> findByCountryCode(Long id) {
//		return ofy().load().type(City.class).filter("country", Ref.create(Key.create(Country.class, id))).order("cityName").list();
//	}

	@Override
	public City findByCityCode(String cityCode) {
		return ofy().load().type(City.class).filter("cityCode", cityCode).first().now();
	}
	
	@Override
	public City findByCityName(String cityName) {
		return ofy().load().type(City.class).filter("cityName", cityName).first().now();
	}
}	
