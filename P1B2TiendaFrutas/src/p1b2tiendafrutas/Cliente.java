/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1b2tiendafrutas;

/**
 *
 * @author ESFOT
 */
public class Cliente {
    private String nombre;
    private int cedula;
    private Frutas[] fruta;

    public Cliente(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Frutas[] getFruta() {
        return fruta;
    }

    public void setFruta(Frutas[] fruta) {
        this.fruta = fruta;
    }

    @Override
    public String toString() {
        String cliente = nombre;
        for(int i = 0; i<fruta.length; i++){
            cliente += fruta +"\n";
        }
        return cliente;
    }
    
   
}
