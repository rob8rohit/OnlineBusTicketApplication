package com.jsp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.Entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
    List<Bus> findBySourceAndDestination(String source, String destination);
}