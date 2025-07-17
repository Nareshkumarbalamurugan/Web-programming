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
public class BasicIOWithMultipleInputs {
    public static void main(String[] args) throws IOException {
        // Creating BufferedReader to read input from console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read a string
        System.out.print("Enter your name: ");
        String name = reader.readLine();

        // Read an integer
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());

        // Read a float
        System.out.print("Enter your percentage: ");
        float percentage = Float.parseFloat(reader.readLine());

        // Display the result
        System.out.println("\n--- Output ---");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage);
    }
}
