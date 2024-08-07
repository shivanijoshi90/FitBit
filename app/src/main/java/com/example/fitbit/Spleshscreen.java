package com.example.fitbit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.fitbit.databinding.ActivitySpleshscreenBinding;

public class Spleshscreen extends AppCompatActivity {

    private ActivitySpleshscreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivitySpleshscreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Set window insets if needed
        // ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), (v, insets) -> {
        //     Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //     v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        //     return insets;
        // });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Spleshscreen.this, MainActivity.class);
                startActivity(intent);

            }
        }, 3000);
    }
}
