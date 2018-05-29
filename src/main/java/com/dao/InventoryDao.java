package com.dao;

import java.util.List;
import java.util.Map;

import com.pojo.Inventory;

public interface InventoryDao {
	
	int insertInventory(Inventory inv);

	int updateInfo(Inventory inv);

	int deleteInfo(int invId);

	Map<String, List<Inventory>> invInfo();

	

	

}
