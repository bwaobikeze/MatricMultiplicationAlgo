package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MatrixAddition addMatrix=new MatrixAddition();
        ArrayList<Integer>Nnumber=new ArrayList<>(List.of(16,64,256,1024,4096,16384));
        for(int i=0; i<Nnumber.size();i++){
            addMatrix.MatricAdditionForN(Nnumber.get(i));
        }

    }
}