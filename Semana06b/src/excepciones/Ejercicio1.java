package excepciones;

public class Ejercicio1 {

    public static void main(String args[]) {
        Negocio negocio = new Negocio();
        try {
            negocio.leerArchivo("c://Instaladores/Demo5.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fin de Main");
    }
}