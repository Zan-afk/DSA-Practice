package Tries;

import java.util.HashMap;
import java.util.Map;
public class TrieNode {
    Map<Character, TrieNode> children; //these Trienode is link between two nodes character is key to access node
    boolean endOfString;

    public TrieNode(){
        children = new HashMap<>();
        endOfString = false;
    }
}
