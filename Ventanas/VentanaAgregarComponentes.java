package ProyectoMotocicletas.Ventanas;

import ProyectoMotocicletas.Arbol.Componente;
import ProyectoMotocicletas.Arbol.Nodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarComponentes extends JFrame {

    private JLabel agregarComponentes;
    private JLabel buscarTexto;
    private JLabel nombreComponente;
    private JLabel referenciaComponente;
    private JLabel precioComponente;
    private JLabel agregueDatos;
    private JLabel noEncontrado;

    private JTextField buscarCuadro;
    public static JTextField nombre;
    public static JTextField referencia;
    public static JTextField precio;

    private JLabel banner;

    private JButton atras;
    private JButton buscar;
    private JButton agregar;

    public VentanaAgregarComponentes() {
        inicializarComponentes();
        dimensionar();
        adicionar();
        visualizar();
        acciones();
        setTitle("Agregar Componentes");
    }

    public void inicializarComponentes() {
        this.banner = new JLabel();
        this.agregarComponentes = new JLabel("<html>Agregar <p> Componentes", SwingConstants.CENTER);
        this.atras = new JButton("Atrás");
        this.buscarTexto = new JLabel("Digite la placa de la Motocicleta:");
        this.buscarCuadro = new JTextField();
        this.nombreComponente = new JLabel("Nombre del componente:");
        this.referenciaComponente = new JLabel("Referencia:");
        this.precioComponente = new JLabel("Precio:");
        this.agregueDatos = new JLabel("Digite los datos del Componente");
        this.nombre = new JTextField();
        this.referencia = new JTextField();
        this.precio = new JTextField();
        this.buscar = new JButton("Buscar");
        this.agregar = new JButton("Agregar");
        this.noEncontrado = new JLabel("No se encontró la Motocicleta",SwingConstants.CENTER);
    }

    public void dimensionar() {
        this.setLayout(null);

        // ETIQUETA TITULO
        this.agregarComponentes.setBounds(400, 20, 350, 90);
        this.agregarComponentes.setForeground(Color.white);
        this.agregarComponentes.setFont(new Font("Felix Titling", Font.BOLD, 40));


        // BANNER
        ImageIcon imagen = new ImageIcon("C:\\Users\\User\\Desktop\\U\\Estructuras de Datos\\Imagenes Proyecto\\banner8.png");
        this.banner = new JLabel();
        this.banner.setBounds(0, 0, 800, 150);
        this.banner.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(banner.getWidth(), banner.getHeight(), Image.SCALE_SMOOTH)));


        // BOTON ATRAS
        this.atras.setBounds(50, 500, 130, 30);
        this.atras.setBackground(new Color(115, 53, 31));
        this.atras.setForeground(new Color(255, 255, 255));
        this.atras.setFont(new Font("Roboto", Font.BOLD, 20));
        this.atras.setEnabled(true); // Encendido del botón


        // ETIQUETA BUSCAR MOTO
        this.buscarTexto.setBounds(100, 150, 300, 90);
        this.buscarTexto.setForeground(Color.white);
        this.buscarTexto.setFont(new Font("Roboto", Font.BOLD, 20));

        // CUADRO BUSCAR MOTO
        this.buscarCuadro.setBounds(470, 180, 250, 30);
        this.buscarCuadro.setFont(new Font("Roboto", Font.BOLD, 16));

        // ETIQUETA DATOS MOTO
        this.agregueDatos.setBounds(240, 230, 400, 90);
        this.agregueDatos.setForeground(Color.white);
        this.agregueDatos.setFont(new Font("Roboto", Font.BOLD, 25));

        // ETIQUETA NOMBRE COMPONENTE
        this.nombreComponente.setBounds(130, 280, 300, 90);
        this.nombreComponente.setForeground(Color.white);
        this.nombreComponente.setFont(new Font("Roboto", Font.BOLD, 18));

        // ETIQUETA REFERENCIA COMPONENTE
        this.referenciaComponente.setBounds(130, 330, 300, 90);
        this.referenciaComponente.setForeground(Color.white);
        this.referenciaComponente.setFont(new Font("Roboto", Font.BOLD, 18));

        // ETIQUETA PRECIO COMPONENTE
        this.precioComponente.setBounds(130, 380, 300, 90);
        this.precioComponente.setForeground(Color.white);
        this.precioComponente.setFont(new Font("Roboto", Font.BOLD, 18));

        // CUADRO NOMBRE MOTO
        this.nombre.setBounds(460, 310, 200, 30);
        this.nombre.setFont(new Font("Roboto", Font.BOLD, 16));

        // CUADRO REFERENCIA MOTO
        this.referencia.setBounds(460, 360, 200, 30);
        this.referencia.setFont(new Font("Roboto", Font.BOLD, 16));

        // CUADRO PRECIO MOTO
        this.precio.setBounds(460, 410, 200, 30);
        this.precio.setFont(new Font("Roboto", Font.BOLD, 16));

        // BOTON BUSCAR
        this.buscar.setBounds(590, 210, 130, 30);
        this.buscar.setBackground(new Color(152, 154, 160));
        this.buscar.setForeground(new Color(12, 98, 131));
        this.buscar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.buscar.setEnabled(true); // Encendido del botón

        // BOTON AGREGAR
        this.agregar.setBounds(590, 450, 130, 30);
        this.agregar.setBackground(new Color(110, 85, 60));
        this.agregar.setForeground(new Color(255, 255, 255));
        this.agregar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.agregar.setEnabled(true); // Encendido del botón

        // ETIQUETA NO SE ENCONTRÓ MOTO
        this.noEncontrado.setBounds(230, 310, 300, 90);
        this.noEncontrado.setForeground(Color.white);
        this.noEncontrado.setFont(new Font("Roboto", Font.BOLD, 20));

    }

    public void adicionar() {
        this.add(agregarComponentes);
        this.add(banner);
        this.add(atras);
        this.add(buscarCuadro);
        this.add(buscarTexto);
        this.add(nombreComponente);
        this.add(referenciaComponente);
        this.add(precioComponente);
        this.add(agregueDatos);
        this.add(nombre);
        this.add(referencia);
        this.add(precio);
        this.add(buscar);
        this.add(agregar);
        this.add(noEncontrado);
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
        ActionListener agregarComponente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                crearListaComponentes(ae);
            }
        };

        atras.addActionListener(devolver);
        buscar.addActionListener(buscarMoto);
        agregar.addActionListener(agregarComponente);
    }

    public void visualizar() {
        this.setSize(800, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo
        nombre.setVisible(false);
        referencia.setVisible(false);
        precio.setVisible(false);
        nombreComponente.setVisible(false);
        referenciaComponente.setVisible(false);
        precioComponente.setVisible(false);
        agregueDatos.setVisible(false);
        agregar.setVisible(false);
        noEncontrado.setVisible(false);
    }

    // BUSCAR NODOS
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

    public boolean estaVacio() {
        return VentanaInsertar.raiz == null;
    }

    public void encontrarMoto(ActionEvent a) {
        String moto = buscarCuadro.getText();
        if (!estaVacio()) {
            Nodo m = buscarMoto(moto);
            if (m == null) {
                System.out.println("No se encontró esa motocicleta");
                noEncontrado.setVisible(true);
                nombre.setVisible(false);
                referencia.setVisible(false);
                precio.setVisible(false);
                nombreComponente.setVisible(false);
                referenciaComponente.setVisible(false);
                precioComponente.setVisible(false);
                agregueDatos.setVisible(false);
                agregar.setVisible(false);
            }else if (m.getPlaca().compareTo(moto) == 0) {
                noEncontrado.setVisible(false);
                nombre.setVisible(true);
                referencia.setVisible(true);
                precio.setVisible(true);
                nombreComponente.setVisible(true);
                referenciaComponente.setVisible(true);
                precioComponente.setVisible(true);
                agregueDatos.setVisible(true);
                agregar.setVisible(true);
            }

        } else {
            System.out.println("No está");
            noEncontrado.setVisible(true);
            nombre.setVisible(false);
            referencia.setVisible(false);
            precio.setVisible(false);
            nombreComponente.setVisible(false);
            referenciaComponente.setVisible(false);
            precioComponente.setVisible(false);
            agregueDatos.setVisible(false);
            agregar.setVisible(false);
        }
    }

    // CREAR LISTAS EN NODOS
    public void crearListaComponentes(ActionEvent e) {

        String moto = buscarCuadro.getText();
        Nodo a = buscarMoto(moto);

        if (a == null) {
            System.out.println("No se encontró esa motocicleta");
            noEncontrado.setVisible(true);
        } else if (a.getPlaca().compareTo(moto) == 0) {
            if (a.cabeza == null) {
                a.cabeza = a.crearComponentes();
                a.fin = a.cabeza;
                VentanaOpciones vp = new VentanaOpciones();
                vp.setVisible(true);
                this.setVisible(false);

            } else {
                Componente aux = a.crearComponentes();
                a.fin.siguiente = aux;
                a.fin = aux;
                a.fin.siguiente = null;
                VentanaOpciones vp = new VentanaOpciones();
                vp.setVisible(true);
                this.setVisible(false);
            }
        }

    }

}
