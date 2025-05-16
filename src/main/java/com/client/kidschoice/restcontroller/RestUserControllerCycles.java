package com.client.kidschoice.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.client.kidschoice.entity.VwProductsBike;
import com.client.kidschoice.entity.VwProductsCycle;
import com.client.kidschoice.service.impl.ProductsCycleService;

@RestController
public class RestUserControllerCycles {
	
	@Autowired
	private ProductsCycleService productsCycleService;
	
	   @GetMapping("/allCycles")
	    public List<VwProductsCycle> getAllProductsCycles() {
	        return productsCycleService.getAllProductsCycles();
	    }
	   @GetMapping("/allCyclesByPID/{productID}")
	    public List<VwProductsCycle> getProductsCyclesByProductID(@PathVariable String productID) {
	        return productsCycleService.getProductsCyclesByProductID(productID);
	    }

}
