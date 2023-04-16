package com.example.proyectoclinica;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class GestionBBDD {


    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    public GestionBBDD(Context context) {
        FirebaseApp.initializeApp(context);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();


    }

    public boolean introducirDoctor (Doctores doc) {

        return true;
    }

}
