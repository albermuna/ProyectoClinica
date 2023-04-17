package com.example.proyectoclinica.clasespojo;

import com.example.proyectoclinica.clasespojo.Citas;

import java.util.List;

public class Doctores {

    public String dni;
    public String nombre;
    public String apellidos;
    public String especialidad;
    public List<Citas> citasDoctor;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Citas> getCitasDoctor() {
        return citasDoctor;
    }

    public void setCitasDoctor(List<Citas> citasDoctor) {
        this.citasDoctor = citasDoctor;
    }
}
