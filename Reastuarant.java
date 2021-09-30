package com.model;

public class Reastuarant {

	private int rest_id;
	private String restua_name;
	private String address;
	private String opening_time;
	private String closing_time;
	private int active;
	public Reastuarant() {
			
	}
	
	public Reastuarant(int rest_id, String restua_name, String address, String opening_time, String closing_time,
			int active) {
		super();
		this.rest_id = rest_id;
		this.restua_name = restua_name;
		this.address = address;
		this.opening_time = opening_time;
		this.closing_time = closing_time;
		this.active = active;
	}
	
	
	
	public int getRest_id() {
		return rest_id;
	}
	public void setRest_id(int rest_id) {
		this.rest_id = rest_id;
	}
	public String getRestua_name() {
		return restua_name;
	}
	public void setRestua_name(String restua_name) {
		this.restua_name = restua_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOpening_time() {
		return opening_time;
	}
	public void setOpening_time(String opening_time) {
		this.opening_time = opening_time;
	}
	public String getClosing_time() {
		return closing_time;
	}
	public void setClosing_time(String closing_time) {
		this.closing_time = closing_time;
	}
	public int isActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Reastuarant [rest_id=" + rest_id + ", restua_name=" + restua_name + ", address=" + address
				+ ", opening_time=" + opening_time + ", closing_time=" + closing_time + ", active=" + active + "]";
	}
	
	
}
