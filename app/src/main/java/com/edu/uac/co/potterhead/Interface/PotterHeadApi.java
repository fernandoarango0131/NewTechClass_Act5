package com.edu.uac.co.potterhead.Interface;

import com.edu.uac.co.potterhead.Model.Character;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PotterHeadApi {

    @GET("characters?key=$2a$10$.N0pRkESmb3OXHg.we4pbOh9oUR9RKALXlPfYGMzAzJ/oM8d8koW6")
    Call<List<Character>> getCharacters();

    /*@GET("sortingHat")
    Call<String> getSortingHat();*/

}
