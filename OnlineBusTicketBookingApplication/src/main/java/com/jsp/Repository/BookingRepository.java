package com.jsp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}

