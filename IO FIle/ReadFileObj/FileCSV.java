package ReadFileObj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCSV {
    public static void main(String[] args) throws FileNotFoundException {
            BufferedReader br = null;
            try {
                FileWriter fw = new FileWriter("countries.csv");
                BufferedWriter bw = new BufferedWriter(fw);
                List<country> countryList = new ArrayList<>();
                countryList.add(new country("3","5","America"));
                countryList.add(new country("2","100","Japan"));
                countryList.add(new country("5","24","canada"));
                countryList.add(new country("3","5","America"));

                for (country c : countryList) {
                    bw.write(String.valueOf(c));
                    bw.newLine();
                }
                bw.close();
                fw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                String line;
                br = new BufferedReader(new FileReader("countries.csv"));

                while ((line = br.readLine()) != null) {
                    printCountry(parseCsvLine(line));
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (br != null)
                        br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public static List<String> parseCsvLine(String csvLine) {
            List<String> result = new ArrayList<>();
            if (csvLine != null) {
                String[] splitData = csvLine.split(",");
                for (int i = 0; i < splitData.length; i++) {
                    result.add(splitData[i]);
                }
            }
            return result;
        }

        private static void printCountry(List<String> country) {
            System.out.println(
                    "Country [id= "
                            + country.get(0)
                            + ", temp= " + country.get(1)
                            + " , name=" + country.get(2)
                            + "]");
        }

}
class country{
    private String id;
    private String temp;
    private String name;
    public country(){}

    public country(String id, String temp, String name){
        this.id = id;
        this.temp = temp;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return id +  ","  + temp + ","+ name;
    }
}