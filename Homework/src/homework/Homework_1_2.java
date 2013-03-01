/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author jaric
 */
public class Homework_1_2 {
    public static void main(String[] args) {
       for(int i = 100 ; i < 1000 ; i++){
          String str = String.valueOf(i); 
          int num_1 = Character.getNumericValue(str.charAt(0));
          int num_2 = Character.getNumericValue(str.charAt(1));
          int num_3 = Character.getNumericValue(str.charAt(2));
          
          if (i == (Math.pow(num_1,3) + Math.pow(num_2,3) + Math.pow(num_3,3)) ){
              System.out.println(i);
          }
          
       }
    }
}
