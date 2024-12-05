//MT 9/5/2024

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        String[] names = {"john", "carl", "jerry"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file.");
            writer.write("\n Here is another line.");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
        BufferedReader reader = new BufferedReader(new FileReader("myOutputFile.txt"));
        String line;
        while((line = reader.readLine()) != null)
        System.out.println(reader.readLine());
        reader.close();
        catch (IOException e) {
            e.printStackTrace();
            }
    }
}
