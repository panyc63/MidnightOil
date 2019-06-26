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
        loginbtn = findViewById(R.id.button);
        nme = findViewById(R.id.editText);
        pass = findViewById(R.id.editText2);
        loginbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nmee = nme.getText().toString();
                passw = pass.getText().toString();

                //Login code
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




