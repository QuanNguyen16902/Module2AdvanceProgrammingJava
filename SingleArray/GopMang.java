import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,5,6,7};
        int b[] = {4,2,3,6,7};
        int index = 0;
        int c[] = new int [a.length + b.length];

        for (int i = 0 ; i < a.length; i++){
            c[index] = a[i];
            index++;
        }

        for (int j = 0; j < b.length ; j++){
            c[index] = b[j];
            index++;
        }


        for(int num: c){
            System.out.print(num + " ");
        }


    }
}
