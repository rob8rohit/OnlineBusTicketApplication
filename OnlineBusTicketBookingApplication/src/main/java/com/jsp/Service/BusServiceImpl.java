package com.jsp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsp.Entity.Bus;
import com.jsp.Repository.BusRepository;

@Service
public class BusServiceImpl implements BusService {
	 private final BusRepository busRepository;

	    public BusServiceImpl(BusRepository busRepository) {
	        this.busRepository = busRepository;
	    }

	    @Override
	    public Bus addBus(Bus bus) {
	        return busRepository.save(bus);
	    }

	    @Override
	    public List<Bus> searchBuses(String source, String destination) {
	        return busRepository.findBySourceAndDestination(source, destination);
	    }

	    @Override
	    public List<Bus> getAllBuses() {
	        return busRepository.findAll();
	    }

}
