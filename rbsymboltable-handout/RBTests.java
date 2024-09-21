import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Vector;

public class RBTests {

    @Test
    public void testSingleInsert() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"10:black", null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }

    @Test
    public void testTwoInsertLeft() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"10:black", "5:red", null, null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);
        tree.insert(5,5);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }
    @Test
    public void testTwoInsertRight() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"10:black", null, "15:red", null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);
        tree.insert(15, 15);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }



    @Test
    public void testThreeInsertBalanced() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"10:black", "5:red", null, null, "15:red", null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);
        tree.insert(5,5);
        tree.insert(15, 15);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }

    @Test
    public void testThreeInsertLL() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"5:black", "2:red", null, null, "10:red", null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);
        tree.insert(5,5);
        tree.insert(2, 2);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }

    @Test
    public void testThreeInsertLR() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"5:black", "2:red", null, null, "10:red", null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);
        tree.insert(2, 2);
        tree.insert(5,5);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }

    @Test
    public void testThreeInsertRL() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"12:black", "10:red", null, null, "15:red", null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);
        tree.insert(15,15);
        tree.insert(12, 12);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }

    @Test
    public void testThreeInsertRR() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"12:black", "10:red", null, null, "15:red", null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);
        tree.insert(12, 12);
        tree.insert(15,15);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }

    @Test
    public void testFourInsertSplitA() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"10:black", "5:black", "2:red", null, null, null, "15:black", null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);
        tree.insert(5,5);
        tree.insert(15, 15);
        tree.insert(2, 2);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }

    @Test
    public void testFourInsertSplitB() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"10:black", "5:black", null, "8:red", null, null, "15:black", null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);
        tree.insert(5,5);
        tree.insert(15, 15);
        tree.insert(8, 8);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }

    @Test
    public void testFourInsertSplitC() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"10:black", "5:black", null, null, "15:black", "12:red", null, null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);
        tree.insert(5,5);
        tree.insert(15, 15);
        tree.insert(12, 12);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }

    @Test
    public void testFourInsertSplitD() {
        RBSymbolTable<Integer, Integer> tree = new RBSymbolTable<Integer, Integer>();
        String[] soln = new String[]{"10:black", "5:black", null, null, "15:black", null, "18:red", null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert(10, 10);
        tree.insert(5,5);
        tree.insert(15, 15);
        tree.insert(18, 18);

        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }

    @Test
    public void testSlideExample() {
        RBSymbolTable<String, String> tree = new RBSymbolTable<String, String>();
        String[] soln = new String[]{"E:black", "C:black", "A:black", null, "B:red", null, null, "D:black", null, null,
                "R:black", "I:black", null, "N:red", null, null, "S:black", null, "X:red", null, null};
        Vector<String> solnVector = new Vector<String>(Arrays.asList(soln));

        tree.insert("A", "A");
        tree.insert("S","S");
        tree.insert("E", "E");
        tree.insert("R", "R");
        tree.insert("C", "C");
        tree.insert("D", "D");
        tree.insert("I", "I");
        tree.insert("N", "N");
        tree.insert("B", "B");
        tree.insert("X", "X");
        Vector<String> st = tree.serialize();
        assertEquals(solnVector, st);
    }
}


