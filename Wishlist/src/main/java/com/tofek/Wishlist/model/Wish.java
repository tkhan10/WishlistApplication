/**
 * 
 */
package com.tofek.Wishlist.model;

import java.sql.Date;

/**
 * @author tkhan26
 *
 */
public class Wish {

	private String wishName;
	private String wishId;
	private Date startDate;
	private Date endDate;
	private boolean isActive = true;
	
	
	
	
	/**
	 * @param wishName
	 * @param wishId
	 * @param startDate
	 * @param endDate
	 */
	public Wish(String wishName, String wishId, Date startDate, Date endDate) {
		super();
		this.wishName = wishName;
		this.wishId = wishId;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	public String getWishName() {
		return wishName;
	}
	public void setWishName(String wishName) {
		this.wishName = wishName;
	}
	public String getWishId() {
		return wishId;
	}
	public void setWishId(String wishId) {
		this.wishId = wishId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
