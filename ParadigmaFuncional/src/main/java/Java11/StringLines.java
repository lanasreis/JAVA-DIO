package Java11;

import java.util.stream.Collectors;

public class StringLines {
    public static void main(String[] args) {
        String html = "<html><head>\n<head>\n <body>\n<body>  \n<html>";
        System.out.println(html.lines().filter(s -> s.contains("<head>")).collect(Collectors.joining()));
    }
}
