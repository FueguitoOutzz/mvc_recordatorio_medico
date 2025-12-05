package model;

public class Medicamento {
    private String nombre;
    private String dosis;
    private int frecuencia;
    public Medicamento(String nombre, String dosis, int frecuencia) {
        setNombre(nombre);
        setDosis(dosis);
        setFrecuencia(frecuencia);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del medicamento no puede estar vacío.");
        }
        this.nombre = nombre;
    }
    public String getDosis() {
        return dosis;
    }
    public void setDosis(String dosis) {
        if(dosis == null || dosis.trim().isEmpty()) {
            throw new IllegalArgumentException("La dosis del medicamento no puede estar vacía.");
        }
        this.dosis = dosis;
    }
    public int getFrecuencia() {
        return frecuencia;
    }
    public void setFrecuencia(int frecuencia) {
        if(frecuencia < 0) {
            throw new IllegalArgumentException("La frecuencia del medicamento no puede ser menor a 0.");
        }
        this.frecuencia = frecuencia;
    }
}
