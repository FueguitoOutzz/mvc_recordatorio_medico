package com.mycompany.mvc_recordatorio_medico.model;

public abstract class usuario {
    private String id;
    private String nombre;
    private String email;
    private String telefono;
    public usuario(String id, String nombre, String email, String telefono) {
        setId(id);
        setNombre(nombre);
        setEmail(email);
        setTelefono(telefono);
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        if(id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El id del usuario no puede estar vacío.");
        }
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del usuario no puede estar vacío.");
        }
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("El email del usuario no puede estar vacío.");
        }
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        if(telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El teléfono del usuario no puede estar vacío.");
        }
        this.telefono = telefono;
    }
}