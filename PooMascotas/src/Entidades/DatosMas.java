/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;




// DatosMas= datos mascota
public abstract class DatosMas  {
    private String nombreM,clase,tipo ;
    private int edadM;
    private String genero;
    private String color;
     public String tipodeAlimento;
    public String vacunas;
    


    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public int getEdadM() {
        return edadM;
    }

    public void setEdadM(int edadM) {
        this.edadM = edadM;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipodeAlimento() {
        return tipodeAlimento;
    }

    public void setTipodeAlimento(String tipodeAlimento) {
        this.tipodeAlimento = tipodeAlimento;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    }
    

