package com.babyachievement;

import org.babyachievement.algorithms.structure.UndirectedGraphNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph133 {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

        Map<Integer, UndirectedGraphNode> map = new HashMap();
        return cloneGraph(node, map);
    }

    UndirectedGraphNode cloneGraph(UndirectedGraphNode node, Map<Integer, UndirectedGraphNode> map){
        if(null==node){
            return null;
        }
        if(map.containsKey(node.label)) {
            return map.get(node.label);
        }

        UndirectedGraphNode newnode = new UndirectedGraphNode(node.label);
        map.put(node.label, newnode);
        List<UndirectedGraphNode> neighbors = node.neighbors;
        for(UndirectedGraphNode neighbor: neighbors) {
            if(neighbor==node) {
                newnode.neighbors.add(newnode);
            }else{
                newnode.neighbors.add(cloneGraph(neighbor, map));
            }
        }

        return newnode;
    }
}
