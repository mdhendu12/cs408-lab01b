package com.example.cs408lab1b__mysteryhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cs408lab1b__mysteryhelper.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    MysteryHelper mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        mp = new MysteryHelper(getResources().getStringArray(R.array.fragments));
    }

    public void onClick(View view) {
        binding.fragmentTV.setText(mp.getRandomFragment());
    }
}