package com.edu.uac.co.potterhead;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter {

    Context context;
    List<Character> characterList;

    public RecyclerAdapter(Context context, List<Character> characterList) {
        this.context = context;
        this.characterList = characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;

    }


}
