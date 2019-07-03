package com.example.www.npfoodordering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class homepage extends AppCompatActivity {
    private Button btnQR,btnLogout;
    public static EditText output;
=======

public class homepage extends AppCompatActivity {
>>>>>>> 3f738d17ac29a1efcf21930deac75c9663137d82

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
<<<<<<< HEAD
        btnQR = findViewById(R.id.btnQR);
        btnLogout = findViewById(R.id.btnLogout);
        output = findViewById(R.id.etResult);

        btnQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homepage.this, qr_scanner.class));

            }
        });
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homepage.this,LoginPage.class));
                finish();
            }
        });
=======
>>>>>>> 3f738d17ac29a1efcf21930deac75c9663137d82
    }
}
