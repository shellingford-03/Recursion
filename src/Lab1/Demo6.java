/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;


public class Demo6 {
    public static int max(double[]a,int n){
      int i;
      double max=a[0];
      for(i=1;i<n;i++)
          if(a[i]>max){
              max=a[i];
          }
      return (int) max;
    }
    public static void main(String[] args) {
        double b[]={1,5,9,7,2,19,10};
        System.out.println(max(b,7));
    }
}
