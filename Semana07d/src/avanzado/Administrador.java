package avanzado;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private static Administrador administrador = new Administrador();
    private String nombre;
    private static List<Profesor> profesores;//teorema de Liskov

    public static Administrador obtenerInstancia(String nombre){
        administrador.setNombre(nombre);
        profesores = new ArrayList<>();
        return administrador;
    }


    public void registrar(Profesor profesor){

        this.profesores.add(profesor);
    }

    public Profesor ganaMas(){
        double maximo = 0;
        Profesor profe=null;
        for(Profesor p:this.profesores){
            if (p.calcularSueldo()>maximo){
                maximo = p.calcularSueldo();
                profe = p;
            }
        }
        return profe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
