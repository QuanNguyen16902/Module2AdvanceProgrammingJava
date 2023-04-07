import javax.swing.text.Document;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ReadFileText {
    public static void main(String[] args) {
        try{
            String filePath = new File("").getAbsolutePath();

            // Create a file object
            File f = new File(filePath + "\\program.txt");

            // Get the absolute path of file f
            String absolute = f.getAbsolutePath();

            // Display the file path of the file object
            // and also the file path of absolute file
            System.out.println("Original  path: "
                    + f.getPath());
            System.out.println("Absolute  path: "
                    + absolute);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }


//        try{
//
//            File inputFile = new File( "C:\\Users\\Admin\\OneDrive\\Documents\\input.txt");
//
//            Scanner reader = new Scanner(inputFile);
//
//            while (reader.hasNextLine()){
//                String data = reader.nextLine();
//                System.out.println(data);
//            }
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



//        try{
//            FileWriter fw = new FileWriter("input.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write("Mot đêm trắng");
//            bw.newLine();
//            bw.write("Dũng ngu");
//
//            bw.close();
//            fw.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
