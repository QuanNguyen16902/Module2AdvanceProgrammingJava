import java.util.PropertyPermission;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
       }
       for(int i = 0 ; i < n ; i ++){
           System.out.print(arr[i] + " ");
       }
        System.out.println("Nhập phan tu xóa: ");
        int X = sc.nextInt();
       int newValue = 0;
       for(int i = 0 ; i < n ; i++) {
            if(X != arr[i]){
                arr[newValue] = arr[i];
                newValue++;
            }
       }

       for(int i = 0 ; i < newValue ; i++){
           System.out.print(arr[i] + " ");
       }
       }
    }

