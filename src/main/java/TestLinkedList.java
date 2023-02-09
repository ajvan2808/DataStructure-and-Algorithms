package src.main.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedList {
    private LinkedList linkedList;

    @Before
    public void SetUp() throws Exception {
        linkedList = new LinkedList();
    }

    @Test
    public void AddFront() throws Exception {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        Assert.assertEquals(3, linkedList.getFirst());
        Assert.assertEquals(1, linkedList.getLast());
    }

    @Test
    public void GetFirst() throws Exception {
        linkedList.addFront(3);
        linkedList.addFront(2);
        linkedList.addFront(1);

        Assert.assertEquals(1, linkedList.getFirst());
    }

    @Test
    public void GetLast() throws Exception {
        linkedList.addFront(1);
        linkedList.addFront(2);

        Assert.assertEquals(1, linkedList.getLast());
    }

    @Test
    public void AddBack() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        Assert.assertEquals(1, linkedList.getFirst());
        Assert.assertEquals(3, linkedList.getLast());
    }

    @Test
    public void sizeOfList() {
        linkedList.addFront(3);
        linkedList.addFront(2);
        linkedList.addFront(1);

        Assert.assertEquals(3, linkedList.size());
    }
}
