package Chapter21;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Ex21_05 {
    public static void main(String[] args) throws IOException {


        File java = new File("./src/Chapter21/Test.java");

        convert(java, "./src/Chapter21/Test.html");

    }

    public static void convert(File java, String url) throws IOException {

        File file = new File(url);

        Set<String> keywords = new HashSet<>(Set.of("abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"));

        Set<String> comments = new HashSet<>(Set.of("//", "/*", "*/", "/**", "*"));


        Set<String> html = new LinkedHashSet<>(Arrays.asList("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<pre>"));


        try (Scanner input = new Scanner(java)) {
            while (input.hasNext()) {

                String str = input.nextLine();
                Set<String> code = new LinkedHashSet<>(Arrays.asList(str.split("(?=[ \".()])")));
                //Set<String> code = new LinkedHashSet<>(Arrays.asList(str.splitWithDelimiters("[ ()]", 0)));
                System.out.print(str + " ");

                str = "";
                if (code.contains("\"")) {
                    boolean quotes = false;
                    for (String e : code) {
                        if (e.trim().contains("\"")) {
                            quotes = quotes ? false : true;
                            str += "<font color=\"lightblue\">" + e + "</font>";
                        } else if (quotes) {
                            str += "<font color=\"lightblue\">" + e + "</font>";
                        } else {
                            str += e;
                        }
                    }

                } else if (isContains(comments, code)) {

                    html.add("<font color=\"green\"> " + code.stream()
                            .map(Object::toString)
                            .collect(Collectors.joining(" ")) + "</font>");

                } else if (isContains(keywords, code)) {
                    for (String e : code) {
                        if (keywords.contains(e.trim())) {
                            str += "<font color=\"blue\">" + e + "</font>";

                        } else {
                            str += e;
                        }
                    }

                }
                html.add(str);
                html.add("\n");

            }

            html.add("</pre>\n</body>\n</html>");
            System.out.println(html);

            try (PrintWriter output = new PrintWriter(new FileOutputStream(file))) {
                html.forEach(output::println);
            }
        }
    }

    public static boolean isContains(Set<String> keywords, Set<String> code) {

        boolean contains = false;

        for (String e : code) {
            if (keywords.contains(e.trim())) {
                return true;
            }
        }

        return contains;
    }
}
