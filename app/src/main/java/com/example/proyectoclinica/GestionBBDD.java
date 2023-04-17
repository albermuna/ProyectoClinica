package com.example.proyectoclinica;

import android.content.Context;
import com.example.proyectoclinica.clasespojo.Doctores;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class GestionBBDD {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    public GestionBBDD(Context context) {
        FirebaseApp.initializeApp(context);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("https://proyectoclinica-73b74-default-rtdb.europe-west1.firebasedatabase.app/");
    }

    public boolean introducirDoctor (Doctores doc) {
        Doctores d = new Doctores();
        d.setDni(doc.getDni());
        d.setApellidos(doc.getApellidos());
        d.setNombre(doc.getNombre());
        d.setEspecialidad(doc.getEspecialidad());
        d.setCitasDoctor(doc.getCitasDoctor());
        databaseReference.child("Doctores").child(d.getDni()).setValue(d);
        return true;
    }

}
