package com.mycompany.mvc_recordatorio_medico.model;

import java.util.ArrayList;

/**
 *
 * @author valde
 */
public class GestorMedicamentos {
    private ArrayList<Medicamento> medicamentos;
    
    public GestorMedicamentos(){
        this.medicamentos = new ArrayList<>();
    }
    
    public ArrayList<Medicamento> getMedicamentos(){
        return medicamentos;
    }
    
    public void agregarMedicamento(Medicamento m){
        medicamentos.add(m);
    }
}
