package com.spring.issues.entitygraph.repository;

import com.spring.issues.entitygraph.model.House;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

    @EntityGraph(attributePaths = {"rooms", "rooms.doors"})
    @Query("SELECT ho FROM House ho")
    List<House> findAllWithRoomsAndDoors();
}