import java.util.Scanner;

public class MaxValMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int arr[][] = {{1,2} ,{2,4}, {5,6}, {8,11}};
        System.out.println("Nhập so phan tu mảng: ");
        int a = sc.nextInt();
        System.out.println("Nhap so phan tu mảng trong mảng: ");
        int b = sc.nextInt();
        int arr[][] = new int [a][b];
        for(int i = 0 ; i < a; i++){
            for(int j = 0 ; j <b ; j++){
                System.out.print("a["+i+"]"+"b["+j+"] =");
                arr[i][j] = sc.nextInt();
            }

        }
        for(int i = 0 ; i < a; i++){
            for(int j = 0 ; j <b ; j++){

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
int maxVal = arr[0][0];
        for(int i = 0; i < a ;i ++){
            for (int j = 0 ; j < b; j++){
                if(arr[i][j] > maxVal){
                    maxVal = arr[i][j];
                }
            }
        }
        System.out.println(maxVal);



//
//
//        int maxVal = arr[0][0];
//        for(int i = 0 ; i < a; i ++ ){
//            for (int j = 0 ; j < b; j++){
//                if(arr[i][j] > maxVal){
//                    maxVal = arr[i][j];
//                }
//            }
//        }
//        System.out.println(maxVal);
    }
}
