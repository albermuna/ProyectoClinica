package com.example.proyectoclinica.clasespojo;

import com.google.type.DateTime;

public class Citas {

    public String uid;
    public DateTime fechaHora;
    public Doctores doctor;
    public Pacientes paciente;
    public Centros centro;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public DateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(DateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Doctores getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctores doctor) {
        this.doctor = doctor;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public Centros getCentro() {
        return centro;
    }

    public void setCentro(Centros centro) {
        this.centro = centro;
    }
}
