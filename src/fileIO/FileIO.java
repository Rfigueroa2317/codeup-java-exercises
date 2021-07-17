package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args) {
//        System.out.println(getFilePath("src","fileIO","test.txt").toAbsolutePath());
//        System.out.println("Does the path exist?");
//        System.out.println(
//                doesPathExist(
//                        getFilePath("src", "fileIO", "test.txt")));


//        tryCreateDirectory(getPath("src", "fileIO", "test.txt"));
        init();

    }

    public static void init(){

        // Try to create the directory
        Path path = FileDirectoryUtil.getPath("src", "fileIO", "test.txt");
        FileDirectoryUtil.tryCreateDirectory(path);

        // Try to create the file
        path = Paths.get(path.toAbsolutePath().toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);

        // Print out the final location of the file
        System.out.println(path.toAbsolutePath());

        // Try to write to the file
        IOUtil.tryWriteToFile(getContent(), path);

        // Try to print the content of the file
        IOUtil.tryPrintContents(path);

    }

    public static List<String> getContent(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        List<String> contentToWrite = new ArrayList<>();
        contentToWrite.add("This is a new line!");
        contentToWrite.add("This is another line!");
        contentToWrite.add("Another line!");
        contentToWrite.add(userInput);

        return contentToWrite;
    }




}
