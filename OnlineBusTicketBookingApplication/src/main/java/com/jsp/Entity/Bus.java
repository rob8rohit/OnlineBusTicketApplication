package com.jsp.Entity;

import jakarta.persistence.*;

@Entity
public class Bus {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String busName;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private double fare;
    private int totalSeats;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	

}
