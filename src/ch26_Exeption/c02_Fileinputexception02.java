package ch26_Exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class c02_Fileinputexception02 {



    public static void main(String[] args){
        String filePath="C:\\Users\\Q-3442 HASAN\\IdeaProjects\\antireman\\src\\javadanEsintiler";
        FileInputStream fis= null;
        try {
            fis = new FileInputStream(filePath);

            int c;
            while (true){
                try {
                    if (!((c=fis.read())!=-1)) break;
                    System.out.print((char)c);
                } catch (IOException e) {
                    System.out.println("dosya okunamıyor");
                    System.out.println("read methodu içindeki catch"+e.getMessage());
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("dosyaya ulaşılamadı");


        }


    }

}
