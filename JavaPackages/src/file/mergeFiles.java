package file;

import java.io.*;

public class mergeFiles {
    public static void main(String[] args) throws IOException {
        File file=new File("src/file/demoFiles");

        PrintWriter printWriter=new PrintWriter("output.txt");
        //printwriter object makes writing to file conevinient,converts every chracter to text form automatically so you ont need to do typecasting separately

        String[] s=file.list(); //taking the list of all the files in the demoFiles folder
        for(String s1 : s){ //iterating over every file to copy the contents
            BufferedReader buffer=new BufferedReader(new FileReader("src/file/demoFiles/"+s1));
            String line= buffer.readLine();
            while (line!=null){
                printWriter.print(line);//the print method directly writes to output.txt
                line=buffer.readLine();
            }
        }
        printWriter.flush();
        printWriter.close();
    }

}
