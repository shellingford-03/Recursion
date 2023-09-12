/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;


public class MethodCallDemo {
    public static int f3(int n){
        return 2*n;
    }
    public static int f2(int n){
        int x= f3(n);
        return x+1;
    }
    public static int f1(int n){
        int k= f2(n) + 5;
        return k;
    }
    public static void main(String[] args){
        int result= f1(3);
        System.out.println(result);
    }
}
