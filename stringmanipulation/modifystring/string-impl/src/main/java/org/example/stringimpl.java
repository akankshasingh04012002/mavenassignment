package org.example;
import java.util.Scanner;
import org.example.stringapi;

public class stringimpl {
    public static void main(String[] args) {
        stringapi object=new stringapi();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println(object.stringLength(s));

        System.out.println(object.reverseString(s));
    }
}