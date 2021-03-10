package com.parking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "slot")
public class Slot {
	private String email;
	private String alemail;
	private String phone;
	private int slot;

	public Slot() {

	}

	public Slot(String email, String alemail, String phone, int slot) {
		super();
		this.email = email;
		this.alemail = alemail;
		this.phone = phone;
		this.slot = slot;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Id
	@Column(name = "alemail", nullable = false)
	public String getAlemail() {
		return alemail;
	}

	public void setAlemail(String alemail) {
		this.alemail = alemail;
	}

	@Column(name = "phone", nullable = false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "slot", nullable = false)
	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	@Override
	public String toString() {
		return "Slot [email=" + email + ", alemail=" + alemail + ", phone=" + phone + ", slot=" + slot + "]";
	}

}
