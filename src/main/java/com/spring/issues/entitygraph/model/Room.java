package com.spring.issues.entitygraph.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ROOMS")
public class Room {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HOUSE_ID")
	private House house;

	@OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
	private Set<Door> doors;

	public Room(Set<Door> doors) {
		super();
		this.doors = doors;
	}

	public Room() {
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

	public Set<Door> getDoors() {
		return doors;
	}

	public void setDoors(Set<Door> doors) {
		this.doors = doors;
	}

}