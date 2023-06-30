package Ex3;

import javax.xml.transform.TransformerException;
import java.io.File;

import static Ex3.Parser.Parse.parse;

public class Main {
    public static void main(String[] args) throws TransformerException {
        parse(new File("src/Ex3/Files/ex3.xml"), new File("src/Ex3/Files/ex3.xslt"));
    }
}