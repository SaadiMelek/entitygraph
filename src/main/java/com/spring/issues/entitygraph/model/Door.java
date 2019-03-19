package com.spring.issues.entitygraph.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Door {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "house_id", nullable = false)
	private House house;

	public Door() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	@Override
	public String toString() {
		return "Door [id=" + id + ", house=" + house + "]";
	}
}