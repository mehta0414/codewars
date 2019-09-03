package Challenges;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Challenge1 {
    public static String longest1(String s1, String s2) {

        String s3 = s1.concat(s2);
        String s4 = "";
        String finalString = "";
        char[] a = s3.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (s4.contains(a[i] + "")) {
            } else {
                s4 = s4 + a[i];
            }
        }
        char b[] = s4.toCharArray();
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            finalString = finalString + b[i];
        }
        return finalString;
    }

    public static String longest2(String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }

    public static String longest3(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
        return sb.toString();
    }

    public static String longest4(String s1, String s2) {
        String s = s1 + s2;
        String out = "";
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.contains(c + "")) {
                out += c;
            }
        }
        return out;
    }

    public static String longest5(String s1, String s2) {
        return (s1 + s2).chars().distinct().mapToObj(c -> String.valueOf((char) c)).sorted().collect(Collectors.joining());
    }

    public static String longest6(String s1, String s2) {
        TreeSet<Character> set = new TreeSet<>();
        // combine  both Strings into a single String
        String s1s2 = s1 + s2;
        StringBuilder sb = new StringBuilder();

        // Add all characters to TreeSet. Now they are ordered and only 1 occurrence of each
        for (int i = 0; i < s1s2.length(); i++)
            set.add(s1s2.charAt(i));

        // Build our StringBuilder by iterating over the Set
        for (Character c : set)
            sb.append(c);
        // Return the result as a String
        return new String(sb);
    }

    public static String longest7(String s1, String s2) {
        s1 = s1 + s2;
        char[] chars = s1.toCharArray();
        TreeSet<Character> set = new TreeSet<>();
        for (char i : chars)
            set.add(i);
        s1 = "";
        for (char i : set)
            s1 += i;
        return s1;
    }
}
