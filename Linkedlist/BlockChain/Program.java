package Linkedlist.BlockChain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static ArrayList<Block> blockChain = new ArrayList<Block>() {
    };
    public static int difficulty = 5;

    public static void main(String[] args) {
//        Block genesisBlock = new Block("hi im a block","0");
//        System.out.println("Hash for block: " + genesisBlock.hash);
//
//        Block secondBlock = new Block("hi im a block", genesisBlock.hash);
//        System.out.println("Hash for block: " + secondBlock.hash);
//
//        Block thirdBlock = new Block("hi im a block", secondBlock.hash);
//        System.out.println("Hash for block: " + thirdBlock.hash);
        blockChain.add(new Block("Hi im the first block", "0"));
        System.out.println("Trying to Mine block 1...");
        blockChain.get(0).mindBlock(difficulty);


        blockChain.add(new Block("Yo im the second block", blockChain.get(blockChain.size() - 1).hash));
        System.out.println("Trying to Mine block 2...");
        blockChain.get(1).mindBlock(difficulty);

        blockChain.add(new Block("Hey im the third block", blockChain.get(blockChain.size() - 1).hash));
        System.out.println("Trying to Mine block 3...");
        blockChain.get(2).mindBlock(difficulty);

        System.out.println("\nBlockchain is Valid: " + isChainValid());

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
        System.out.println("\nThe block chain: ");
        System.out.println(blockchainJson);

    }
    public static boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;
        String hashTarget = new String(new char[difficulty]).replace("\0","0");

        for(int i = 1 ; i < blockChain.size();i++) {
            currentBlock = blockChain.get(i);
            previousBlock = blockChain.get(i - 1);

            if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                System.out.println("Current Hashes not equal");
                return false;
            }
        }
        return true;
    }
}
