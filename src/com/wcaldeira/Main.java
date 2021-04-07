package com.wcaldeira;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastElement = intArray.length - 1; lastElement > 0; lastElement --){
            int largest = 0;

            for(int i = 0; i <= lastElement; i ++){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }

            swap(intArray, largest, lastElement);
        }


        for (int elemt : intArray){
            System.out.println(elemt);
        }
    }

    public static void swap(int [] listItens, int i, int j){
        if(i == j){
            return;
        }

        int temp = listItens[i];
        listItens[i] = listItens[j];
        listItens[j] = temp;
    }
}
