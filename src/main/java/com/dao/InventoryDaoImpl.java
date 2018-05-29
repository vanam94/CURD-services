package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pojo.Inventory;
import com.pojo.InventoryResultSet;




@Repository
public class InventoryDaoImpl implements InventoryDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}	
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate=namedParameterJdbcTemplate;
	}

	

	public int insertInventory(Inventory inv) {
		System.out.println("received data to dao layer"+ inv);
		String insertQuery="insert into dealer values(?,?,?,?)";
		int rowsAffected= jdbcTemplate.update
				(insertQuery,new Object[] {inv.getInvId(),inv.getInvName(),inv.getInvDesc(),inv.getQuantity()});
		return rowsAffected;
	}


	public int updateInfo(Inventory inv) {
		System.out.println("data received to dao layer is" + inv);
		String updateQuery="update dealer set invName=:name, invDesc =:desc, quantity= :quan where invId= :id";
		
		Map<String, Object>  map= new HashMap<String, Object>();

		map.put("name", inv.getInvName());
		map.put("desc",inv.getInvDesc());
		map.put("quan", inv.getQuantity());
		map.put("id", inv.getInvId());
		
		int noOfRowsAffected= namedParameterJdbcTemplate.update(updateQuery,map);
		return noOfRowsAffected;
	
	
	}


	public int deleteInfo(int invId) {
		System.out.println("data received to dao layer is" + invId);
		String deleteQuery="delete from dealer where invId=?";
		int noOfRowsAffected= jdbcTemplate.update(deleteQuery,new Object[] {invId});
		return noOfRowsAffected;
	}


	public Map<String, List<Inventory>> invInfo() {
		String sql="select * from dealer";
		Map<String, List<Inventory>> mapObj= jdbcTemplate.query(sql, new InventoryResultSet());
		return mapObj;
	}

}
