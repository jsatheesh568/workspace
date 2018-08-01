import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satheesh.service.LoginService;

public class Application {

	public static void main(String[] args) {
		//LoginService service =new LoginServiceImpl();
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		LoginService service = appContext.getBean("LoginService", LoginService.class);
System.out.println(service.findAll().get(0).getUsername());
	}

}
