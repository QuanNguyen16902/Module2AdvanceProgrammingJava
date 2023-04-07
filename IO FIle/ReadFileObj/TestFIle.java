package ReadFileObj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestFIle {
    public static void main(String[] args) throws IOException {

        FileIOExample fileIOExample = new FileIOExample();
        List<Person> list = new ArrayList<>();


        Person people0 = new Person("Quan", "17", "Nam");
        Person people1 = new Person("Tung", "17", "Nam");
        Person people2 = new Person("Hoa", "17", "Nam");
        Person people3 = new Person("Pah", "17", "Nam");
        Person people4 = new Person("Day", "17", "Nu");

        list.add(people0);
        list.add(people1);
        list.add(people2);
        list.add(people3);
        list.add(people4);

        fileIOExample.WriteToFile(list, "person.txt");

        fileIOExample.readFromFile("person.txt");

    }
}






