package interview_algorithm.chapter1;

import junit.framework.TestCase;
import org.junit.*;

public class GetMinStack1Test extends TestCase {
    private GetMinStack1 stack = null;

    @Before
    public void setUp(){
        stack = new GetMinStack1();
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
    public void testGetMin(){
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(8);
        assertEquals(stack.getmin(), 3);
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
}
