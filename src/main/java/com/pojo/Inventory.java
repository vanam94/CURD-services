package com.pojo;

public class Inventory {

	private int invId;
	private String invName;
	private String invDesc ;
	private int quantity ;
	
	public Inventory() {
		
	}
	public Inventory(int invId, String invName, String invDesc, int quantity) {
		this.invId = invId;
		this.invName = invName;
		this.invDesc = invDesc;
		this.quantity = quantity;
	}
	public int getInvId() {
		return invId;
	}
	public void setInvId(int invId) {
		this.invId = invId;
	}
	public String getInvName() {
		return invName;
	}
	public void setInvName(String invName) {
		this.invName = invName;
	}
	public String getInvDesc() {
		return invDesc;
	}
	public void setInvDesc(String invDesc) {
		this.invDesc = invDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Inventory [invId=" + invId + ", invName=" + invName + ", invDesc=" + invDesc + ", quantity=" + quantity
				+ "]";
	}
	
	

}

