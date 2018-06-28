package interview_algorithm.chapter1;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class GetMinStack2Test extends TestCase {
    private GetMinStack2 stack;

    @Before
    public void setUp(){
        stack = new GetMinStack2();
    }

    @Test
    public void testPush(){
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(8);

        stack.printContent();
    }

    @Test
    public void testPop(){
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(8);
        stack.printContent();

        stack.pop();
        stack.printContent();

        stack.pop();
        stack.printContent();
    }

    @Test
    public void testGetMin(){
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(8);
        assertEquals(stack.getmin(), 3);
    }
}
