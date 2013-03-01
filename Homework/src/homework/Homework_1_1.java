/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author jaric
 */
public class Homework_1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer number_1 = 1000;
        int num_1 = number_1;
        Integer number_2 = 495;
        int num_2 = number_2;
        System.out.println(GCD(num_1, num_2));
    }
    public static int GCD(int a, int b) { return b==0 ? a : GCD(b, a%b); }
}
