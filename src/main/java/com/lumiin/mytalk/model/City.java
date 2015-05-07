package com.lumiin.mytalk.model;

import com.googlecode.objectify.annotation.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity(name = "CITY")
@Cache
@XmlRootElement(name = "city")
public class City implements Serializable {
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
	private Date updatedOn;
	@Ignore
	private String formattedDate;

	@OnSave
	public void updatedOn() {
		updatedOn = new Date();
	}

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
	
	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getFormattedDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return sdf.format(updatedOn);
	}

	public void setFormattedDate(String formattedDate) {
		this.formattedDate = formattedDate;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof City)) return false;

		City city = (City) o;

		if (id != null ? !id.equals(city.id) : city.id != null) return false;
		if (cityCode != null ? !cityCode.equals(city.cityCode) : city.cityCode != null) return false;
		if (cityName != null ? !cityName.equals(city.cityName) : city.cityName != null) return false;
		if (active != null ? !active.equals(city.active) : city.active != null) return false;
		if (updatedOn != null ? !updatedOn.equals(city.updatedOn) : city.updatedOn != null) return false;
		return !(formattedDate != null ? !formattedDate.equals(city.formattedDate) : city.formattedDate != null);

	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
		result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
		result = 31 * result + (active != null ? active.hashCode() : 0);
		result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
		result = 31 * result + (formattedDate != null ? formattedDate.hashCode() : 0);
		return result;
	}
}
