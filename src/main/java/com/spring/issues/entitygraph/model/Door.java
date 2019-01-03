package com.spring.issues.entitygraph.model;

import javax.persistence.*;

@Entity
@Table(name = "DOORS")
public class Door {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DOOR_ID")
	private Room room;

	public Door() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}