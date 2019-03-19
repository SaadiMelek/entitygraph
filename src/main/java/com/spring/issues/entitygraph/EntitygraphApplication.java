package com.spring.issues.entitygraph;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.issues.entitygraph.model.Door;
import com.spring.issues.entitygraph.model.House;
import com.spring.issues.entitygraph.model.Room;
import com.spring.issues.entitygraph.repository.HouseRepository;

@SpringBootApplication
public class EntitygraphApplication implements CommandLineRunner {

	@Autowired
	HouseRepository houseRepository;

	public static void main(String[] args) {
		SpringApplication.run(EntitygraphApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		House house = new House();
		Set<Door> doors = new HashSet<>();
		doors.add(new Door());
		doors.add(new Door());
		doors.add(new Door());
		for (Door door : doors) {
			door.setHouse(house);
		}
		house.setDoors(doors);
		Set<Room> rooms = new HashSet<>();
		rooms.add(new Room());
		rooms.add(new Room());
		rooms.add(new Room());
		for (Room room : rooms) {
			room.setHouse(house);
		}
		house.setRooms(rooms);
		houseRepository.save(house);
	}
}