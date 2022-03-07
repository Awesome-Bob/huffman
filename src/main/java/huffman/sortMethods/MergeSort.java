package huffman.sortMethods;

import huffman.tree.Node;
import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public void sort(List<Node> array){
        int length = array.size();
        if (length <= 1) return;

        int middle = length/2;
        ArrayList<Node> leftArray = new ArrayList<>();
        ArrayList<Node> rightArray = new ArrayList<>();

        int i = 0, j = 0;
        for (; i < length; i++){
            if (i < middle){
                leftArray.add(i, array.get(i)   );
            }else {
                rightArray.add(j,array.get(i));
                j++;
            }
        }
        sort(leftArray);
        sort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(ArrayList<Node> leftArray, ArrayList<Node> rightArray, List<Node> array) {
        int leftSize = array.size() / 2;
        int rightSize = array.size() - leftSize;
        int i = 0, l = 0, r = 0;
        while (l < leftSize && r < rightSize){
            if (leftArray.get(l).getFreq() < rightArray.get(r).getFreq()){
                array.set(i,leftArray.get(l));
                i++;
                l++;
            }else {
                array.set(i, rightArray.get(r));
                i++;
                r++;
            }
        }
        while (l < leftSize){
            array.set(i, leftArray.get(l));
            i++;
            l++;
        }
        while (r < rightSize){
            array.set(i, rightArray.get(r));
            i++;
            r++;
        }
    }
}
