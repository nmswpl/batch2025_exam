package in.co.nmsworks.exam2;

import java.util.Scanner;

public class StringParse {
    public static void main(String[] args) {
        StringParse s = new StringParse();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        s.parseTheString(input);
        sc.close();
    }

    private void parseTheString(String input) {
        StringBuilder name = new StringBuilder();

        String[] words = input.split(":");

        for (int i = 0; i < words.length; i++) {
                name.append(words[i]);
        }

        System.out.println(name);

    }
}
