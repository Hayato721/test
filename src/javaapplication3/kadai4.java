/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author hayat
 */
import java.util.Arrays;

public class kadai4 {
  @SuppressWarnings("empty-statement")
  public static void main (String[] args){
    int[] num = new int[5];
    String[] str = new String[3];
    
    num[0] = 1;
    num[1] = 2;
    num[2] = 0;
    num[3] = 4;
    num[4] = 5;
    
    str[0] = "配列";
    str[1] = "アルゴリズム";
    str[2] = "基本情報技術者試験";
    
    System.out.println(num[2]);
    System.out.println(str[2]);
    
    if(Arrays.asList(num).contains("0")){
      System.out.println("0あり！");
    } else{
      System.out.println("0なし！");
    }
  }
}
