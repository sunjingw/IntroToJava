package Chapter21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex21_03 {
    public static void main(String[] args) throws FileNotFoundException {

        Set<String> keywords = new HashSet<>(Arrays.asList("abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"));


        int count = 0;

        try (Scanner input = new Scanner(new File("./src/Chapter21/Test.java"))) {

            while (input.hasNext()) {

                String s = input.next();

                if (s.contains("//")) {
                    //found line comment
                    input.nextLine(); //go to next line

                } else if (s.contains("/**") || s.contains("/*")) {

                    while (!s.contains("*/")) {
                        s = input.nextLine();
                    }

                } else if (s.contains("\"")) {

                    s = input.next();

                    while (!s.contains("\"")) {
                        s = input.next(); //go to next word
                    }

                } else {
                    count = keywords.contains(s) ? count + 1 : count;
                }

            }

            System.out.println(count);
        }
    }
}
