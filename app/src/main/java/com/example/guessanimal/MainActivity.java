package com.example.guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView animalImage;
    Button resultBin;
    Boolean isDogImage;
    Boolean isCatImage;
    Boolean isGiraffeImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animalImage = findViewById(R.id.animalImage);
        resultBin = findViewById(R.id.resultBin);

        resultBin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                if (isDogImage){
                    intent.putExtra("key", "Собака");
                } else if (isCatImage){
                    intent.putExtra("key", "Кошка");
                } else if (isGiraffeImage){
                    intent.putExtra("key", "Жираф");
                } else{
                    intent.putExtra("key", "Животное не выбрано");
                }

                startActivity(intent);
            }
        });
    }

    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.dogBtn:
                isDogImage = true;
                isCatImage = false;
                isGiraffeImage = false;
                animalImage.setImageResource(R.drawable.dog);
                break;
            case R.id.catBtn:
                isDogImage = false;
                isCatImage = true;
                isGiraffeImage = false;
                animalImage.setImageResource(R.drawable.cat);
                break;
            case R.id.giraffeBtn:
                isDogImage = false;
                isCatImage = false;
                isGiraffeImage = true;
                animalImage.setImageResource(R.drawable.giraffe);
                break;
        }
    }
    public void answer(View view) {
        switch (view.getId()) {
            case R.id.thisDogBtn:
                if(isDogImage) {
                    Toast.makeText(this, "Верно", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Неверно", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.thisCatBtn:
                if(isCatImage) {
                    Toast.makeText(this, "Верно", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Неверно", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.thisGiraffeBtn:
                if(isGiraffeImage) {
                    Toast.makeText(this, "Верно", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Неверно", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}