package ProyectoMotocicletas.Ventanas;

import ProyectoMotocicletas.MetodosSQL.MetodosSQL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaPrincipal extends JFrame {

    private JLabel creditos;
    private JLabel tituloProyecto;
    private JLabel etqUsuario;
    private JLabel etqContrasena;
    private JLabel registrese;

    private JTextField usuario;
    private JPasswordField password;

    private JButton iniciar;
    private JButton imagenSalir;
    private JButton imagenEntrar;
    private JButton registro;

    MetodosSQL metodos = new MetodosSQL();

    public VentanaPrincipal() {
        inicializarComponentes();
        adicionar();
        dimensionar();
        visualizar();
        acciones();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Proyecto Motocicletas");
    }


    public void inicializarComponentes() {
        this.tituloProyecto = new JLabel("<html>Proyecto <p> Motocicletas", SwingConstants.CENTER);
        this.creditos = new JLabel("Felipe Chacón, Alejandro Reyes, Universidad Jorge Tadeo Lozano", SwingConstants.CENTER);
        this.etqUsuario = new JLabel("Usuario:", SwingConstants.LEFT); //Centrar el texto en la etiqueta
        this.etqContrasena = new JLabel("Contraseña:", SwingConstants.LEFT);
        this.usuario = new JTextField();
        this.password = new JPasswordField();
        this.iniciar = new JButton("Iniciar");
        this.imagenSalir = new JButton();
        this.imagenEntrar = new JButton();
        this.registro = new JButton("Registrarse");
        this.registrese = new JLabel("Usuario no encontrado, por favor regístrese");

    }

    public void dimensionar() {

        this.setLayout(null);


        // ETIQUETA TITULO
        this.tituloProyecto.setBounds(250, 30, 300, 100);
        this.tituloProyecto.setForeground(Color.WHITE);
        this.tituloProyecto.setOpaque(true);
        this.tituloProyecto.setBackground(Color.gray);
        this.tituloProyecto.setFont(new Font("Roboto", Font.PLAIN, 40));


        // ETIQUETA CREDITOS
        this.creditos.setBounds(200, 530, 400, 20);
        this.creditos.setForeground(Color.BLACK);
        this.creditos.setOpaque(true);
        this.creditos.setBackground(Color.gray);
        this.creditos.setFont(new Font("Roboto", Font.PLAIN, 10));


        //ETIQUETA USUARIO
        this.etqUsuario.setBounds(200, 210, 80, 30);//inicio x, inicio y, desplazamiento x, desplazamiento y
        this.etqUsuario.setForeground(Color.BLACK); // Color de la letra
        this.etqUsuario.setFont(new Font("Roboto", Font.PLAIN, 20));

        // ESPACIO USUARIO
        this.usuario.setBounds(200, 250, 400, 50);
        this.usuario.setFont(new Font("Roboto", Font.PLAIN, 30));


        //ETIQUETA CONTRASEÑA
        this.etqContrasena.setBounds(200, 310, 120, 30);//inicio x, inicio y, desplazamiento x, desplazamiento y
        this.etqContrasena.setForeground(Color.BLACK);
        this.etqContrasena.setOpaque(false);
        //this.etqContrasena.setBackground(Color.black);
        this.etqContrasena.setFont(new Font("Roboto", Font.PLAIN, 20));

        // ESPACIO CONTRASEÑA
        this.password.setBounds(200, 350, 400, 50);
        this.password.setFont(new Font("Roboto", Font.PLAIN, 30));

        // BOTON ENVIAR
        this.iniciar.setBounds(320, 450, 200, 50);
        this.iniciar.setBackground(new Color(115, 53, 31));
        this.iniciar.setForeground(new Color(255, 255, 255));
        this.iniciar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.iniciar.setEnabled(true); // Encendido del botón

        // BOTON SALIR GORDITO
        this.imagenSalir.setBounds(50, 450, 100, 100);
        this.imagenSalir.setBackground(Color.WHITE);
        this.imagenSalir.setForeground(new Color(44, 164, 224));
        this.imagenSalir.setFont(new Font("Roboto", Font.BOLD, 20));
        this.imagenSalir.setEnabled(true); // Encendido del botón
        ImageIcon imagenBoton = new ImageIcon("C:\\Users\\User\\Desktop\\U\\Estructuras de Datos\\Imagenes Proyecto\\Bloqueado.jpg");
        this.imagenSalir.setIcon(new ImageIcon(imagenBoton.getImage().getScaledInstance(imagenSalir.getWidth(), imagenSalir.getHeight(), Image.SCALE_SMOOTH)));

        // BOTON SALIR GORDITO
        this.imagenEntrar.setBounds(650, 450, 100, 100);
        this.imagenEntrar.setBackground(Color.WHITE);
        this.imagenEntrar.setForeground(new Color(44, 164, 224));
        this.imagenEntrar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.imagenEntrar.setEnabled(true); // Encendido del botón
        ImageIcon imagenBoton2 = new ImageIcon("C:\\Users\\User\\Desktop\\U\\Estructuras de Datos\\Imagenes Proyecto\\Abierto.jpg");
        this.imagenEntrar.setIcon(new ImageIcon(imagenBoton2.getImage().getScaledInstance(imagenEntrar.getWidth(), imagenEntrar.getHeight(), Image.SCALE_SMOOTH)));

        // BOTON REGISTRO
        this.registro.setBounds(340,420,150,40);
        this.registro.setBackground(new Color(117, 114, 114));
        this.registro.setForeground(new Color(255, 255, 255));
        this.registro.setFont(new Font("Roboto", Font.BOLD, 16));
        this.registro.setEnabled(true); // Encendido del botón

        //ETIQUETA REGISTRESE
        this.registrese.setBounds(300, 440, 400, 30);//inicio x, inicio y, desplazamiento x, desplazamiento y
        this.registrese.setForeground(Color.BLACK);
        this.registrese.setFont(new Font("Roboto", Font.PLAIN, 20));


    }

    public void adicionar() {
        this.add(tituloProyecto);
        this.add(etqUsuario);
        this.add(etqContrasena);
        this.add(usuario);
        this.add(password);
        //this.add(iniciar);
        this.add(imagenSalir);
        this.add(imagenEntrar);
        this.add(creditos);
        this.add(registro);

    }

    public void abrirVent2(ActionEvent a) {


        String busquedaUsuario = metodos.buscarUserRegistrado(usuario.getText(),password.getText());

        if(usuario.getText().equals("root")&&password.getText().equals("root")){
            System.out.println("Admin capo");
            VentanaOpciones vp = new VentanaOpciones();
            vp.setVisible(true);
            this.setVisible(false);
        }else if (busquedaUsuario.equals("Usuario encontrado")){
            String busquedaNombre = metodos.buscarUsuario(usuario.getText());
            VentanaOpciones vp = new VentanaOpciones();
            System.out.println("Bienvenido " + busquedaNombre);
            vp.setVisible(true);
            this.setVisible(false);
        }else {
            registrese.setVisible(true);
            System.out.println("No se ha registrado");
            JOptionPane.showMessageDialog(null,"No se encontró el usuario, regístrese o revise la contraseña","Error",JOptionPane.QUESTION_MESSAGE);
        }
    }

    public void abrirVentRegistro(ActionEvent a) {
        VentanaRegistro vp = new VentanaRegistro();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void salirPrograma(ActionEvent a) {
        System.exit(0);
    }

    public void acciones() {
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVent2(ae);
            }
        };

        ActionListener salir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                salirPrograma(ae);
            }
        };
        ActionListener registroVen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentRegistro(ae);
            }
        };



        imagenEntrar.addActionListener(oyenteDeAccion);
        imagenSalir.addActionListener(salir);
        registro.addActionListener(registroVen);
    }

    public void visualizar() {
        this.setSize(800, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        // this.getContentPane().setBackground(new Color(178, 2, 2));
        registrese.setVisible(false);
    }


    // COLOR FONDO DEGRADADO
    Color color1 = (new Color(103, 1, 1));
    Color color2 = (new Color(44, 42, 42));

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int h = getHeight();
        int w = getWidth();

        GradientPaint fondo = new GradientPaint(1000, 1000, color1, 0, h, color2);
        Graphics2D panel = (Graphics2D) g;
        panel.setPaint(fondo);
        panel.fillRect(0, 0, w, h);
        dimensionar();
        visualizar();
    }
}
