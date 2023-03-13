import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {

        File directory = new File("D:\\Test\\1");
        directory.mkdir ();
        File file = new File(directory, "Test.txt");
        boolean isCreated = file.createNewFile ();
        System.out.println ("isCreated " + isCreated);
        System.out.println(file.getAbsolutePath());
        System.out.println("isExist " + file.exists());//true

        File directory3 = new File ( "D:\\Test\\3" );
        directory3.mkdir ();
        System.out.println (directory3 + " " + directory3.length ());
        File file3 = new File ( directory3, "test3.txt");
        file3.createNewFile ();
        System.out.println (file3.getAbsolutePath ());

        File file2 = new File("D:\\Test\\2");
        boolean isCreated2 = file2.mkdir();
        System.out.println ("isCreated2: " + isCreated2);

        File directory4 = new File ( "D:\\Download" );
        System.out.println (directory4.length ());



    }
}
