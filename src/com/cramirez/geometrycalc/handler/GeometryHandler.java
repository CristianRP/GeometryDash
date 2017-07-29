/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cramirez.geometrycalc.handler;

import com.cramirez.geometrycalc.shapes.Circulo;
import com.cramirez.geometrycalc.shapes.Cuadrado;
import com.cramirez.geometrycalc.shapes.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GeometryHandler {
    
    private Cuadrado cuadrado = new Cuadrado();
    private Rectangulo rectangulo = new Rectangulo();
    private Circulo circulo = new Circulo();
    
    private void showMenu() {
        print("Figuras geometricas");
        print(" 1. Cuadrado ");
        print(" 2. Rectangulo ");
        print(" 3. Circulo");
        print(" 0. Salir");
    }
    
    public void obtenerOpcion() {
        int op = 0;
        do {
            Scanner scann = new Scanner(System.in);
            showMenu();
            try {
                op = scann.nextInt();
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }
            if (op == 1) {
                print("Ingresa el lado: ");
                double lado = scann.nextDouble();
                seleccionarFigura((double) op, lado);
            } else if (op == 2) {
                print("Ingresa el largo: ");
                double largo = scann.nextDouble();
                print("Ingresa el ancho: ");
                double ancho = scann.nextDouble();
                seleccionarFigura((double) op, largo, ancho);
            } else if (op == 3) {
                print("Ingresa el radio: ");
                double radio = scann.nextDouble();
                seleccionarFigura((double) op, radio);
            }
        } while (op != 0);
    }
    
    private void print(String message) {
        System.out.println(message);
    }
    
    private void seleccionarFigura(double... params) {
        if (params[0] == 1) {
            cuadrado.setLado(params[1]);
            cuadrado.setArea(cuadrado.calcuarArea(params[1]));
            cuadrado.setPerimetro(cuadrado.calcularPerimetro(params[1]));
            print("****Datos del cuadradado.****");
            String resultAreaCuadradoStr = String.format("1. Area: %.2f", cuadrado.getArea());
            print(resultAreaCuadradoStr);
            String resultPerimetroCuadradoStr = String.format("2. Perimetro: %.2f", cuadrado.getPerimetro());
            print(resultPerimetroCuadradoStr);
            print("*****************************");
        } else if (params[0] == 2) {
            rectangulo.setLargo(params[1]);
            rectangulo.setAncho(params[2]);
            rectangulo.setArea(rectangulo.calcularArea(rectangulo.getLargo(), rectangulo.getAncho()));
            rectangulo.setPerimetro(rectangulo.calcularPerimetro(rectangulo.getLargo(), rectangulo.getAncho()));
            print("****Datos del rectangulo.****");
            String resultAreaCuadradoStr = String.format("1. Area: %.2f", rectangulo.getArea());
            print(resultAreaCuadradoStr);
            String resultPerimetroCuadradoStr = String.format("2. Perimetro: %.2f", rectangulo.getPerimetro());
            print(resultPerimetroCuadradoStr);
            print("*****************************");
        } else if (params[0] == 3) {
            circulo.setRadio(params[1]);
            circulo.setArea(circulo.calcularArea(circulo.getRadio()));
            circulo.setPerimetro(circulo.calcularPerimetro(circulo.getRadio()));
            print("****Datos del circulo.****");
            String resultAreaCuadradoStr = String.format("1. Area: %.2f", circulo.getArea());
            print(resultAreaCuadradoStr);
            String resultPerimetroCuadradoStr = String.format("2. Perimetro: %.2f", circulo.getPerimetro());
            print(resultPerimetroCuadradoStr);
            print("*****************************");
        }
    }
}
