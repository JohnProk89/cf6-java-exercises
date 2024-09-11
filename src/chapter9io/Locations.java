package chapter9io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Reads a file and prints in another one, in different format
 */
public class Locations {

    public static void main(String[] args) {
        // Declarations and Initializations
        String line;
        String[] tokens;
        boolean isFirstLine = true;
        StringBuilder sb = new StringBuilder();
        Path dir = Paths.get("C:/tmp/exercise");
        Path path = dir.resolve("locationsOut.txt");

        // Calculations
        try (BufferedReader bf = new BufferedReader(new FileReader(dir + "/locationsIn.txt"));
             PrintWriter pw = new PrintWriter(path.toFile())) {
            if (Files.notExists(dir)) Files.createDirectory(dir);
            while ((line = bf.readLine()) != null) {
                if (isFirstLine) {  // Ignoring 1st line of the document
                    isFirstLine = false;
                    continue;
                }
                tokens = line.split(",");
                sb.append("{ location: \'").append(tokens[0]).append("\', latitude: \'").append(tokens[1]).append("\', longitude: \'").append(tokens[2]).append("\'},\n");
                line = bf.readLine();
                if (line != null) {
                    // If there's another line, append a comma and a new line
                    sb.append(",\n");
                } else {
                    break; // Exit loop if no more lines
                }
            }
            pw.print(sb.substring(0,sb.length() - 2)); // Trimming 2 last characters (\n and ,)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
