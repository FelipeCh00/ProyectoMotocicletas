package ProyectoMotocicletas.Ventanas;

import ProyectoMotocicletas.Arbol.Nodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInsertar extends JFrame {

    static Nodo raiz;

    private JLabel ingresarMoto;
    private JLabel ingresarDatos;
    private JLabel placa;
    private JLabel modelo;
    private JLabel cilindraje;
    private JLabel color;
    private JLabel banner;

    public static JTextField cuadroPlaca;
    public static JTextField cuadroModelo;
    public static JTextField cuadroCilindraje;
    public static JTextField cuadroColor;
    private JButton atras;
    private JButton enviar;


    public VentanaInsertar() {
        inicializarComponentes();

        dimensionar();
        adicionar();
        visualizar();
        acciones();
        setTitle("Insertar Motocicleta");
    }

    public void inicializarComponentes() {

        this.ingresarMoto = new JLabel("<html>Ingresar <p> Motocicleta", SwingConstants.LEFT);
        this.placa = new JLabel("Placa:", SwingConstants.LEFT);
        this.modelo = new JLabel("Modelo:", SwingConstants.LEFT);
        this.cilindraje = new JLabel("Cilindraje:", SwingConstants.LEFT);
        this.color = new JLabel("Color:", SwingConstants.LEFT);
        this.ingresarDatos = new JLabel("Ingrese los datos de la Motocicleta: ");
        this.cuadroPlaca = new JTextField();
        this.cuadroModelo = new JTextField();
        this.cuadroCilindraje = new JTextField();
        this.cuadroColor = new JTextField();
        this.atras = new JButton("Atrás");
        this.enviar = new JButton("Guardar");
        this.banner = new JLabel();

    }

    public void dimensionar() {

        this.setLayout(null);

        // ETIQUETA TITULO
        this.ingresarMoto.setBounds(400, 20, 300, 70);
        this.ingresarMoto.setForeground(Color.white);
        this.ingresarMoto.setFont(new Font("Felix Titling", Font.BOLD, 30));

        // ETIQUETA DATOS
        this.ingresarDatos.setBounds(50, 130, 600, 50);
        this.ingresarDatos.setForeground(Color.white);
        this.ingresarDatos.setFont(new Font("Roboto", Font.BOLD, 20));


        // BOTON ATRAS
        this.atras.setBounds(50, 500, 130, 30);
        this.atras.setBackground(new Color(115, 53, 31));
        this.atras.setForeground(new Color(255, 255, 255));
        this.atras.setFont(new Font("Roboto", Font.BOLD, 20));
        this.atras.setEnabled(true); // Encendido del botón

        // BOTON GUARDAR
        this.enviar.setBounds(560, 455, 130, 30);
        this.enviar.setBackground(new Color(110, 85, 60));
        this.enviar.setForeground(new Color(255, 255, 255));
        this.enviar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.enviar.setEnabled(true); // Encendido del botón

        // BANNER
        ImageIcon imagen = new ImageIcon("C:\\Users\\User\\Desktop\\U\\Estructuras de Datos\\Imagenes Proyecto\\banner2.jpg");
        this.banner = new JLabel();
        this.banner.setBounds(0, 0, 800, 100);
        this.banner.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(banner.getWidth(), banner.getHeight(), Image.SCALE_SMOOTH)));


        // ETIQUETA PLACA
        this.placa.setBounds(100, 200, 200, 30);//inicio x, inicio y, desplazamiento x, desplazamiento y
        this.placa.setForeground(Color.white); // Color de la letra
        this.placa.setOpaque(false);
        this.placa.setBackground(Color.gray);
        this.placa.setFont(new Font("Roboto", Font.BOLD, 20));

        //ETIQUETA CUADRO PLACA
        this.cuadroPlaca.setBounds(400, 200, 300, 30);//inicio x, inicio y, desplazamiento x, desplazamiento y
        this.cuadroPlaca.setForeground(Color.BLACK); // Color de la letra
        this.cuadroPlaca.setFont(new Font("Roboto", Font.PLAIN, 20));


        // ETIQUETA MODELO
        this.modelo.setBounds(100, 250, 200, 30);//inicio x, inicio y, desplazamiento x, desplazamiento y
        this.modelo.setForeground(Color.white); // Color de la letra
        this.modelo.setOpaque(false);
        this.modelo.setBackground(Color.gray);
        this.modelo.setFont(new Font("Roboto", Font.BOLD, 20));


        //ETIQUETA CUADRO MODELO
        this.cuadroModelo.setBounds(400, 250, 300, 30);//inicio x, inicio y, desplazamiento x, desplazamiento y
        this.cuadroModelo.setForeground(Color.BLACK); // Color de la letra
        this.cuadroModelo.setFont(new Font("Roboto", Font.PLAIN, 20));

        // ETIQUETA CILINDRAJE
        this.cilindraje.setBounds(100, 300, 200, 30);//inicio x, inicio y, desplazamiento x, desplazamiento y
        this.cilindraje.setForeground(Color.white); // Color de la letra
        this.cilindraje.setOpaque(false);
        this.cilindraje.setBackground(Color.gray);
        this.cilindraje.setFont(new Font("Roboto", Font.BOLD, 20));


        //ETIQUETA CUADRO CILINDRAJE
        this.cuadroCilindraje.setBounds(400, 300, 300, 30);//inicio x, inicio y, desplazamiento x, desplazamiento y
        this.cuadroCilindraje.setForeground(Color.BLACK); // Color de la letra
        this.cuadroCilindraje.setFont(new Font("Roboto", Font.PLAIN, 20));

        // ETIQUETA COLOR
        this.color.setBounds(100, 350, 200, 30);//inicio x, inicio y, desplazamiento x, desplazamiento y
        this.color.setForeground(Color.white); // Color de la letra
        this.color.setOpaque(false);
        this.color.setBackground(Color.gray);
        this.color.setFont(new Font("Roboto", Font.BOLD, 20));


        //ETIQUETA CUADRO COLOR
        this.cuadroColor.setBounds(400, 350, 300, 30);//inicio x, inicio y, desplazamiento x, desplazamiento y
        this.cuadroColor.setForeground(Color.BLACK); // Color de la letra
        this.cuadroColor.setFont(new Font("Roboto", Font.PLAIN, 20));


    }

    public void adicionar() {
        this.add(ingresarMoto);
        this.add(ingresarDatos);
        this.add(placa);
        this.add(modelo);
        this.add(cilindraje);
        this.add(color);
        this.add(cuadroPlaca);
        this.add(cuadroModelo);
        this.add(cuadroCilindraje);
        this.add(cuadroColor);
        this.add(atras);
        this.add(enviar);
        this.add(banner);
    }

    public void abrirVentOpciones(ActionEvent a) {
        VentanaOpciones vp = new VentanaOpciones();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void enviarDatos(ActionEvent a) {
        insertarNodo();
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

        atras.addActionListener(devolver);

        ActionListener enviarDatosMoto = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                enviarDatos(ae);
            }
        };

        enviar.addActionListener(enviarDatosMoto);


    }

    public void visualizar() {
        this.setSize(800, 600);
        this.setVisible(true);
        this.setResizable(false);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo

    }


    // METODOS PARA CREACION DE MOTOS

    // INGRESO DE DATOS
    public Nodo crearNodo() {

        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setPlaca(cuadroPlaca.getText());
        nuevoNodo.setModelo(cuadroModelo.getText());
        try {
            nuevoNodo.setCilindraje(Integer.parseInt(cuadroCilindraje.getText()));
        } catch (Exception e) {
            System.out.println("Cilindraje invalido");
        }
        nuevoNodo.setColor(cuadroColor.getText());
        return nuevoNodo;
    }

    public void insertarNodo() {

        Nodo motoNueva = crearNodo();

        if (raiz == null) {
            raiz = motoNueva;
        } else {
            Nodo aux = raiz;
            Nodo padre;

            while (true) {
                padre = aux;
                if (motoNueva.getCilindraje() < aux.getCilindraje()) {
                    aux = aux.izquierda;
                    if (aux == null) {
                        padre.izquierda = motoNueva;
                        return;
                    }
                } else if ((motoNueva.getCilindraje() > aux.getCilindraje())) {
                    aux = aux.derecha;
                    if (aux == null) {
                        padre.derecha = motoNueva;
                        return;
                    }
                } else if ((motoNueva.getCilindraje() == aux.getCilindraje())) {
                    System.out.println("No se puede ingresar dos motocicletas con el mismo cilindraje");
                    return;
                }
            }

        }
    }
}
