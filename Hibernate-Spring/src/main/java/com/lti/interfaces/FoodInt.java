package com.lti.interfaces;

import java.util.List;

import com.lti.component.Food;

public interface FoodInt {
	
     public void addNewFood(Food food);
     
     public List<Food> getAvailableFood();
}
