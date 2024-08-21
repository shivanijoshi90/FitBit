package com.example.fitbit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fitbit.databinding.ActivitySecondBinding;

public class Second_Activity extends AppCompatActivity {
    private ActivitySecondBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.txtforgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Second_Activity.this, "Forgot Password", Toast.LENGTH_SHORT).show();

            }
        });

        binding.txtsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Second_Activity.this, "Sign Up", Toast.LENGTH_SHORT).show();

            }
        });

        binding.btnlog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_Activity.this, Third_Activity.class);
                startActivity(intent);

            }
        });

    }

}

