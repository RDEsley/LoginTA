package com.example.loginta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtLogin, edtSenha;
    Button btnAcessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtLogin = (EditText) findViewById(R.id.txtLogin);
        edtSenha = (EditText) findViewById(R.id.txtSenha);
        btnAcessar = (Button) findViewById(R.id.cmdAcessar);
        btnAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(MainActivity.this, SegundaActivity.class);
                intencao.putExtra("LOGIN", edtLogin.getText().toString());
                intencao.putExtra("SENHA", edtSenha.getText().toString());

                startActivity(intencao);
            }
        });

    }
}