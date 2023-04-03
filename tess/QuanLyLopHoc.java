package tess;

import java.awt.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class QuanLyLopHoc {
    static class LopHoc {
        private String MaLop;
        private String TenLop;

        public LopHoc() {

        }

        public LopHoc(String MaLop, String TenLop) {
            this.MaLop = MaLop;
            this.TenLop = TenLop;
        }


        public String getMaLop() {
            return MaLop;
        }

        public void setMaLop(String maLop) {
            MaLop = maLop;
        }

        public String getTenLop() {
            return TenLop;
        }

        public void setTenLop(String tenLop) {
            TenLop = tenLop;
        }

        @Override
        public String toString() {
            return "Mã lớp: " + MaLop
                    + " , Tên lớp: " + TenLop;
        }

        public void HienThi() {
            System.out.printf(" %-15s %-15s ", MaLop, TenLop);
        }

        public void NhapThongTin() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap Mã lớp: ");
            MaLop = sc.nextLine();
            System.out.println("Nhap ten lop: ");
            TenLop = sc.nextLine();

        }
    }
    public static int Menu() {
        Scanner sc= new Scanner(System.in);
        int chon;
        System.out.println("\nCHUONG TRINH QUAN LY LOP HOC!");
        System.out.println("1. Nhập thông tin lớp");
        System.out.println("2. Thêm");
        System.out.println("3. Xóa");
        System.out.println("4. Cập nhật");
        System.out.println("5. Hiển thị");
        System.out.println("0. Thoat");
        chon = sc.nextInt();
        return chon;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LopHoc[] l1 = null;
         int chon;
         int n =0;
        do {
            chon = Menu();
            switch (chon) {
                case 1:
                    System.out.println("co bn lop:");
                     n = sc.nextInt();
                    l1 = new LopHoc[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Thong tin lop thu " +i);
                        l1[i] = new LopHoc();
                        l1[i].NhapThongTin();
                    }
                    n++;
                    break;
                case 2:
                    LopHoc l2 = new LopHoc();
                    Scanner in = new Scanner(System.in);

                    LopHoc[] tempArr = new LopHoc[l1.length+1];
                    for(int i = 0 ; i < l1.length; i++){
                        tempArr[i] = l1[i];
                    }

                    tempArr[tempArr.length-1] = l2;
                    l1 =  tempArr;
                    System.out.println("ma moi");
                    String a = in.nextLine();
                    System.out.println("ten moi");
                    String b = in.nextLine();
                    l2.setMaLop(a);
                    l2.setTenLop(b);
                    System.out.println("Add new lop: "  + l2.getMaLop() + "," + l2.getTenLop());

                    n++;

                    break;
                case 3:
                    Scanner ed = new Scanner(System.in);

                    LopHoc[] lopHocs = new LopHoc[l1.length - 1];
                    int removeIndex  = 0;
                    LopHoc lopHoc = new LopHoc();
                    System.out.println("Xoa phan tu theo Mã lớp: ");
                    String t = ed.nextLine();
                    lopHoc.setMaLop(t);

                    for(int i = 0 ; i < l1.length; i ++){
                        if(Objects.equals(l1[i].getMaLop(), lopHoc.getMaLop())){
                            removeIndex = i;
                            break;
                        }
                    }
                    int newIndex = 0;
                    for(int i = 0 ; i < l1.length; i++){
                        if(i != removeIndex){
                            lopHocs[newIndex] = l1[i];
                            newIndex++;
                        }
                    }
                    l1 = lopHocs;
                    System.out.println("Xoa phan tu voi Mã lớp: " + t);
                    break;
                case 4:
                    LopHoc ll = new LopHoc();

                    Scanner ss = new Scanner(System.in);
                    System.out.println("Nhap vi tri cap nhat: ");
                    int index = sc.nextInt();
                    for(int i = 0 ; i < l1.length; i++){
                        if(Objects.equals(l1[i].getMaLop(),ll.getMaLop())){
                            index = i;
                            break;
                        }
                    }
                    Scanner st = new Scanner(System.in);
                    System.out.println("Ma moi: ");
                    String ma = st.nextLine();

                    System.out.println("Ten moi: ");
                    String te = st.nextLine();

                    l1[index].setMaLop(ma);
                    l1[index].setTenLop(te);

                    break;
                case 5:
                    System.out.printf("%-8s %-15s %-15s " ,"STT", "MaLop" ,"TenLop");
                    for (int i = 0; i < l1.length; i++) {
                        System.out.println();
                        System.out.print(i + "\t\t");
                        l1[i].HienThi();
                    }
                    break;
            }
        } while (chon != 0);
    }
}

