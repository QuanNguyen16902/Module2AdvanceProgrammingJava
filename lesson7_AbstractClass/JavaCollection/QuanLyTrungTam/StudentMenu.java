package lesson7_AbstractClass.JavaCollection.QuanLyTrungTam;

import java.util.Scanner;
import java.util.SortedSet;

public class StudentMenu {
    private void menu(){
        System.out.println("Quản lý sinh viên");
        System.out.println("1. Hiển thị danh sách sinh viên");
        System.out.println("2. Thêm sinh viên");
        System.out.println("3. Cập nhật sinh viên");
        System.out.println("4. Xóa sinh viên");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Hiển thị sinh viên điểm cao nhất");
        System.out.println("0. Quay lại");
    }
    public static StudentManagement studentManagement = new StudentManagement();
    public void showAllStudent(){
        studentManagement.showListStudent();
    }
    private void removeStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mã sinh viên cần xóa: ");
        String id = sc.nextLine();
        studentManagement.removeStudent(id);
    }
    private void addStudent(){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Thêm sinh viên!");
        Student student = inputStudentFromKeyBoard();
        studentManagement.addStudent(student);

    }
    private void UpdateStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên cần chỉnh sửa");
        String id = sc.nextLine();
        Student student = inputStudentFromKeyBoard();
        studentManagement.updateByID(id,student);
    }
    private Student inputStudentFromKeyBoard(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sv: ");
        String id = sc.nextLine();
        System.out.println("Nhập tên sv: ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm: ");
        double mark = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String birthday = sc.nextLine();
        Student student = new Student(id,name,birthday,mark);
        return student;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            menu();
            System.out.println("Nhập lựa chọn của bạn:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    showAllStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    UpdateStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
            }
        }while (choice!=0);
    }
}
