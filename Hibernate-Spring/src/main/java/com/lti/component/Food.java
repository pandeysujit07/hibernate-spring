package com.lti.component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "TBL_FOOD")
public class Food {
    
	@Id
	@Column(name="FOOD_NO")
	private int foodNo;
	
	@Column(name="FOOD_NAME")
	private String foodName;
	
	@Column(name="FOOD_QUANTITY")
	private int foodQuantity;
	
	public int getFoodNo() {
		return foodNo;
	}
	public void setFoodNo(int foodNo) {
		this.foodNo = foodNo;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodQuantity() {
		return foodQuantity;
	}
	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	
	
	
}
