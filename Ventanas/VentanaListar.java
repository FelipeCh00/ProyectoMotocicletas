package ProyectoMotocicletas.Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaListar extends JFrame {

    private JLabel listarMoto;
    private JLabel banner;
    private JButton atras;

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

    }

    public void adicionar() {
        this.add(listarMoto);
        this.add(banner);
        this.add(atras);

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
