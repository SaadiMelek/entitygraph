package com.spring.issues.entitygraph;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.issues.entitygraph.model.House;
import com.spring.issues.entitygraph.repository.HouseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HouseRepositoryTest {

    @Autowired
    private HouseRepository houseRepository;

	@Test
    @Sql(scripts = "/test-data.sql")
    public void entityGraph_test() {
        List<House> houses = houseRepository.findAllWithRoomsAndDoors();
        assertEquals(1, houses.size());
        assertEquals(1, houses.get(0).getRooms().size());
        //Iterator iter = houses.get(0).getRooms().iterator();
        //Room first = (Room) iter.next();
        assertEquals(2, houses.get(0).getRooms().stream().findFirst().get().getDoors().size());
    }
}