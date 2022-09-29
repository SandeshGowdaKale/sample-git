package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Charcy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int charcyId;
	private String type;

	@OneToOne
	@JoinColumn
	private Bike bike;

	public int getCharcyId() {
		return charcyId;
	}

	public void setCharcyId(int charcyId) {
		this.charcyId = charcyId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "Charcy [charcyId=" + charcyId + ", type=" + type +  "]";
	}

}
