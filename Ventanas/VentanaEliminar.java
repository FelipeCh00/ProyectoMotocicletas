package ProyectoMotocicletas.Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEliminar extends JFrame {

    private  JLabel eliminarMoto;
    private JLabel banner;
    private JButton atras;

    public VentanaEliminar(){
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
        this.eliminarMoto = new JLabel("<html>Eliminar <p> Motocicleta");

    }

    public void dimensionar() {
        this.setLayout(null);

        // ETIQUETA TITULO
        this.eliminarMoto.setBounds(90,20,320,90);
        this.eliminarMoto.setForeground(Color.white);
        this.eliminarMoto.setFont(new Font("Felix Titling", Font.BOLD, 40));


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

    }

    public void adicionar() {
        this.add(eliminarMoto);
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
