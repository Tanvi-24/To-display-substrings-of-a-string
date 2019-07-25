package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        StringBuffer s = new StringBuffer();
        System.out.println("Substrings are : ");
        for(int i=0;i<str.length();i++)
        {
            for(int count=i+1;count<str.length();count++)
            {
                s.append(str.substring(i,count+1));
                System.out.println(s.reverse());
                s.delete(0,s.length());
            }

        }
    }
}
