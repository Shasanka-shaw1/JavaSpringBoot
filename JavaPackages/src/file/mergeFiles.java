package file;

import java.io.*;

public class mergeFiles {
    public static void main(String[] args) throws IOException {
        File file=new File("src/file/demoFiles");

        PrintWriter printWriter=new PrintWriter("output.txt");

        String[] s=file.list();
        for(String s1 : s){
            BufferedReader buffer=new BufferedReader(new FileReader("src/file/demoFiles/"+s1));
            String line= buffer.readLine();
            while (line!=null){
                printWriter.print(line);
                line=buffer.readLine();
            }
        }
        printWriter.flush();
        printWriter.close();
    }

}
