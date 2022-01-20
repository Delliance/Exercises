package com.danieltesting.Exercises.Exercise1;

import java.util.Arrays;
import java.util.Random;

public class ColumnChecker {


    public static void columnChecker(){

        Random r = new Random();
        int low = 10;
        int high = 20;
        int columns = 0;
        int blocks = 0;
        int totalNumberBlocks = 0;
        int remainder = 0;
        int [] arrayBlocks;
        int multiple = 0;
        int blocksToMove = 0;

        columns = r.nextInt(high-low)+low;

        arrayBlocks = new int[columns];

        blocks = columns*(r.nextInt(high-low)+low);

        totalNumberBlocks = blocks;

        while (true) {

            if (blocks > 0) {
                arrayBlocks [r.nextInt(columns)] ++;
                blocks--;
            }
            else {
                break;
            }

        }

        multiple = totalNumberBlocks/columns;

        System.out.println("Initial array: "+Arrays.toString(arrayBlocks));
        System.out.println("The total number of blocks is: "+totalNumberBlocks+" there must be "+multiple+" blocks in each column.");

        for (int i = 0; i < columns; i++) {

            int blocksToRemove = 0;

            if (arrayBlocks[i]>multiple){

                blocksToRemove = arrayBlocks[i]-multiple;
                blocksToMove += blocksToRemove;
                arrayBlocks[i] -= blocksToRemove;

            }

        }

        System.out.println("To make all the columns even we have to move "+blocksToMove+" blocks.");

        for (int i = 0; i < columns; i++) {

            int blocksToAdd = 0;
            if (arrayBlocks[i]<multiple){

                blocksToAdd = multiple - arrayBlocks[i];
                arrayBlocks [i] += blocksToAdd;
                blocksToMove -= blocksToAdd;

            }

        }

        System.out.println("By moving that number of blocks we get: "+Arrays.toString(arrayBlocks));



    }


}
