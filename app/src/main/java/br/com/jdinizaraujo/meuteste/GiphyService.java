package br.com.jdinizaraujo.meuteste;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by juliana on 24/10/16.
 */

public interface GiphyService {

    public static final String API_KEY = "dc6zaTOxFJmzC";

    // http://api.giphy.com/v1/gifs/search?q=cats&limit=9&api_key=dc6zaTOxFJmzC
    @GET("gifs/search")
    Call<GiphySearch> searchGifs(@Query("q") String query, @Query("limit") int limit, @Query("api_key") String api_key);
}
