/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mvc_recordatorio_medico;

import controller.ControladorMedicamentos;
import controller.ControladorMenu;

/**
 *
 * @author Mizu
 */
public class Mvc_recordatorio_medico {

    public static void main(String[] args) {
        ControladorMedicamentos controlador = new ControladorMedicamentos();
        ControladorMenu controladorMenu = new ControladorMenu();
        
        controladorMenu.iniciar();
        //controlador.iniciar();
        
    }
}
