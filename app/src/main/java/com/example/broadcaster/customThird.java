package com.example.broadcaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

import com.example.broadcaster.databinding.ActivityBatteryThirdBinding;

public class customThird extends AppCompatActivity {
    ActivityBatteryThirdBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityBatteryThirdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String massage=getIntent().getStringExtra("massage");
        CustomBroadcastReceiver receiver = new CustomBroadcastReceiver(binding.thirdView);
        IntentFilter filter = new IntentFilter(CustomBroadcastReceiver.CUSTOM_ACTION);
        registerReceiver(receiver, filter);
    }
}