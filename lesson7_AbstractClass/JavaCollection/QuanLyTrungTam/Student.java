package lesson7_AbstractClass.JavaCollection.QuanLyTrungTam;

import java.util.Date;

public class Student {
    private String id;
    private String name;
    private String birthday;
    private double mark;
    private Clazz clazz;

    Student(String id , String name , String birthday, double mark){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    public String toString(){
        return id + ", " + name + ", " + birthday+ ", " + mark + ", " + clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
    public Clazz getClazz(){
        return this.clazz;
    }
}
