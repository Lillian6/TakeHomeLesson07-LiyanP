package com.example.pengbuding.takehomelesson07_liyanp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.security.PrivateKey;
import java.util.ArrayList;

/**
 * Created by pengbuding on 24/03/2018.
 */

public  class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private ArrayList<Animal> animals;
    private Context context;

    public AnimalAdapter(ArrayList<Animal> animals, Context context) {
        this.animals = animals;
        this.context = context;
    }

    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new AnimalViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.animalName.setText(animal.name);
        holder.averageAge.setText(animal.averageAge);
        holder.animalPic.setImageResource(animal.imageId);

    }

    public int getItemCount(){return animals.size();}

}
