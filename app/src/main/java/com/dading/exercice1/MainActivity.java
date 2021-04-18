package com.dading.exercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{

EditText email,password;

Button Login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        email = (EditText) findViewById(R.id.edtEmail);
        password = (EditText) findViewById(R.id.edtPass);
        Login = (Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().length()==0){
                    email.setError("Email harus diisi!");
                }else if(password.getText().toString().length()==0){
                    password.setError("Password harus diisi!");
                }else {Toast.makeText(getApplicationContext(),
                        "Login Berhasil!",
                        Toast.LENGTH_SHORT).show();

                }
            }
            public void LoginDaf(View view){
                Intent intent = new Intent(MainActivity.this, pendaftaran.class);
                startActivity(intent);
            }
        });
    }
}
