package com.example.pengbuding.takehomelesson07_liyanp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by pengbuding on 24/03/2018.
 */

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public TextView animalName;
    public TextView averageAge;
    public ImageView animalPic;

    public AnimalViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        animalName = (TextView) itemView.findViewById(R.id.animal_name);
        averageAge = (TextView) itemView.findViewById(R.id.average_age_text);
        animalPic = (ImageView) itemView.findViewById(R.id.animal_image);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, animalName.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
