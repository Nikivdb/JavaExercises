package be.cegeka.hanoi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class HanoiTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void hanoiWith1Disk() {
        new Hanoi().solve(1);
        assertEquals("A -> C\n", outContent.toString().replaceAll("\r",""));
    }

    @Test
    public void hanoiWith2Disk() {
        new Hanoi().solve(2);
        assertEquals(
                "A -> B\n" +
                "A -> C\n" +
                "B -> C\n", outContent.toString().replaceAll("\r",""));
    }

    @Test
    public void hanoiWith3Disk() {
        new Hanoi().solve(3);
        assertEquals("A -> C\n" +
                "A -> B\n" +
                "C -> B\n" +
                "A -> C\n" +
                "B -> A\n" +
                "B -> C\n" +
                "A -> C\n", outContent.toString().replaceAll("\r",""));
    }

    @Test
    public void hanoiWith4Disk() {
        new Hanoi().solve(4);
        assertEquals("A -> B\n" +
                "A -> C\n" +
                "B -> C\n" +
                "A -> B\n" +
                "C -> A\n" +
                "C -> B\n" +
                "A -> B\n" +
                "A -> C\n" +
                "B -> C\n" +
                "B -> A\n" +
                "C -> A\n" +
                "B -> C\n" +
                "A -> B\n" +
                "A -> C\n" +
                "B -> C\n", outContent.toString().replaceAll("\r",""));
    }

    @Test
    public void hanoiWith5Disk() {
        new Hanoi().solve(5);
        assertEquals("A -> C\n" +
                "A -> B\n" +
                "C -> B\n" +
                "A -> C\n" +
                "B -> A\n" +
                "B -> C\n" +
                "A -> C\n" +
                "A -> B\n" +
                "C -> B\n" +
                "C -> A\n" +
                "B -> A\n" +
                "C -> B\n" +
                "A -> C\n" +
                "A -> B\n" +
                "C -> B\n" +
                "A -> C\n" +
                "B -> A\n" +
                "B -> C\n" +
                "A -> C\n" +
                "B -> A\n" +
                "C -> B\n" +
                "C -> A\n" +
                "B -> A\n" +
                "B -> C\n" +
                "A -> C\n" +
                "A -> B\n" +
                "C -> B\n" +
                "A -> C\n" +
                "B -> A\n" +
                "B -> C\n" +
                "A -> C\n", outContent.toString().replaceAll("\r",""));
    }
}