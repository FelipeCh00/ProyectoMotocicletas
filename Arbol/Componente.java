package ProyectoMotocicletas.Arbol;

public class Componente {

    private String nombre;
    private String referencia;
    private int precio;

    public Componente siguiente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "[Nombre: " + this.nombre+"]-"+"[Referencia: "  + this.referencia+"]-"+"[Precio: " + this.precio+"]";
    }

}
