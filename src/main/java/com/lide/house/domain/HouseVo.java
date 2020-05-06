package com.lide.house.domain;

import java.io.Serializable;
import java.util.Date;

public class HouseVo extends House  implements Serializable {
	private String leixing;
	private String leixingtext;
	private Double minprice;
	private Double maxprice;
	private String mindate;
	private String maxdate;
	public String getLeixing() {
		return leixing;
	}
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	public String getLeixingtext() {
		return leixingtext;
	}
	public void setLeixingtext(String leixingtext) {
		this.leixingtext = leixingtext;
	}
	public Double getMinprice() {
		return minprice;
	}
	public void setMinprice(Double minprice) {
		this.minprice = minprice;
	}
	public Double getMaxprice() {
		return maxprice;
	}
	public void setMaxprice(Double maxprice) {
		this.maxprice = maxprice;
	}
	public String getMindate() {
		return mindate;
	}
	public void setMindate(String mindate) {
		this.mindate = mindate;
	}
	public String getMaxdate() {
		return maxdate;
	}
	public void setMaxdate(String maxdate) {
		this.maxdate = maxdate;
	}
	
	
}
