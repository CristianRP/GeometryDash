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
public class Cuadrado {
    private double lado;
    private double perimetro;
    private double area;
    
    public Cuadrado() {
        lado = 0d;
        perimetro = 0d;
        area = 0d;
    }
    
    public Cuadrado(double lado, double perimetro, double area) {
        this.lado = lado;
        this.perimetro = perimetro;
        this.area = area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public double calcularPerimetro(double lado) {
        double perimetroResult = lado * 4;
        return perimetroResult;
    }
    
    public double calcuarArea(double lado) {
        double areaResultado = Math.pow(lado, 2);
        return areaResultado;
    }
    
}
