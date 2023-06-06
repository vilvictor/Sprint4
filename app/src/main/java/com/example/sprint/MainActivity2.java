package com.example.sprint;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button linkedinButton = findViewById(R.id.linkedinButton);
        Button callButton = findViewById(R.id.callButton);
        Button fragmentButton = findViewById(R.id.emailButton);

        linkedinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/victor-villegas-4658471a7"));
                startActivity(linkedinIntent);
            }
        });

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "+56976223669";
                Intent whatsappIntent = new Intent(Intent.ACTION_VIEW);
                whatsappIntent.setData(Uri.parse("https://api.whatsapp.com/send?phone=56976223669"));
                startActivity(whatsappIntent);
            }
        });

        fragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Agrega aquí el código para abrir el fragmento deseado
            }
        });
    }
}
