package ProyectoMotocicletas.Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaOpciones extends JFrame {


    private JLabel textoOpciones;
    private JButton insertar;
    private JButton eliminar;
    private JButton listar;
    private JButton lista;
    private JButton vender;
    private JButton salirOpciones;
    private JLabel imagenBanner;
    private JLabel imagenArbol;
    private JLabel imagenFondo;

    public VentanaOpciones(){
        visualizar();
        inicializarComponentes();
        dimensionar();
        adicionar();
        acciones();
        setTitle("Menú de opciones");

    }
    public void inicializarComponentes() {
        this.textoOpciones = new JLabel("Opciones", SwingConstants.CENTER);
        this.insertar = new JButton("Insertar Motocicleta");
        this.eliminar = new JButton("Eliminar Motocicleta");
        this.listar = new JButton("Listar Motocicletas");
        this.lista = new JButton("Listar Componentes");
        this.vender = new JButton("Vender Motocicleta");
        this.salirOpciones = new JButton("Atrás");
        this.imagenFondo = new JLabel();
    }

    public void dimensionar(){
        this.setLayout(null);

        // ETIQUETA TITULO
        this.textoOpciones.setBounds(450,15,300,50);
        this.textoOpciones.setForeground(Color.white);
        this.textoOpciones.setFont(new Font("Felix Titling", Font.BOLD, 40));

        // BOTON INSERTAR MOTO
        this.insertar.setBounds(130, 190, 250, 30);
        this.insertar.setBackground(Color.WHITE);
        this.insertar.setForeground(new Color(3, 92, 134));
        this.insertar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.insertar.setEnabled(true); // Encendido del botón

        // BOTON ELIMINAR MOTO
        this.eliminar.setBounds(130, 280, 250, 30);
        this.eliminar.setBackground(Color.WHITE);
        this.eliminar.setForeground(new Color(3, 92, 134));
        this.eliminar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.eliminar.setEnabled(true); // Encendido del botón

        // BOTON LISTAR MOTO
        this.listar.setBounds(280, 350, 250, 30);
        this.listar.setBackground(Color.WHITE);
        this.listar.setForeground(new Color(3, 92, 134));
        this.listar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.listar.setEnabled(true); // Encendido del botón

        // BOTON LISTA COMPONENTES
        this.lista.setBounds(400, 190, 250, 30);
        this.lista.setBackground(Color.WHITE);
        this.lista.setForeground(new Color(3, 92, 134));
        this.lista.setFont(new Font("Roboto", Font.BOLD, 20));
        this.lista.setEnabled(true); // Encendido del botón

        // BOTON VENDER MOTO
        this.vender.setBounds(400, 280, 250, 30);
        this.vender.setBackground(Color.WHITE);
        this.vender.setForeground(new Color(3, 92, 134));
        this.vender.setFont(new Font("Roboto", Font.BOLD, 20));
        this.vender.setEnabled(true); // Encendido del botón

        // BOTON ATRAS MOTO
        this.salirOpciones.setBounds(50, 500, 130  , 30);
        this.salirOpciones.setBackground(new Color(115, 53, 31));
        this.salirOpciones.setForeground(new Color(255, 255, 255));
        this.salirOpciones.setFont(new Font("Roboto", Font.BOLD, 20));
        this.salirOpciones.setEnabled(true); // Encendido del botón



        // BANNER
        ImageIcon imagen = new ImageIcon("C:\\Users\\User\\Desktop\\U\\Estructuras de Datos\\Imagenes Proyecto\\banner.jpg");
        this.imagenBanner = new JLabel();
        this.imagenBanner.setBounds(0, 0, 800, 100);
        this.imagenBanner.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(imagenBanner.getWidth(), imagenBanner.getHeight(), Image.SCALE_SMOOTH)));

        // IMAGEN ARBOL
        ImageIcon arbol = new ImageIcon("C:\\Users\\User\\Desktop\\U\\Estructuras de Datos\\Imagenes Proyecto\\arbol2.png");
        this.imagenArbol = new JLabel();
        this.imagenArbol.setBounds(650, 430, 100, 100);
        this.imagenArbol.setIcon(new ImageIcon(arbol.getImage().getScaledInstance(imagenArbol.getWidth(), imagenArbol.getHeight(), Image.SCALE_SMOOTH)));

        // IMAGEN FONDO
        ImageIcon fondo = new ImageIcon("C:\\Users\\User\\Desktop\\U\\Estructuras de Datos\\Imagenes Proyecto\\negro.jpg");
        this.imagenFondo = new JLabel();
        this.imagenFondo.setBounds(100, 150, 600, 300);
        this.imagenFondo.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(imagenFondo.getWidth(), imagenFondo.getHeight(), Image.SCALE_SMOOTH)));

    }

    public void adicionar(){
        this.add(textoOpciones);

        this.add(insertar);
        this.add(eliminar);
        this.add(listar);
        this.add(lista);
        this.add(vender);
        this.add(salirOpciones);
        this.add(imagenBanner);
        this.add(imagenArbol);
        this.add(imagenFondo);
    }

    public void abrirVentP(ActionEvent a) {
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void abrirVentInsertar(ActionEvent a) {
        VentanaInsertar vp = new VentanaInsertar();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void abrirVentEliminar(ActionEvent a) {
        VentanaEliminar vp = new VentanaEliminar();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void abrirVentListar(ActionEvent a) {
        VentanaListar vp = new VentanaListar();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void abrirVentComponentes(ActionEvent a) {
        VentanaComponentes vp = new VentanaComponentes();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void abrirVentVender(ActionEvent a) {
        VentanaVender vp = new VentanaVender();
        vp.setVisible(true);
        this.setVisible(false);
    }



    public void acciones(){
        ActionListener abrirVenPrin = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentP(ae);
            }
        };
        ActionListener abrirVenInsertar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentInsertar(ae);
            }
        };
        ActionListener abrirVenEliminar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentEliminar(ae);
            }
        };
        ActionListener abrirVenListar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentListar(ae);
            }
        };
        ActionListener abrirVenComponentes = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentComponentes(ae);
            }
        };
        ActionListener abrirVenVender = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentVender(ae);
            }
        };

        salirOpciones.addActionListener(abrirVenPrin);
        insertar.addActionListener(abrirVenInsertar);
        eliminar.addActionListener(abrirVenEliminar);
        listar.addActionListener(abrirVenListar);
        lista.addActionListener(abrirVenComponentes);
        vender.addActionListener(abrirVenVender);
    }

    public void visualizar(){
        this.setSize(800, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo

    }
}
