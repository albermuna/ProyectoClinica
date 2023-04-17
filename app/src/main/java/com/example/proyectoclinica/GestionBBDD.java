package com.example.proyectoclinica;

import android.content.Context;
import com.example.proyectoclinica.clasespojo.Centros;
import com.example.proyectoclinica.clasespojo.Citas;
import com.example.proyectoclinica.clasespojo.Doctores;
import com.example.proyectoclinica.clasespojo.Pacientes;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;


public class GestionBBDD {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    public GestionBBDD(Context context) {
        FirebaseApp.initializeApp(context);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("https://proyectoclinica-73b74-default-rtdb.europe-west1.firebasedatabase.app/");
    }

    public boolean introducirDoctor (Doctores doc) {
        HashMap<String, Object> doctor = new HashMap<>();
        doctor.put("dni", doc.getDni());
        doctor.put("nombre", doc.getNombre());
        doctor.put("apellidos", doc.getApellidos());
        doctor.put("especialidad", doc.getEspecialidad());
        doctor.put("citas", doc.getCitasDoctor());
        databaseReference.child("doctores").child(doc.getDni()).setValue(doctor);
        return true;
    }

    public boolean introducirPaciente (Pacientes pac) {
        HashMap<String, Object> paciente = new HashMap<>();
        paciente.put("dni", pac.getDni());
        paciente.put("nombre", pac.getNombre());
        paciente.put("apellidos", pac.getApellidos());
        paciente.put("edad", pac.getEdad());
        paciente.put("citas", pac.getCitasPaciente());
        databaseReference.child("pacientes").child(pac.getDni()).setValue(paciente);
        return true;
    }

    public boolean introducirCentro (Centros cen) {
        HashMap<String, Object> centro = new HashMap<>();
        centro.put("uid", cen.getUid());
        centro.put("nombre", cen.getNombre());
        centro.put("direccion", cen.getDireccion());
        centro.put("doctores", cen.getDoctoresCentro());
        centro.put("pacientes", cen.getPacientesCentro());
        centro.put("citas", cen.getCitasCentro());
        databaseReference.child("centros").child(cen.getUid()).setValue(centro);
        return true;
    }

    public boolean introducirCita (Citas cit) {
        HashMap<String, Object> cita = new HashMap<>();
        cita.put("uid", cit.getUid());
        cita.put("fecha y hora", cit.getFechaHora());
        cita.put("doctor", cit.getDoctor().getDni());
        cita.put("paciente", cit.getPaciente().getDni());
        cita.put("centro", cit.getCentro().getUid());
        databaseReference.child("citas").child(cit.getUid()).setValue(cita);
        return true;
    }

}
