package com.jsp.Entity;

import jakarta.persistence.*;

@Entity
public class Booking {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String passengerName;
	    private String email;
	    private String phone;

	    private int seatsBooked;
	    private double totalFare;

	    @ManyToOne
	    @JoinColumn(name = "bus_id")
	    private Bus bus;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPassengerName() {
			return passengerName;
		}

		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public int getSeatsBooked() {
			return seatsBooked;
		}

		public void setSeatsBooked(int seatsBooked) {
			this.seatsBooked = seatsBooked;
		}

		public double getTotalFare() {
			return totalFare;
		}

		public void setTotalFare(double totalFare) {
			this.totalFare = totalFare;
		}

		public Bus getBus() {
			return bus;
		}

		public void setBus(Bus bus) {
			this.bus = bus;
		}

}
