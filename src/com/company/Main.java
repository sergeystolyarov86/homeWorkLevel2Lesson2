package com.company;

public class Main {

    public static void main(String[] args) {

        String[][] array = {{"1", "4", "5", "55"}, {"77", "61", "44", "8",}, {"3", "6", "0", "6"}, {"7", "9", "1", "11"}};
        String[][] wrongSizeArray = {{"5", "56", "88","5"}, {"1","99",  "5"},{"1","1","1","1"},{"10","0","0"}};
        String[][] wrongDataArray = {{"11", "5","4", "5"}, {"77", "61", "4", "81",}, {"32", "5", "0", "6"}, {"0", "7l", "1", "11"}};

       // Проверка массива с корректными данными

        System.out.println("Подан корректный массив:");
        try {
             fourOnFour(array);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("");

        // Проверка массива с некорректным размером

        System.out.println("Подан массив с некорретным размером:");
        try {
             fourOnFour(wrongSizeArray);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("");

        // Подан массив с некорректными данными

        System.out.println("Подан массив с некорретными данными:");

        try {
             fourOnFour(wrongDataArray);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }


    }

    public static  int fourOnFour  (String[][] array)  throws MyArraySizeException,MyArrayDataException {
        int summ=0;
        int line=0;
        int column=0;
        for(int i=0;i<4;i++) {
            if (array[i].length != 4 || array.length != 4) throw new MyArraySizeException();
        }
        try {
            for (int i=0;i<4;i++)
            {  line=i;
            for (int j = 0; j < 4; j++) {
                column = j;
                summ += Integer.parseInt(array[i][j]);
            }
            }
        }
        catch (NumberFormatException e){
            String message="в "+String.valueOf(line)+" ряду, "+String.valueOf(column)+" ячейке";
            throw new MyArrayDataException(message);
        }
        System.out.println("Сумма элементов массива равна "+ summ);
         return summ;
    }
}