package com.jsp.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Entity.Booking;
import com.jsp.Entity.Bus;
import com.jsp.Repository.BookingRepository;
import com.jsp.Repository.BusRepository;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	 private final BookingRepository bookingRepository;
	    private final BusRepository busRepository;

	    public BookingController(BookingRepository bookingRepository, BusRepository busRepository) {
	        this.bookingRepository = bookingRepository;
	        this.busRepository = busRepository;
	    }

	    @PostMapping("/book")
	    public Booking bookTicket(@RequestParam Long busId, @RequestBody Booking booking) {
	        Bus bus = busRepository.findById(busId).orElseThrow(() -> new RuntimeException("Bus not found"));

	        if (booking.getSeatsBooked() > bus.getTotalSeats()) {
	            throw new RuntimeException("Not enough seats available");
	        }

	        // Reduce seat count
	        bus.setTotalSeats(bus.getTotalSeats() - booking.getSeatsBooked());
	        busRepository.save(bus);

	        // Set bus and fare
	        booking.setBus(bus);
	        booking.setTotalFare(booking.getSeatsBooked() * bus.getFare());

	        return bookingRepository.save(booking);
	    }

}
