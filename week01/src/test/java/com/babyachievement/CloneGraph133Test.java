package com.babyachievement;

import org.babyachievement.algorithms.structure.UndirectedGraphNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CloneGraph133Test {

    @Test
    public void cloneGraph() {
        UndirectedGraphNode zero = new UndirectedGraphNode(0);
        UndirectedGraphNode one = new UndirectedGraphNode(1);
        UndirectedGraphNode two = new UndirectedGraphNode(2);

        zero.neighbors.add(one);
        zero.neighbors.add(two);

        one.neighbors.add(two);
        two.neighbors.add(two);

        CloneGraph133 cloneGraph133 = new CloneGraph133();
        UndirectedGraphNode graph = cloneGraph133.cloneGraph(zero);
        assertThat(graph.label, is(0));
        assertThat(graph.neighbors.size(), is(2));
        assertThat(graph.neighbors.get(1).label, is(2));

    }
}