/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;


public class RecursionDemo2 {
    public static int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int result=factorial(3);
        System.out.println(result);
    }
}
