package file;

import java.io.*;

public class CreateFileClass {
    public static void main(String[] args) throws IOException{
        File txtfile=new File("abc.txt");
        txtfile.createNewFile();
        System.out.println(txtfile.canWrite());
        System.out.println(System.getProperty("user.dir")); //current working directory
//        txtfile.delete();

        File srcFolder=new File("src");
        System.out.println(srcFolder.exists());
    }
}
