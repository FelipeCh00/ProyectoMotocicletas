package ProyectoMotocicletas;

import ProyectoMotocicletas.Ventanas.VentanaGrafico;
import ProyectoMotocicletas.Ventanas.VentanaPrincipal;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        VentanaPrincipal i = new VentanaPrincipal();

        EventQueue.invokeLater(() -> {

            var ex = new VentanaGrafico();

        });
    }

}
