package com.motoacademy.lablogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Register extends AppCompatActivity {

    EditText txtEmail, txtPass;
    MaterialButton btnReg;
    TextView gotoLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtEmail = findViewById(R.id.edemail);
        txtPass = findViewById(R.id.edpass);
        btnReg = findViewById(R.id.btnEntrar);
        gotoLogin = findViewById(R.id.logNow);

        gotoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, passwd;

                email = txtEmail.getText().toString();
                passwd = String.valueOf(txtPass.getText());

                if(TextUtils.isEmpty(email)) {
                    Toast.makeText(Register.this, "O email não pode estar vazio", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(passwd)) {
                    Toast.makeText(Register.this, "Senha não pode estar vazio", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }
}