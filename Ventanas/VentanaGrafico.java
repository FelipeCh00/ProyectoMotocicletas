package ProyectoMotocicletas.Ventanas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import ProyectoMotocicletas.Arbol.Componente;
import ProyectoMotocicletas.Arbol.Nodo;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class VentanaGrafico extends JFrame {

    private JButton atras;
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    public void inicializarComponentes() {
        this.atras = new JButton("Atrás");
    }

    public void dimensionar() {
        this.setLayout(null);

        // BOTON ATRAS
        this.atras.setBounds(50, 500, 130, 30);
        this.atras.setBackground(new Color(115, 53, 31));
        this.atras.setForeground(new Color(255, 255, 255));
        this.atras.setFont(new Font("Roboto", Font.BOLD, 20));
        this.atras.setEnabled(true); // Encendido del botón

    }

    public void adicionar() {
        this.add(atras);
    }

    public void visualizar() {

        this.setVisible(true);
        setLocationRelativeTo(null);
        this.setResizable(false);

    }

    public VentanaGrafico() {
        initUI();
    }

    private void initUI() {


        CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(new Color(30, 30, 30));
        add(chartPanel);

        pack();
        setTitle("Precio Componentes Motocicleta Raíz");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private CategoryDataset createDataset() {

        if (VentanaInsertar.raiz != null) {
            Nodo motoComponentes = VentanaInsertar.raiz;

            if (motoComponentes.cabeza != null) {

                Componente aux = motoComponentes.cabeza;
                while (aux != null) {
                    dataset.setValue(aux.getPrecio(), "Precio", aux.getNombre());
                    aux = aux.siguiente;

                }
                return dataset;
            }

        }
        return null;
    }

    private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart(
                "Precio de los componentes del Nodo Raíz",
                "",
                "Precio",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        return barChart;
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

    public void abrirVentOpciones(ActionEvent a) {
        VentanaOpciones vp = new VentanaOpciones();
        vp.setVisible(true);
        this.setVisible(false);
    }
}
