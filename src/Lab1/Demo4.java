/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;


public class Demo4 {
    public static double gp(int n,double a,double q){
        return (a*(Math.pow(q, n-1)));
    }
    public static void main(String[] args) {
        System.out.println(gp(6, 1.5, 2));
    }
}
