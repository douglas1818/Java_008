/*
Confeccionar un programa que permita crear una matriz irregular y luego imprimier la matriz en forma completa 

 */
package java_008;
import java.util.Scanner;

public class Java_008 {
private Scanner sc;
private int [][] mat;


public void cargar()
{
    sc = new Scanner(System.in);  
    System.out.println("Cuantas filas tiene la matriz:  ");
    int filas = sc.nextInt();
    mat =new int[filas][];
    for (int f = 0; f < mat.length; f++) 
    {
        System.out.println("Cuantas elementos tiene la fila "+f+".");
        int elementos = sc.nextInt();
        
        for (int c = 0; c < mat[f].length; c++)
        {
            System.out.println("Ingrese componentes: "); 
            mat[f][c] = sc.nextInt();
        }
    }
}
public void imprimir()
{
    for (int f = 0; f < mat.length; f++) 
    {
        for (int c = 0; c < mat[f].length; c++)
        {
            System.out.print(mat[f][c]+"");
        }
        System.out.println();
    }
}
    
    public static void main(String[] args) 
    {
      Java_008 jv008 = new Java_008();
      jv008.cargar();
      jv008.imprimir();
    }
    
}
