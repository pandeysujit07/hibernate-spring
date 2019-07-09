


import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.lti.component.Food;

import com.lti.interfaces.FoodInt;



public class FoodTest {

	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
@Test
public void test() {
		
		FoodInt cpi = (FoodInt) context.getBean("foodCartImpl1");
		
		
		Food f = new Food();
		f.setFoodNo(4);
		f.setFoodName("jackfruit");
		f.setFoodQuantity(5);
	
		
		cpi.addNewFood(f);
		
	}

@Test
public void fetch() {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	
	FoodInt cpi= (FoodInt) context.getBean("foodCartImpl1");
	Food cc=new Food();
				
	List<Food> list=cpi.getAvailableFood();
	for(Food c : list){
		System.out.println(c.getFoodNo());
		System.out.println(c.getFoodName());
		System.out.println(c.getFoodQuantity());
		

	}
}
	
}

