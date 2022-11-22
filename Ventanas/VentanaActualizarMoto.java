package ProyectoMotocicletas.Ventanas;

import ProyectoMotocicletas.Arbol.Nodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaActualizarMoto extends JFrame {

    private JLabel actualizarMoto;
    private JLabel banner;
    private JLabel buscarTexto;
    private JLabel noEncontrado;
    private JLabel queQuiereAct;
    private JLabel fueActualizado;

    private JTextField buscarCuadro;
    private JTextField dato;

    private JButton buscar;
    private JButton atras;
    private JButton placa;
    private JButton modelo;
    private JButton cilindraje;
    private JButton color;
    private JButton actualizar;
    private JButton actualizar2;
    private JButton actualizar3;
    private JButton actualizar4;



    public VentanaActualizarMoto() {
        inicializarComponentes();
        dimensionar();
        adicionar();
        visualizar();
        acciones();
        setTitle("Actualizar Motocicleta");
    }

    public void inicializarComponentes() {
        this.banner = new JLabel();
        this.actualizarMoto = new JLabel("<html>Actualizar <p> Motocicletas", SwingConstants.CENTER);
        this.atras = new JButton("Atrás");
        this.placa = new JButton("Placa");
        this.modelo = new JButton("Modelo");
        this.cilindraje = new JButton("Cilindraje");
        this.color = new JButton("Color");
        this.buscarTexto = new JLabel("Digite la placa de la Motocicleta:");
        this.buscarCuadro = new JTextField();
        this.buscar = new JButton("Buscar");
        this.noEncontrado = new JLabel("No se encontró la Motocicleta", SwingConstants.CENTER);
        this.queQuiereAct = new JLabel("¿Qué dato desea actualizar?", SwingConstants.CENTER);
        this.dato = new JTextField();
        this.actualizar = new JButton("Actualizar");
        this.actualizar2 = new JButton("Actualizar");
        this.actualizar3 = new JButton("Actualizar");
        this.actualizar4 = new JButton("Actualizar");
        this.fueActualizado = new JLabel("<html>La Motocicleta ha <p>sido Modificada", SwingConstants.CENTER);

    }

    public void dimensionar() {
        this.setLayout(null);

        // ETIQUETA TITULO
        this.actualizarMoto.setBounds(400, 20, 350, 90);
        this.actualizarMoto.setForeground(Color.white);
        this.actualizarMoto.setFont(new Font("Felix Titling", Font.BOLD, 40));


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


        // BOTON PLACA
        this.placa.setBounds(100, 320, 130, 30);
        this.placa.setBackground(new Color(128, 125, 34));
        this.placa.setForeground(new Color(255, 255, 255));
        this.placa.setFont(new Font("Roboto", Font.BOLD, 20));
        this.placa.setEnabled(true); // Encendido del botón

        // BOTON MODELO
        this.modelo.setBounds(250, 320, 130, 30);
        this.modelo.setBackground(new Color(128, 125, 34));
        this.modelo.setForeground(new Color(255, 255, 255));
        this.modelo.setFont(new Font("Roboto", Font.BOLD, 20));
        this.modelo.setEnabled(true); // Encendido del botón

        // BOTON CILINDRAJE
        this.cilindraje.setBounds(400, 320, 130, 30);
        this.cilindraje.setBackground(new Color(128, 125, 34));
        this.cilindraje.setForeground(new Color(255, 255, 255));
        this.cilindraje.setFont(new Font("Roboto", Font.BOLD, 20));
        this.cilindraje.setEnabled(true); // Encendido del botón

        // BOTON COLOR
        this.color.setBounds(550, 320, 130, 30);
        this.color.setBackground(new Color(128, 125, 34));
        this.color.setForeground(new Color(255, 255, 255));
        this.color.setFont(new Font("Roboto", Font.BOLD, 20));
        this.color.setEnabled(true); // Encendido del botón

        // ETIQUETA BUSCAR MOTO
        this.buscarTexto.setBounds(100, 150, 300, 90);
        this.buscarTexto.setForeground(Color.white);
        this.buscarTexto.setFont(new Font("Roboto", Font.BOLD, 20));

        // CUADRO BUSCAR MOTO
        this.buscarCuadro.setBounds(470, 180, 250, 30);
        this.buscarCuadro.setFont(new Font("Roboto", Font.BOLD, 16));

        // BOTON BUSCAR
        this.buscar.setBounds(590, 210, 130, 30);
        this.buscar.setBackground(new Color(152, 154, 160));
        this.buscar.setForeground(new Color(12, 98, 131));
        this.buscar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.buscar.setEnabled(true); // Encendido del botón

        // ETIQUETA NO SE ENCONTRÓ MOTO
        this.noEncontrado.setBounds(230, 310, 300, 90);
        this.noEncontrado.setForeground(Color.white);
        this.noEncontrado.setFont(new Font("Roboto", Font.BOLD, 20));

        // ETIQUETA QUE QUIERE ACTUALIZAR
        this.queQuiereAct.setBounds(250, 230, 300, 90);
        this.queQuiereAct.setForeground(Color.white);
        this.queQuiereAct.setFont(new Font("Roboto", Font.BOLD, 20));

        // CUADRO DATO
        this.dato.setBounds(180, 380, 300, 30);
        this.dato.setFont(new Font("Roboto", Font.BOLD, 20));

        // BOTON ACTUALIZAR PLACA
        this.actualizar.setBounds(490, 380, 130, 30);
        this.actualizar.setBackground(new Color(164, 44, 44));
        this.actualizar.setForeground(new Color(255, 255, 255));
        this.actualizar.setFont(new Font("Roboto", Font.BOLD, 20));
        this.actualizar.setEnabled(true); // Encendido del botón

        // BOTON ACTUALIZAR MODELO
        this.actualizar2.setBounds(490, 380, 130, 30);
        this.actualizar2.setBackground(new Color(164, 44, 44));
        this.actualizar2.setForeground(new Color(255, 255, 255));
        this.actualizar2.setFont(new Font("Roboto", Font.BOLD, 20));
        this.actualizar2.setEnabled(true); // Encendido del botón

        // BOTON ACTUALIZAR CILINDRAJE
        this.actualizar3.setBounds(490, 380, 130, 30);
        this.actualizar3.setBackground(new Color(164, 44, 44));
        this.actualizar3.setForeground(new Color(255, 255, 255));
        this.actualizar3.setFont(new Font("Roboto", Font.BOLD, 20));
        this.actualizar3.setEnabled(true); // Encendido del botón

        // BOTON ACTUALIZAR COLOR
        this.actualizar4.setBounds(490, 380, 130, 30);
        this.actualizar4.setBackground(new Color(164, 44, 44));
        this.actualizar4.setForeground(new Color(255, 255, 255));
        this.actualizar4.setFont(new Font("Roboto", Font.BOLD, 20));
        this.actualizar4.setEnabled(true); // Encendido del botón

        // ETIQUETA MOTO ACTUALIZADA
        this.fueActualizado.setBounds(230, 420, 300, 90);
        this.fueActualizado.setForeground(Color.white);
        this.fueActualizado.setFont(new Font("Roboto", Font.BOLD, 20));

    }

    public void adicionar() {
        this.add(actualizarMoto);
        this.add(banner);
        this.add(atras);
        this.add(placa);
        this.add(modelo);
        this.add(cilindraje);
        this.add(color);
        this.add(buscarCuadro);
        this.add(buscarTexto);
        this.add(buscar);
        this.add(noEncontrado);
        this.add(queQuiereAct);
        this.add(dato);
        this.add(actualizar);
        this.add(actualizar2);
        this.add(actualizar3);
        this.add(actualizar4);
        this.add(fueActualizado);

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
        ActionListener actPlaca = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cuadroPlaca(ae);
            }
        };
        ActionListener actPlacaBoton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actualizarPlaca(ae);
            }
        };
        ActionListener actModelo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cuadroModelo(ae);
            }
        };
        ActionListener actModeloBoton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actualizarModelo(ae);
            }
        };
        ActionListener actCilindraje = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cuadroCilindraje(ae);
            }
        };
        ActionListener actCilindrajeBoton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actualizarCilindraje(ae);
            }
        };
        ActionListener actColor = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cuadroColor(ae);
            }
        };
        ActionListener actColorBoton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actualizarColor(ae);
            }
        };

        atras.addActionListener(devolver);
        buscar.addActionListener(buscarMoto);
        placa.addActionListener(actPlaca);
        modelo.addActionListener(actModelo);
        cilindraje.addActionListener(actCilindraje);
        color.addActionListener(actColor);
        actualizar.addActionListener(actPlacaBoton);
        actualizar2.addActionListener(actModeloBoton);
        actualizar3.addActionListener(actCilindrajeBoton);
        actualizar4.addActionListener(actColorBoton);
    }

    public void visualizar() {
        this.setSize(800, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo
        noEncontrado.setVisible(false);
        placa.setVisible(false);
        modelo.setVisible(false);
        cilindraje.setVisible(false);
        color.setVisible(false);
        queQuiereAct.setVisible(false);
        dato.setVisible(false);
        actualizar.setVisible(false);
        actualizar2.setVisible(false);
        actualizar3.setVisible(false);
        actualizar4.setVisible(false);
        fueActualizado.setVisible(false);
    }

    public void encontrarMoto(ActionEvent a) {
        String moto = buscarCuadro.getText();
        if (!estaVacio()) {
            Nodo m = buscarMoto(moto);
            if (m == null) {
                noEncontrado.setVisible(true);
                placa.setVisible(false);
                modelo.setVisible(false);
                cilindraje.setVisible(false);
                color.setVisible(false);
                queQuiereAct.setVisible(false);
                dato.setVisible(false);
                actualizar.setVisible(false);
            } else if (m.getPlaca().compareTo(moto) == 0) {
                noEncontrado.setVisible(false);
                placa.setVisible(true);
                modelo.setVisible(true);
                cilindraje.setVisible(true);
                color.setVisible(true);
                queQuiereAct.setVisible(true);
            }

        } else {
            noEncontrado.setVisible(true);
            placa.setVisible(false);
            modelo.setVisible(false);
            cilindraje.setVisible(false);
            color.setVisible(false);
            queQuiereAct.setVisible(false);
            dato.setVisible(false);
            actualizar.setVisible(false);
        }
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

    public void cuadroPlaca(ActionEvent a){
        dato.setVisible(true);
        actualizar.setVisible(true);

    }
    public void cuadroModelo(ActionEvent a){
        dato.setVisible(true);
        actualizar2.setVisible(true);

    }
    public void cuadroCilindraje(ActionEvent a){
        dato.setVisible(true);
        actualizar3.setVisible(true);
    }
    public void cuadroColor(ActionEvent a){
        dato.setVisible(true);
        actualizar4.setVisible(true);

    }
    public void actualizarPlaca(ActionEvent a){
        String moto = buscarCuadro.getText();
        Nodo m = buscarMoto(moto);
        String nuevoDato = dato.getText();

        m.setPlaca(nuevoDato);
        fueActualizado.setVisible(true);
        actualizar.setEnabled(false);
    }
    public void actualizarModelo(ActionEvent a){
        String moto = buscarCuadro.getText();
        Nodo m = buscarMoto(moto);
        String nuevoDato = dato.getText();

        m.setModelo(nuevoDato);
        fueActualizado.setVisible(true);
        actualizar2.setEnabled(false);
    }
    public void actualizarCilindraje(ActionEvent a){
        String moto = buscarCuadro.getText();
        Nodo m = buscarMoto(moto);
        String nuevoDato = dato.getText();

        m.setCilindraje(Integer.parseInt(nuevoDato));
        fueActualizado.setVisible(true);
        actualizar3.setEnabled(false);
    }
    public void actualizarColor(ActionEvent a){
        String moto = buscarCuadro.getText();
        Nodo m = buscarMoto(moto);
        String nuevoDato = dato.getText();

        m.setColor(nuevoDato);
        fueActualizado.setVisible(true);
        actualizar4.setEnabled(false);
    }

}
