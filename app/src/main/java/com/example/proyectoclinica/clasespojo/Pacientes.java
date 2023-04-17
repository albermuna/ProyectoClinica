package com.example.proyectoclinica.clasespojo;

import com.example.proyectoclinica.clasespojo.Citas;

import java.util.List;

public class Pacientes {

    public String dni;
    public String nombre;
    public String apellidos;
    public Integer edad;
    public List<Citas> citasPaciente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public List<Citas> getCitasPaciente() {
        return citasPaciente;
    }

    public void setCitasPaciente(List<Citas> citasPaciente) {
        this.citasPaciente = citasPaciente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
