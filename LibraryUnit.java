package Librarytest;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Library {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    private boolean someLibraryMethod() {
        return false;
    }
}

