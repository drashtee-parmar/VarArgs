package dev.learning;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello World again");

        String[] splitString = "Hello world again".split(" ");
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

//        Using array of string
        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }
    private  static void printText(String... textList){

        for (String t : textList){
            System.out.println(t);
        }
    }
}
