package net.toregard.respository;


import org.junit.Test;

import java.util.LinkedList;
import static org.mockito.Mockito.*;

public class MockMohitoTest {

    @Test
    public void a(){
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

// stubbing appears before the actual execution
        when(mockedList.get(0)).thenReturn("first");

// the following prints "first"
        System.out.println(mockedList.get(0));

// the following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));
    }
}
