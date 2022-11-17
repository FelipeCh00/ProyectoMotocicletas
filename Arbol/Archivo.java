package ProyectoMotocicletas.Arbol;

import java.io.File;
import java.io.PrintWriter;

public class Archivo {

    private String baseURL;
    PrintWriter pw;

    public void crearArchivo() {
        try {
            this.pw = new PrintWriter(new File(this.baseURL));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribir(String line){

        try {
            pw.write(line);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void cerrarArchivo(){
        try {
            this.pw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }


}
