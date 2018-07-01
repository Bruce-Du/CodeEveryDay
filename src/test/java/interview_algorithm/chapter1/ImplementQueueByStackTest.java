package interview_algorithm.chapter1;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class ImplementQueueByStackTest extends TestCase {
    private ImplementQueueByStack object = null;

    @Before
    public void setUp(){
        object = new ImplementQueueByStack();
    }

    @Test
    public void testPush(){
        object.add(1);
        object.add(2);
        object.add(3);

        object.printContent();
    }

    @Test
    public void testPop(){
        object.add(5);
        object.add(6);
        object.add(8);

        assertEquals(object.poll(), 5);
        object.printContent();
    }

    @Test
    public void testPeek(){
        object.add(5);
        object.add(6);
        object.add(8);

        assertEquals(object.peek(), 5);
    }
}
