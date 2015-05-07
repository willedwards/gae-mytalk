package com.lumiin.mytalk.dao;

import com.lumiin.mytalk.config.ConversionConfiguration;
import com.lumiin.mytalk.dto.CityDTO;
import com.lumiin.mytalk.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CityHelperService  {
	
	//@Qualifier("converter")

	@Autowired
	ConversionConfiguration conversionService;// = ConversionServiceFactory.registerConverters();
	
	public City toEntity(CityDTO dto){
		City entity = conversionService.getConversionService().convert(dto, City.class);

		//City entity = conversionService.convert(dto, City.class);
		//entity.setCountry(Ref.create(Key.create(Country.class, dto.getCountryDTO().getId())));
		return entity;
	}
	
	public CityDTO toDTO(City entity){
		CityDTO dto = conversionService.getConversionService().convert(entity, CityDTO.class);
		// Adding only country id
		//CountryDTO countryDTO = new CountryDTO();
		//countryDTO.setId(entity.getCountry().getKey().getId());
		//dto.setCountryDTO(countryDTO);
		return dto;
	}
	
	public List<CityDTO> toDTOList(List<City> entities){
		List<CityDTO> list = new ArrayList<CityDTO>(0);
		for(City entity : entities){
			list.add(toDTO(entity));
		}
		return list;
	}
}
