package avanzado;

public class Ejercicio2 {
    public static void main(String[] args) {

        Administrador administrador = Administrador.obtenerInstancia("Freddy");
        Profesor profesorTC = Factoria.dameObjeto("TC","88888888","Pepe","29","1000","0.12");
        Profesor profesorTP = Factoria.dameObjeto("TP","99999999","Luis","27","40","30");

        administrador.registrar(profesorTC);
        administrador.registrar(profesorTP);

        for(Profesor p:administrador.getProfesores()){
            System.out.println(p.getNombre() + "   " + p.calcularSueldo());
        }
        Profesor profesor = administrador.ganaMas();
        System.out.println("Gana mas:" + profesor.getNombre() + "  " + profesor.calcularSueldo());
        //end class
    }
}
