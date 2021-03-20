package in.nit.test;

import java.io.File;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.nit.model.User;

public class JsonAnnotaionTest {

	public static void main(String[] args) {

		try {

//		creating User class object
			User user = new User();
			user.setuID(1001);
			user.setuName("Akaash");
			user.setuPassword("Ak@123");
			user.setuAuthor("Admin");

//		creating ObjectMapper class Object
			ObjectMapper om = new ObjectMapper();
			
			
//			writing Json values As String value
			String json = om.writeValueAsString(user);
//			printing json data
			System.out.println(json);
			
			System.out.println("------------------------------------------------------------");
			
			
//			writing Json values in file
			om.writeValue(new File("C:/Vikash/logs/user.json"), user);
			
			

		} catch (JsonProcessingException jpe) {
			jpe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
