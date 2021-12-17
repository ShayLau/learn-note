package com.hashtree;


import java.util.ArrayList;
import java.util.List;

/**
 * HashTree demo
 *
 * 
 */
public class Demo {
    public static void main(String[] args) {

        List<String> txList = new ArrayList<>();

        txList.add("1");
        txList.add("2");
        txList.add("3");
        txList.add("4");

        MerkleTrees merkleTrees = new MerkleTrees(txList);
        merkleTrees.merkle_tree();
        System.out.println(merkleTrees.getRoot());


    }
}
