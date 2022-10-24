package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatrixAddition {
    /*
    * The Function MatricAddition()
    * Takes in one parameter which is an Int type
    * It declares 2 BigInteger variables (to deal with the bigger m), 2 index variables, and a Matrix
    * it initializes the 2D matrix with 1
    * This function then executes the algorithm on page 126
    *
    */
    void MatricAdditionForN(int n){
        BigInteger m=new BigInteger("1677721600");
        BigInteger numCounter = new BigInteger("0");
        int additionMatrix[][]=new int [n][n];
        int firstNum, SecondNum, x;
        Random rand = new Random();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                additionMatrix[i][j]=1;
            }
        }
        //numCounter
        long startExcution= System.nanoTime();
        for (;numCounter.equals(m);numCounter.add(new BigInteger("1"))){
            firstNum=rand.nextInt(n);
            SecondNum= rand.nextInt(n);
            x=rand.nextInt(100)+1;
            additionMatrix[firstNum][SecondNum]=additionMatrix[firstNum][SecondNum]+x;
        }
        long endExucution=(System.nanoTime()-startExcution);
        System.out.println("Excucution For Version 1 Size: "+ n);
        System.out.println("Excucution Time For Version 1 in Nanoseconds: "+endExucution+" Ns");
        System.out.println();
    }

}
