package com.service;

import java.util.List;
import java.util.Map;

import com.pojo.Inventory;

public interface InventoryService {
	
	String insertInventory(Inventory inv);

	String updateInfo(Inventory inv);

	String deleteInfo(int invId);

	Map<String, List<Inventory>> invList();

	

}
