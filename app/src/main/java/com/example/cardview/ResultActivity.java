package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {
    private TextView mGreetingTextView;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Inicialitza el TextView i ImageView on es mostrarà la felicitació i la imatge
        mGreetingTextView = findViewById(R.id.greeting_text_view);
        mImageView = findViewById(R.id.image_view);

        // Recull les dades del formulari passades a través de l'Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String surname = intent.getStringExtra("surname");

        // Utilitza una funció aleatòria per seleccionar una felicitació de Nadal i una imatge aleatòria
        String[] greetings = {"Feliz Navidad", "Bon Nadal", "Merry Christmas","Bones Festes"};
        int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
        Random random = new Random();
        int index = random.nextInt(greetings.length-1);
        int imageId = images[index];

        // Crea la felicitació personalitzada amb el nom i el cognom
        String greeting = greetings[index] + " " + name + " " + surname;

        // Estableix la felicitació personalitzada i la imatge seleccionada aleatòriament en el TextView i ImageView
        mGreetingTextView.setText(greeting);
        mImageView.setImageResource(imageId);
    }
}