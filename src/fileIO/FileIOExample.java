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

    // *** TO BE CONTINUED *** \\


}
