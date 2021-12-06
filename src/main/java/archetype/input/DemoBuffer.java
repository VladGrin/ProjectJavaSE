package archetype.input;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoBuffer {
    public static void main(String[] args) {
//        File file = new File("data/reader_in.txt");
//        FileReader reader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//
//        FileWriter writer = new FileWriter("wr_out.txt");
//        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        try (BufferedReader reader = new BufferedReader(new FileReader("data/reader_in.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("data/wr_out.txt"))) {

            List<String> strings = new ArrayList<>();
            String str = "";
            while ((str = reader.readLine()) != null) {
                strings.add(str);
                writer.write(str);
                writer.newLine();
                writer.flush();
            }

            for (String string : strings) {
                System.out.println(string);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path = Paths.get("data/reader_in.txt");
        try {
            List<String> strings = Files.readAllLines(path);
            System.out.println(strings);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(new FileInputStream("data/in.txt"))) {
            String next = scanner.next();
            System.out.println(next);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (PrintStream printStream = new PrintStream(new FileOutputStream("data/wr_out.txt"))) {

            System.setOut(printStream);
            System.out.println("Hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
