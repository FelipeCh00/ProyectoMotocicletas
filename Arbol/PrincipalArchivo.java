package ProyectoMotocicletas.Arbol;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrincipalArchivo {

    public PrincipalArchivo() {
        lecturaConsola();
    }

    public static void lecturaConsola() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line;
            Archivo lapiz = new Archivo();
            lapiz.setBaseURL("C:\\Users\\User\\Desktop\\Java\\Proyectos\\HelloWorld\\out\\production\\EstructuraDeDatos\\Archivo de Texto Nuevo.txt");
            lapiz.crearArchivo();
            while (!((line = in.readLine()).equals("0"))) {
                lapiz.escribir(line);
                lapiz.escribir("\n");
            }
            lapiz.cerrarArchivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivo(){
        try {
            LecturaArchivo2 la = new LecturaArchivo2();
            la.setBaseUrl("C:\\Users\\User\\Desktop\\Java\\Proyectos\\HelloWorld\\out\\production\\EstructuraDeDatos\\Archivo de Texto Nuevo.txt");
            la.abrirArchivo();
            String line;
            while((line=la.leer())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        PrincipalArchivo p = new PrincipalArchivo();
        p.leerArchivo();
    }

}
