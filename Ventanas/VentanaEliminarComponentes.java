package ProyectoMotocicletas.Ventanas;

import ProyectoMotocicletas.Arbol.Nodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEliminarComponentes extends JFrame {
    private JLabel venderMoto;
    private JLabel banner;
    private JButton atras;

    public static JLabel nombreComponente;
    public static JLabel mensajeCompEliminado;
    public static JLabel mensajeNoEncontrado;
    private JLabel noEncontrado;

    public static JTextField componenteCuadro;

    private JLabel buscarTexto;
    private JTextField buscarCuadro;

    private JButton buscarBoton;
    private JButton buscarBoton2;
    private JButton eliminar;

    public VentanaEliminarComponentes() {
        inicializarComponentes();
        dimensionar();
        adicionar();
        visualizar();
        acciones();
        setTitle("Eliminar Componentes");
    }

    public void inicializarComponentes() {
        this.banner = new JLabel();
        this.venderMoto = new JLabel("<html>Eliminar <p> Componentes", SwingConstants.CENTER);
        this.atras = new JButton("Atrás");
        this.buscarTexto = new JLabel("Digite la placa de la Motocicleta:");
        this.buscarCuadro = new JTextField();
        this.buscarBoton = new JButton("Buscar");
        this.buscarBoton2 = new JButton("Eliminar Componente");
        this.eliminar = new JButton("Eliminar");
        this.noEncontrado = new JLabel("No se encontró la Motocicleta",SwingConstants.CENTER);
        mensajeCompEliminado = new JLabel("<html>El Componente ha sido<p> eliminado exitosamente",SwingConstants.CENTER);
        nombreComponente = new JLabel("<html>Digite el nombre del <p>componente que desea eliminar: ",SwingConstants.CENTER);
        mensajeNoEncontrado = new JLabel("<html>No se encontró un <p>componente con ese nombre",SwingConstants.CENTER);
        componenteCuadro = new JTextField();

    }

    public void dimensionar() {
        this.setLayout(null);

        // ETIQUETA TITULO
        this.venderMoto.setBounds(400, 20, 350, 90);
        this.venderMoto.setForeground(Color.white);
        this.venderMoto.setFont(new Font("Felix Titling", Font.BOLD, 40));


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

        // BOTON BUSCAR MOTO
        this.buscarBoton.setBounds(590, 210, 130, 30);
        this.buscarBoton.setBackground(new Color(152, 154, 160));
        this.buscarBoton.setForeground(new Color(12, 98, 131));
        this.buscarBoton.setFont(new Font("Roboto", Font.BOLD, 20));
        this.buscarBoton.setEnabled(true); // Encendido del botón


        // ETIQUETA NOMBRE DEL COMPONENTE
        nombreComponente.setBounds(80, 250, 300, 90);
        nombreComponente.setForeground(Color.white);
        nombreComponente.setFont(new Font("Roboto", Font.BOLD, 20));

        // CUADRO COMPONENTE
        componenteCuadro.setBounds(430, 290, 250, 30);
        componenteCuadro.setFont(new Font("Roboto", Font.BOLD, 16));

        // BOTON BUSCAR COMPONENTE
        this.buscarBoton2.setBounds(470, 320, 180, 30);
        this.buscarBoton2.setBackground(new Color(152, 154, 160));
        this.buscarBoton2.setForeground(new Color(12, 98, 131));
        this.buscarBoton2.setFont(new Font("Roboto", Font.BOLD, 15));
        this.buscarBoton2.setEnabled(true); // Encendido del botón



        // ETIQUETA NO SE ENCONTRÓ MOTO
        this.noEncontrado.setBounds(230, 310, 300, 90);
        this.noEncontrado.setForeground(Color.white);
        this.noEncontrado.setFont(new Font("Roboto", Font.BOLD, 20));

        // ETIQUETA NO SE ENCONTRÓ COMPONENTE
        mensajeCompEliminado.setBounds(250, 370, 300, 90);
        mensajeCompEliminado.setForeground(Color.white);
        mensajeCompEliminado.setFont(new Font("Roboto", Font.BOLD, 20));

        // ETIQUETA NO SE ENCONTRÓ COMPONENTE
        mensajeNoEncontrado.setBounds(250, 370, 300, 90);
        mensajeNoEncontrado.setForeground(Color.white);
        mensajeNoEncontrado.setFont(new Font("Roboto", Font.BOLD, 20));



    }

    public void adicionar() {
        this.add(venderMoto);
        this.add(banner);
        this.add(atras);
        this.add(buscarCuadro);
        this.add(buscarTexto);
        this.add(buscarBoton);
        this.add(buscarBoton2);
        this.add(eliminar);
        this.add(noEncontrado);
        this.add(mensajeCompEliminado);
        this.add(nombreComponente);
        this.add(mensajeNoEncontrado);
        this.add(componenteCuadro);
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
        ActionListener buscarComp = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                buscarComponente(ae);
            }
        };

        atras.addActionListener(devolver);
        buscarBoton.addActionListener(buscarMoto);
        buscarBoton2.addActionListener(buscarComp);
    }

    public void visualizar() {
        this.setSize(800, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo
        mensajeCompEliminado.setVisible(false);
        mensajeNoEncontrado.setVisible(false);
        nombreComponente.setVisible(false);
        this.buscarBoton2.setVisible(false);
        componenteCuadro.setVisible(false);
        this.noEncontrado.setVisible(false);
    }

    public void buscarComponente(ActionEvent a){

        String moto = buscarCuadro.getText();
        Nodo motocicleta = buscarMoto(moto);
        String quieroBuscarEsto = componenteCuadro.getText();
        if(quieroBuscarEsto!=null){
            motocicleta.eliminarComponente(componenteCuadro.getText());
        }else {
            mensajeNoEncontrado.setVisible(true);
        }

    }

    public boolean estaVacio() {
        return VentanaInsertar.raiz == null;
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

    public Nodo encontrarMoto(ActionEvent a) {
        String moto = buscarCuadro.getText();
        if (!estaVacio()) {
            Nodo m = buscarMoto(moto);
            if (m == null) {
                System.out.println("No se encontró esa motocicleta");
                noEncontrado.setVisible(true);
                nombreComponente.setVisible(false);
                componenteCuadro.setVisible(false);
                this.buscarBoton2.setVisible(false);



            } else if (m.getPlaca().compareTo(moto) == 0) {
                this.noEncontrado.setVisible(false);
                nombreComponente.setVisible(true);
                componenteCuadro.setVisible(true);
                this.buscarBoton2.setVisible(true);
                return m;
            }

        } else {
            System.out.println("No está");
            this.noEncontrado.setVisible(true);
            nombreComponente.setVisible(false);
            componenteCuadro.setVisible(false);
            this.buscarBoton2.setVisible(false);
            return null;


        }
        return null;
    }
}
