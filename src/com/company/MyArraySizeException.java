package com.company;


    public class MyArraySizeException extends RuntimeException{
        public MyArraySizeException() {
            super("Размер массива некорректный,нужен размер массива 4*4!");
        }
    }

