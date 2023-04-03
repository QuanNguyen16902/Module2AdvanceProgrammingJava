package lesson7_AbstractClass.JavaCollection.QuanLyTrungTam;

import tess.QuanLyLopHoc;
import lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.StudentManagement;
import java.util.ArrayList;
import java.util.List;
import lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.Student;
import lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.Clazz;
import static lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.StudentMenu.studentManagement;

public class ClassManagement<T extends Clazz> {
    List<Clazz> listClass = new ArrayList<>();

    public List<Clazz> getListClass() {
        return listClass;
    }

    public void setListClass(List<Clazz> listClass) {
        this.listClass = listClass;
    }

    public void addClass(T clazz){
        listClass.add(clazz);
    }
    public void removeClass(T clazz){
        listClass.remove(clazz);
    }

    public void showListClass(){
        for(Clazz c : listClass){
            System.out.println(c);
        }
    }
    public int findById(String id){
        int index = -1;
        for(int i = 0 ; i < listClass.size();i++){
            if(listClass.get(i).getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }
    public void updateById(String id , Clazz clazz){
        int index = findById(id);
        if(index !=-1){
            listClass.set(index, clazz);
        }else {
            System.out.println("Khong tim thay ma!");
        }
    }

    public void removeById(String id){
        int index = findById(id);
        if(index != -1){
            listClass.remove(index);
        }else {
            System.out.println("Khong ton tai ma lop nay!");
        }
    }
    public Clazz findById(int index){
        return listClass.get(index);
    }

    public void showNumberOfStudentInClass(){

        for(Clazz clazz : listClass){
            int count = studentManagement.CountStudentInClass(clazz);
            System.out.println("Lớp " + clazz.getName() + " có " + count + " học viên");
        }
    }
}
