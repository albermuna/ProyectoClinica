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
import com.google.firebase.database.*;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import org.jetbrains.annotations.NotNull;

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
                validarPaciente(dniUsuario, contraseñaUsuario);
                validarDoctor(dniUsuario, contraseñaUsuario);


            }
        });

    }

    private void validarDoctor(String dniUsuario, String contraseñaUsuario) {
        DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference("doctores");
        Query query = dbRef.orderByKey().equalTo(dniUsuario);
        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    String contraseña = snapshot.child("contraseña").getValue(String.class);
                }
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
    }

    private void validarPaciente(String dniUsuario, String contraseñaUsuario) {
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
    }


    public void createUser(View view) {


    }


}