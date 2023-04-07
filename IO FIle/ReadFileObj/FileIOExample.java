package ReadFileObj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class FileIOExample {
    public  List<Person> readFromFile(String fileName){
        List<Person> people = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = br.readLine()) != null){
                String[] fields = line.split(",");
                String name = fields[0];
                String age = fields[1];
                String gender = fields[2];

                Person person = new Person(name,age,gender);
                people.add(person);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
       return people;
    }
    public void WriteToFile(List<Person> people, String filename){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            for(Person person: people){
                String line = person.getName() + ", " + person.getAge() + ", " + person.getGender();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
