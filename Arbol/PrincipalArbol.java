package ProyectoMotocicletas.Arbol;
import java.io.InputStreamReader;
import java.util.Scanner;


public class PrincipalArbol {

    static Nodo raiz;
    Scanner sc;


    public PrincipalArbol() {
        solicitarDatos();
        menu();
        raiz = null;
    }

    public void abrirFlujo() {
        try {
            sc = new Scanner(new InputStreamReader(System.in));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String leer() {
        try {
            return sc.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int menu() {
        int opcion;
        System.out.println("******** Digite una opci�n *********+");
        System.out.println("1) Insertar Motocicleta");
        System.out.println("2) Imprimir motocicletas en preorden");
        System.out.println("3) Imprimir motocicletas en postorden");
        System.out.println("4) Imprimir motocicletas en inorden");
        System.out.println("5) Agregar componentes");
        System.out.println("6) Imprimir Componentes");
        System.out.println("7) Eliminar Componentes");
        System.out.println("8) Salir");
        System.out.print("Opci�n ==> ");

        try {
            opcion = Integer.parseInt(leer());
            return opcion;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void solicitarDatos() {
        int opcion;
        abrirFlujo();
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("Crear �rbol");
                    insertarNodo();
                    break;
                case 2:
                    System.out.println("Imprimir PREORDEN");
                    if (!estaVacio()) {
                        preOrder(raiz);
                    } else {
                        System.out.println("Esta vac�o");
                    }

                    break;
                case 3:
                    System.out.println("Imprimir POSTORDEN");
                    if (!estaVacio()) {
                        posOrder(raiz);
                    } else {
                        System.out.println("Esta vac�o");
                    }
                    break;
                case 4:
                    System.out.println("Imprimir INORDER");
                    System.out.println("raiz: " + raiz.getCilindraje());
                    if (!estaVacio()) {
                        inOrder(raiz);
                    } else {
                        System.out.println("Esta vac�o");
                    }

                    break;
                case 5:
                    System.out.println("Agregar componentes");
                    crearListaComponentes();
                    break;
                case 6:
                    imprimirComponentes();
                    break;
                case 7:
                    System.out.println("Eliminar componente");
                    System.out.println("Digite la placa de la motocicleta: ");
                    String moto = leer();
                    Nodo a = buscarMoto(moto);
                    if (a == null) {
                        System.out.println("No se encontr�");
                    }else{
                        a.eliminarComponente();
                    }
                case 8:
                    System.out.println("Saliendo");
                    break;
            }
        } while (opcion != 8);
    }


    public Nodo crearNodo() {

        Nodo nuevoNodo = new Nodo();
        System.out.println("Ingrese la placa: ");
        nuevoNodo.setPlaca(leer());
        System.out.println("Ingrese el modelo: ");
        nuevoNodo.setModelo(leer());
        System.out.println("Ingrese el cilindraje: ");
        nuevoNodo.setCilindraje(Integer.parseInt(leer()));
        System.out.println("Ingrese el color: ");
        nuevoNodo.setColor(leer());
        return nuevoNodo;
    }

    public void insertarNodo() {

        Nodo motoNueva = crearNodo();

        if (raiz == null) {
            raiz = motoNueva;
        } else {
            Nodo aux = raiz;
            Nodo padre;

            while (true) {
                padre = aux;
                if (motoNueva.getCilindraje() < aux.getCilindraje()) {
                    aux = aux.izquierda;
                    if (aux == null) {
                        padre.izquierda = motoNueva;
                        return;
                    }
                } else if ((motoNueva.getCilindraje() > aux.getCilindraje())) {
                    aux = aux.derecha;
                    if (aux == null) {
                        padre.derecha = motoNueva;
                        return;
                    }
                } else if ((motoNueva.getCilindraje() == aux.getCilindraje())) {
                    System.out.println("No se puede ingresar dos motocicletas con el mismo cilindraje");
                    return;
                }
            }

        }
    }

    public Nodo buscarMoto(String placa) {

        if(raiz!=null){
            Nodo aux = raiz;
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
        }else{
            System.out.println("No hay motocicletas");
        }
        return null;
    }

    public void crearListaComponentes() {

        System.out.println("Digite la placa de la moto que necesita para agregarlo: ");
        String moto = sc.nextLine();
        Nodo a = buscarMoto(moto);

        if (a == null) {
            System.out.println("No se encontr� esa motocicleta");
        } else if (a.getPlaca().compareTo(moto) == 0) {
            if (a.cabeza == null) {
                a.cabeza = a.crearComponentes();
                a.fin = a.cabeza;
            } else {
                Componente aux = a.crearComponentes();
                a.fin.siguiente = aux;
                a.fin = aux;
                a.fin.siguiente = null;
            }
        }

    }



    public void imprimirComponentes() {

        System.out.println("Digite la placa de la moto que necesita: ");
        String moto = sc.nextLine();

        Nodo motoComponentes = buscarMoto(moto);

        if (motoComponentes == null) {
            System.out.println("No se encontr�");
        } else if (buscarMoto(moto).getPlaca().compareTo(moto) == 0) {
            if (motoComponentes.cabeza != null) {
                Componente aux = motoComponentes.cabeza;
                while (aux != null) {
                    System.out.println("-----------------------------");
                    System.out.println("Componente: " + aux);
                    aux = aux.siguiente;
                    System.out.println("-----------------------------");
                }
            } else {
                System.out.println("\n-----------------------------");
                System.out.println("No se encontraron Componentes");
                System.out.println("-----------------------------");

            }

        } else {
            System.out.println("No se encontr� la motocicleta");
        }

    }

    public boolean estaVacio() {
        return raiz == null;
    }

    // PREORDEN --> NODO, IZQUIERDA, DERECHA
    public void preOrder(Nodo r) {
        if (r != null) {
            System.out.println(r);
            preOrder(r.izquierda);
            preOrder(r.derecha);
        }
    }

    // INORDEN --> IZQUIERDA, NODO, DERECHA
    public void inOrder(Nodo r) {
        if (r != null) {
            inOrder(r.izquierda);
            System.out.println(r);
            inOrder(r.derecha);

        }
    }

    // POSTORDEN --> IZQUIERDA, DERECHA, NODO
    public void posOrder(Nodo r) {
        if (r != null) {
            posOrder(r.izquierda);
            posOrder(r.derecha);
            System.out.println(r);

        }
    }

    public static void main(String[] args) {

        PrincipalArbol p = new PrincipalArbol();
    }

}
