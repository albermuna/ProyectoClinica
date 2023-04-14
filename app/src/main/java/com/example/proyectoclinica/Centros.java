package com.example.proyectoclinica;

import java.util.ArrayList;
import java.util.List;

public class Centros {
    public Integer id;
    public String nombre;
    public String direccion;
    public List<Doctores> doctoresCentro = new ArrayList<Doctores>();
    public List<Pacientes> pacientesCentro = new ArrayList<Pacientes>();
    public List<Citas> citasCentro = new ArrayList<Citas>();

    public Centros() {

    }

    public Centros(Integer id, String nombre, String direccion,
                   List<Doctores> doctoresCentro, List<Pacientes> pacientesCentro,
                   List<Citas> citasCentro) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this. doctoresCentro = doctoresCentro;
        this.pacientesCentro = pacientesCentro;
        this.citasCentro = citasCentro;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDoctoresCentro(List<Doctores> doctoresCentro) {
        this.doctoresCentro = doctoresCentro;
    }

    public List<Doctores> getDoctoresCentro() {
        return doctoresCentro;
    }

    public void setPacientesCentro(List<Pacientes> pacientesCentro) {
        this.pacientesCentro = pacientesCentro;
    }

    public List<Pacientes> getPacientesCentro() {
        return pacientesCentro;
    }

    public void setCitasCentro(List<Citas> citasCentro) {
        this.citasCentro = citasCentro;
    }

    public List<Citas> getCitasCentro() {
        return citasCentro;
    }
}
