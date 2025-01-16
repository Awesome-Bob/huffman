package huffman;


import huffman.tree.Node;
import huffman.util.TreePrinter;
import huffman.util.TreePrinter.*;
import java.util.HashMap;
import java.util.Map;

public class main {
    String input = "Oh I do like to be beside the seaside, I do like to be beside the sea";
    Map<Character,Integer> ft =Huffman.freqTable(input);
    Node root = Huffman.treeFromFreqTable(ft);



}
