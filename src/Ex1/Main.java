package Ex1;

import java.io.File;

import static Ex1.Parser.Parse.parse;

public class Main {
    public static void main(String[] args) {
        parse(new File("src/Ex1/Files/ex1.xml"));
    }

}
