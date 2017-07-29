/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cramirez.geometrycalc.shapes;

/**
 *
 * @author alumno
 */
public class Rectangulo {
    
    private double largo;
    private double ancho;
    private double resultado;
    private double area;
    private double perimetro;
    
    public Rectangulo() {
        largo = 0d;
        ancho = 0d;
        resultado = 0d;
    }

    public Rectangulo(double largo, double ancho, double resultado, double area, double perimetro) {
        this.largo = largo;
        this.ancho = ancho;
        this.resultado = resultado;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    public double calcularArea(double largo, double ancho) {
        double areaResult = largo * ancho;
        return areaResult;
    }
    
    public double calcularPerimetro(double largo, double ancho) {
        double perimetroResult = 2 * (largo + ancho);
        return perimetroResult;
    }
    
}
