import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//         int i = 0;
//        int num = 0;
//        int sum = 0;
//        while (num < n){
//            num++;
//            i = i+ 2;
//            sum = sum+i;
//
//        }
//        System.out.println(sum);

//        int n = sc.nextInt();



//        if( n == Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3)){
//            System.out.println("Đây là số armstrong");
//        }
//        else {
//        int n = sc.nextInt();
//               int a = n/100;
//            int b = n%100/10;
//        int c = n%((a*100 + b*10);
//        System.out.println(c);
//        int sum = 0;
//        for(int i = 0; i < 999; i++){
//
//
//            if( i == Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3)){
//                System.out.println(i + " ");
//                sum = sum+i;
//            }
//        }
//        System.out.println(sum);
//        for(int i = 1; i < 999;i++){
//
//        }
//        int [][] c = {{1,2}, {3,4}, {3,4}, {3,4}};
//        int [][] b = new int[4][2];
//        for(int i = 0; i < 4;i++){
//            for(int j = 0; j<2;j++){
//                b[i][j] = i;
//            }
//        }
//
//        for(int i = 0; i < 4;i++){
//            for(int j = 0; j<2;j++) {
//            System.out.print(b[i][j]);
//            }
//            System.out.println();
//        }
        System.out.print("Nhập số pần tử mảng: ");
        int n = sc.nextInt();

        int [][] arr = new int[n][n];

        System.out.println("Nhập phần tử mảng: ");
        for(int i = 0; i < n;i++){
            for(int j = 0 ; j < n ; j++) {
                System.out.printf("arr[%d][%d]", i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Các phần tử mảng: ");
        show(arr);

    }

    public static void show(int[][] arr) {
        for(int i = 0;i< arr.length; i++){
            for(int j = 0 ; j < arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }



}