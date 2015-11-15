package retrofit.test.config;

import retrofit.JacksonConverterFactory;
import retrofit.Retrofit;
import retrofit.test.service.ServerService;


public class RetrofitConfig {
	public ServerService service;
	
	public RetrofitConfig(){
		Retrofit retrofit = new Retrofit.Builder()
	    .baseUrl("http://localhost:8080")
	    .addConverterFactory(JacksonConverterFactory.create())
	    .build();
		service =retrofit.create(ServerService.class);
	}
}
