package com.lumiin.mytalk.model;

import com.googlecode.objectify.annotation.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity(name = "CITY")
@Cache
@XmlRootElement(name = "city")
public class City  {
	private static final long serialVersionUID = 1L;
	@Id
	@Index
	private Long id;
	@Index
	private String cityCode;
	@Index
	private String cityName;
	//@Index
	//private Ref<Country> country;
	@Index
	private Boolean active;
	//private Date updatedOn;
	//@Ignore
	//private String formattedDate;

	//@OnSave
	//public void updatedOn() {
	//	updatedOn = new Date();
	//}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	//public Ref<Country> getCountry() {
	//	return country;
	//}

//	public void setCountry(Ref<Country> country) {
//		this.country = country;
//	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
//	public Date getUpdatedOn() {
//		return updatedOn;
//	}
//
//	public void setUpdatedOn(Date updatedOn) {
//		this.updatedOn = updatedOn;
//	}
//
//	public String getFormattedDate() {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//		return sdf.format(updatedOn);
//	}
//
//	public void setFormattedDate(String formattedDate) {
//		this.formattedDate = formattedDate;
//	}



}
