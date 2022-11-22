package ProyectoMotocicletas.Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaOpciones extends JFrame {


    private JLabel textoOpciones;
    private JLabel imagenBanner;
    private JLabel imagenArbol;
    private JLabel imagenFondo;

    private JButton insertarMotocicletas;
    private JButton venderMoto;
    private JButton listarMotocicletas;
    private JButton listarComponentes;
    private JButton agregarComponentes;
    private JButton eliminarComponentes;
    private JButton actualizarMoto;
    private JButton salirOpciones;
    private JButton actualizarComponentes;
    private JButton grafico;


    public VentanaOpciones() {
        visualizar();
        inicializarComponentes();
        dimensionar();
        adicionar();
        acciones();
        setTitle("Menú de opciones");

    }

    public void inicializarComponentes() {
        this.textoOpciones = new JLabel("Opciones", SwingConstants.CENTER);

        this.agregarComponentes = new JButton("Agregar Componentes");
        this.eliminarComponentes = new JButton("Eliminar Componentes");
        this.insertarMotocicletas = new JButton("Agregar Motocicleta");
        this.venderMoto = new JButton("Vender Motocicleta");
        this.listarMotocicletas = new JButton("Listar Motocicletas");
        this.listarComponentes = new JButton("Listar Componentes");
        this.actualizarMoto = new JButton("Actualizar Motocicleta");
        this.actualizarComponentes = new JButton("Actualizar Componentes");
        this.salirOpciones = new JButton("Atrás");
        this.grafico = new JButton("Gráfico");

        this.imagenFondo = new JLabel();
    }

    public void dimensionar() {
        this.setLayout(null);

        // ETIQUETA TITULO
        this.textoOpciones.setBounds(450, 15, 300, 50);
        this.textoOpciones.setForeground(Color.white);
        this.textoOpciones.setFont(new Font("Felix Titling", Font.BOLD, 40));

        // BOTON INSERTAR MOTO
        this.insertarMotocicletas.setBounds(130, 190, 250, 30);
        this.insertarMotocicletas.setBackground(Color.WHITE);
        this.insertarMotocicletas.setForeground(new Color(3, 92, 134));
        this.insertarMotocicletas.setFont(new Font("Roboto", Font.BOLD, 20));
        this.insertarMotocicletas.setEnabled(true); // Encendido del botón

        // BOTON ELIMINAR MOTO
        this.venderMoto.setBounds(130, 260, 250, 30);
        this.venderMoto.setBackground(Color.WHITE);
        this.venderMoto.setForeground(new Color(3, 92, 134));
        this.venderMoto.setFont(new Font("Roboto", Font.BOLD, 20));
        this.venderMoto.setEnabled(true); // Encendido del botón

        // BOTON LISTAR MOTO
        this.listarMotocicletas.setBounds(130, 330, 250, 30);
        this.listarMotocicletas.setBackground(Color.WHITE);
        this.listarMotocicletas.setForeground(new Color(3, 92, 134));
        this.listarMotocicletas.setFont(new Font("Roboto", Font.BOLD, 20));
        this.listarMotocicletas.setEnabled(true); // Encendido del botón

        // BOTON AGREGAR COMPONENTES
        this.agregarComponentes.setBounds(400, 190, 250, 30);
        this.agregarComponentes.setBackground(Color.WHITE);
        this.agregarComponentes.setForeground(new Color(3, 92, 134));
        this.agregarComponentes.setFont(new Font("Roboto", Font.BOLD, 20));
        this.agregarComponentes.setEnabled(true); // Encendido del botón

        // BOTON ELIMINAR COMPONENTES
        this.eliminarComponentes.setBounds(400, 260, 250, 30);
        this.eliminarComponentes.setBackground(Color.WHITE);
        this.eliminarComponentes.setForeground(new Color(3, 92, 134));
        this.eliminarComponentes.setFont(new Font("Roboto", Font.BOLD, 20));
        this.eliminarComponentes.setEnabled(true); // Encendido del botón

        // BOTON LISTAR COMPONENTES
        this.listarComponentes.setBounds(400, 330, 250, 30);
        this.listarComponentes.setBackground(Color.WHITE);
        this.listarComponentes.setForeground(new Color(3, 92, 134));
        this.listarComponentes.setFont(new Font("Roboto", Font.BOLD, 20));
        this.listarComponentes.setEnabled(true); // Encendido del botón


        // BOTON ACTUALIZAR MOTO
        this.actualizarMoto.setBounds(130, 400, 250, 30);
        this.actualizarMoto.setBackground(Color.WHITE);
        this.actualizarMoto.setForeground(new Color(3, 92, 134));
        this.actualizarMoto.setFont(new Font("Roboto", Font.BOLD, 20));
        this.actualizarMoto.setEnabled(true); // Encendido del botón

        // BOTON ACTUALIZAR COMPONENTES
        this.actualizarComponentes.setBounds(400, 400, 250, 30);
        this.actualizarComponentes.setBackground(Color.WHITE);
        this.actualizarComponentes.setForeground(new Color(3, 92, 134));
        this.actualizarComponentes.setFont(new Font("Roboto", Font.BOLD, 18));
        this.actualizarComponentes.setEnabled(true); // Encendido del botón

        // BOTON GRAFICO
        this.grafico.setBounds(500, 500, 100, 30);
        this.grafico.setBackground(Color.WHITE);
        this.grafico.setForeground(new Color(3, 92, 134));
        this.grafico.setFont(new Font("Roboto", Font.BOLD, 18));
        this.grafico.setEnabled(true); // Encendido del botón


        // BOTON ATRAS MOTO
        this.salirOpciones.setBounds(50, 500, 130, 30);
        this.salirOpciones.setBackground(new Color(115, 53, 31));
        this.salirOpciones.setForeground(new Color(255, 255, 255));
        this.salirOpciones.setFont(new Font("Roboto", Font.BOLD, 20));
        this.salirOpciones.setEnabled(true); // Encendido del botón


        // BANNER
        ImageIcon imagen = new ImageIcon("C:\\Users\\User\\Desktop\\Java\\Proyectos\\EstructurasDeDatosClases\\src\\EstructuraDeDatos\\src\\" +
                "ProyectoMotocicletas\\Imagenes\\banner.jpg");
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

    public void adicionar() {

        this.add(textoOpciones);
        this.add(grafico);
        this.add(insertarMotocicletas);
        this.add(venderMoto);
        this.add(listarMotocicletas);
        this.add(listarComponentes);
        this.add(actualizarMoto);
        this.add(salirOpciones);
        this.add(agregarComponentes);
        this.add(eliminarComponentes);
        this.add(actualizarComponentes);

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
        VentanaVender vp = new VentanaVender();
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
        VentanaActualizarMoto vp = new VentanaActualizarMoto();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void abrirVentAgregarComponentes(ActionEvent a) {
        VentanaAgregarComponentes vp = new VentanaAgregarComponentes();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void abrirVentEliminarComponentes(ActionEvent a) {
        VentanaEliminarComponentes vp = new VentanaEliminarComponentes();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void abrirVentActComponentes(ActionEvent a) {
        VentanaActualizarComp vp = new VentanaActualizarComp();
        vp.setVisible(true);
        this.setVisible(false);
    }

    public void abrirVentGrafico(ActionEvent a) {

        if (VentanaInsertar.raiz != null) {
            if (VentanaInsertar.raiz.cabeza != null) {
                VentanaGrafico vp = new VentanaGrafico();
                vp.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron Componentes", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, "No se encontraron Motocicletas", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void acciones() {
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
        ActionListener abrirVenAgreComp = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentAgregarComponentes(ae);
            }
        };
        ActionListener abrirVenElimComp = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentEliminarComponentes(ae);
            }
        };
        ActionListener abrirVenActComp = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentActComponentes(ae);
            }
        };
        ActionListener abrirVenGraf = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                abrirVentGrafico(ae);
            }
        };

        salirOpciones.addActionListener(abrirVenPrin);
        insertarMotocicletas.addActionListener(abrirVenInsertar);
        venderMoto.addActionListener(abrirVenEliminar);
        listarMotocicletas.addActionListener(abrirVenListar);
        listarComponentes.addActionListener(abrirVenComponentes);
        actualizarMoto.addActionListener(abrirVenVender);
        agregarComponentes.addActionListener(abrirVenAgreComp);
        eliminarComponentes.addActionListener(abrirVenElimComp);
        actualizarComponentes.addActionListener(abrirVenActComp);
        grafico.addActionListener(abrirVenGraf);
    }

    public void visualizar() {
        this.setSize(800, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo

    }
}
