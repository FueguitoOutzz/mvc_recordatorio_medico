package com.mycompany.mvc_recordatorio_medico.controller;

import com.mycompany.mvc_recordatorio_medico.model.recordatorio;
import java.util.ArrayList;
import java.util.List;

public class ControladorRecordatorios {
	private final List<recordatorio> recordatorios;
	private int nextId = 1;

	public ControladorRecordatorios() {
		this.recordatorios = new ArrayList<>();
	}

	public recordatorio agregar(recordatorio r) {
		if (r == null) throw new IllegalArgumentException("Recordatorio no puede ser null");
		r.setId(nextId++);
		recordatorios.add(r);
		return r;
	}

	public List<recordatorio> listar() {
		return new ArrayList<>(recordatorios);
	}

	public recordatorio buscarPorId(int id) {
		for (recordatorio r : recordatorios) {
			if (r.getId() == id) return r;
		}
		return null;
	}

	public boolean eliminar(int id) {
		recordatorio r = buscarPorId(id);
		if (r != null) {
			return recordatorios.remove(r);
		}
		return false;
	}

	public boolean actualizar(recordatorio updated) {
		if (updated == null) return false;
		for (int i = 0; i < recordatorios.size(); i++) {
			if (recordatorios.get(i).getId() == updated.getId()) {
				recordatorios.set(i, updated);
				return true;
			}
		}
		return false;
	}
}
