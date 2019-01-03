package com.spring.issues.entitygraph.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HOUSES")
public class House {

	@Id
	@GeneratedValue
	private Long id;

	@OneToMany(mappedBy = "house", fetch = FetchType.LAZY)
	private Set<Room> rooms = new HashSet<>();

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

	public House(Set<Room> rooms) {
		super();
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "House [id=" + id + "]";
	}

}