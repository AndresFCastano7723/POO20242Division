/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.*;
import vista.*;

public class Ejecutar {
    public static void main(String[] args) {
        Presentacion p = new Presentacion();
        Validar v = new Validar();
        float d1 = p.entrada("Ingrese el numerador");
        float d2;
        do{
            d2 = p.entrada("Ingrese el denominador");
        }while(!v.val(d2));
        Division d = new Division();
        d.setD1(d1);
        d.setD2(d2);
        p.mostrar("El resultado es: "+ d.dividir());
    }
}
