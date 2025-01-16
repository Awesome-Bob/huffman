package huffman.sortMethods;

import huffman.tree.Node;
import java.util.Collections;
import java.util.List;

public class QuickSort implements NodeSort{


    public  void sort(List<Node> array, Node n){
        array.add(array.size()-1,n);
        quicksort(array,0,array.size()-1);
    }

    private static void quicksort(List<Node> array, int lowIndex, int highIndex) {
        if(lowIndex>=highIndex)return;
        int pivot = array.get(highIndex).getFreq();
        int leftPointer = partition(array, lowIndex, highIndex, pivot);
        quicksort(array,lowIndex,leftPointer-1);
        quicksort(array,leftPointer+1,highIndex);
    }

    private static int partition(List<Node> array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer<rightPointer){
            while (array.get(leftPointer).getFreq()<=pivot && leftPointer<rightPointer) leftPointer++;
            while (array.get(rightPointer).getFreq() >= pivot && leftPointer < rightPointer) rightPointer--;
            Collections.swap(array,leftPointer,rightPointer);
        }
        Collections.swap(array,leftPointer,highIndex);
        return leftPointer;
    }
}
