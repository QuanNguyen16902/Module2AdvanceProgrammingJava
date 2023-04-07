import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFIle {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(  source.toPath() ,dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        System.out.printf("Enter source file:");
//        String sourcePath = in.nextLine();
//        System.out.printf("Enter destination file:");
//        String destPath = in.nextLine();
//        File sourceFile = new File(sourcePath);
//        File destFile = new File(destPath);
//        try {
//            copyFileUsingJava7Files(sourceFile, destFile);
//            //copyFileUsingStream(sourceFile, destFile);
//            System.out.printf("Copy completed");
//        } catch (IOException ioe) {
//            System.out.printf("Can't copy that file");
//            System.out.printf(ioe.getMessage());
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            File fileLog1 = new File("product.txt");
            File fileLog2 = new File("nama.txt");
            inStream = new FileInputStream(fileLog1);
            outStream = new FileOutputStream(fileLog2);

            int length;
            byte[] buffer = new byte[1024];
            // copy the file content in bytes

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            // delete the original file
            fileLog1.delete();
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
//        }
    }
}
