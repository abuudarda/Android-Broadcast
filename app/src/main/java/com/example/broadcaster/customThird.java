package com.example.broadcaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.example.broadcaster.databinding.ActivityBatteryThirdBinding;
import com.example.broadcaster.databinding.ActivityCustomBcinputBinding;

public class customThird extends AppCompatActivity {
    ActivityBatteryThirdBinding binding;
    CustomBroadcastReceiver cbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityBatteryThirdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String Value = intent.getStringExtra("message");

        IntentFilter intentFilter = new IntentFilter("com.example.broadcaster.CUSTOM_ACTION");
        cbr =new CustomBroadcastReceiver(binding.thirdView);
        registerReceiver(cbr, intentFilter);

        binding.thirdView.setText(Value);

    }
}