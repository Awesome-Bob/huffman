package huffman.sortMethods;

import huffman.tree.Node;

import java.util.List;

public class BinarySearchSort  implements NodeSort{

    public void sort(List<Node> list, Node n){
        int nfreq = n.getFreq();
        int lo = 0;
        int hi = list.size();

        while (lo<=hi){
            int mid  = (hi+lo)/2;
            int mfreq = list.get(mid).getFreq();
            if (mfreq==nfreq) break;
            else if (nfreq>mfreq) lo = mid+1;
            else hi=mid-1;
        }

        list.add(lo,n);
    }

}
