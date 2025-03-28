package com.example.loginta;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundaActivity extends AppCompatActivity {
     TextView tvLogin, tvSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);

        tvLogin = (TextView) findViewById(R.id.lblLogin);
        tvSenha = (TextView) findViewById(R.id.lblSenha);

        Bundle dados = getIntent().getExtras();
        String loginUsuario, senhaUsuario;
        loginUsuario = dados.getString("LOGIN");
        senhaUsuario = dados.getString("SENHA");

        tvSenha.setText(senhaUsuario);
        tvLogin.setText(loginUsuario);

    }
}