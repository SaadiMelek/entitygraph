package com.spring.issues.entitygraph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.issues.entitygraph.model.Door;
import com.spring.issues.entitygraph.model.House;
import com.spring.issues.entitygraph.model.Room;
import com.spring.issues.entitygraph.repository.HouseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HouseRepositoryTest {

	@Autowired
	private HouseRepository houseRepository;

	@Test
	public void entityGraph_test() {
		List<House> houses = houseRepository.myQuery();
		assertNotNull(houses);
		assertEquals(3, houses.get(0).getDoors().size());
		assertEquals(3, houses.get(0).getRooms().size());
		for (House house : houses) {
			System.out.println(house);
			for (Room room : house.getRooms()) {
				System.out.println(room);
			}
			for (Door door : house.getDoors()) {
				System.out.println(door);
			}
		}
	}
}