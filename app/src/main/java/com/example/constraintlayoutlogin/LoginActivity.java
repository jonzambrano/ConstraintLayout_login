package com.example.constraintlayoutlogin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.constraintlayoutlogin.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout tilUsuario;
    private TextInputEditText edtUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Enlazar las vistas del XML con las variables de Java
        tilUsuario = findViewById(R.id.textInputLayoutUser);
        edtUsuario = findViewById(R.id.editTextUser);
    }

    /**
     * Este método es llamado cuando el botón 'Ingresar' de la pantalla de login es presionado.
     * Valida si el campo de usuario está vacío.
     */
    public void btLogin(View v) {
        String usuario = edtUsuario.getText().toString().trim();

        if (usuario.isEmpty()) {
            tilUsuario.setError("Nombre requerido");
        } else {
            tilUsuario.setErrorEnabled(false);
            // Aquí continuaría la lógica de autenticación
        }
    }
}