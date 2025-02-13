package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText txtEmail, txtSenha;
    MaterialButton bntEsqueceuSenha, bntCadastrar, bntEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //apresentando as variaveis
        bntCadastrar = findViewById(R.id.bntCadastrar);
        bntEntrar = findViewById(R.id.bntEntrar);
        bntEsqueceuSenha = findViewById(R.id.bntEsqueceuSenha);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);


        //criando ação para os botoes
        bntEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, password;

                if (email.equals("etecia") && password.equals("etecia")) {
                    startActivity(new Intent(getApplicationContext(), MenuPrincipalActivity.class));
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Usuário ou senha invalidos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}