package Mang2Chieu;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println("fibonaci("+n+") = "+fibonaci(n));
//        int sum = 0 ;
//        for(int i = 0 ; i < n; i++){
//            sum = sum + fibonaci(i);
//        }
//        System.out.print("Tong day so fibonaci thu " + n + ":");
//        System.out.println(sum);
//        System.out.println("N giai thua = " + GiaiThua(n));
        if(SoNguyenTo(n)){
            System.out.println(n + " La so ngto ");
        }else {
            System.out.println("Khong phai so ngto");
        }
    }
    public static int fibonaci(int a){
        if(a == 0 || a == 1 ) return 1;
        return fibonaci(a-1) + fibonaci(a-2);
    }
    public static  int GiaiThua(int a){
        if(a == 0) return 1;
        return a * GiaiThua(a-1);
    }
    public static boolean SoNguyenTo(int a){
        if(a < 2) return false;
        for(int i = 2; i < a - 1 ; i++){
            if(a % i == 0){
                return false;}
        }

        return true;
    }
}
