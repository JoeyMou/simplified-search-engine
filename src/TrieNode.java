import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Joey on 2015/12/5.
 */
public class TrieNode {
    Map<Character, TrieNode> nexts;
    boolean isLeaf;
    List<File> occurrenceList;
    TrieNode() {
        nexts = new HashMap<Character, TrieNode>();
        isLeaf = false;
        occurrenceList = null;
    }
}
