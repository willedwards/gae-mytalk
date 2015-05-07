package com.lumiin.mytalk.dto;

public class CityDTO {
	private Long id;
	private String cityCode;
	private String cityName;
	private Boolean active;
	private String updatedOn;
	//private CountryDTO countryDTO;
	//private List<RegionDTO> regions;
	
	public CityDTO(){
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}

//	public CountryDTO getCountryDTO() {
//		return countryDTO;
//	}
//
//	public void setCountryDTO(CountryDTO countryDTO) {
//		this.countryDTO = countryDTO;
//	}
//
//	public List<RegionDTO> getRegions() {
//		return regions;
//	}
//
//	public void setRegions(List<RegionDTO> regions) {
//		this.regions = regions;
//	}
}
