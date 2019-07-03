package com.example.www.npfoodordering;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    private Button loginbtn;
    private EditText nme, pass;
    private String nmee , passw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
<<<<<<< HEAD
<<<<<<< HEAD
        loginbtn = findViewById(R.id.btnLogin);
        nme = findViewById(R.id.etName);
        pass = findViewById(R.id.etPass);
=======
=======
>>>>>>> parent of ef24cf5... added QR Scanner
        loginbtn = findViewById(R.id.button);
        nme = findViewById(R.id.editText);
        pass = findViewById(R.id.editText2);
>>>>>>> 3f738d17ac29a1efcf21930deac75c9663137d82
        loginbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nmee = nme.getText().toString();
                passw = pass.getText().toString();

                //Login Page
                if (nmee.equals("abc") & passw.equals("1234"))
                {
                    Intent intent = new Intent(LoginPage.this, homepage.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginPage.this, "Wrong Login Details", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}




