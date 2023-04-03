import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,6};
        System.out.println("Nhap phần tử:");
        int n = sc.nextInt();
        System.out.println("Nhap vao vị trí:");
        int X = sc.nextInt();
        for(int i = 0 ; i < arr.length -1;i++){
            if(i <= -1 || i >= arr.length-1){
                System.out.println("Khong chèn dc");
            }
            else{
                if(X == i){
                    i = i+1;
                    arr[i] = arr[i+1];
                }
            }
        }
        for(int i = 0; i<arr.length-1;i++){
            System.out.println(arr);
        }

    }
}
