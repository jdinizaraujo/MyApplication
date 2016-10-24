package br.com.jdinizaraujo.meuteste;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by juliana on 18/10/16.
 */

public class ExibeGifs extends Activity implements Callback<List<Giphy>> {

    private List<Giphy> mGiphy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exibe_gifs);

        requestGists();
        Giphy giphy = (Giphy) getGiphys();

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Picasso.with(this).load(giphy.GiphyImage.url).into(imageView);
    }


    private void requestGists(){
        GiphyService service = GiphyServiceBuilder.build();
        Call<GiphySearch> c = service.searchGifs("cats",1,service.API_KEY);
        c.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<Giphy>> call, Response<List<Giphy>> response) {
        List<Giphy> giphys = response.body();
        setGiphys(giphys);

    }

    @Override
    public void onFailure(Call<List<Giphy>> call, Throwable t) {

    }

    public void setGiphys(List<Giphy> giphys){
        this.mGiphy = giphys;
    }

    public List<Giphy> getGiphys(){
        return mGiphy;
    }

}
