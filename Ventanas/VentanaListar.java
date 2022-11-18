package ProyectoMotocicletas.Ventanas;

import ProyectoMotocicletas.Arbol.Nodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaListar extends JFrame {

    private JLabel listarMoto;
    private JLabel banner;
    private JButton atras;
    private JButton imprimirPreorden;
    private JButton imprimirPostorden;
    private JButton imprimirInorden;
    private JTextArea cuadroNodos;

    public VentanaListar() {
        inicializarComponentes();
        dimensionar();
        adicionar();
        visualizar();
        acciones();
        setTitle("Listar Motocicletas");
    }

    public void inicializarComponentes() {

        this.banner = new JLabel();
        this.listarMoto = new JLabel("<html>Listar <p> Motocicletas",SwingConstants.CENTER);
        this.atras = new JButton("Atrás");
        this.imprimirPreorden = new JButton("Preorden");
        this.imprimirPostorden = new JButton("Postorden");
        this.imprimirInorden= new JButton("Inorden");
        this.cuadroNodos = new JTextArea();
    }

    public void dimensionar() {
        this.setLayout(null);

        // ETIQUETA TITULO
        this.listarMoto.setBounds(400, 20, 350, 90);
        this.listarMoto.setForeground(Color.white);
        this.listarMoto.setFont(new Font("Felix Titling", Font.BOLD, 40));


        // BANNER
        ImageIcon imagen = new ImageIcon("C:\\Users\\User\\Desktop\\U\\Estructuras de Datos\\Imagenes Proyecto\\banner7.png");
        this.banner = new JLabel();
        this.banner.setBounds(0, 0, 800, 150);
        this.banner.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(banner.getWidth(), banner.getHeight(), Image.SCALE_SMOOTH)));


        // BOTON ATRAS
        this.atras.setBounds(50, 500, 130, 30);
        this.atras.setBackground(new Color(115, 53, 31));
        this.atras.setForeground(new Color(255, 255, 255));
        this.atras.setFont(new Font("Roboto", Font.BOLD, 20));
        this.atras.setEnabled(true); // Encendido del botón


        // BOTON PREORDEN
        this.imprimirPreorden.setBounds(80, 200, 200, 30);
        this.imprimirPreorden.setBackground(Color.WHITE);
        this.imprimirPreorden.setForeground(new Color(3, 92, 134));
        this.imprimirPreorden.setFont(new Font("Roboto", Font.BOLD, 20));
        this.imprimirPreorden.setEnabled(true); // Encendido del botón

        // BOTON POSTORDEN
        this.imprimirPostorden.setBounds(300, 200, 200, 30);
        this.imprimirPostorden.setBackground(Color.WHITE);
        this.imprimirPostorden.setForeground(new Color(3, 92, 134));
        this.imprimirPostorden.setFont(new Font("Roboto", Font.BOLD, 20));
        this.imprimirPostorden.setEnabled(true); // Encendido del botón

        // BOTON INORDEN
        this.imprimirInorden.setBounds(520, 200, 200, 30);
        this.imprimirInorden.setBackground(Color.WHITE);
        this.imprimirInorden.setForeground(new Color(3, 92, 134));
        this.imprimirInorden.setFont(new Font("Roboto", Font.BOLD, 20));
        this.imprimirInorden.setEnabled(true); // Encendido del botón


        // CUADRO NODOS
        this.cuadroNodos.setBounds(100,250,600,200);
        this.cuadroNodos.setFont(new Font("Roboto", Font.BOLD, 20));


    }

    public void adicionar() {
        this.add(listarMoto);
        this.add(banner);
        this.add(atras);
        this.add(imprimirPreorden);
        this.add(imprimirPostorden);
        this.add(imprimirInorden);
        this.add(cuadroNodos);

    }

    public void abrirVentOpciones(ActionEvent a) {
        VentanaOpciones vp = new VentanaOpciones();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void preOrder(Nodo r) {
        if (r != null) {
            cuadroNodos.append(r.toString()+"\n");
            preOrder(r.izquierda);
            preOrder(r.derecha);
        }
    }

    public boolean estaVacio() {
        return VentanaInsertar.raiz == null;
    }

    public void imprimirPre(ActionEvent a){
        if (!estaVacio()) {
            preOrder(VentanaInsertar.raiz);
        } else {
            System.out.println("Esta vacío");
        }
    }

    public void acciones() {
        ActionListener devolver = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentOpciones(ae);
            }
        };
        atras.addActionListener(devolver);

        ActionListener preorden = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imprimirPre(ae);
            }
        };

        imprimirPreorden.addActionListener(preorden);
    }

    public void visualizar() {
        this.setSize(800, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo

    }

}
