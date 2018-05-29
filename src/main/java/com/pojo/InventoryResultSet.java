package com.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class InventoryResultSet implements ResultSetExtractor<Map<String, List<Inventory>>>{

	public Map<String, List<Inventory>> extractData(ResultSet rs) throws SQLException, DataAccessException {
		Map<String, List<Inventory>> map= new HashMap<String, List <Inventory>>();
		List<Inventory> list=new  ArrayList<Inventory>();
		 while(rs.next()) {
			 Inventory inv= new Inventory();
			 
			 
			 inv.setInvId(rs.getInt("invId"));
			 inv.setInvName(rs.getString("invName"));
			 inv.setInvDesc(rs.getString("invDesc"));
			 inv.setQuantity(rs.getInt("quantity"));
			 list.add(inv);
			 }
		 
		 map.put("inventory Object", list);
		 return map;
		
		}
	

	}






		





