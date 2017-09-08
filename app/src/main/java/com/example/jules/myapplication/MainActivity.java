package com.example.jules.myapplication;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import android.text.TextWatcher;
import android.text.Editable;



public class MainActivity extends AppCompatActivity {
    TextView monTexte = null;
    Button raz = null;
    EditText login = null;
    EditText password = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        monTexte = (TextView) findViewById(R.id.text);

        setContentView(R.layout.activity_main);

        raz = (Button) findViewById(R.id.raz);

        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);

        raz.setOnClickListener(razlistener);
    }

    private View.OnClickListener razlistener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String l = login.getText().toString();
            String p = password.getText().toString();
            String admin = "admin";

            int comparaison = l.compareToIgnoreCase("admin");
            if (comparaison != 0)
                Toast.makeText(getApplicationContext(), "Notre service est actuellement indisponible.", Toast.LENGTH_SHORT).show();
            int comparaison2 = p.compareToIgnoreCase("admin");
            if (comparaison2 != 0 && comparaison == 0)
                Toast.makeText(getApplicationContext(), "Notre service est actuellement indisponible.", Toast.LENGTH_SHORT).show();
            if (comparaison == 0 && comparaison2 == 0)
                Toast.makeText(getApplicationContext(), "Welcome Admin", Toast.LENGTH_SHORT).show();
            login.getText().clear();
            password.getText().clear();
        }
    };

}
