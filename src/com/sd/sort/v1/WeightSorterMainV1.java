package com.sd.sort.v1;
import java.util.Arrays;

public class WeightSorterMainV1 {
    public static void main(String[] args){
        Weight[] weights=new Weight[5];
        weights[0]=new Weight(50);
        weights[1]=new Weight(40);
        weights[2]=new Weight(70);
        weights[3]=new Weight(30);
        weights[4]=new Weight(60);
        Arrays.sort(weights);
        for(Weight w:weights)
            System.out.println(w.toString());
    }
}
