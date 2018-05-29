package com.service;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.InventoryDao;
import com.pojo.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	private InventoryDao inventoryDao;
	
	

	public InventoryDao getInventoryDao() {
		return inventoryDao;
	}



	public void setInventoryDao(InventoryDao inventoryDao) {
		this.inventoryDao = inventoryDao;
	}



	public String insertInventory(Inventory inv) {
		System.out.println("data received in service"+ inv);
		int result= inventoryDao.insertInventory(inv);
		
		if(result==0) {
			return "Inventory entry failed";
		}else {
			return "Inventory entry Successful";
			
		}
		
	}



	public String updateInfo(Inventory inv) {
		System.out.println("data received in service"+ inv);
		int result= inventoryDao.updateInfo(inv);
		
		if(result==0) {
			return "Inventory update failed";
		}else {
			return "Inventory update Successful";
			
		}
	}



	public String deleteInfo(int invId) {
		System.out.println("data received in service"+ invId);
		int result= inventoryDao.deleteInfo(invId);
		
		if(result==0) {
			return "Inventory delete failed";
		}else {
			return "Inventory delete Successful";
			
		}
	}



	public Map<String, List<Inventory>> invList() {
		Map<String, List<Inventory>> result= inventoryDao.invInfo();
		return result;
		
	}
	

}
