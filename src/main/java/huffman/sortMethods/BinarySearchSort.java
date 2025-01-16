package huffman.sortMethods;

import huffman.tree.Node;

import java.util.List;

public class BinarySearchSort  implements NodeSort{

    public void sort(List<Node> list, Node n){
        int nFreq = n.getFreq();
        int lo = 0;
        int hi = list.size();

        while (lo<=hi){
            int mid  = lo+(hi-lo)/2;
            int mFreq = list.get(mid).getFreq();
            if (mFreq==nFreq) break;
            else if (nFreq>mFreq) lo = mid+1;
            else hi=mid-1;
        }

        list.add(lo,n);
    }

}
