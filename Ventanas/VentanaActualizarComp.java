package ProyectoMotocicletas.Ventanas;

import ProyectoMotocicletas.Arbol.Componente;
import ProyectoMotocicletas.Arbol.Nodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaActualizarComp extends JFrame {

    private JLabel actualizarComponente;
    private JLabel banner;
    private JLabel buscarTexto;
    private JLabel noEncontradoMoto;
    private JLabel noEncontradoComp;
    private JLabel fueActualizado;
    private JLabel nombreComp;
    private JLabel agregueDatos;


    private JTextField buscarCuadro;
    private JTextField dato;
    private JTextArea cuadroLista;

    private JButton buscar;
    private JButton atras;
    private JButton buscar2;
    private JButton actualizar;

    private JLabel nombreComponente;
    private JLabel referenciaComponente;
    private JLabel precioComponente;
    public static JTextField nombre;
    public static JTextField referencia;
    public static JTextField precio;

    public VentanaActualizarComp() {
        inicializarComponentes();
        dimensionar();
        adicionar();
        visualizar();
        acciones();
        setTitle("Actualizar Componentes");
    }

    public void inicializarComponentes() {
        this.atras = new JButton("Atrás");
        this.banner = new JLabel();
        this.actualizarComponente = new JLabel("<html>Actualizar <p> Componente");

        this.buscarTexto = new JLabel("Digite la placa de la Motocicleta:");
        this.buscarCuadro = new JTextField();
        this.buscar = new JButton("Buscar");
        this.buscar2 = new JButton("Buscar");

        this.noEncontradoMoto = new JLabel("No se encontró la Motocicleta", SwingConstants.CENTER);
        this.fueActualizado = new JLabel("<html>La Motocicleta ha <p>sido Modificada", SwingConstants.CENTER);
        this.noEncontradoComp = new JLabel("No se encontró ese Componente", SwingConstants.CENTER);

        this.nombreComp = new JLabel("<html>Digite el nombre del componente<p> que desea actualizar:", SwingConstants.CENTER);
        this.dato = new JTextField();

        this.cuadroLista = new JTextArea();
        this.nombreComponente = new JLabel("Nombre del componente:");
        this.referenciaComponente = new JLabel("Referencia:");
        this.precioComponente = new JLabel("Precio:");
        nombre = new JTextField();
        referencia = new JTextField();
        precio = new JTextField();
        this.actualizar = new JButton("Actualizar");
        this.agregueDatos = new JLabel("Agregue los nuevos datos del componente");


    }

    public void dimensionar() {
        this.setLayout(null);

        // ETIQUETA TITULO
        this.actualizarComponente.setBounds(90, 20, 320, 90);
        this.actualizarComponente.setForeground(Color.white);
        this.actualizarComponente.setFont(new Font("Felix Titling", Font.BOLD, 40));


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
        this.noEncontradoMoto.setBounds(230, 310, 300, 90);
        this.noEncontradoMoto.setForeground(Color.white);
        this.noEncontradoMoto.setFont(new Font("Roboto", Font.BOLD, 20));

        // ETIQUETA MOTO ACTUALIZADA
        this.fueActualizado.setBounds(230, 440, 300, 90);
        this.fueActualizado.setForeground(Color.white);
        this.fueActualizado.setFont(new Font("Roboto", Font.BOLD, 20));

        // ETIQUETA NO SE ENCONTRÓ COMP
        this.noEncontradoComp.setBounds(230, 370, 300, 90);
        this.noEncontradoComp.setForeground(Color.white);
        this.noEncontradoComp.setFont(new Font("Roboto", Font.BOLD, 20));


        // ETIQUETA NOMBRE COMPONENTE
        this.nombreComp.setBounds(80, 260, 300, 90);
        this.nombreComp.setForeground(Color.white);
        this.nombreComp.setFont(new Font("Roboto", Font.BOLD, 20));

        // CUADRO DATO
        this.dato.setBounds(430, 280, 250, 30);
        this.dato.setFont(new Font("Roboto", Font.BOLD, 20));

        // BOTON BUSCAR2
        this.buscar2.setBounds(550, 315, 130, 30);
        this.buscar2.setBackground(new Color(110, 93, 24));
        this.buscar2.setForeground(new Color(255, 255, 255));
        this.buscar2.setFont(new Font("Roboto", Font.BOLD, 20));
        this.buscar2.setEnabled(true); // Encendido del botón

        // CUADRO COMPONENTES
        this.cuadroLista.setBounds(100, 250, 600, 30);
        this.cuadroLista.setFont(new Font("Roboto", Font.BOLD, 16));


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
        nombre.setBounds(460, 310, 200, 30);
        nombre.setFont(new Font("Roboto", Font.BOLD, 16));

        // CUADRO REFERENCIA MOTO
        referencia.setBounds(460, 360, 200, 30);
        referencia.setFont(new Font("Roboto", Font.BOLD, 16));

        // CUADRO PRECIO MOTO
        precio.setBounds(460, 410, 200, 30);
        precio.setFont(new Font("Roboto", Font.BOLD, 16));

        // BOTON ACTUALIZAR
        this.actualizar.setBounds(540, 450, 120, 30);
        this.actualizar.setBackground(new Color(164, 44, 44));
        this.actualizar.setForeground(new Color(255, 255, 255));
        this.actualizar.setFont(new Font("Roboto", Font.BOLD, 16));
        this.actualizar.setEnabled(true); // Encendido del botón

        // ETIQUETA AGREGUE DATOS COMP
        this.agregueDatos.setBounds(100, 150, 500, 90);
        this.agregueDatos.setForeground(Color.white);
        this.agregueDatos.setFont(new Font("Roboto", Font.BOLD, 20));
    }

    public void adicionar() {
        this.add(actualizarComponente);
        this.add(atras);
        this.add(banner);
        this.add(buscarCuadro);
        this.add(buscarTexto);
        this.add(buscar);
        this.add(buscar2);
        this.add(noEncontradoMoto);
        this.add(noEncontradoComp);
        this.add(fueActualizado);
        this.add(nombreComp);
        this.add(dato);
        this.add(cuadroLista);

        this.add(nombreComponente);
        this.add(referenciaComponente);
        this.add(precioComponente);
        this.add(nombre);
        this.add(referencia);
        this.add(precio);
        this.add(actualizar);
        this.add(agregueDatos);
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
                actualizarComp(ae);
            }
        };
        ActionListener subirDatoComp = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                subirDatos(ae);
            }
        };

        atras.addActionListener(devolver);
        buscar.addActionListener(buscarMoto);
        buscar2.addActionListener(buscarComp);
        actualizar.addActionListener(subirDatoComp);
    }

    public void visualizar() {
        this.setSize(800, 600);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(new Color(30, 30, 30)); //Poner Color RGB en el fondo
        fueActualizado.setVisible(false);
        noEncontradoMoto.setVisible(false);
        nombreComp.setVisible(false);
        dato.setVisible(false);
        buscar2.setVisible(false);
        noEncontradoComp.setVisible(false);
        cuadroLista.setVisible(false);
        nombre.setVisible(false);
        referencia.setVisible(false);
        precio.setVisible(false);
        nombreComponente.setVisible(false);
        referenciaComponente.setVisible(false);
        precioComponente.setVisible(false);
        actualizar.setVisible(false);
        agregueDatos.setVisible(false);

    }

    public void encontrarMoto(ActionEvent a) {
        String moto = buscarCuadro.getText();
        if (!estaVacio()) {
            Nodo m = buscarMoto(moto);
            if (m == null) {
                System.out.println("No se encontró esa motocicleta");
                noEncontradoMoto.setVisible(true);
                fueActualizado.setVisible(false);
                nombreComp.setVisible(false);
                dato.setVisible(false);
                buscar2.setVisible(false);
                fueActualizado.setVisible(false);
            } else if (m.getPlaca().compareTo(moto) == 0) {
                noEncontradoMoto.setVisible(false);
                fueActualizado.setVisible(true);
                nombreComp.setVisible(true);
                dato.setVisible(true);
                buscar2.setVisible(true);
                fueActualizado.setVisible(false);


            }

        } else {
            System.out.println("No está");
            noEncontradoMoto.setVisible(true);
            fueActualizado.setVisible(false);
            nombreComp.setVisible(false);
            dato.setVisible(false);
            buscar2.setVisible(false);
            fueActualizado.setVisible(false);

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

    // CLASE ACTUALIZAR COMPONENTE
    public void actualizarComp(ActionEvent a) {

        String moto = buscarCuadro.getText();
        Nodo motoBuscada = buscarMoto(moto);

        Componente nodo = motoBuscada.cabeza;
        String componenteUsuario = dato.getText();

        boolean flag = false;
        while (nodo != null) {
            if (nodo.getNombre().compareTo(componenteUsuario) == 0) {
                flag = true;
                dato.setVisible(false);
                nombreComp.setVisible(false);
                buscar2.setVisible(false);
                buscar.setVisible(false);
                buscarCuadro.setVisible(false);
                buscarTexto.setVisible(false);
                cuadroLista.setVisible(true);
                agregueDatos.setVisible(true);
                cuadroLista.setText("");
                cuadroLista.append("Componente: " + nodo);
                nombre.setVisible(true);
                referencia.setVisible(true);
                precio.setVisible(true);
                nombreComponente.setVisible(true);
                referenciaComponente.setVisible(true);
                precioComponente.setVisible(true);
                actualizar.setVisible(true);
                break;
            }
            nodo = nodo.siguiente;
        }
        if (flag) {
            noEncontradoComp.setVisible(false);
        } else {
            noEncontradoComp.setVisible(true);
        }


    }

    public void subirDatos(ActionEvent a) {

        String moto = buscarCuadro.getText();
        Nodo motoBuscada = buscarMoto(moto);

        Componente nodo = motoBuscada.cabeza;
        String componenteUsuario = dato.getText();

        boolean flag = false;
        while (nodo != null) {
            if (nodo.getNombre().compareTo(componenteUsuario) == 0) {
                flag = true;

                if(nombre.getText().compareTo("")>0){
                    nodo.setNombre(nombre.getText());
                }
                if (referencia.getText().compareTo("")>0) {
                    nodo.setReferencia(referencia.getText());
                }
                if (precio.getText()!= null) {
                    nodo.setPrecio(Integer.parseInt(precio.getText()));
                }
                break;
            }
            nodo = nodo.siguiente;
        }
        if (flag) {
            noEncontradoComp.setVisible(false);
            fueActualizado.setVisible(true);
        } else {
            noEncontradoComp.setVisible(true);
        }
        actualizar.setEnabled(false);
    }
}
