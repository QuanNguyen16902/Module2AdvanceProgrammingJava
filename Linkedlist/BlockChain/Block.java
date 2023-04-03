package Linkedlist.BlockChain;

import java.util.Calendar;
import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;
    private int nonce;

    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash(){
        String calculateHash = StringUtil.applySha256(previousHash + Long.toString(timeStamp) + Integer.toString(nonce) + data);
        return calculateHash;
    }
    public void mindBlock(int difficulty){
        String str = new String (new char[difficulty]).replace("\0","0");
        while (!hash.substring(0 , difficulty).equals(str))

        {
            nonce++;
            hash = calculateHash();
        }

        System.out.println("Block Mind!: " + hash);
    }
}

