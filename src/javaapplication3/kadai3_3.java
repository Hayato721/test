/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author hayat
 */
public class kadai3_3 {

  public static void main(String[] args) {

    int num = 12;
    int val = 2;
    int cnt = 0;
    while (val <= num / 2) {
      if (num % val == 0) {
        System.out.println("val:" + val);
        cnt++;
        System.out.println("cnt:" + cnt);
      }
      val++;
    }
    System.out.println("約数:" + cnt + "個");

  }
}
