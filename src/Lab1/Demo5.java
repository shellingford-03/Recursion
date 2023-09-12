/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;


public class Demo5 {
    public static double sum(double[]a,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        double a[]={1.5,2,4,5,2,6.5};
        System.out.println(sum(a, 6));
    }
}
