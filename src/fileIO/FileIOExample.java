package fileIO;

public class FileIOExample {

    // *** File IO *** \\

    // Some context and definitions:

    //  .file = a discrete container for data on a storage device
    //  .path = the location of a file in a filesystem

    // IO = In Java, it provides a set of input streams and a set of output
    //      streams used to read and write data to fileIO.files or other input
    //      and output sources. There are three categories of classes in
    //      java.io: input streams, output streams and everything else.


    // *** Absolute vs Relative Paths *** \\

    // Paths consist of directory names, separated by '/s'. In addition there
    // are several special characters in paths:

    //  . '/': when a path starts with '/', it refers to the filesystem root,
    //  otherwise it is used to separate directories in a path.
    //  . '.': current directory
    //  . '..': parent directory
    // *** you know these already as you use them on intellij to navigate
    // through the terminal for files *** \\

    // There are two types of paths:

    //  .Absolute paths = specified from the filesystem root
    //  .relative paths = relative to the 'current working directory'

    // imagine we have a filesystem that looks like this:

    //  /
    //      users/
    //          Document/
    //              important-stuff.tx
    //          IdeaProjects/
    //              java-exercises/ <-- current working directory
    //                  src/
    //                      FileTastic.java
    //                  data/
    //                      data.txt

    // The directory that we are operating from, or the 'current working
    // directory', is marked as the 'java-exercises' project directory.
    // Since this is the case, here are some examples of relative paths:

    //  data/data.txt
    //  ./data/.txt
    //  ../../Documents/important-stuff.txt

    // We say that these paths are relative, because their location on
    // where the current working directory is, where we are specifying
    // the path from. If we specified these paths from a different
    // working directory, they would be invalid, meaning they wouldn't
    // be correct paths to the files they were referencing.

    // In contrast, absolute paths specify a location 'unambiguously'.
    // These paths:

    //  /Users/codeup/IdeaProjects/java-exercises/data/data.txt
    //  /Users/codeup/Documents/important-stuff.txt

    // Will always refer to the same location, regardless of where the
    // current working directory is.


    // *** Working With Files *** \\

    // The java standard library contains many different classes for
    // working with paths and files, located in the 'java.io' and
    // 'java.nio' packages.

    // We'll start by providing an overview of the three classes
    // and one interface we'll be working with, talk about some
    // methods on them, then work through some larger examples.


    // *** Paths *** \\

    // The 'Path' interface

    //  .Defines an object that represents a filepath
    //  .Many file operations will expect to be passed an argument
    //      of type 'Path'
    //  .Abstracts away differences between different filesystem paths
    //      (Windows vs MacOS)

    // 'Path' class

    //  .Contains static methods for obtaining file paths
    //  .Can be used to obtain objects that implement 'Path'


    // *** Files *** \\

    // 'File' class

    //  .Object that represents a file

    // 'Files' class

    //  .Contains static methods for manipulating files


    // *** Common Path and File Methods *** \\

    // ** Most of the methods discussed in the curriculum
    //  for the file IO can throw an'IOException'; you
    //  will ned to handle this in your application.
    //  For the sake of easy demonstration, the error
    //  handling code is omitted from the examples in
    //  this lesson, but you can assume that the method
    //  the examples are inside of contains 'throws
    //  IOException' in the method signature. ** \\

    // The code examples below are not copy-pastable
    // examples, but rather, document the return type
    // of the method as well as the type(s) of the
    // arguments that need to be passed to it.

    //  .Return a 'Path' that corresponds to the passed
    //   String, or multiple strings representing
    //   directories an files

    //      Path paths.get(String filename)
    //      Path paths.get(String directory, String filename)
    //      Path paths.get(String parentDir, String childDir, String filename)

    //  .Tests for the existence of a file or directory

    //      boolean Files.exists(Path filepath)
    //      boolean Files.notExists(Path filepath)

    // As the names imply, '.exists' returns true if the given path exists,
    // while '.notExists' returns true if the given path does not exist.

    //  .Create an empty file at the specified path

    //      Path Files.createFile(Path path)

    //  .Create a directory or multiple specified directories if necessary

    //      Path Files.createDirectories(Path path)

    // Here's an example of using a relative path to create a directory and
    // file if they do not yet exist:

    //      String directory = "data";
    //      String filename = "info.txt";

    //      Path dataDirectory = Paths.get(directory);
    //      Path dataFile = Paths.get(directory, filename);

    //      if(Files.notExists(dataDirectory)) {
    //         Files.createDirectories(dataDirectory);
    //      }

    //      if (!Files.exists(dataFile)) {
    //          Files.createFile(dataFile);
    //      }

    // This will create the directory 'data' in the current working directory,
    // and, within that directory, create a file named info.txt.

    // Notice that we pass multiple arguments to 'Paths.get'. This way we
    // can just specify the directory name and not the directory separator, which
    // is different for different operating systems. If you are writing code that
    // needs to work cross-platform, be sure to pass each directory name
    // as a separate string argument.

    // ** When running a project with Intellij, when your code runs, the current
    // working directory will be the root of your project. ** \\


    // *** Reading And Writing Files *** \\


    // Now that we know how to handle paths and files, we can discuss how to
    // read a file's contents, and how to write content to a file. While there are
    // many methods in the Java standard library to accomplish this, we'll
    // focus on two:

    //  .Write a list of strings to a file

    //      Path Files.write(Path filepath, List<String> lines[, StandardOpenOption
    //          option])

    //  .Each string in the 'lines' parameter will become one line in the file
    //  .Default is to overwrite the existing file (or create a new one)
    //  .The last argument is optional
    //  .'StandardOpenOption.APPEND' can be used as the last argument to add to
    //      an existing file

    //  .Read the contents of a file

    //      List<String> Files.readAllLines(Path filepath)

    //  .Transforms each line in the file into a string
    //  .Each element of the returned list is a string (one line from the file)

    // Now let's take a look at some examples of working with these methods:

    // Here's how we would create a list and write its contents to a file:

    //      List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
    //      Path filepath = Paths.get("data", "groceries.txt");
    //      Files.write(filepath, groceryList);

    // This code uses the '.asList' static method of the 'Arrays' class, which
    // returns a new 'List' created from the arguments passed to it.

    // After running the file 'data/groceries.txt', we will have the following
    // contents:

    //      coffee
    //      milk
    //      sugar

    // For the rest of our examples, we'll assume that this file, 'data/groceries.txt',
    // exists and has the contents shown above.

    //  .Print out each line in an existing file, along with the line number

    //      Path groceriesPath = Paths.get("data", "groceries.txt");
    //      List<String> groceryList = Files.readAllLines(groceriesPath);

    //      for (int i = 0; i < groceryList.size(); i += 1) {
    //          system.out.println((i + 1) + ": " + groceryList.get(i));
    //      }

    // .Add a line to an existing file

    //      Files.write(
    //      Paths.get("data", "groceries.txt"),
    //      Arrays.asList("eggs"), // list with one item
    //      StandardOpenOption.APPEND
    //      );

    // By using 'StandardOpenOption.APPEND', we are able to add lines to
    // the existing file, instead of overwriting its contents.

    // .Replace "milk" with "cream"

    //      List<String> lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
    //      List<String> newList = new ArrayList<>();

    //      for (String line : lines) {
    //          if (line.equals("milK")) {
    //              newList.add("cream"));
    //              continue;
    //         }
    //          newList.add(line);
    //      }

    //      Files.write(Paths.get("data", "groceries.txt"), newList);



    // *** Fin *** \\

}
