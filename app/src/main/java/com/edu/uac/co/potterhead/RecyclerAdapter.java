package com.edu.uac.co.potterhead;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.uac.co.potterhead.Model.Character;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CharacterViewHolder> {

    private Context context;
    private List<Character> characterList;

    public RecyclerAdapter(Context context, List<Character> characterList) {
        this.context = context;
        this.characterList = characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RecyclerAdapter.CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.character_data, parent, false);

        return new CharacterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.CharacterViewHolder holder, int position) {
        Character character = characterList.get(position);

        holder.tvName.setText(character.getName());

        if (!(character.getHouse() == "")) {
            holder.tvHouse.setText(character.getHouse());
        }

        holder.tvPatronous.setText(character.getPatronus());
        holder.tvSpecies.setText(character.getBloodStatus());
        holder.tvSpecies.setText(character.getSpecies());
        holder.tvBloodStatus.setText(character.getBloodStatus());
        holder.tvRole.setText(character.getRole());
        holder.tvSchool.setText(character.getSchool());
        if(character.isDeathEater() == true){
            holder.tvDeathEater.setText("true");
        } else {
            holder.tvDeathEater.setText("false");
        }
        if(character.isDumboldoresArmy() == true){
            holder.tvDumbArmy.setText("true");
        } else {
            holder.tvDumbArmy.setText("false");
        }
        if(character.isOrderOfThePhoenix() == true){
            holder.tvOrderFenix.setText("true");
        } else {
            holder.tvOrderFenix.setText("false");
        }
        if(character.isMinistryOfMagic() == true){
            holder.tvMinMagic.setText("true");
        } else {
            holder.tvMinMagic.setText("false");
        }
        holder.tvAlias.setText(character.getAlias());
        holder.tvWand.setText(character.getWand());
        holder.tvBoggart.setText(character.getBoggart());
        holder.tvAnimagus.setText(character.getAnimagus());
    }

    @Override
    public int getItemCount() {
        if (characterList != null) {
            return characterList.size();
        }
        return 0;
    }


    public class CharacterViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvHouse;
        TextView tvPatronous;
        TextView tvSpecies;
        TextView tvBloodStatus;
        TextView tvRole;
        TextView tvSchool;
        TextView tvDeathEater;
        TextView tvDumbArmy;
        TextView tvOrderFenix;
        TextView tvMinMagic;
        TextView tvAlias;
        TextView tvWand;
        TextView tvBoggart;
        TextView tvAnimagus;

        public CharacterViewHolder(@NonNull View itemView) {
            super(itemView);

            init(itemView);
        }

        public void init(View view) {
            tvName = (TextView) view.findViewById(R.id.nameTV);
            tvHouse = (TextView) view.findViewById(R.id.houseTV);
            tvPatronous = (TextView) view.findViewById(R.id.patronousTV);
            tvSpecies = (TextView) view.findViewById(R.id.speciesTV);
            tvBloodStatus = (TextView) view.findViewById(R.id.bloodStatusTV);
            tvRole = (TextView) view.findViewById(R.id.roleTV);
            tvSchool = (TextView) view.findViewById(R.id.schoolTV);
            tvDeathEater = (TextView) view.findViewById(R.id.deathEaterTV);
            tvDumbArmy = (TextView) view.findViewById(R.id.dumbArmyTV);
            tvOrderFenix = (TextView) view.findViewById(R.id.orderFenixTV);
            tvMinMagic = (TextView) view.findViewById(R.id.minMagicTV);
            tvAlias = (TextView) view.findViewById(R.id.aliasTV);
            tvWand = (TextView) view.findViewById(R.id.wandTV);
            tvBoggart = (TextView) view.findViewById(R.id.boggartTV);
            tvAnimagus = (TextView) view.findViewById(R.id.animaTV);
        }
    }
}
