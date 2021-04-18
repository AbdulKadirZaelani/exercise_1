package com.dading.exercice1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class pendaftaran extends AppCompatActivity {
    EditText Nama,Alamat,email,pass,repass;
    Button Daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendaftaran);

        Nama = (EditText) findViewById(R.id.pnNama);
        Alamat = (EditText) findViewById(R.id.pnAlamat);
        email = (EditText) findViewById(R.id.pnEmail);
        pass = (EditText) findViewById(R.id.pnPass);
        repass = (EditText) findViewById(R.id.pnRepass);
        Daftar =(Button)findViewById(R.id.btnDaftar);

        Daftar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Nama.getText().toString().length() == 0) {
                    Nama.setError("Nama harus diisi!");
                } else if (Alamat.getText().toString().length() == 0) {
                    Alamat.setError("Alamat harus diisi!");
                } else if (email.getText().toString().length() == 0) {
                    email.setError("Email harus diisi!");
                } else if (pass.getText().toString().length() == 0) {
                    pass.setError("Password harus diisi!");
                } else if (repass.getText().toString().length() == 0) {
                    repass.setError("Masukan password Kembali!");
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Pendaftaran Berhasil!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}









