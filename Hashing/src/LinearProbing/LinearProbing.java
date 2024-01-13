package LinearProbing;

import java.util.ArrayList;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    LinearProbing(int size){
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    //hash function
    public int modASCIIHashFunction(String word, int m){
        char[] ch;
        ch = word.toCharArray();
        int i,sum;
        for (sum=0,i=0; i<word.length(); i++){
            sum = sum+ch[i];
        }
        return sum%m;
    }

    //get load factor

    public double getLoadFactor(){
        double loadFactor = usedCellNumber * 1.0/hashTable.length;
        return loadFactor;
    }

    //rehash

    public void rehashKeys(String word){
        usedCellNumber =0;
        ArrayList<String> data =new ArrayList<String>();
        for (String s:hashTable) {
            data.add(s);
            data.add(word);

            hashTable = new String[hashTable.length*2];
            for (String sp:data) {
                insertHashTable(sp);
            }
        }

    }

    //insert in hashtable

    public void insertHashTable(String word){

        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75){
            rehashKeys(word);
        }
        else {
            int index = modASCIIHashFunction(word , hashTable.length);
            for (int i = index; i < index+hashTable.length ; i++) {
                int newIndex = i % hashTable.length;
                if (hashTable[newIndex] == null){
                    hashTable[newIndex] = word;
                    System.out.println("the "+word+" successfully inserted at location: "+newIndex );
                    break;
                }
                else {
                    System.out.println(newIndex + "is already occupied trying next cell");
                }
            }
        }
        usedCellNumber++;
    }

    //display hashtable

    public void displayHashtable(){
        if (hashTable == null){
            System.out.println("hashtable does not exist");
            return;
        }
        else {
            System.out.println("--------------HashTable------------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("index "+i+" , key: "+hashTable[i]);
            }
        }
    }
















}
