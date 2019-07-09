package com.lti.component;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.interfaces.FoodInt;

@Component("foodCartImpl1")
public class FoodCart implements FoodInt {
	
	@PersistenceContext
	private  EntityManager entityManager;
	
	@Transactional
	public void addNewFood(Food food) {
		entityManager.persist(food);			
		}
	
	public List<Food> getAvailableFood() {
		
		//Query q =  entityManager.createQuery("select  c from CarPart as c");
		//List<CarPart> list = q.getResultList();
		//return list;
		
		return entityManager.createQuery("select  c from Food as c").getResultList();
	}

}
