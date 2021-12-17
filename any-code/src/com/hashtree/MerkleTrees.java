package com.hashtree;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class MerkleTrees {

    // transaction List
    List<String> txList;
    // Merkle Root
    String root;

    /**
     * constructor
     * @param txList transaction List
     */
    public MerkleTrees(List<String> txList) {
        this.txList = txList;
        root = "";
    }

    /**
     * execute merkle_tree and set root.
     * 计算整个交易列表的MerkleTree
     * 计算方法：
     * 首先将所有的交易列表的hash值计算一遍
     * 然后，循环计算出MerkleTree的根
     */
    public void merkle_tree() {

        List<String> tempTxList = new ArrayList<>();

        for (int i = 0; i < this.txList.size(); i++) {
            tempTxList.add(this.txList.get(i));
        }

        List<String> newTxList = getNewTxList(tempTxList);
        while (newTxList.size() != 1) {
            newTxList = getNewTxList(newTxList);
        }

        this.root = newTxList.get(0);
    }

    /**
     * return Node Hash List.
     *
     * 计算相邻元素的 SHA-256
     * @param tempTxList
     * @return
     */
    private List<String> getNewTxList(List<String> tempTxList) {

        List<String> newTxList = new ArrayList<String>();
        int index = 0;
        while (index < tempTxList.size()) {
            // left
            String left = tempTxList.get(index);
            index++;

            // right
            String right = "";
            if (index != tempTxList.size()) {
                right = tempTxList.get(index);
            }

            // sha2 hex value
            String sha2HexValue = getSHA2HexValue(left + right);
            newTxList.add(sha2HexValue);
            index++;

        }

        return newTxList;
    }

    /**
     * Return hex string
     * @param str
     * @return
     */
    public String getSHA2HexValue(String str) {
        byte[] cipher_byte;
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(str.getBytes());
            cipher_byte = md.digest();
            StringBuilder sb = new StringBuilder(2 * cipher_byte.length);
            for(byte b: cipher_byte) {
                sb.append(String.format("%02x", b&0xff) );
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     * Get Root
     * @return
     */
    public String getRoot() {
        return this.root;
    }

}