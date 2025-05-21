package com.jsp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsp.Entity.Bus;


public interface BusService {
	
	Bus addBus(Bus bus);
    List<Bus> searchBuses(String source, String destination);
    List<Bus> getAllBuses();
}
