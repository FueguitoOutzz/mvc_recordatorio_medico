package controller;

import view.MenuPrincipal;
import view.VistaMedicamentos;

/**
 *
 * @author valde
 */
public class ControladorMenu {
    private MenuPrincipal menu;
    private ControladorMedicamentos controladorMedicamentos;
    
    public ControladorMenu(){
        this.menu = new MenuPrincipal();
        this.controladorMedicamentos = new ControladorMedicamentos();
    }
    
    public void iniciar(){
        this.menu.setVisible(true);
        this.menu.getMedicamentosButton().addActionListener(e -> {
            this.menu.setVisible(false);
            this.controladorMedicamentos.iniciar();
        });
    }
}
