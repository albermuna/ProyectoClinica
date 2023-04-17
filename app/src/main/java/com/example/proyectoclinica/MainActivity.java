package com.example.proyectoclinica;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.proyectoclinica.clasespojo.Doctores;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    FirebaseFirestore firestore;
    GestionBBDD gestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer a = 4;
        gestion = new GestionBBDD(this);
        Doctores doc = new Doctores();
        doc.setDni("73137878V");
        doc.setNombre("Alberto");
        gestion.introducirDoctor(doc);
    }
}