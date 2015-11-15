package retrofit.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import retrofit.test.api.ServerAPI;
import retrofit.test.model.FriendList;
import retrofit.test.model.Person;
import retrofit.test.model.RegisterAll;
import retrofit.test.model.STAT;
import retrofit.test.model.User;

public class App {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ServerAPI api = new ServerAPI();
		User per2;
		STAT stat;
		RegisterAll add_user = new RegisterAll();
		User modify_user = new User();
		FriendList fl;
		
		Person per;
		Person request_person = new Person();
		
		FriendList frstat;
		frstat = api.friendSearch("jiwon90", "jiwon90");
		//ObjectMapper mapper = new ObjectMapper(); 

		//fr.setFriendList((FriendList)stat.getRsp());

		
	
		//FriendList fr = mapper.readValue(stat.getRsp().toString(), FriendList.class);  
		//System.out.println(obj2.equals(new FriendList()));
		
		//System.out.println(frstat.getRsp().getFriendList().get(0).getUserID());
		
		/*
		per2 = api.getUser("jiwon90", "jiwon90");
		print_user(per2);
	
		
		add_user.setId("jiwon10");
		add_user.setPassword("1010");
		add_user.setUserName("hallo");
		add_user.setUserAge("5");
		add_user.setPhone("0204920");
		add_user.setComment("bgjgj");
		
		stat = api.addUser(add_user);
		System.out.println(stat.getStat()+stat.getCause());
		
		
		modify_user.setUserID("jiwon90");
		modify_user.setUserName("hal");
		modify_user.setUserAge("10");
		modify_user.setPhone("0920");
		modify_user.setComment("ㅠㅠ");
		
		stat = api.modifyUser("jiwon90",modify_user);
		System.out.println(stat.getStat());
		
	/*	
		// API TEST
		// GET API TEST
		per = api.getPerson();
		print(per);
		// GET API PARAMETER TEST
		per = api.getParamPerson("heemin");
		print(per);
		// POST API TEST
		request_person.setAge("29");
		request_person.setCompany("samsung");
		request_person.setId("heemin87");
		request_person.setName("KIM HEE MIN");
		request_person.setPhone("010 ....");
		
		per = api.getPostPerson(request_person);
		print(per);
		//PUT API TEST
		request_person.setAge("30");
		request_person.setCompany("samsung!!");
		request_person.setId("heemin870");
		request_person.setName("KIM HEE MIN2");
		request_person.setPhone("010 ....");
		
		per = api.getPutPerson(request_person);
		print(per);
		
		//Header API TEST
		per = api.getHeaderPerson("seo12","Seo Sung won");
		print(per);
		
		//Multi API TEST
		per=api.getMultiPerson("headerID", "paramname");
		print(per);
		
		//Multi Person API TEST
		List<Person> list = new ArrayList<Person>();
		list=api.getListMultiPerson("kim8989", "heemin");
		System.out.println("List");
		for(int i=0; i<list.size();i++){
		print(list.get(i));
		}
	*/	
		
	}

	public static void print(Person per) {
		System.out.println("id:" + per.getId() + ", name:" + per.getName() + ", age:" + per.getAge() + ", phone:" + per.getPhone() + ", company:"
				+ per.getCompany());
	}
	
	public static void print_user(User per2) {
		System.out.println("userid:" + per2.getUserID() + ", username:" + per2.getUserName() + ", userage:" + per2.getUserAge() + ", phone:" + per2.getPhone() + ", comment:"
				+ per2.getComment());
	}
}
