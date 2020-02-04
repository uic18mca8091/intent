package com.example.practical1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.practical1.R;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.img);

        Intent receivedIntent = getIntent();
        Uri receivedUri = receivedIntent.getParcelableExtra(Intent.EXTRA_STREAM);

        if (receivedUri != null) {
            imageView.setImageURI(receivedUri);
        }

    }
}
