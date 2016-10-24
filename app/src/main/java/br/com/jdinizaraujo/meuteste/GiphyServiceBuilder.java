package br.com.jdinizaraujo.meuteste;

import com.facebook.stetho.okhttp3.StethoInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by juliana on 24/10/16.
 */

public class GiphyServiceBuilder {

    public static GiphyService build(){

        OkHttpClient.Builder httpCliente = new OkHttpClient.Builder();

        httpCliente.addNetworkInterceptor(new StethoInterceptor());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.giphy.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpCliente.build())
                .build();

        return (GiphyService) retrofit.create(GiphySearch.class);
    }
}
