/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cramirez.geometrycalc.controller;

import com.cramirez.geometrycalc.handler.GeometryHandler;

/**
 *
 * @author Cristian Ramirez
 */
public class GeometryCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeometryHandler handler = new GeometryHandler();
        handler.obtenerOpcion();
    }
    
}
