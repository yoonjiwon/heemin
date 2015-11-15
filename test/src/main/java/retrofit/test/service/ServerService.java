package retrofit.test.service;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.test.model.FriendList;
import retrofit.test.model.RegisterAll;
import retrofit.test.model.STAT;
import retrofit.test.model.User;
import retrofit.test.model.UserAuth;



public interface ServerService {
	/*http://square.github.io/retrofit/*/
	
		@PUT("/project/auth/loginuser")
		Call<STAT> loginUser(@Body UserAuth userauth);
		
		//@PUT("/project/auth/logoutuser")
		//Call<STAT> logoutUser(@Body UserAuth userauth);
		
		@GET("/project/friend/friendsearch")
		Call<FriendList> friendsearch(@Header("id") String id, @Query("userID") String userID);
	
		@GET("/project/service/getuser")
		Call<User> getUser(@Header("id") String id, @Query("userID") String userID);
		
		@POST("/project/auth/registeruser")
		Call<STAT> addUser(@Body RegisterAll add_user);
		
		@PUT("/project/service/modifyuser")
		Call<STAT> modifyUser(@Header("id") String id, @Body User modify_user);
		
		@DELETE("/project/removeuser")
		Call<User> removeUser();
		
	 /*   @GET("/project/restothertest")
	    Call<Person> getPerson();
	    
	    @GET("/project/parametertest")
	    Call<Person> getParamPerson(@Query("name") String name);
	    
	    @POST("/project/posttest")
	    Call<Person> getPostPerson(@Body Person request_person);
	    
	    @PUT("/project/puttest")
	    Call<Person> getPutPerson(@Body Person request_person);
	    
	    @GET("/project/headertest")
	    Call<Person> getHeaderPerson(@Header("id") String id,@Header("name") String name);
	    
	    @GET("/project/multitest")
	    Call<Person> getMultiPerson(@Header("id") String id,@Query("name") String name);
	    
	    @GET("/project/multipersontest")
	    Call<List<Person>> getListMultiPerson(@Header("id") String id,@Query("name") String name);
	    */
}
