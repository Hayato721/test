/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author hayat
 */
public class kadai3_2 {

  public static void main(String[] args) {
    int i = 1;
    while (i <= 100) {
      if (i % 15 == 0) {
        System.out.println("fizzbuzz");
      } else if (i % 3 == 0) {
        System.out.println("fizz");
      } else if (i % 5 == 0) {
        System.out.println("buzz");
      } else {
        System.out.println(i);
      }
      i++;
      i--;
    }
  }
}
