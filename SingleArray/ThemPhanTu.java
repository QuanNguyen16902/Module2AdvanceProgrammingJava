import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp so phan tu cua mang:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Nhap phần tử:");
        int a = sc.nextInt();
        System.out.println("Nhap vao vị trí:");
        int X = sc.nextInt();

        if(X < -1){
            System.out.println("Không chèn đc");
        }
         if(X >n){
             System.out.println("Không chèn dc");
        }

        int c = n + 1;
        int b[] = new int[c];

        for (int i = 0 ; i < arr.length ; i ++){
            b[i] = arr[i];
        }

        for(int i = b.length -1 ; i > X ; i--){
            b[i] = b[i-1];
        }

        b[X] = a;

    for (int num : b){
        System.out.print(num + " ");
    }

    }
}
