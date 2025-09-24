package file;

import java.io.*;

public class readWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("hello.txt",true);
//        fileWriter.write("kyahua");
        char[] ch={'a','b','c'};
//        fileWriter.write("\n");
//        fileWriter.write(ch);
//        fileWriter.flush();
//        fileWriter.close();
//        fileWriter.delete();
        FileReader fileReader=new FileReader("hello.txt");
        //====================
//        int i=fileReader.read(); //gives ascii value of the first character of the file
//        while(i!=-1){
//            System.out.print((char)i);
//            i=fileReader.read();
//        }
        //====================
        char[] c=new char[100];
        //====================
//        fileReader.read(c);
//        System.out.print(c);
        //======================
//        fileReader.read(c,2,3);
//        System.out.println(c);
        //=======================
        BufferedReader buffer=new BufferedReader(fileReader);
//        int i=buffer.read();
//        while(i!=-1){
//            System.out.print((char)i);
//            i=buffer.read();
//        }
//        fileReader.close();
//       ========================
//        String s=buffer.readLine();
//        while(s!=null){
//            System.out.println(s);
//            s=buffer.readLine();
//        }
//        buffer.close();
        //no need to close fileReader because the buffer reader automatically closes it
        BufferedWriter bufferWriter=new BufferedWriter(fileWriter);
        bufferWriter.write("helloooooo");
        bufferWriter.newLine();
        bufferWriter.write(ch);
        bufferWriter.close();



    }

}
