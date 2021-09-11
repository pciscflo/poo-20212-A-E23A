package com.upc.relaciones;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Bicicleta> arregloBicicletas;

    public Tienda() {
        this.arregloBicicletas = new ArrayList<>();
    }

    public void registrar(Bicicleta bicicleta){
        this.arregloBicicletas.add(bicicleta);
    }
    public int contarCantidadBicicletasMontañeras(){
        int contador=0;
        for(Bicicleta p:this.arregloBicicletas){
            if(p.getClass()==Montañeras.class){
                contador++;
            }
        }
        return contador;
    }
    public List<Bicicleta> obtenerBicicletasMontañeras(Class tipo){
        List<Bicicleta> temporal = new ArrayList<>();
        for(Bicicleta p: this.arregloBicicletas){
            if(p.getClass() == tipo){
                temporal.add(p);
            }
        }
        return temporal;
    }
}
