package Semester03.Algorithms;

import java.util.Scanner;

import Semester03.Utils.IntArrayUtils;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] readArray = IntArrayUtils.read(scanner, 5);
        IntArrayUtils.print(readArray);
    }
}