package com.lide.house.domain;

import java.io.Serializable;
import java.util.Date;

public class House  implements Serializable {
	private String name;
	private String phone;
	private String typeName;
	private String typePrice;
	private Date createdata;
	private Integer typeid;
	private String showtext;
	public House() {
		super();
	}
	public House(String name, String phone, String typeName, String typePrice, Date createdata, String showtext) {
		super();
		this.name = name;
		this.phone = phone;
		this.typeName = typeName;
		this.typePrice = typePrice;
		this.createdata = createdata;
		this.showtext = showtext;
	}
	
	public Integer getTypeid() {
		return typeid;
	}
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypePrice() {
		return typePrice;
	}
	public void setTypePrice(String typePrice) {
		this.typePrice = typePrice;
	}
	public Date getCreatedata() {
		return createdata;
	}
	public void setCreatedata(Date createdata) {
		this.createdata = createdata;
	}
	public String getShowtext() {
		return showtext;
	}
	public void setShowtext(String showtext) {
		this.showtext = showtext;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdata == null) ? 0 : createdata.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((showtext == null) ? 0 : showtext.hashCode());
		result = prime * result + ((typeName == null) ? 0 : typeName.hashCode());
		result = prime * result + ((typePrice == null) ? 0 : typePrice.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		if (createdata == null) {
			if (other.createdata != null)
				return false;
		} else if (!createdata.equals(other.createdata))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (showtext == null) {
			if (other.showtext != null)
				return false;
		} else if (!showtext.equals(other.showtext))
			return false;
		if (typeName == null) {
			if (other.typeName != null)
				return false;
		} else if (!typeName.equals(other.typeName))
			return false;
		if (typePrice == null) {
			if (other.typePrice != null)
				return false;
		} else if (!typePrice.equals(other.typePrice))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "House [name=" + name + ", phone=" + phone + ", typeName=" + typeName + ", typePrice=" + typePrice
				+ ", createdata=" + createdata + ", typeid=" + typeid + ", showtext=" + showtext + "]";
	}
	
}
