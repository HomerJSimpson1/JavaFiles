import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquarelotronTest {
	Squarelotron sq = null;
	int n = 5;
	
	@BeforeEach
	void setUp() throws Exception {
		sq = new Squarelotron(n);
	}

	@Test
	void testSquarelotron() {
		//fail("Not yet implemented");
		
		// Test with hard-coded array rows
		int[] firstRow = {1, 2, 3, 4, 5};
		int[] secondRow = {6, 7, 8, 9, 10};
		int[] thirdRow = {11, 12, 13, 14, 15};
		int[] fourthRow = {16, 17, 18, 19, 20};
		int[] fifthRow = {21, 22, 23, 24, 25};
		
		assertTrue(Arrays.equals(firstRow, sq.squarelotron[0]));
		assertTrue(Arrays.equals(secondRow, sq.squarelotron[1]));
		assertTrue(Arrays.equals(thirdRow, sq.squarelotron[2]));
		assertTrue(Arrays.equals(fourthRow, sq.squarelotron[3]));
		assertTrue(Arrays.equals(fifthRow, sq.squarelotron[4]));
	}

	
	
	@Test
	void testUpsideDownFlip() {
		// NOTE: Sometimes the resultSq.size and testSq.size values are used interchangeably
		// While this might be confusing and should probably be corrected, they are always
		// going to be the same size by construction.
		
		//fail("Not yet implemented");
		Squarelotron testSq = null;
		Squarelotron resultSq = null;
		
		// i is the size of the Squarelotron
		for (int i = 1; i < 9; i++) {
			testSq = new Squarelotron(i);
			//System.out.println("The number of rings possible here is: " + testSq.numRings());
			// j is the ring size
			for (int j = 1; j <= testSq.numRings(); j++) {
				resultSq = testSq.upsideDownFlip(j);
				
				for (int k = j - 1; k < testSq.numRings(); k++) {
					for (int l = j - 1; l < testSq.size - j; l++) {
						// Don't need (k == resultSq.size - j) because k won't get to those values 
						if ((k == j - 1) || (l == j - 1) || (l == testSq.size - j)) {
							// Then this is the row where the whole row within the ring was flipped.
							assertTrue(resultSq.squarelotron[k][l] == testSq.squarelotron[testSq.size - 1 - k][l]);
						}
						else {
							assertTrue(resultSq.squarelotron[k][l] == testSq.squarelotron[k][l]);
						}
					}

				}
				
			}
		}
	}

	
	
	
	@Test
	void testMainDiagonalFlip() {
		//fail("Not yet implemented");
		
		Squarelotron testSq = null;
		Squarelotron resultSq = null;
		
		// i is the size of the Squarelotron
		for (int i = 1; i < 9; i++) {
			testSq = new Squarelotron(i);
			//System.out.println("The number of rings possible here is: " + testSq.numRings());
			// j is the ring size
			for (int j = 1; j <= testSq.numRings(); j++) {
				resultSq = testSq.mainDiagonalFlip(j);
				
				for (int k = j - 1; k <= testSq.size - j; k++) {
					for (int l = j - 1; l <= k; l++) {			
						if ((k != l) && ((l == j - 1) || (k == testSq.size - j))) {
							// Then this is the row where the whole row within the ring was flipped.
							assertTrue(resultSq.squarelotron[k][l] == testSq.squarelotron[l][k]);
						}
						else {
							assertTrue(resultSq.squarelotron[k][l] == testSq.squarelotron[k][l]);
						}
					}
				}
				
			}
		}
	}
	
	
	

	@Test
	void testRotateRight() {
		//fail("Not yet implemented");
		Squarelotron origSq = new Squarelotron(sq.size);
		
		// This doesn't rotate the squarelotron at all
		sq.rotateRight(0);
		for (int i = 0; i < sq.size; i++) {
			for (int j = 0; j < sq.size; j++) {
				assertEquals(sq.squarelotron[i][j], origSq.squarelotron[i][j]);
			}
		}
		
		// Rotate once to the right
		sq.rotateRight(1);
		for (int i = 0; i < sq.size; i++) {
			for (int j = 0; j < sq.size; j++) {
				assertEquals(sq.squarelotron[i][j], origSq.squarelotron[sq.size - 1 - j][i]);
			}
		}
		
		// Rotate once to the left
		// This returns sq to it's original configuration, since we rotated once to the right above.
		sq.rotateRight(-1);
		for (int i = 0; i < sq.size; i++) {
			for (int j = 0; j < sq.size; j++) {
				assertEquals(sq.squarelotron[i][j], origSq.squarelotron[i][j]);
			}
		}
		
		// Rotate once more to the left
		sq.rotateRight(-1);
		for (int i = 0; i < sq.size; i++) {
			for (int j = 0; j < sq.size; j++) {
				assertEquals(sq.squarelotron[i][j], origSq.squarelotron[j][sq.size - 1 - i]);
			}
		}
		
		// Rotate three more times to the left, which will return sq to its original configuration.
		sq.rotateRight(-3);
		for (int i = 0; i < sq.size; i++) {
			for (int j = 0; j < sq.size; j++) {
				assertEquals(sq.squarelotron[i][j], origSq.squarelotron[i][j]);
			}
		}
		
	}

	
	
//	@Test
//	void testMain() {
//		fail("Not yet implemented");
//	}

}
