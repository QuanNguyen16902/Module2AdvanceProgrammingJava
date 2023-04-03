import java.util.Scanner;

public class DaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//       -- tính S(n) = n!
//        int tich = 1;
//        for(int i = 1; i <= n ; i++) {
//            tich = tich * i;
//        }
//        System.out.println(tich);

        // - S(n) = x + x^2 + x^3 + ... + x^n
//        int sum = 0;
//        int x = sc.nextInt();
//        for(int i = 1 ; i <= n; i++){
//            sum = (int) (sum + Math.pow(x,i));
//        }
//        System.out.println(sum);
        // S(n) = 1 + 1/2 + 1/3 + 1/4 +... + 1/n
//        double sum = 0 ;
//        for (int i = 1 ; i <= n ;i++ ){
//            sum = sum + (double)1/i;
//        }
//        System.out.println(sum);

//        S(n) = 1! + 2! + 3! + .. + n!

// -- Tính tổng n giai thừa
//        int sum = 0;
//        int tich = 1;
//        for(int i = 1; i<=n ; i++) {
//            tich = tich * i;
//            sum = sum + tich;
//        }
//        System.out.println(sum);
        int x = 5;
        do{
            System.out.println("Hello");
            x--;
        } while(x == 5);
    }
    public  static int GiaiThua(int a){
    if(a == 1)  return 1;
    return a *GiaiThua(a-1);
    }
}
