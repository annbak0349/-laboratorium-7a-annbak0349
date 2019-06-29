package edu.wt.w07b;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface AnnBakAPI {
    String BASE_URL = "https://annbak0349.herokuapp.com/";

    @GET("airbnb/{city}/")
    Call<List<Question>> getQuestions(@Path("city") String title);
}