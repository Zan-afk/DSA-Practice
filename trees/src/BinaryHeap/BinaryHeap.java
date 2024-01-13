package BinaryHeap;

//binary heap is either min heap or max heap.[the root must be min or max among all present node ] the same property must be recursivly true for all nodes

public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size){
        arr =new int[size+1];
        sizeOfTree = 0;
        System.out.println("Binary heap has been created");
    }

    public boolean isEmpty(){
        if (sizeOfTree == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public Integer peek(){
        if (isEmpty()){
            System.out.println("Binary heap is empty");
            return null;
        }
        return arr[1];
    }

    public int sizeOfBH(){
        return sizeOfTree;
    }

    //level order traversal

    public void levelOrder(){
        for (int i = 1; i <= sizeOfTree ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n");
    }

    // heapify for insert

    public void heapifyBottomToTop(int index , String heapType){
        int parent = index/2;
        if (index <= 1){
            return;
        }
        if (heapType == "Min"){
            if (arr[index]<arr[parent]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (heapType == "Max") {
            if (arr[index] > arr[parent]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomToTop(parent,heapType);
    }

    public void insert(int value , String typeHeap){
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree,typeHeap);
        System.out.println("inserted "+value+" successfully in heap");
    }

    













}
