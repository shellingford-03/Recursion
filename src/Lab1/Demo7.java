/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;


public class Demo7 {
    public static int min(double[]a,int n){
      int i;
      double min=a[0];
      for(i=1;i<n;i++)
          if(a[i]<min){
              min=a[i];
          }
      return (int) min;
    }
    public static void main(String[] args) {
        double b[]={1,5,9,7,2,19,10};
        System.out.println(min(b,7));
    }
}

