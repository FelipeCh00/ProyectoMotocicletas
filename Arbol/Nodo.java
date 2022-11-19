package ProyectoMotocicletas.Arbol;

import ProyectoMotocicletas.Ventanas.VentanaAgregarComponentes;
import ProyectoMotocicletas.Ventanas.VentanaEliminarComponentes;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Nodo {

    public Nodo izquierda = null;
    public Nodo derecha = null;
    public Componente cabeza = null;
    public Componente fin = null;
    private String placa;
    private int cilindraje;
    private String modelo;
    private String color;

    private int a = 0;
    Scanner sc;

    public Nodo() {
        abrirFlujo();
    }

    public void abrirFlujo() {
        try {
            sc = new Scanner(new InputStreamReader(System.in));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String leer() {
        try {
            return sc.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Componente crearComponentes() {

        Componente componente = new Componente();
        componente.setNombre(VentanaAgregarComponentes.nombre.getText());
        componente.setReferencia(VentanaAgregarComponentes.referencia.getText());
        componente.setPrecio(Integer.parseInt(VentanaAgregarComponentes.precio.getText()));
        return componente;
    }

    public void eliminarComponente(String componente) {

        Componente nodo = cabeza;

        String componenteUsuario;
        VentanaEliminarComponentes.nombreComponente.setVisible(true);
        VentanaEliminarComponentes.componenteCuadro.setVisible(true);
        componenteUsuario = componente;

        boolean flag = false;
        while (nodo != null) {
            if (nodo.getNombre().compareTo(componenteUsuario) == 0) {
                flag = true;
                if (nodo == cabeza) {//Eliminar Cabeza
                    cabeza = cabeza.siguiente;
                } else if (nodo == fin) {// Eliminar Fin
                    Componente aux = cabeza;
                    while (aux.siguiente != fin) {
                        aux = aux.siguiente;
                    }
                    fin = null;
                    fin = aux;
                    aux.siguiente = null;
                } else {//Eliminar en medio
                    Componente aux = cabeza;
                    while (aux.siguiente != nodo) {
                        aux = aux.siguiente;
                    }
                    aux.siguiente = nodo.siguiente;
                    nodo = null;
                }
                break;
            }
            nodo = nodo.siguiente;
        }
        if (flag) {
            VentanaEliminarComponentes.mensajeNoEncontrado.setVisible(false);
            VentanaEliminarComponentes.mensajeCompEliminado.setVisible(true);
        } else {
            VentanaEliminarComponentes.mensajeCompEliminado.setVisible(false);
            VentanaEliminarComponentes.mensajeNoEncontrado.setVisible(true);
        }

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "[Placa: " + this.placa + "]-" + "[Cilindraje: " + this.cilindraje + "]-" + "[Modelo: " + this.modelo + "]-" + "[Color: " + this.color + "]";
    }
}
