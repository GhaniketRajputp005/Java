import java.io.*;

public class FileHandling {

    public static void main(String[] args) {

       

            File f = new File("hello.txt"); //

            try {
                f.createNewFile();
                FileWriter fw = new FileWriter(f);

                String str = "yoolo";
                String st = "Molo";

                fw.write(str);
                fw.write(st);
                fw.close();

            } 
            catch(IOException e){}

        
    }
    // catch(IOException e){}

    // }

}
