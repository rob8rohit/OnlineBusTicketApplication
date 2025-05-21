package com.jsp.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Entity.Bus;
import com.jsp.Service.BusService;

@RestController
@RequestMapping("/api/buses")
public class BusController {
	 private final BusService busService;

	    public BusController(BusService busService) {
	        this.busService = busService;
	    }

	    @PostMapping("/add")
	    public Bus addBus(@RequestBody Bus bus) {
	        return busService.addBus(bus);
	    }
	    
	    @GetMapping("/search")
	    public List<Bus> searchBuses(@RequestParam String source, @RequestParam String destination) {
	        return busService.searchBuses(source, destination);
	    }

	    @GetMapping
	    public List<Bus> getAll() {
	        return busService.getAllBuses();
	    }
}
