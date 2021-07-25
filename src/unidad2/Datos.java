/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author Brigitte
 */
public class Datos {     

    public String ingresarDatos() {
        String datos = "", nombre = "", apellido = "", hobies = "", editCod = "", sistemaOp = "";      
       int edad = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre");
        nombre = sc.nextLine();
        System.out.println("Ingresa tu apellido");
        apellido = sc.nextLine();
        System.out.println("Ingresa tu edad");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa tu hobies");
        hobies = sc.nextLine();
        System.out.println("Ingresa tu editor de codigo preferido");
        editCod = sc.nextLine();
        System.out.println("Ingresa tu sistema operativo");
        sistemaOp = sc.nextLine();
        datos = "\n\tNombre\tApellido\tEdad\tHobies\tEditCod\tSistemaOp\n"+
                "\t"+nombre+"\t"+apellido+"\t"+edad+"\t"+hobies+"\t"+editCod+"\t"+sistemaOp ;
        return datos;
    }

    public void mostrarPorConsola(String d) {
        System.out.println(d);
    }

    
}
