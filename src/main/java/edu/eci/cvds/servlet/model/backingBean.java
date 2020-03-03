package edu.eci.cvds.servlet.model;

import javax.faces.bean.*;
import java.util.ArrayList;
import java.util.Random;

@ManagedBean(name = "guessBean")
@ApplicationScoped
public class backingBean {

    private ArrayList<Integer> numIntentos;
    private int premioAcumulado;
    private int numeroRandom;
    private String estado;


    public backingBean(){
        restart();
    }

    public void restart(){
        Random r = new Random();
        numeroRandom = r.nextInt(11);
        numIntentos = new ArrayList<>();
        premioAcumulado = 100000;
        estado = "No gana";
    }

    public void guess(int num){
        numIntentos.add(num);
        if(num!=numeroRandom){
            premioAcumulado-=10000;
        }else{
            estado = "Gana";
        }
    }

    public ArrayList<Integer> getNumIntentos() {
        return numIntentos;
    }

    public void setNumIntentos(ArrayList<Integer> numIntentos) {
        this.numIntentos = numIntentos;
    }

    public int getPremioAcumulado() {
        return premioAcumulado;
    }

    public void setPremioAcumulado(int premioAcumulado) {
        this.premioAcumulado = premioAcumulado;
    }

    public int getNumeroRandom() {
        return numeroRandom;
    }

    public void setNumeroRandom(int numeroRandom) {
        this.numeroRandom = numeroRandom;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}