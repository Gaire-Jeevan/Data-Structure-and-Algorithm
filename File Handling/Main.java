import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // create
        try {
            File fo = new File("new-file.txt");
            fo.createNewFile();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
        // write in the file
        try {
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("कर्मण्येवाधिकारस्ते मा फलेषु कदाचन।\r\n" + //
                                "मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्मणि॥");

                                fw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
        // reading in the file
        try (BufferedReader br = new BufferedReader (new FileReader("new-file.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
    
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // create
        try {
            File fo = new File("random.txt");
            fo.createNewFile();

            if (fo.delete()) {
                System.out.println(fo.getName());
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
