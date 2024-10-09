package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] arguments) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\c_sha\\Desktop\\DataFiles\\DataFiles\\emplyees.csv"));
        String data = br.readLine();
    }
}
