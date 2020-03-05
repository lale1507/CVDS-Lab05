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
    private int numeroEntra;
    private int cantIntentos;


    public backingBean(){
        numIntentos = new ArrayList<Integer>();
        Random r = new Random();
        numeroRandom = r.nextInt(10)+1;
        estado = "No Gana";
        premioAcumulado = 0;
        cantIntentos=0;
        //restart();
    }

    public void restart(){
        numIntentos = new ArrayList<Integer>();
        Random r = new Random();
        numeroRandom = r.nextInt(10)+1;
        estado = "No Gana";
        premioAcumulado = 0;
        cantIntentos = 0;
    }

    public void guess(int num){
        cantIntentos+=1;
        numeroEntra=num;
        numIntentos.add(num);
        if(num!=numeroRandom){
            premioAcumulado-=10000;
        }else{
            estado = "Gana";
        }
        //numIntentos.add(num);
    }

    public ArrayList<Integer> getNumIntentos() {
        return numIntentos;
    }

    public int getCantIntentos(){
        return this.cantIntentos;
    
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