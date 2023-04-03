package lesson7_AbstractClass.JavaCollection.QuanLyTrungTam;
import lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.StudentMenu;
import lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.ClassMenu;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        ClassMenu classMenu = new ClassMenu();
        StudentMenu studentMenu = new StudentMenu();
        do{
            menu();
            System.out.println("Nhập lựa chọn");
            choice =sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    classMenu.run();
                    break;
                case 2:
                    studentMenu.run();
                    break;
            }
        }while (choice != 0);
    }
    public static void menu(){
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ TRUNG TÂM");
        System.out.println("1. Quản lý lớp học");
        System.out.println("2. Quản lý học sinh");
        System.out.println("0. Thoát");
    }
}
