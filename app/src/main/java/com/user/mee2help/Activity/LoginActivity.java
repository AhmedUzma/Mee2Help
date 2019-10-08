package com.user.mee2help.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.user.mee2help.R;

public class LoginActivity extends AppCompatActivity {

    EditText edt_mob,edt_password;
    TextView txt_forgot;
    Button btn_login;
    LinearLayout lnr_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        onClick();
    }

    public void init(){
        edt_mob = findViewById(R.id.edt_mob);
        edt_password = findViewById(R.id.edt_password);
        txt_forgot = findViewById(R.id.txt_forgot);
        btn_login = findViewById(R.id.btn_login);
        lnr_register = findViewById(R.id.lnr_register);
    }

    public void onClick(){
        lnr_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });
    }
}
