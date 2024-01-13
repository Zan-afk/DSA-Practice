package Tries;

public class Trie {

    private TrieNode root;

    public Trie(){
        root = new TrieNode();
        System.out.println("Trie has been created");
    }

    public void insert(String word){
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch); //these node is checking value present in trie or not if not it will put value in node and creating link between them
            if (node == null){
                node = new TrieNode();
                current.children.put(ch,node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println("successfully inserted "+word+" in trie");
    }

    //search for a word in trie

    public boolean search(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null) {
                System.out.println("word: " + word + " does not exist in tries");
                return false;
            }
            currentNode = node;
        }
        if (currentNode.endOfString == true) {
            System.out.println("word: " + word + " exist in tries");
            return true;
        } else {
            System.out.println("word: " + word + " does not exist in tries. But it is prefix of another string");
        }
        return currentNode.endOfString;
    }


        //delete string from trie


    private boolean delete(TrieNode parentNode , String word , int index){
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;
        //deletion method is started from leaf node

        if (currentNode.children.size() > 1){  //this is 1 condn the word is another words prefix //some other prefix of string is same as word we want to delete
            delete(currentNode, word , index+1);
            return false;
        }
        if (index == word.length()-1){  //this is 2nd condn where node has one more letter and end of string api and apis we want to delete api
            //here we cant delete i so we want to update end of string to false//here we are lst char of word
            if (currentNode.children.size()>= 1){
                currentNode.endOfString = false;
                return false;
            }
            else {
                parentNode.children.remove(ch); //in these case the char is not prefix of some other word so we have to delete this char
                return true;
            }
        }
        if (currentNode.endOfString == true){ //3 cod is other sting is prefix of this string apis and ap we want to delete apis
            delete(currentNode,word,index+1);
            return false;
        }
        canThisNodeBeDeleted = delete(currentNode,word,index+1); //4 cond is node does not depend on any other node
        if (canThisNodeBeDeleted == true){
            parentNode.children.remove(ch);
            return true;
        }
        else {
            return false;
        }
    }

    public void delete(String word){
        if (search(word) == true){
            delete(root,word,0);
        }
    }














}
