package interview_algorithm.chapter1;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Queue;

public class DogCatQueueTest extends TestCase {
    private DogCatQueue queue;
    @Before
    public void setUp(){
        queue = new DogCatQueue();
        Dog dog = new Dog();
        queue.add(dog);
        Cat cat = new Cat();
        queue.add(cat);
        Dog dog2 = new Dog();
        queue.add(dog2);
        Dog dog3 = new Dog();
        queue.add(dog3);
        Cat cat1 = new Cat();
        queue.add(cat1);
    }

    @Test
    public void testPollAll(){
        assertEquals("Dog",queue.pollAll().getPetType());
        assertEquals("Cat",queue.pollAll().getPetType());
    }

    @Test
    public void testPollCat(){
        assertEquals("Cat", queue.pollCat().getPetType());
        assertEquals("Cat", queue.pollCat().getPetType());
    }

    @Test
    public void testPollDog(){
        assertEquals("Dog", queue.pollDog().getPetType());
        assertEquals("Dog", queue.pollDog().getPetType());
        assertEquals("Dog", queue.pollDog().getPetType());
    }

    @Test
    public void testIsCatEmpty(){
        testPollCat();
        assertTrue(queue.isCatEmpty());
    }

    @Test
    public void testIsDogEmpty(){
        testPollDog();
        assertTrue(queue.isDogEmpty());
    }

    @Test
    public void testIsEmpty(){
        for(int i = 0; i < 5; i ++){
            queue.pollAll();
        }

        assertTrue(queue.isEmpty());
    }
}
