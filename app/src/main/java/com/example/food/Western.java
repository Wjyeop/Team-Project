package com.example.food;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Western extends AppCompatActivity {
    Button btn_click;
    Random random = new Random();
    ImageView imageView;
    TextView txtResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);

        imageView = findViewById(R.id.imageView);
        btn_click = (Button) findViewById(R.id.click);
        txtResult = findViewById(R.id.food_name);
        btn_click.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int count = random.nextInt(4)+1;
                switch(count){
                    case 1 :
                        imageView.setImageResource(R.drawable.w_pic1);
                        txtResult.setText("파스타");
                        break;
                    case 2 :
                        imageView.setImageResource(R.drawable.w_pic2);
                        txtResult.setText("리조또");
                        break;
                    case 3 :
                        imageView.setImageResource(R.drawable.w_pic3);
                        txtResult.setText("스테이크");
                        break;
                    case 4 :
                        imageView.setImageResource(R.drawable.w_pic4);
                        txtResult.setText("피자");
                        break;
                }
            }
        });
    }
}
