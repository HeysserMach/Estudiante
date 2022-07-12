/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class TestEstudiante {

    public static void main(String[] args) {
        Estudiante Est1 = new Estudiante("20191031271", "Heysser");
        Clase C1 = new Clase("IS-110", "Introduccion a ingenieria en sistemas", 89, Est1);
        
        Clase C2 = new Clase("MM-314", "Programacion 1", 72, Est1);
        
        Clase C3 = new Clase("mm110", "Matematica1", 99, Est1);
        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
    }
}
