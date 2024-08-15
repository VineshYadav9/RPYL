
package com.rpyl.houseMaterialExpense;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class HouseMaterialExpense {
	@Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
    public String product;
    public int unit;
    public int rs;
    public int quantity;
//    @Column(name = "date")
//    @Temporal(TemporalType.TIMESTAMP)
    private String date;
    public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getRs() {
		return rs;
	}
	public void setRs(int rs) {
		this.rs = rs;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;

	}
}
