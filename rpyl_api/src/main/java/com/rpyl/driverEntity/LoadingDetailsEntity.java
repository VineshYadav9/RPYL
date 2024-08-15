package com.rpyl.driverEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class LoadingDetailsEntity {

	@Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	public  String loadingPoint;
	public String unLoadingPoint;
	public int loadingDate;
	public int unLoadingDate;
	public String fareRs;
	public String advance;
	public String pod;
	public String payToDriver;
	public String diesel;
	public int litters;
	public String otherExpence;
	public String vehicle;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnLoadingPoint() {
		return unLoadingPoint;
	}
	public void setUnLoadingPoint(String unLoadingPoint) {
		this.unLoadingPoint = unLoadingPoint;
	}
	public int getLoadingDate() {
		return loadingDate;
	}
	public void setLoadingDate(int loadingDate) {
		this.loadingDate = loadingDate;
	}
	public int getUnLoadingDate() {
		return unLoadingDate;
	}
	public void setUnLoadingDate(int unLoadingDate) {
		this.unLoadingDate = unLoadingDate;
	}
	public String getFareRs() {
		return fareRs;
	}
	public void setFareRs(String fareRs) {
		this.fareRs = fareRs;
	}
	public String getAdvance() {
		return advance;
	}
	public void setAdvance(String advance) {
		this.advance = advance;
	}
	public String getPod() {
		return pod;
	}
	public void setPod(String pod) {
		this.pod = pod;
	}
	public String getPayToDriver() {
		return payToDriver;
	}
	public void setPayToDriver(String payToDriver) {
		this.payToDriver = payToDriver;
	}
	public String getDiesel() {
		return diesel;
	}
	public void setDiesel(String diesel) {
		this.diesel = diesel;
	}
	public int getLitters() {
		return litters;
	}
	public void setLitters(int litters) {
		this.litters = litters;
	}
	public String getOtherExpence() {
		return otherExpence;
	}
	public void setOtherExpence(String otherExpence) {
		this.otherExpence = otherExpence;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	
}
