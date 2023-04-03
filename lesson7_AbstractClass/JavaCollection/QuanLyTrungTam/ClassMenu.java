package lesson7_AbstractClass.JavaCollection.QuanLyTrungTam;
import lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.StudentManagement;
import lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.StudentMenu;
import lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.Clazz;
import java.util.Scanner;

import static lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.StudentMenu.studentManagement;
import static lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.Main.sc;


public class ClassMenu {
    public ClassManagement classManagement = new ClassManagement();
    private void menu(){
        System.out.println("QUẢN LÝ LỚP HỌC");
        System.out.println("1. Hiển thi danh sách lớp");
        System.out.println("2. Thêm lớp học mới");
        System.out.println("3. Chỉnh sửa thông tin lớp học");
        System.out.println("4. Xóa lớp học");
        System.out.println("5. Thêm sinh viên vào lớp học");
        System.out.println("6. Thống kê mỗi lớp có bao nhiêu sinh viên");
        System.out.println("0. Quay lại");
    }
    public void run(){
        int choice;
        do{
            menu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    showAllClass();
                    break;
                case 2:
                    addNewClass();
                    break;
                case 3:
                    updateClassInfo();
                    break;
                case 4:
                    removeClass();
                    break;
                case 5:
                    addStudentToClass();
                    break;
                case 6:
                    ShowStudentInClass();
                    break;
            }
        }while (choice!=0);
    }
    public void showAllClass(){
        classManagement.showListClass();
    }

    public void ShowStudentInClass(){
        classManagement.showNumberOfStudentInClass();
    }

    private void addStudentToClass(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập mã lớp muốn thêm sinh viên vào: ");
        String id = sc.nextLine();
        int index = classManagement.findById(id);
        if(index == -1){
            System.out.println("Không có mã lớp này");
        }else {
            studentManagement.showListStudent();
            Clazz clazz = classManagement.findById(index);
            System.out.println("Nhập mã sinh viên mà bạn muốn thêm vào lớp: ");
            String studentId = sc.nextLine();
            int studentIndex = studentManagement.getByID(studentId);
            studentManagement.addStudentToIndex(studentIndex,clazz);
        }
    }

    private void removeClass(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã lớp bạn muốn xóa: ");
        String id = sc.nextLine();
        classManagement.removeById(id);
    }
    private Clazz inputClassFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã lớp:");
        String id = scanner.nextLine();
        System.out.println("Nhập tên lớp:");
        String name = scanner.nextLine();
        return new Clazz(id, name);
    }
    private void updateClassInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên cần chỉnh: ");
        String id = sc.nextLine();
        Clazz clazz = inputClassFromKeyboard();
        classManagement.updateById(id,clazz);
    }
    private void addNewClass(){
        Clazz clazz = inputClassFromKeyboard();
        classManagement.addClass(clazz);
    }
}
