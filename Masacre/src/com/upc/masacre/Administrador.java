package com.upc.masacre;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private String mombre;
    private List<Participante> participantes;

    public Administrador() {
    }

    public Administrador(String mombre) {
        this.mombre = mombre;
        this.participantes = new ArrayList<>();
    }

    public String registrar(Participante participante){
        String result = participante.validarDatos();
        if(result.equals("")){
            this.participantes.add(participante);
            result = "Participante " + participante.getNombre() + " " + participante.getApellido() + " agregado correctamente.";
        }
        return result;
    }

    public Participante calcularGanador(){
        double maximo = 0;
        Participante parti = null;
        for(Participante p:this.participantes){
            if(p.obtenerPuntaje() > maximo){
                maximo = p.obtenerPuntaje();
                parti = p;
            }
        }
        return parti;
    }

    public List<Participante> listarPorTipo(String tipo){
        List<Participante> participantes = new ArrayList<>();
        for(Participante p:this.participantes){
            if(tipo.equals("TV")){
                if(p instanceof Televidente){
                    participantes.add(p);
                }
            }
            if(tipo.equals("FAN")){
                if(p instanceof Fan){
                    participantes.add(p);
                }
            }
        }
        return participantes;
    }

    public String getMombre() {
        return mombre;
    }

    public void setMombre(String mombre) {
        this.mombre = mombre;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }
}
