package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(" // 1. Создать пустой список строк");
        ArrayList<String> strArray = new ArrayList<>();
        System.out.println(strArray);



        System.out.println(" // 2. Считать с клавиатуры 5 строк и добавить и в список \n");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++){
            strArray.add(reader2.readLine());
        }
        System.out.println("Это весь список " + strArray);


        System.out.println("// 3. Используя цикл, найди самую короткую строку в списке");
        ArrayList<String> randomStrings =  new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           // наполняем лист
            for (int i = 0; i < 5; i++ ){
                randomStrings.add(reader.readLine());}
            // проверяем на длину
            String shortest = randomStrings.get(0);
            for (String element : randomStrings){
                if(element.length() <= shortest.length())
                shortest = element;
            }
            System.out.println("Самая короткая строка - " + shortest);


        System.out.println("// 5. Если таких строк несколько, выведи каждую с новой строки.");
        ArrayList<String> randomStrings3 =  new ArrayList<>();
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
       // наполняем лист
        for (int i = 0; i < 5; i++ ){
            randomStrings3.add(reader3.readLine());
        }
        // ищем короткую строку
        String shortTest3 = randomStrings3.get(0);
        for (String element3 : randomStrings3){
            if (element3.length() <= shortTest3.length()){
                shortTest3 = element3;
            }
        }
        // ищем повторы короткой строки
        String shortTest4 = randomStrings3.get(0);
        for (String element4 : randomStrings3){
            if (element4.length() == shortTest3.length()){
                shortTest4 = element4;
                if (shortTest4 != shortTest3){
                    System.out.println("Эта тожже короткая - " + shortTest4);
                }
            }
        }
        System.out.println("Короткий последний элемент - " + shortTest3);
    }
}





