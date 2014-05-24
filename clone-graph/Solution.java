/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        Map<UndirectedGraphNode, UndirectedGraphNode> tracker = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        clone(node, tracker);
        return tracker.get(node);
    }
    
    public UndirectedGraphNode clone(UndirectedGraphNode node, Map<UndirectedGraphNode, UndirectedGraphNode> tracker){
        
        if (tracker.get(node) != null) return tracker.get(node);
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        tracker.put(node, newNode);
        for (UndirectedGraphNode temp : node.neighbors){
            newNode.neighbors.add(clone(temp, tracker));
        }
        return newNode;
    }
}