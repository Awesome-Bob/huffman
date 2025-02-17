package huffman.sortMethods;

import huffman.tree.Node;
import java.util.List;

public class BubbleSort implements NodeSort {

    public void sort( List<Node> list,Node n){
        int u = 1;
        int freq = n.getFreq();
        int size = list.size();

        for (; u < size; u++){
            if (list.get(u).getFreq() > freq){
                list.add(u,n);
            }
        }
    }
}
