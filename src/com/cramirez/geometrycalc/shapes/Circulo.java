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
public class Circulo {

    private double radio;
    private double area;
    private double perimetro;

    public Circulo() {
        radio = 0d;
        area = 0d;
        perimetro = 0d;
    }

    public Circulo(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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

    public double calcularPerimetro(double radio) {
        double perimetroResult = Math.PI * 2 * radio;
        return perimetroResult;
    }

    public double calcularArea(double radio) {
        double areaResult = Math.PI * Math.pow(radio, 2);
        return areaResult;
    }

}
