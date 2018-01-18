package ru.job4j.loop;

import static java.lang.System.out;

/**
 * Created by Home on 18.01.2018.
 */
public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i<=finish; i++, start++) {
            if ((start%2)==0){
                sum=sum+start;
            }
        }
        return sum;
    }
}
