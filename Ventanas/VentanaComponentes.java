package ProyectoMotocicletas.Ventanas;

import ProyectoMotocicletas.Arbol.Componente;
import ProyectoMotocicletas.Arbol.Nodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaComponentes extends JFrame {

    private JLabel listarComponentes;
    private JLabel banner;
    private JLabel buscarTexto;

    private JButton atras;
    private JButton buscar;

    private JTextArea cuadroLista;
    private JTextField buscarCuadro;


    public VentanaComponentes() {
        inicializarComponentes();
        dimensionar();
        adicionar();
        visualizar();
        acciones();
        setTitle("Listar Componentes");
    }

    public void inicializarComponentes() {
        this.banner = new JLabel();
        this.listarComponentes = new JLabel("<html>Listar <p> Componentes");
        this.atras = new JButton("Atrás");
        this.cuadroLista = new JTextArea();
        this.buscarTexto = new JLabel("Digite la placa de la Motocicleta:");
        this.buscarCuadro = new JTextField();
        this.buscar = new JButton("Buscar");

    }

    public void dimensionar() {
        this.setLayout(null);

        // ETIQUETA TITULO
        this.listarComponentes.setBounds(90, 30, 320, 90);
        this.listarComponentes.setForeground(Color.white);
        this.listarComponentes.setFont(new Font("Felix Titling", Font.BOLD, 40));

        // BANNER
        ImageIcon imagen = new ImageIcon("C:\\Users\\User\\Desktop\\U\\Estructuras de Datos\\Imagenes Proyecto\\banner4.jpg");
        this.banner = new JLabel();
        this.banner.setBounds(0, 0, 800, 150);
        this.banner.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(banner.getWidth(), banner.getHeight(), Image.SCALE_SMOOTH)));

        // BOTON ATRAS
        this.atras.setBounds(50, 500, 130, 30);
        this.atras.setBackground(new Color(115, 53, 31));
        this.atras.setForeground(new Color(255, 255, 255));
        this.atras.setFont(new Font("Roboto", Font.BOLD, 20));
        this.atras.setEnabled(true); // Encendido del botón

        // CUADRO COMPONENTES
        this.cuadroLista.setBounds(100, 270, 600, 200);
        this.cuadroLista.setFont(new Font("Roboto", Font.BOLD, 12));

        // ETIQUETA BUSCAR MOTO
        this.buscarTexto.setBounds(100, 150, 300, 90);
        this.buscarTexto.setForeground(Color.white);
        this.buscarTexto.setFont(new Font("Roboto", Font.BOLD, 20));

        // CUADRO BUSCAR MOTO
        this.buscarCuadro.setBounds(470, 180, 250, 30);
        this.buscarCuadro.setFont(new Font("Roboto", Font.BOLD, 12));

        // BOTON BUSCAR
        this.buscar.setBounds(590, 210, 130, 30);
        this.buscar.setBackground(new Color(152, 154, 160));
        this.buscar.setForeground(new Color(12, 98, 131));
        this.buscar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.buscar.setEnabled(true); // Encendido del botón


    }

    public void adicionar() {
        this.add(atras);
        this.add(listarComponentes);
        this.add(banner);
        this.add(cuadroLista);
        this.add(buscarTexto);
        this.add(buscar);
        this.add(buscarCuadro);
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

        atras.addActionListener(devolver);
        buscar.addActionListener(buscarMoto);
    }

    public void visualizar() {
        this.setSize(800, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo
        cuadroLista.setVisible(false);
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

    public void encontrarMoto(ActionEvent a) {
        String moto = buscarCuadro.getText();
        if (!estaVacio()) {
            Nodo motoComponentes = buscarMoto(moto);
            if (motoComponentes == null) {
                cuadroLista.setVisible(true);
                cuadroLista.setText("No se encontró esa motocicleta");

            } else if (motoComponentes.getPlaca().compareTo(moto) == 0) {
                cuadroLista.setVisible(true);
                cuadroLista.setText("");
                if (motoComponentes.cabeza != null) {
                    Componente aux = motoComponentes.cabeza;
                    while (aux != null) {
                        cuadroLista.append("Componente: " + aux + "\n");
                        aux = aux.siguiente;
                    }
                } else {
                    cuadroLista.append("\n-----------------------------\n");
                    cuadroLista.append("No se encontraron Componentes\n");
                    cuadroLista.append("-----------------------------\n");

                }
            }

        } else {
            System.out.println("No está");
            cuadroLista.setVisible(true);
            cuadroLista.setText("No  se han agregado motocicletas aún");

        }
    }

    public boolean estaVacio() {
        return VentanaInsertar.raiz == null;
    }

}
