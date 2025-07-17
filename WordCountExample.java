/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.web_technology_exp1;
import java.io.*;
/**
 *
 * @author student
 */


public class WordCountExample {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader to read input from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence: ");
        String sentence = br.readLine();

        // Split the sentence into words based on spaces
        String[] words = sentence.trim().split("\\s+");

        // Count the number of words
        int wordCount = words.length;

        // Display the count
        System.out.println("Number of words: " + wordCount);
    }
}

