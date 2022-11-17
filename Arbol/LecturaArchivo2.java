package ProyectoMotocicletas.Arbol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LecturaArchivo2 {

    BufferedReader in;
    private String baseUrl;

    public void abrirArchivo(){
        try {
            in = new BufferedReader(new FileReader(new File(baseUrl)));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String leer(){
        try {
            return in.readLine();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public  void cerrarArchivo(){
        try {
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

}
