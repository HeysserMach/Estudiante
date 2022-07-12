/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Estudiante {
    private String Cuenta;
    private String Nombre;

   public Estudiante(String Cuenta, String Nombre){
       
    this.Cuenta = Cuenta;
    this.Nombre = Nombre;
    }
   public String toString()
{
return String.format("Cuenta:%s, Estudiante:%s" ,
Cuenta, Nombre);
}

}
