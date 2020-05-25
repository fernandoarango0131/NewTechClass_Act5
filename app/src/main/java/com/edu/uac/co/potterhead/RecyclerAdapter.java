package com.edu.uac.co.potterhead;

import android.content.Context;
import android.util.Log;
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
    private String house, patronous, species, bloodStatus, role, school, alias, wand, boggart, animagus;
    private Boolean deathEater, dumbArmy, fenixOrder, magicMin;

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

        house = character.getHouse();
        if (house == null) {
            holder.tvHouse.setVisibility(View.GONE);
            holder.lblHouse.setVisibility(View.GONE);
        } else {
            holder.tvHouse.setVisibility(View.VISIBLE);
            holder.lblHouse.setVisibility(View.VISIBLE);
            holder.tvHouse.setText(house);
        }

        patronous = character.getPatronus();
        if (patronous == null) {
            holder.tvPatronous.setVisibility(View.GONE);
            holder.lblPatro.setVisibility(View.GONE);
        } else {
            holder.tvPatronous.setVisibility(View.VISIBLE);
            holder.lblPatro.setVisibility(View.VISIBLE);
            holder.tvPatronous.setText(patronous);
        }

        species = character.getSpecies();
        if (species == null) {
            holder.tvSpecies.setVisibility(View.GONE);
            holder.lblSpecies.setVisibility(View.GONE);
        } else {
            holder.tvSpecies.setVisibility(View.VISIBLE);
            holder.lblSpecies.setVisibility(View.VISIBLE);
            holder.tvSpecies.setText(species);
        }

        bloodStatus = character.getBloodStatus();
        if (bloodStatus == null) {
            holder.tvBloodStatus.setVisibility(View.GONE);
            holder.lblBloodStat.setVisibility(View.GONE);
        } else {
            holder.tvBloodStatus.setVisibility(View.VISIBLE);
            holder.lblBloodStat.setVisibility(View.VISIBLE);
            holder.tvBloodStatus.setText(bloodStatus);
        }

        role = character.getRole();
        if (role == null) {
            holder.tvRole.setVisibility(View.GONE);
            holder.lblRole.setVisibility(View.GONE);
        } else {
            holder.tvRole.setVisibility(View.VISIBLE);
            holder.lblRole.setVisibility(View.VISIBLE);
            holder.tvRole.setText(role);
        }

        school = character.getSchool();
        if (school == null) {
            holder.tvSchool.setVisibility(View.GONE);
            holder.lblSchool.setVisibility(View.GONE);
        } else {
            holder.tvSchool.setVisibility(View.VISIBLE);
            holder.lblSchool.setVisibility(View.VISIBLE);
            holder.tvSchool.setText(school);
        }

        deathEater = character.isDeathEater();
            holder.tvDeathEater.setText(deathEater.toString());

        dumbArmy = character.isDumbledoresArmy();
        holder.tvDumbArmy.setText(dumbArmy.toString());

        fenixOrder = character.isOrderOfThePhoenix();
            holder.tvOrderFenix.setText(fenixOrder.toString());

        magicMin = character.isMinistryOfMagic();
            holder.tvMinMagic.setText(magicMin.toString());

        alias = character.getAlias();
        if (alias == null) {
            holder.tvAlias.setVisibility(View.GONE);
            holder.lblAlias.setVisibility(View.GONE);
        } else {
            holder.tvAlias.setVisibility(View.VISIBLE);
            holder.lblAlias.setVisibility(View.VISIBLE);
            holder.tvAlias.setText(alias);
        }

        wand = character.getWand();
        if (wand == null) {
            holder.tvWand.setVisibility(View.GONE);
            holder.lblWand.setVisibility(View.GONE);
        } else {
            holder.tvWand.setVisibility(View.VISIBLE);
            holder.lblWand.setVisibility(View.VISIBLE);
            holder.tvWand.setText(wand);
        }

        boggart = character.getBoggart();
        if (boggart == null) {
            holder.tvBoggart.setVisibility(View.GONE);
            holder.lblBoggart.setVisibility(View.GONE);
        } else {
            holder.tvBoggart.setVisibility(View.VISIBLE);
            holder.lblBoggart.setVisibility(View.VISIBLE);
            holder.tvBoggart.setText(boggart);
        }

        animagus = character.getAnimagus();
        if (animagus == null) {
            holder.tvAnimagus.setVisibility(View.GONE);
            holder.lblAnimagus.setVisibility(View.GONE);
        } else {
            holder.tvAnimagus.setVisibility(View.VISIBLE);
            holder.lblAnimagus.setVisibility(View.VISIBLE);
            holder.tvAnimagus.setText(animagus);
        }
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
        TextView lblHouse;
        TextView tvHouse;
        TextView lblPatro;
        TextView tvPatronous;
        TextView lblSpecies;
        TextView tvSpecies;
        TextView lblBloodStat;
        TextView tvBloodStatus;
        TextView lblRole;
        TextView tvRole;
        TextView lblSchool;
        TextView tvSchool;
        TextView lblDeathEater;
        TextView tvDeathEater;
        TextView lblDumbArmy;
        TextView tvDumbArmy;
        TextView lblFenOrder;
        TextView tvOrderFenix;
        TextView lblMagicMin;
        TextView tvMinMagic;
        TextView lblAlias;
        TextView tvAlias;
        TextView lblWand;
        TextView tvWand;
        TextView lblBoggart;
        TextView tvBoggart;
        TextView lblAnimagus;
        TextView tvAnimagus;


        public CharacterViewHolder(@NonNull View itemView) {
            super(itemView);

            init(itemView);
        }

        public void init(View view) {
            tvName = (TextView) view.findViewById(R.id.nameTV);
            lblHouse = (TextView) view.findViewById(R.id.houseLabel);
            tvHouse = (TextView) view.findViewById(R.id.houseTV);
            lblPatro = (TextView) view.findViewById(R.id.patronousLabel);
            tvPatronous = (TextView) view.findViewById(R.id.patronousTV);
            lblSpecies = (TextView) view.findViewById(R.id.speciesLabel);
            tvSpecies = (TextView) view.findViewById(R.id.speciesTV);
            lblBloodStat = (TextView) view.findViewById(R.id.bloodStatusTV);
            tvBloodStatus = (TextView) view.findViewById(R.id.bloodStatusTV);
            lblRole = (TextView) view.findViewById(R.id.roleLabel);
            tvRole = (TextView) view.findViewById(R.id.roleTV);
            lblSchool = (TextView) view.findViewById(R.id.schoolLabel);
            tvSchool = (TextView) view.findViewById(R.id.schoolTV);
            lblDeathEater = (TextView) view.findViewById(R.id.deathEaterLabel);
            tvDeathEater = (TextView) view.findViewById(R.id.deathEaterTV);
            lblDumbArmy = (TextView) view.findViewById(R.id.dumbArmyLabel);
            tvDumbArmy = (TextView) view.findViewById(R.id.dumbArmyTV);
            lblFenOrder = (TextView) view.findViewById(R.id.orderFenixLabel);
            tvOrderFenix = (TextView) view.findViewById(R.id.orderFenixTV);
            lblMagicMin = (TextView) view.findViewById(R.id.minMagicLabel);
            tvMinMagic = (TextView) view.findViewById(R.id.minMagicTV);
            lblAlias = (TextView) view.findViewById(R.id.aliasLabel);
            tvAlias = (TextView) view.findViewById(R.id.aliasTV);
            lblWand = (TextView) view.findViewById(R.id.wandLabel);
            tvWand = (TextView) view.findViewById(R.id.wandTV);
            lblBoggart = (TextView) view.findViewById(R.id.boggartLabel);
            tvBoggart = (TextView) view.findViewById(R.id.boggartTV);
            lblAnimagus = (TextView) view.findViewById(R.id.animagusLabel);
            tvAnimagus = (TextView) view.findViewById(R.id.animaTV);
        }
    }
}
