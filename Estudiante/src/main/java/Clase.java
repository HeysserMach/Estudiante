/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Clase {
    private String Codigo;
    private String Nombre;
    private float Nota;
    private Estudiante E1;
    
     public Clase(String Codigo, String Nombre, float Nota, Estudiante E1){
       
    this.Codigo = Codigo;
    this.Nombre = Nombre;
    this.Nota = Nota;
    this.E1 = E1;
    }
     
     public String toString()
{
return String.format(" %s%n %s, %s%n Nota: %.1f%n",
E1, Codigo, Nombre, Nota);
}

}
