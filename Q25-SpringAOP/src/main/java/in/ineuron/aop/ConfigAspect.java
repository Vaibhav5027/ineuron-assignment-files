package in.ineuron.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConfigAspect {
     
	@Pointcut("execution(public * in.ineuron.service.PersonServiceImpl.getWelcomeMsg(*))")
	public void operation() {
		
	}
	
	@Before(value = "operation()")
	public void beforeMethodCall() {
		System.out.println("before welcome msg");
	}
	
	@After(value = "operation()")
	public void afterMethodCall() {
		System.out.println("after welcome msg");
	}
	@AfterReturning(value = "operation()", returning = "obj")
	public void afterWelcomeMsg(Object obj) {
		System.out.println(obj);
	}
}
