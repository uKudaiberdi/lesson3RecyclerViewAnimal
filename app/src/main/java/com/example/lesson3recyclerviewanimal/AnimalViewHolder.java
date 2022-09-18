package com.example.lesson3recyclerviewanimal;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private TextView tv_animal;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_animal = itemView.findViewById(R.id.tv_animal);
    }

    public void bind (String animal){
        tv_animal.setText(animal);
    }
}
