package DirectChaining;
import java.util.ArrayList;
import java.util.LinkedList;
public class DirectChaining {
     LinkedList<String>[] hashTable;
     int maxChainSize = 5;

     DirectChaining(int size){
         hashTable = new LinkedList[size];
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

    //insert values at hashtable

    public void insertHashTable(String word){
         int newIndex = modASCIIHashFunction(word,hashTable.length);
         if (hashTable[newIndex] == null){
             hashTable[newIndex] = new LinkedList<String>();
             hashTable[newIndex].add(word);
         }
         else {
             hashTable[newIndex].add(word);
         }
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

    //search in table

    public boolean searchHashTable(String word){
         int newIndex = modASCIIHashFunction(word,hashTable.length);
         if (hashTable[newIndex] != null && hashTable[newIndex].contains(word)){
             System.out.println("\n" + "\"" +word+"\""+ "found in hashtable at location: " +newIndex);
             return true;
         }
         else {
             System.out.println("\n" + "\"" +word+"\""+ "does not found in hashtable");
             return false;
         }
    }


    //delete in hashtable

    public void deleteKeyHashTable(String word){
         int newIndex = modASCIIHashFunction(word, hashTable.length);
         boolean res = searchHashTable(word);
         if (res == true){
             hashTable[newIndex].remove(word);
             System.out.println("\n" + "\"" +word+"\""+ "has been deleted form hashtable ");
         }
         else {
             System.out.println("\n" + "\"" +word+"\""+ "does not found in hashtable");
         }
    }












}
