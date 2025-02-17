package huffman;

import huffman.sortMethods.*;
import huffman.tree.Node;
import java.util.ArrayList;
import java.util.List;
/**
 * A priority queue of @Node@ objects. Each node has an int as its label representing its frequency.
 * The queue should order objects in ascending order of frequency, i.e. lowest first.
 */
public class PQueue {

    private final List<Node> queue;
    private final NodeSort ns = new BinarySearchSort();

    public PQueue() {
        queue = new ArrayList<>();
    }

    /**
     * Add a node to the queue. The new node should be inserted at the point where the frequency of next node is
     * greater than or equal to that of the new one.
     * @param n The node to enqueue.
     */
    public void enqueue(Node n) {
        if (queue.isEmpty()) {
            queue.add(0,n);
            return;
        }
        int size =queue.size();
        int freq = n.getFreq();
        if (size==1){
            if (queue.get(0).getFreq()>freq)
                queue.add(0,n);
            else
                queue.add(1,n);
            return;
        }
        if (queue.get(size-1).getFreq()<freq){
            queue.add(n);
            return;
        }
        if (queue.get(0).getFreq()>freq){
            queue.add(0,n);
            return;
        }
        ns.sort(queue,n);
    }

    /**
     * Remove a node from the queue.
     * @return  The first node in the queue.
     */
    public Node dequeue() {
        if (queue.isEmpty())return null;
        return queue.remove(0);
    }

    /**
     * Return the size of the queue.
     * @return  Size of the queue.
     */
    public int size() {
        return queue.size();
    }
}
