package com.spring.issues.entitygraph.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class House {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(mappedBy = "house", cascade = CascadeType.ALL)
	private Set<Room> rooms = new HashSet<>();

	@OneToMany(mappedBy = "house", cascade = CascadeType.ALL)
	private Set<Door> doors = new HashSet<>();

	public House() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	public Set<Door> getDoors() {
		return doors;
	}

	public void setDoors(Set<Door> doors) {
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "House [id=" + id + "]";
	}

}