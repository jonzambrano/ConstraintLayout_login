package com.example.constraintlayoutlogin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.constraintlayoutlogin.LoginActivity;
import com.example.constraintlayoutlogin.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Asegúrate de que este layout coincida con el nombre de tu archivo XML
        setContentView(R.layout.activity_main);
    }

    /**
     * Este método es llamado cuando el botón 'Ingresar' es presionado.
     * Navega desde MainActivity hacia LoginActivity.
     * El atributo android:onClick="btStart" en el XML del botón enlaza a este método.
     */
    public void btStart(View v) {
        // La intención (Intent) ahora se crea desde MainActivity
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}