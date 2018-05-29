package com.controller;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Inventory;

import com.service.InventoryService;


@Controller
public class InventoryController {
	@Autowired
	private InventoryService inventoryService;
	
	
	public InventoryService getInventoryService() {
		return inventoryService;
	}

	public void setInventoryServiceImpl(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}
	
	// // http://localhost:8080/JavaServices/create
	
	@RequestMapping(value="create", method=RequestMethod.PUT)
	@ResponseBody String put(@RequestBody Inventory inv) {
		System.out.println("data received is" + inv);
		String result = inventoryService.insertInventory(inv);
		return result;
		
	}
	
	// http://localhost:8080/JavaServices/update
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	 @ResponseBody String edit(@RequestBody Inventory inv){
		System.out.println("data we received is" + inv);
		String result =inventoryService.updateInfo(inv);
		return result;
		
	}
	
	// http://localhost:8080/JavaServices/delete?invId=12000
	
	@RequestMapping(value="delete", method=RequestMethod.DELETE)
	@ResponseBody String delete(@RequestParam int invId) {
		System.out.println("data we received is" + invId);
		String result =inventoryService.deleteInfo(invId);
		return result;
	
		
	}
	
	// http://localhost:8080/JavaServices/get
	
	@RequestMapping(value="get", method=RequestMethod.GET)
	 @ResponseBody  Map<String, List<Inventory>> getInventory(){
		Map<String, List<Inventory>> map=inventoryService.invList();
		return map;

	}
	
}
