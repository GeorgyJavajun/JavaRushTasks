package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String[]> fileContent = new ArrayList<>();
        String firstFile;
        String secondFile;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            firstFile = reader.readLine();
            secondFile = reader.readLine();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(firstFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(secondFile))) {

            while (reader.ready()) { fileContent.add(reader.readLine().split(" ")); }

            for (String[] s : fileContent) {
                for (String value : s) {
                    try {
                        int num = Integer.parseInt(value);
                        writer.write(num + " ");
                    } catch (Exception ignore) { }
                }
            }
        }

    }
}
