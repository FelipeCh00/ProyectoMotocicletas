package ProyectoMotocicletas.Ventanas;

import ProyectoMotocicletas.MetodosSQL.MetodosSQL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistro extends JFrame {

    private JLabel registroUsuario;
    private JLabel usuarioEtq;
    private JLabel contraEtq;
    private JLabel registado;
    private JLabel noRegistado;

    private JTextField usuario;
    private JPasswordField contra;

    private JButton atras;
    private JButton enviar;

    MetodosSQL metodos = new MetodosSQL();

    public VentanaRegistro() {
        inicializarComponentes();
        dimensionar();
        adicionar();
        visualizar();
        acciones();
        setTitle("Registro Nuevo Usuario");
    }

    public void inicializarComponentes() {
        this.atras = new JButton("Atrás");
        this.registroUsuario = new JLabel("Registro");

        this.usuarioEtq = new JLabel("Usuario: ");
        this.usuario = new JTextField();

        this.contraEtq = new JLabel("Contraseña: ");
        this.contra = new JPasswordField();

        this.enviar = new JButton("Envíar");
        this.registado = new JLabel("<html> Se ha registrado exitosamente");
        this.noRegistado = new JLabel("<html> No se pudo registrar");

    }

    public void dimensionar() {
        this.setLayout(null);

        // ETIQUETA TITULO
        this.registroUsuario.setBounds(40, 10, 320, 90);
        this.registroUsuario.setForeground(Color.white);
        this.registroUsuario.setFont(new Font("Felix Titling", Font.BOLD, 30));


        // BOTON ATRAS
        this.atras.setBounds(30, 300, 100, 30);
        this.atras.setBackground(new Color(115, 53, 31));
        this.atras.setForeground(new Color(255, 255, 255));
        this.atras.setFont(new Font("Roboto", Font.BOLD, 16));
        this.atras.setEnabled(true); // Encendido del botón

        // ETIQUETA USUARIO
        this.usuarioEtq.setBounds(60, 80, 100, 90);
        this.usuarioEtq.setForeground(Color.white);
        this.usuarioEtq.setFont(new Font("Roboto", Font.BOLD, 20));

        // CUADRO USUARIO
        this.usuario.setBounds(230, 110, 200, 30);
        this.usuario.setFont(new Font("Roboto", Font.BOLD, 20));

        // ETIQUETA CONTRASEÑA
        this.contraEtq.setBounds(60, 170, 320, 90);
        this.contraEtq.setForeground(Color.white);
        this.contraEtq.setFont(new Font("Roboto", Font.BOLD, 20));

        // CUADRO CONTRASEÑA
        this.contra.setBounds(230, 200, 200, 30);
        this.contra.setFont(new Font("Roboto", Font.BOLD, 20));


        // BOTON ENVIAR
        this.enviar.setBounds(350, 300, 100, 30);
        this.enviar.setBackground(new Color(110, 85, 60));
        this.enviar.setForeground(new Color(255, 255, 255));
        this.enviar.setFont(new Font("Roboto", Font.BOLD, 16));
        this.enviar.setEnabled(true); // Encendido del botón

        // ETIQUETA REGISTRADO
        this.registado.setBounds(140, 230, 320, 90);
        this.registado.setForeground(Color.white);
        this.registado.setFont(new Font("Roboto", Font.BOLD, 16));

        // ETIQUETA NO REGISTRADO
        this.noRegistado.setBounds(60, 250, 320, 90);
        this.noRegistado.setForeground(Color.white);
        this.noRegistado.setFont(new Font("Roboto", Font.BOLD, 16));

    }

    public void adicionar() {
        this.add(registroUsuario);
        this.add(atras);
        this.add(usuarioEtq);
        this.add(usuario);
        this.add(contraEtq);
        this.add(contra);
        this.add(enviar);
        this.add(registado);
        this.add(noRegistado);

    }

    public void abrirVentPrinc(ActionEvent a) {
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void guardarDatosSQL(ActionEvent a) {
        int i = metodos.guardar(usuario.getText(), contra.getText());
        if (i > 0) {
            enviar.setEnabled(false);
            registado.setVisible(true);
        }else{
            noRegistado.setVisible(true);
        }
    }

    public void acciones() {
        ActionListener devolver = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentPrinc(ae);
            }
        };
        ActionListener subirDatos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                guardarDatosSQL(ae);
            }
        };

        atras.addActionListener(devolver);
        enviar.addActionListener(subirDatos);
    }

    public void visualizar() {
        this.setSize(500, 400);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo
        registado.setVisible(false);
        noRegistado.setVisible(false);
    }
}
