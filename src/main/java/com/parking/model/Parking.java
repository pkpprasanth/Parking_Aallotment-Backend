package com.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parking")
public class Parking {

	private String email;
	private String intime;
	private String outtime;
	private String totaldays;
	private String parkingslot;
	private String amount;

	public Parking(String email, String intime, String outtime, String totaldays, String parkingslot, String amount) {
		super();
		this.email = email;
		this.intime = intime;
		this.outtime = outtime;
		this.totaldays = totaldays;
		this.parkingslot = parkingslot;
		this.amount = amount;
	}

	public Parking() {

	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Id
	@Column(name = "intime", nullable = false)
	public String getIntime() {
		return intime;
	}

	public void setIntime(String intime) {
		this.intime = intime;
	}

	@Column(name = "outtime", nullable = false)
	public String getOuttime() {
		return outtime;
	}

	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}

	@Column(name = "totaldays", nullable = false)
	public String getTotaldays() {
		return totaldays;
	}

	public void setTotaldays(String totaldays) {
		this.totaldays = totaldays;
	}

	@Column(name = "parkingslot", nullable = false)
	public String getParkingslot() {
		return parkingslot;
	}

	public void setParkingslot(String parkingslot) {
		this.parkingslot = parkingslot;
	}

	@Column(name = "amount", nullable = false)
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Parking [email=" + email + ", intime=" + intime + ", outtime=" + outtime + ", totaldays=" + totaldays
				+ ", parkingslot=" + parkingslot + ", amount=" + amount + "]";
	}

}
