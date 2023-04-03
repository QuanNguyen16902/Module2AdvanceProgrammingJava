import java.util.Scanner;

public class minValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minVal = arr[0];
        System.out.println("Mang cua ban: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
                index = i;
            }
        }
        System.out.println("So nho nhat: " + minVal + " o vi tri " + index);

    for(int i = 0; i < arr.length/2; i++){
           int temp = arr[i];
           arr[i] = arr[n - 1 - i];
           arr[n-1-i] = temp;
    }
    for(int num : arr){
        System.out.print(num +" " );
    }
    }
}


