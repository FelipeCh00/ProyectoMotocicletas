package ProyectoMotocicletas.Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInsertar extends JFrame {

    private JLabel ingresarMoto;
    private JLabel nombre;
    private JLabel referencia;
    private JLabel precio;
    private JLabel banner;
    private JTextField cuadroNombre;
    private JTextField cuadroReferencia;
    private JTextField cuadroPrecio;
    private JButton atras;


    public VentanaInsertar() {
        inicializarComponentes();

        dimensionar();
        adicionar();
        visualizar();
        acciones();
        setTitle("Insertar Motocicleta");
    }

    public void inicializarComponentes() {

        this.ingresarMoto = new JLabel("<html>Ingresar <p> Motocicleta", SwingConstants.CENTER);
        this.nombre = new JLabel("Nombre de la Motocicleta;");
        this.referencia = new JLabel("Referencia:");
        this.precio = new JLabel("Precio:");
        this.cuadroNombre = new JTextField();
        this.cuadroReferencia = new JTextField();
        this.cuadroPrecio = new JTextField();
        this.atras = new JButton("Atrás");
        this.banner = new JLabel();

    }

    public void dimensionar() {

        this.setLayout(null);

        // ETIQUETA TITULO
        this.ingresarMoto.setBounds(400,20,300,70);
        this.ingresarMoto.setForeground(Color.white);
        this.ingresarMoto.setFont(new Font("Felix Titling", Font.BOLD, 30));


        // BOTON ATRAS
        this.atras.setBounds(50, 500, 130, 30);
        this.atras.setBackground(new Color(115, 53, 31));
        this.atras.setForeground(new Color(255, 255, 255));
        this.atras.setFont(new Font("Roboto", Font.BOLD, 20));
        this.atras.setEnabled(true); // Encendido del botón

        // BANNER
        ImageIcon imagen = new ImageIcon("C:\\Users\\User\\Desktop\\U\\Estructuras de Datos\\Imagenes Proyecto\\banner2.jpg");
        this.banner = new JLabel();
        this.banner.setBounds(0, 0, 800, 100);
        this.banner.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(banner.getWidth(), banner.getHeight(), Image.SCALE_SMOOTH)));



    }

    public void adicionar() {
        this.add(ingresarMoto);
        this.add(nombre);
        this.add(referencia);
        this.add(precio);
        this.add(cuadroNombre);
        this.add(cuadroReferencia);
        this.add(cuadroPrecio);
        this.add(atras);
        this.add(banner);
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

        atras.addActionListener(devolver);
    }


    public void visualizar() {
        this.setSize(800, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo

    }


}
