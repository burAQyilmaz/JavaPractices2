package day21_ArraysUtility_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur"};
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String[] students = new String[group1.length + group2.length];

        int i = 0;

        for (String s : group1) {

            students[i++] += s;
        }
        for (String s : group2) {

            students[i++] += s;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("-----------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char c : ch1) {

            chars[j++] += c;
        }
        for (char c : ch2) {

            chars[j++] += c;
        }
        System.out.println(Arrays.toString(chars));
    }
}
