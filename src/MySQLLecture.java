public class MySQLLecture {

    // What is Data?

    // .Facts

    // what is a Database?
    // . A systematic collection of data
    // . Databases allow us to easily manage and sort through
    //  organized data
    // . DBMS - A collection of programs which allow users to access
    //      a database and manipulate data. Data-Based-Management-System
    // some places who use DBMS:
    //      . CPS Energy - uses DBMS to manage billing, client info
    //      . FaceBook

    // What is MySQL?

    // . MySQL is a Relational Database Management System (RDBMS)
    // . Allows data between tables to communicate with each other
    // . Lets us manipulate millions of rows efficiently

    // . Relation databases are the most common way to permanently store
    //   data in web development
    // . SQL is the language we use to query and interact with our database.
    // . The commands in this language are divided into several categories.

    // Checking the server
    // . Before we interact with our database, we must make sure that the
    // server is running.
    // . Check the status with:
    // mysql.


    // MySQL in Command Line
    // . There are 2 parts to MySQL:
    //      . MySQL server - understands SQL commands; this is where tha data
    //                      lives
    //      . MySQL client - the interface we use to connect to the server and
    //                      send commands to display data on screen
    // . We can connect to the database
    // the command to connect to the terminal is:
    // *** mysql -u root -p ***
    // *** password: codeup ***
    // you will not see it and that's intentional. It is for security purposes

    // On Exercises:
    // SELECT * FROM mysql.user will give you the list of users.
    // ';' will not recognize the command. '\G' will give you the whole
    // list of users.

    // SELECT user, host FROM mysql.user
    // ';' will give you the table. '\G' will give you the row.
    //  Both the same information

    // SELECT * FROM mysql.help_topic
    // both commands will give you help topics. too long to see the difference.

    // SELECT help_topic_id, help_category_id, url FROM mysql.help_topic
    // Same as the ones above. One will give you the table option,
    // The other one will give you the row option. Both giving you
    // the same info.
    // q will get you out of the row or table command


    // *** Database users *** \\

    // We are going to learn how to:
    // .Find our 'current_user;'
    // . List our available users
    // . Create a new user
    // . Grant user privileges
    // . Delete a user from our users table

    // SELECT current user - to find the current user
    // SELECT user, host FROM mysql.user; - To list a table of users


    // MySQL Databases \\

    // Database -
}
