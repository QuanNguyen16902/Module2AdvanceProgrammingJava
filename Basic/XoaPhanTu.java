import java.util.PropertyPermission;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Nhập phần tử cần xóa:");
        int X = sc.nextInt();
        int c = 0;
//
        for(int i = 0; i < n;i++){
            if(arr[i] != X){
                arr[c] = arr[i];
                c++;
            }
        }
        n=c;


        for (int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");

        }
    }
}
