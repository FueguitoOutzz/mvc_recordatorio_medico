package com.mycompany.mvc_recordatorio_medico.model;
import java.util.ArrayList;

public class paciente extends usuario {
    private int edad;
    private ArrayList<String> historialMedico;
    private ArrayList<medicamento> medicamentos;
    
    public paciente(String id, String nombre, String email, String telefono, int edad, ArrayList<String> historialMedico) {
        super(id, nombre, email, telefono);
        setEdad(edad);
        setHistorialMedico(historialMedico);
        setMedicamentos(null);
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if(edad < 0 || edad > 130) {
            throw new IllegalArgumentException("La edad debe estar en el rango 0-130.");
        }
        this.edad = edad;
    }
    public ArrayList<String> getHistorialMedico() {
        return historialMedico;
    }
    public void setHistorialMedico(ArrayList<String> historialMedico) {
        if(historialMedico == null) {
            this.historialMedico = new ArrayList<>();
        } else {
            this.historialMedico = historialMedico;
        }
    }
    public ArrayList<medicamento> getMedicamentos() {
        return medicamentos;
    }
    public void setMedicamentos(ArrayList<medicamento> medicamentos) {
        if(medicamentos == null) {
            this.medicamentos = new ArrayList<>();
        } else {
            this.medicamentos = medicamentos;
        }
    }
    
}
