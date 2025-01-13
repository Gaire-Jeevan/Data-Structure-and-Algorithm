import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Input {

    public static void main(String[] args) {

        // taking data in byte stream and printing in character stream
        // try (InputStreamReader isr = new InputStreamReader(System.in)){
        //     System.out.print("Enter some letters: ");
        //     int letters = isr.read();

        //     while (isr.ready()) {
        //         System.out.println((char) letters);
        //         letters = isr.read();
        //     }

        //     isr.close();
        //     System.out.println();
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        try (FileReader fr = new FileReader("note.txt")){
            System.out.print("Enter some letters: ");
            int letters = fr.read();

            while (fr.ready()) {
                System.out.println((char) letters);
                letters = fr.read();
            }

            // no need to close this resources because this class implement Autoclosable which is auto closed when written in try-close block
            // fr.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // byte to char stream and then readin char stream
        try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
           System.out.println("You typed: " + br.readLine());
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // filereader
        try ( BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {

            while (br.ready()) {
                System.out.print(br.readLine());
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

// output
OutputStream os = System.out;
// os.write(😂); // range is exceeded
System.out.println();

try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
    osw.write("Hello World");
    osw.write(85);
    osw.write('A');
    osw.write("\n");

    char[] arr = "hello world".toCharArray();

    osw.write(arr);
} catch (IOException e) {
    System.out.println(e.getMessage());
}


try (FileWriter fr = new FileWriter("note.txt", true)) {
    fr.write("Hello World");
    fr.write(85);
    fr.write('A');
    fr.write("\n");

    char[] arr = "hello world".toCharArray();

    fr.write(arr);
} catch (IOException e) {
    System.out.println(e.getMessage());
}



try (BufferedWriter bw = new BufferedWriter (new FileWriter("note.txt"))) {
    bw.write("Krishna World");
    
} catch (IOException e) {
    System.out.println(e.getMessage());
}
        
    }
}