package com.example.proyectoclinica.pantallas;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.proyectoclinica.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

public class InicioSesion extends AppCompatActivity {
    TextView nuevoUsuario;
    EditText dni, contraseña;
    Button entrar;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        nuevoUsuario = findViewById(R.id.crearUsuarioTextView);
        contraseña = findViewById(R.id.contraseñaEditText);
        dni = findViewById(R.id.dniEditText);
        entrar = findViewById(R.id.entrarButton);
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dniUsuario = dni.getText().toString();
                String contraseñaUsuario = contraseña.getText().toString();

                db.collection("pacientes")
                        .whereEqualTo("dni", dniUsuario)
                        .whereEqualTo("contraseña", contraseñaUsuario)
                        .get()
                        .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                if (task.isSuccessful()) {
                                    if (task.getResult().size() > 0) {
                                        // Las credenciales son correctas, iniciar sesión como paciente
                                        // ...
                                    } else {
                                        // Las credenciales son incorrectas, mostrar un mensaje de error
                                        // ...
                                    }
                                } else {
                                    // Error al comprobar las credenciales, mostrar un mensaje de error
                                    // ...
                                }
                            }
                        });

                db.collection("doctores")
                        .whereEqualTo("dni", dniUsuario)
                        .whereEqualTo("contraseña", contraseñaUsuario)
                        .get()
                        .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                            @Override
                            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                if (task.isSuccessful()) {
                                    if (task.getResult().size() > 0) {
                                        // Las credenciales son correctas, iniciar sesión como doctor
                                        // ...
                                    } else {
                                        // Las credenciales son incorrectas, mostrar un mensaje de error
                                        // ...
                                    }
                                } else {
                                    // Error al comprobar las credenciales, mostrar un mensaje de error
                                    // ...
                                }
                            }
                        });
            }
        });

    }







    public void createUser(View view) {


    }


}