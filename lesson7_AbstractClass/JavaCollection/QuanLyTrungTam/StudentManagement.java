package lesson7_AbstractClass.JavaCollection.QuanLyTrungTam;

import java.util.ArrayList;
import java.util.List;
import lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.Student;
import lesson7_AbstractClass.JavaCollection.QuanLyTrungTam.Clazz;

public class StudentManagement<T extends Student> {
    List<Student> listStudent = new ArrayList<>();

    public void addStudent(T student){
        listStudent.add(student);
    }
    public void addStudentToIndex(int index , Clazz clazz){
        Student student = listStudent.get(index);
        student.setClazz(clazz);
        listStudent.set(index,student);
    }

    public void removeStudent(String student){
        listStudent.remove(student);
    }
    public void showListStudent(){
        for (Student l :listStudent){
            System.out.println(l);
        }
    }

    public void updateByID(String id, T student){
       int index = getByID(id);
       if(index != -1){
           listStudent.set(index , student);
       }else {
           System.out.println("Khong co ma sinh vien nay");
       }
    }

    public int getByID(String id){
        int index = 0;
        for(int i = 0 ; i < listStudent.size();i++) {
              if(listStudent.get(i).getId().equals(id)){
                  index = i;
                  break;
              }
        }
        return index;
    }
    public int CountStudentInClass(Clazz clazz){
        int count = 0;
        for(int i = 0 ; i < listStudent.size(); i++){
            Student student = listStudent.get(i);
            if(student.getClazz().getId().equals(clazz.getId())){
                count++;
            }
        }
        return count;
    }

}
