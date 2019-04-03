package br.com.etecia.login_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEntrar = findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtUser = findViewById(R.id.txtUser);
                TextView txtPass = findViewById(R.id.txtPass);
                String user = txtUser.getText().toString();
                String pass = txtPass.getText().toString();

            }
        });
    }
}
