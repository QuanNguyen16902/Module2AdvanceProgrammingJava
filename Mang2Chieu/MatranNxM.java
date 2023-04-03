package Mang2Chieu;

import java.util.Scanner;

public class MatranNxM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("arr[" + i + "]" + "[" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Mang cua ban la: arr[" +n+"]" + "["+m+"] = ");
        for (int i = 0; i < n; i++) {
            System.out.print("{");
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println("}");
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Tổng dduong chéo chính: " + sum);
        int sum2 = 0;
        System.out.println("Phan tu duong cheo phu");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i  == n - j - 1) {
                    System.out.println(arr[i][j]);
                    sum2 = sum2 + arr[i][j];
                }
            }
        }
        System.out.println("Tong deo cheo phu: "+ sum2);

        System.out.println("Tinh tong cot nao: ");
        int d = sc.nextInt();
        int sum3= 0;
        for (int i = 0; i < n; i++) {

                    System.out.print(arr[i][d] + " ");
                    sum3 = sum3 + arr[i][d];
                }

        System.out.println(sum3);
        }

    }

