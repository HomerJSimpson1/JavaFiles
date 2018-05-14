import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquarelotronTest {
       Squarelotron sq;
       int n;
       Scanner scn;
       
       @BeforeEach
       void setUp() throws Exception {
              //n = scn.nextInt();
              n = 5;
              sq = new Squarelotron(n);
       }

       @Test
       void testSquarelotron() {
              //fail("Not yet implemented");
              scn = new Scanner(System.in);
              n = scn.nextInt();
              // This requires that the user input is the same value as the n declared above in setUp()
              assertEquals(n, sq.size);
              
              scn.close();
       }

       @Test
       void testUpsideDownFlip() {
              fail("Not yet implemented");
       }

       @Test
       void testMainDiagonalFlip() {
              fail("Not yet implemented");
       }

       @Test
       void testRotateRight() {
              fail("Not yet implemented");
       }

       @Test
       void testMain() {
              fail("Not yet implemented");
       }

}

