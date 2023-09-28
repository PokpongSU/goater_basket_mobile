package com.example.myprojectgoater;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    public Button button;

    // all project created by Pokpong Sunapha (WTZ) 65114540345

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView goater1;
        String img = "https://seeklogo.com/images/G/goat-head-logo-205100183F-seeklogo.com.png";
        goater1 = findViewById(R.id.goater1);
        Glide.with(this).load(img).into(goater1);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();

            }
        });


        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbutton = (MaterialButton) findViewById(R.id.button);

        // Username = admin
        // Password = admin
        // ต้องเป็น admin ให้เหมือนกันทั้ง 2 ถึงจะสามารถเข้าใช้งานได้

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    // correct
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    openActivity3();
                }else
                    // incorrect
                    Toast.makeText(MainActivity.this,"LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();

//                Button btn = findViewById(R.id.loginbutton);
//                btn.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                    }
//                });
            }
        });


    }
    public void openActivity3() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}