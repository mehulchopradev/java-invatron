import java.io.*;

public class Readfiles {
    public static void main(String[] args) {
        String path = "/home/mehul/Documents/training/menu_driven_prog";

        File f = new File(path);
        // System.out.println(f.exists());
        // System.out.println(f.isFile());

        // two modes in which we can read/write from/to the file
        // Character mode
        // Byte mode

        /* FileReader fileReader = null;
        try {
            fileReader = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("PLease check whether the file exists or no");
            return;
        }

        try {
            int c = fileReader.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fileReader.read();
            }
        } catch (IOException io) {
            io.printStackTrace();
        }


        // very important to explicitly close the reference to an OS resource
        try {
            fileReader.close();
        } catch (IOException e) {
        } */

        // autoclose a resource
        // try - catch with resources

        /* try (FileReader fileReader = new FileReader(f)) {
            // fileReader resource will be available only inside this try block.
            // once the program comes out of the try block, the fileReader resource will be auto closed
            int c = fileReader.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } */

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
