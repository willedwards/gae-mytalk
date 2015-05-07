package com.lumiin.mytalk.model;

import com.lumiin.mytalk.dao.CityHelperService;
import com.lumiin.mytalk.dto.CityDTO;
import com.lumiin.mytalk.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ch on 5/3/2015.
 */
@Component
public class CityModel {


    private final CityService cityService;
    private final CityHelperService cityHelperService;

    @Autowired
    public CityModel(CityService cityService, CityHelperService cityHelperService) {
        this.cityService = cityService;
        this.cityHelperService = cityHelperService;
    }

    public CityStatus create(String name,String code) {

        City exists = cityService.findByCityCode(code);
        if(exists !=null)
           return CityStatus.EXISTS;

        CityDTO city = new CityDTO();
        city.setCityName(name);
        city.setCityCode(code);
        city.setActive(true);
        //CountryDTO ct = new CountryDTO();
        //ct.setCountryCode("CH");
        //ct.setCountryName("SWIZERLAND");
        //city.setCountryDTO(ct);

        cityService.createWithID(cityHelperService.toEntity(city));

        return CityStatus.CREATED;

    }
}
