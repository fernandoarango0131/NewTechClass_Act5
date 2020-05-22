package com.edu.uac.co.potterhead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.edu.uac.co.potterhead.Interface.PotterHeadApi;
import com.edu.uac.co.potterhead.Model.Character;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private List<Character> characterList;
    //String sortedHouse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characterList = new ArrayList<>();
        //sortedHouse = new String();

        PotterHeadApi apiInterface = ApiClient.getClient().create(PotterHeadApi.class);

        Call<List<Character>> call = apiInterface.getCharacters();
        //Call<String> call = apiInterface.getSortingHat();

        call.enqueue(new Callback<List<Character>>() {
            /*@Override
            public void onResponse(Call<String> call, Response<String> response) {
                sortedHouse = response.body();
                Log.d("MainActivity", sortedHouse);
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d("MainActivity", t.toString());
            }*/

            @Override
            public void onResponse(Call<List<Character>> call, Response<List<Character>> response) {

                characterList = response.body();
                Log.d("MainActivity", characterList.size()+"");
            }

            @Override
            public void onFailure(Call<List<Character>> call, Throwable t) {

                Log.d("MainActivity", t.toString());
            }
        });


    }
}
