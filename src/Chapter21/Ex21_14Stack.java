package Chapter21;

import java.util.*;

public class Ex21_14Stack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        long start = System.currentTimeMillis();
        crawler(url);

        System.out.println(System.currentTimeMillis() - start + " ms");
    }

    public static void crawler(String startingURL) {
        Stack<String> listOfPendingURLs = new Stack<String>();
        //Set<String> listOfTraversedURLs = new HashSet<>();

        listOfPendingURLs.push(startingURL);

        while (!listOfPendingURLs.isEmpty()) {

            String urlString = listOfPendingURLs.pop();

            System.out.println("Crawl " + urlString);

            for (String s : getSubURLs(urlString)) {
                    listOfPendingURLs.add(s);

            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) { // Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else
                        current = -1;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}