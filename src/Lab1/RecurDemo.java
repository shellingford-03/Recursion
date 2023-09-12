/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;


public class RecurDemo {
    public static double factorial(int n){
        if(n<2) return 1;
        return n* factorial(n-1);
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}
