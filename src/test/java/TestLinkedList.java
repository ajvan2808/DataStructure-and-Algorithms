package src.test.java;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.main.java.LinkedList;

public class TestLinkedList {
    private LinkedList linkedList;

    @Before
    public void SetUp() throws Exception {
        linkedList = new LinkedList();
    }

    @After
    public void Reset() throws Exception {
        linkedList.clearList();
    }

    @Test
    public void AddFront() throws Exception {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);
        
        Assert.assertEquals(3, LinkedList.Size);
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
        Assert.assertEquals(0, LinkedList.Size);

        linkedList.addFront(3);
        linkedList.addFront(2);
        linkedList.addFront(1);

        Assert.assertEquals(3, LinkedList.Size);
    }

    @Test
    public void Clear() throws Exception {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        linkedList.clearList();
        
        Assert.assertEquals(null, LinkedList.head);
        Assert.assertEquals(0, LinkedList.Size);
    }

    @Test
    public void Delete() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.deleteNode(2);

        Assert.assertEquals(1, linkedList.getFirst());
        Assert.assertEquals(3, linkedList.getLast());
        Assert.assertEquals(2, linkedList.size());
    }
}
