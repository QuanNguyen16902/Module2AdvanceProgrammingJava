import javax.swing.text.Style;
import java.util.Date;
import java.util.Scanner;

public class test {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {50, 100};
        m(a);
        System.out.println(a[0]);
    }

    static void m(int[] x) {
        x[0] = 200;
    }



        //Bảng cửu chương
//        for(int i = 2 ; i <= 9; i++){
//
//            for (int j = 1; j < 10; j ++){
//                System.out.println( i+"x"+ j + " = " + (i*j));
//            }
//            System.out.println();
//        }

        // Hiển thị thông tin thời gian
//        Date date = new Date();
//
//        System.out.println(date.toString());
 // - Năm nhuận
//        System.out.println("Nhập năm:");
//        int a = sc.nextInt();
//        if(a % 400 ==0 && a % 100==0){
//            System.out.println("Năm nhuận");
//        }
//        else if(a % 4 ==0){
//            System.out.println("năm nhuận");
//        }else {
//            System.out.println("năm ko nhuận");
//        }
       // -- Pt bậc 2
//        System.out.println("nhập a(hệ số bậc 2): ");
//        double a = sc.nextDouble();
//        System.out.println("nhập b(hệ số bậc 1): ");
//        double b = sc.nextDouble();
//        System.out.println("nhập c(hệ số bậc 0): ");
//        double c = sc.nextDouble();
//        double delta = Math.pow(b,2)- 4*a*c;
//        if (a == 0) {
//            if (b == 0) {
//                if (c == 0) {
//                    System.out.println("ptrinh có vô số nghiệm");
//                } else {
//                    System.out.println("Phương trình vô nghiệm!");
//                }
//            }
//         else {
//            System.out.println("ptrinh có 1 nghiệm: " + (-c / b));
//        }
//        }
//
//        else {
//
//            if(delta > 0){
//                System.out.println("Phuong trinh co 2 ngo pb: x1 = " + (-b+Math.sqrt(delta))/(2*a) + ", x2 = "+ (-b-Math.sqrt(delta))/(2*a));
//            } else if (delta == 0) {
//                System.out.println("phương  trình có ngo kép: x1=x2=" + (-b/2*a));
//            }
//            else {
//                System.out.println("phương trình vô ngo");
//            }
//        }

    }


