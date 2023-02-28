package com.example.broadcaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.broadcaster.databinding.ActivityCustomBcinputBinding;

public class customBCinput extends AppCompatActivity {
    private TextView mTextView;
    public static final String CUSTOM_ACTION = "com.example.broadcaster.CUSTOM_ACTION";

    ActivityCustomBcinputBinding binding;
    CustomBroadcastReceiver cbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityCustomBcinputBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.Broadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(customBCinput.this, CustomBroadcastReceiver.class);
                intent.putExtra("key", binding.bcinput.getText().toString());
                startActivity(intent);
            }
        });

//        binding.Broadcast.setOnClickListener(view -> {
//            Intent service = new Intent(customBCinput.this, )
//        });
//        mTextView=findViewById(R.id.customReceive);


//        Intent intent = new Intent(this,customBCinput.class);
//        String def=binding.bcinput.toString();
//        intent.putExtra("message", def);
//        startService(intent);



//        cbr=new CustomBroadcastReceiver(binding.customReceive);
//        registerReceiver(cbr,intent);

    }


}