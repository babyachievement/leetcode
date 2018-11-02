/**
 * date: 2018/11/2 9:54
 */

package com.babyachievement.top.interviews;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/flatten-nested-list-iterator/description/
 */
public class NestedIterator341 implements Iterator<Integer> {

    private LinkedList<NestedInteger> integerStack;
    private LinkedList<Integer>       indexStack;

    public NestedIterator341(List<NestedInteger> nestedList) {
        this.integerStack = new LinkedList<>();
        this.indexStack = new LinkedList<>();

        if (!nestedList.isEmpty()) {
            integerStack.addLast(new NestedInteger() {
                @Override
                public boolean isInteger() {
                    return false;
                }

                @Override
                public Integer getInteger() {
                    return null;
                }

                @Override
                public List<NestedInteger> getList() {
                    return nestedList;
                }
            });
            indexStack.addLast(0);
        }
    }

    @Override
    public Integer next() {
        Integer v = integerStack.pollLast().getInteger();
        indexStack.pollLast();
        return v;
    }

    @Override
    public boolean hasNext() {
        if (integerStack.isEmpty()) {
            return false;
        }

        if (integerStack.peekLast().isInteger())
            return true;

        findUntilNextInteger();

        return !integerStack.isEmpty();
    }

    private void findUntilNextInteger() {
        if (integerStack.isEmpty()) {
            return;
        }

        if (integerStack.peekLast().isInteger()) {
            return;
        }

        if (integerStack.peekLast().getList().size() <=
                indexStack.peekLast().intValue()) {
            integerStack.pollLast();
            indexStack.pollLast();
        } else {
            final Integer index     = indexStack.pollLast();
            final int     nextIndex = index.intValue() + 1;
            indexStack.addLast(nextIndex);

            integerStack.addLast(integerStack.peekLast()
                                             .getList()
                                             .get(index.intValue()));
            indexStack.addLast(0);
        }

        findUntilNextInteger();
    }

    Iterator<NestedInteger> it;
    NestedIterator341 lastIt;
    Integer cur;
    /*public NestedIterator341(List<NestedInteger> nestedList) {
        it = nestedList.iterator();
        cur = getNext();
    }*/

    public Integer getNext() {
        if (lastIt != null && lastIt.hasNext()) return lastIt.next();
        NestedInteger nt;
        if (it.hasNext()) nt = it.next();
        else return null;
        if (nt.isInteger()) return nt.getInteger();
        lastIt = new NestedIterator341(nt.getList());
        if (lastIt.hasNext()) return lastIt.next();
        else return getNext();
    }

    public Integer next2() {
        Integer tm = cur;
        cur = getNext();
        return tm;
    }

    public boolean hasNext2() {
        return cur != null;
    }

}