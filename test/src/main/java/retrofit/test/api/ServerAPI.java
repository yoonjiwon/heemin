package retrofit.test.api;

import java.io.IOException;

import retrofit.Call;
import retrofit.Response;
import retrofit.test.config.RetrofitConfig;
import retrofit.test.model.FriendList;
import retrofit.test.model.RegisterAll;
import retrofit.test.model.STAT;
import retrofit.test.model.User;
import retrofit.test.model.UserAuth;

public class ServerAPI {

	private RetrofitConfig retrofit;

	public ServerAPI() {
		retrofit = new RetrofitConfig();
	}
	
	public STAT loginUser(UserAuth userauth){
		try{
			Call<STAT> stat = retrofit.service.loginUser(userauth);
			Response<STAT> per2 = stat.execute();
			return per2.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public FriendList friendSearch(String id, String userID){
		try{
			Call<FriendList> friend = retrofit.service.friendsearch(id, userID);
			Response<FriendList> per2 = friend.execute();
			return per2.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	public User getUser(String id, String userID){
		try{
			Call<User> user = retrofit.service.getUser(id, userID);
			Response<User> per2 = user.execute();
			return per2.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public STAT addUser(RegisterAll add_user){
		try{
			Call<STAT> stat = retrofit.service.addUser(add_user);
			Response<STAT> per2 = stat.execute();
			return per2.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	public STAT modifyUser(String id, User modify_user){
		try{
			Call<STAT> stat = retrofit.service.modifyUser(id, modify_user);
			Response<STAT> per2 = stat.execute();
			return per2.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*


	public Person getPerson(){
		try {
			Call<Person> person = retrofit.service.getPerson();
			Response<Person> per = null;
			per=person.execute();
			return per.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Person getParamPerson(String name){
		try {
			Call<Person> person = retrofit.service.getParamPerson(name);
			Response<Person> per = null;
			per=person.execute();
			return per.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Person getPostPerson(Person request_person){
		try {
			Call<Person> person = retrofit.service.getPostPerson(request_person);
			Response<Person> per = null;
			per=person.execute();
			return per.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Person getPutPerson(Person request_person){
		try {
			Call<Person> person = retrofit.service.getPutPerson(request_person);
			Response<Person> per = null;
			per=person.execute();
			return per.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Person getHeaderPerson(String id,String name){
		try {
			Call<Person> person = retrofit.service.getHeaderPerson(id, name);
			Response<Person> per = null;
			per=person.execute();
			return per.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Person getMultiPerson(String id,String name){
		try {
			Call<Person> person = retrofit.service.getMultiPerson(id, name);
			Response<Person> per = null;
			per=person.execute();
			return per.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Person> getListMultiPerson(String id,String name){
		try {
			Call<List<Person>> person = retrofit.service.getListMultiPerson(id, name);
			Response<List<Person>> per = null;
			per=person.execute();
			return per.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	*/
}
