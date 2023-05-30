package in.ineuron;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.model.User;
import in.ineuron.service.UserService;

@SpringBootApplication
public class Q21SpringDataJpaApplication  {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Q21SpringDataJpaApplication.class, args);
		UserService service =(UserService) context.getBean("userservice"); 
		User user =new User();
		user.setName("RAM");
		user.setQulification("BE");
		user.setDesignation("SystermEngineer");
		service.save(user);
	}

	
   
}
