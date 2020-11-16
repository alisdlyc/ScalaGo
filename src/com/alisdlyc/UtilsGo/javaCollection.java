package com.alisdlyc.UtilsGo;

import scala.collection.mutable.ArrayBuffer;

import java.util.ArrayList;

public class javaCollection {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[2] = 1;
        System.out.println(nums[2]);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.hashCode());
        list.add(3);
        list.add(4);
        System.out.println(list.hashCode());

    }
}
