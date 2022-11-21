package ProyectoMotocicletas.Ventanas;

import ProyectoMotocicletas.Arbol.Nodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaVender extends JFrame {

    private JLabel venderMoto;
    private JLabel banner;
    private JLabel buscarTexto;
    private JLabel noEncontrado;
    private JLabel estaSeguro;
    private JLabel vendido;

    private JTextField buscarCuadro;
    private JTextArea visualizarMoto;

    private JButton buscar;
    private JButton atras;
    private JButton si;
    private JButton no;


    public VentanaVender() {
        inicializarComponentes();
        dimensionar();
        adicionar();
        visualizar();
        acciones();
        setTitle("Eliminar Motocicleta");
    }

    public void inicializarComponentes() {
        this.atras = new JButton("Atrás");
        this.banner = new JLabel();
        this.venderMoto = new JLabel("<html>Eliminar <p> Motocicleta");
        this.buscarTexto = new JLabel("Digite la placa de la Motocicleta:");
        this.buscarCuadro = new JTextField();
        this.buscar = new JButton("Buscar");
        this.noEncontrado = new JLabel("No se encontró la Motocicleta", SwingConstants.CENTER);
        this.estaSeguro = new JLabel("<html> ¿Está seguro que desea vender esta motocicleta?", SwingConstants.CENTER);
        this.visualizarMoto = new JTextArea();
        this.si = new JButton("Sí");
        this.no = new JButton("No");
        this.vendido = new JLabel("La Motocicleta fue vendida",SwingConstants.CENTER);

    }

    public void dimensionar() {
        this.setLayout(null);

        // ETIQUETA TITULO
        this.venderMoto.setBounds(90, 20, 320, 90);
        this.venderMoto.setForeground(Color.white);
        this.venderMoto.setFont(new Font("Felix Titling", Font.BOLD, 40));


        // BOTON ATRAS
        this.atras.setBounds(50, 500, 130, 30);
        this.atras.setBackground(new Color(115, 53, 31));
        this.atras.setForeground(new Color(255, 255, 255));
        this.atras.setFont(new Font("Roboto", Font.BOLD, 20));
        this.atras.setEnabled(true); // Encendido del botón

        // BANNER
        ImageIcon imagen = new ImageIcon("C:\\Users\\User\\Desktop\\U\\Estructuras de Datos\\Imagenes Proyecto\\banner3.jpg");
        this.banner = new JLabel();
        this.banner.setBounds(0, 0, 800, 150);
        this.banner.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(banner.getWidth(), banner.getHeight(), Image.SCALE_SMOOTH)));


        // ETIQUETA BUSCAR MOTO
        this.buscarTexto.setBounds(100, 150, 300, 90);
        this.buscarTexto.setForeground(Color.white);
        this.buscarTexto.setFont(new Font("Roboto", Font.BOLD, 20));

        // CUADRO BUSCAR MOTO
        this.buscarCuadro.setBounds(470, 180, 250, 30);
        this.buscarCuadro.setFont(new Font("Roboto", Font.BOLD, 16));

        // BOTON BUSCAR
        this.buscar.setBounds(590, 210, 130, 30);
        this.buscar.setBackground(new Color(152, 154, 160));
        this.buscar.setForeground(new Color(12, 98, 131));
        this.buscar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.buscar.setEnabled(true); // Encendido del botón

        // ETIQUETA NO SE ENCONTRÓ MOTO
        this.noEncontrado.setBounds(230, 310, 300, 90);
        this.noEncontrado.setForeground(Color.white);
        this.noEncontrado.setFont(new Font("Roboto", Font.BOLD, 20));


        // ETIQUETA MENSAJE ESTÁ SEGURO
        this.estaSeguro.setBounds(240, 250, 400, 90);
        this.estaSeguro.setForeground(Color.white);
        this.estaSeguro.setFont(new Font("Roboto", Font.BOLD, 25));

        // CUADRO PARA VER MOTO
        this.visualizarMoto.setBounds(100,350,600,30);
        this.visualizarMoto.setFont(new Font("Roboto", Font.BOLD, 16));


        // BOTON SI
        this.si.setBounds(230, 420, 100, 30);
        this.si.setBackground(new Color(178, 2, 2));
        this.si.setForeground(new Color(255, 255, 255));
        this.si.setFont(new Font("Roboto", Font.BOLD, 22));
        this.si.setEnabled(true); // Encendido del botón

        // BOTON NO
        this.no.setBounds(450, 420, 100, 30);
        this.no.setBackground(new Color(152, 154, 160));
        this.no.setForeground(new Color(0, 0, 0));
        this.no.setFont(new Font("Roboto", Font.BOLD, 22));
        this.no.setEnabled(true); // Encendido del botón

        // ETIQUETA MENSAJE VENDIDO
        this.vendido.setBounds(210, 300, 400, 90);
        this.vendido.setForeground(Color.white);
        this.vendido.setFont(new Font("Roboto", Font.BOLD, 25));
    }

    public void adicionar() {
        this.add(venderMoto);
        this.add(atras);
        this.add(banner);
        this.add(buscarTexto);
        this.add(buscarCuadro);
        this.add(buscar);
        this.add(noEncontrado);
        this.add(estaSeguro);
        this.add(visualizarMoto);
        this.add(si);
        this.add(no);
        this.add(vendido);
    }

    public void abrirVentOpciones(ActionEvent a) {
        VentanaOpciones vp = new VentanaOpciones();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void acciones() {
        ActionListener devolver = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentOpciones(ae);
            }
        };
        ActionListener buscarMoto = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                encontrarMoto(ae);
            }
        };
        ActionListener venderMoto = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                eliminar(ae);
            }
        };

        atras.addActionListener(devolver);
        buscar.addActionListener(buscarMoto);
        no.addActionListener(devolver);
        si.addActionListener(venderMoto);
    }

    public void visualizar() {
        this.setSize(800, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo
        noEncontrado.setVisible(false);
        estaSeguro.setVisible(false);
        visualizarMoto.setVisible(false);
        si.setVisible(false);
        no.setVisible(false);
        vendido.setVisible(false);
    }

    public boolean estaVacio() {
        return VentanaInsertar.raiz == null;
    }

    public void encontrarMoto(ActionEvent a) {
        String moto = buscarCuadro.getText();
        if (!estaVacio()) {
            Nodo m = buscarMoto(moto);
            if (m == null) {
                noEncontrado.setVisible(true);
                estaSeguro.setVisible(false);
                visualizarMoto.setVisible(false);

            } else if (m.getPlaca().compareTo(moto) == 0) {
                noEncontrado.setVisible(false);
                estaSeguro.setVisible(true);
                visualizarMoto.setVisible(true);
                visualizarMoto.setText("");
                visualizarMoto.append("Motocicleta: " + m);
                si.setVisible(true);
                no.setVisible(true);

            }

        } else {
            noEncontrado.setVisible(true);
            estaSeguro.setVisible(false);
            visualizarMoto.setVisible(false);
        }
    }

    public Nodo buscarMoto(String placa) {

        if (VentanaInsertar.raiz != null) {
            Nodo aux = VentanaInsertar.raiz;
            while (aux.getPlaca().compareTo(placa) != 0) {
                if (placa.compareTo(aux.getPlaca()) < 0) {
                    aux = aux.izquierda;
                } else {
                    aux = aux.derecha;
                }
                if (aux == null) {
                    return null;
                }
            }
            return aux;
        } else {
            System.out.println("No hay motocicletas");
        }
        return null;
    }

    public boolean eliminar(ActionEvent a) {

        String moto = buscarCuadro.getText();
        Nodo m = buscarMoto(moto);

        int cilindraje = m.getCilindraje();
        Nodo aux = VentanaInsertar.raiz;
        Nodo padre = VentanaInsertar.raiz;

        boolean esHijoIzquierdo = true;
        while (aux.getCilindraje() != cilindraje) {
            padre = aux;
            if (cilindraje < aux.getCilindraje()) {
                esHijoIzquierdo = true;
                aux = aux.izquierda;
            } else {
                esHijoIzquierdo = false;
                aux = aux.derecha;
            }
            if (aux == null) {
                return false;
            }
        } // Fin del While

        if (aux.izquierda == null && aux.derecha == null) {
            if (aux == VentanaInsertar.raiz) {
                VentanaInsertar.raiz = null;
            } else if (esHijoIzquierdo) {
                padre.izquierda = null;
            } else {
                padre.derecha = null;
            }
        } else if (aux.derecha == null) {
            if (aux == VentanaInsertar.raiz) {
                VentanaInsertar.raiz = aux.izquierda;
            } else if (esHijoIzquierdo) {
                padre.izquierda = aux.izquierda;
            } else {
                padre.derecha = aux.izquierda;
            }
        } else if (aux.izquierda == null) {
            if (aux == VentanaInsertar.raiz) {
                VentanaInsertar.raiz = aux.derecha;
            } else if (esHijoIzquierdo) {
                padre.izquierda = aux.derecha;
            } else {
                padre.derecha = aux.derecha;
            }

        } else {
            Nodo reemplazo = obtenerNodoReemplazo(aux);
            if (aux == VentanaInsertar.raiz) {
                VentanaInsertar.raiz = reemplazo;
            } else if (esHijoIzquierdo) {
                padre.izquierda = reemplazo;
            } else {
                padre.derecha = reemplazo;
            }
            reemplazo.izquierda = aux.izquierda;

        }

        estaSeguro.setVisible(false);
        si.setVisible(false);
        no.setVisible(false);
        visualizarMoto.setVisible(false);
        vendido.setVisible(true);

        return true;
    }

    // DEVOLVER NODO REEMPLAZO
    public Nodo obtenerNodoReemplazo(Nodo nodoR) {

        Nodo reemplazarPadre = nodoR;
        Nodo reemplazo = nodoR;
        Nodo aux = nodoR.derecha;

        while (aux != null) {
            reemplazarPadre = reemplazo;
            reemplazo = aux;
            aux = aux.izquierda;
        }
        if (reemplazo != nodoR.derecha) {
            reemplazarPadre.izquierda = reemplazo.derecha;
            reemplazo.derecha = nodoR.derecha;
        }
        System.out.println("El nodo Reemplazo es " + reemplazo);
        return reemplazo;

    }

}
