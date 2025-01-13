// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.OutputStreamWriter;

// public class Output {
//     public static void main(String[] args) {
//         // output
//         OutputStream os = System.out;
//         // os.write(😂); // range is exceeded
//         System.out.println();

//         try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//             osw.write("Hello World");
//             osw.write(85);
//             osw.write('A');
//             osw.write("\n");

//             char[] arr = "hello world".toCharArray();

//             osw.write(arr);
//         } catch (IOException e) {
//             System.out.println(e.getMessage());
//         }


//         try (FileWriter fr = new FileWriter("note.txt", true)) {
//             fr.write("Hello World");
//             fr.write(85);
//             fr.write('A');
//             fr.write("\n");

//             char[] arr = "hello world".toCharArray();

//             fr.write(arr);
//         } catch (IOException e) {
//             System.out.println(e.getMessage());
//         }



//         try (BufferedWriter bw = new BufferedWriter (new FileWriter("note.txt"))) {
//             bw.write("Krishna World");
            
//         } catch (IOException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }
