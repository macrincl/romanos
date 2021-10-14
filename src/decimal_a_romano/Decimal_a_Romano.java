/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal_a_romano;

/**
 *
 * @author Humberto
 * Equipo conformado por: 
 * Coria Lopez Josue Macrin
 * Pimentel Alvarez Humberto Javier 
 */

import java.util.Scanner;

public class Decimal_a_Romano {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N;
      do {
             System.out.print("Introduce un número decimal porfavor: ");
             N = sc.nextInt();
      } while (N < 1 || N > 3999);
      System.out.println(N + " en numeros romanos corresponde a: " + convertirANumerosRomanos(N));                            
  }

  //método para pasar a números romanos
  public static String convertirANumerosRomanos(int numero) {
      int i, miles, centenas, decenas, unidades;
      String romano = "";
      
      //obtenemos cada cifra del número
      miles = numero / 1000;
      centenas = numero / 100 % 10;
      decenas = numero / 10 % 10;
      unidades = numero % 10;



      //unidades
      if (unidades == 9) {
          romano = romano + "IX";
      } else if (unidades >= 5) {
                 romano = romano + "V";
                 for (i = 6; i <= unidades; i++) {                                                           
                      romano = romano + "I";
                 }
      } else if (unidades == 4) {
                 romano = romano + "IV";
      } else {
                 for (i = 1; i <= unidades; i++) {
                      romano = romano + "I";
                 }
      }
      return romano;
  }
}