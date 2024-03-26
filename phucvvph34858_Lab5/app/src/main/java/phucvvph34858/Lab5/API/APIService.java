package phucvvph34858.Lab5.API;

import java.util.ArrayList;
import java.util.List;


import phucvvph34858.Lab5.DTO.ShoeDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIService {


    String DOMAIN = "http://192.168.0.101:3000";

    @GET("/api/get-list-distributors")
    Call<List<ShoeDTO>> getShoe();

    @POST("/api/post-distributors")
    Call<ShoeDTO> createShoe(@Body ShoeDTO distributors);


    @PUT("/api/update-distributors-by-id/{id}")
    Call<ShoeDTO> updateShoe(@Path("id") String id, @Body ShoeDTO distributors);

    @DELETE("/api/delete-distributors-by-id/{id}")
    Call<ShoeDTO> deleteShoe(@Path("id") String id);


    @GET("/api/search-distributors")
    Call<ArrayList<ShoeDTO>> searchDistributor(@Query("name") String name);
}
