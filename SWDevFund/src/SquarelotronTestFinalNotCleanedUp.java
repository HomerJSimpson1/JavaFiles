import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
//import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquarelotronTest {
	Squarelotron sq = null;
	int n = 5;
	//Scanner scn;
	
	@BeforeEach
	void setUp() throws Exception {
		//n = scn.nextInt();
		//n = 5;
		sq = new Squarelotron(n);
	}

	@Test
	void testSquarelotron() {
		//fail("Not yet implemented");
		// scn = new Scanner(System.in);
		// n = scn.nextInt();
		// // This requires that the user input is the same value as the n declared above in setUp()
		// assertEquals(n, sq.size);
		
		// Test with hard-coded array rows
		int[] firstRow = {1, 2, 3, 4, 5};
		int[] secondRow = {6, 7, 8, 9, 10};
		int[] thirdRow = {11, 12, 13, 14, 15};
		int[] fourthRow = {16, 17, 18, 19, 20};
		int[] fifthRow = {21, 22, 23, 24, 25};
		
		//sq.printSquarelotron();
		
		// The following prints out the addresses, not the arrays.
		//System.out.println(sq.squarelotron[0]);
		//System.out.println(firstRow);
		
		// Can't use regular equality for arrays!
		// assertEquals(sq.squarelotron[0], firstRow);
		assertTrue(Arrays.equals(firstRow, sq.squarelotron[0]));
		assertTrue(Arrays.equals(secondRow, sq.squarelotron[1]));
		assertTrue(Arrays.equals(thirdRow, sq.squarelotron[2]));
		assertTrue(Arrays.equals(fourthRow, sq.squarelotron[3]));
		assertTrue(Arrays.equals(fifthRow, sq.squarelotron[4]));

		//assertEquals(sq.squarelotron[1], {1, 2, 3, 4, 5 });
		//assertTrue()0
		
		// scn.close();
	}

	
	@Test
	void testUpsideDownFlip() {
		// NOTE: Sometimes the resultSq.size and testSq.size values are used interchangeably
		// While this might be confusing and should probably be corrected, they are always
		// going to be the same size by construction.
		
		//fail("Not yet implemented");
		Squarelotron testSq = null;
		Squarelotron resultSq = null;
		//int[] newArr1, newArr2;
		
		// i is the size of the Squarelotron
		for (int i = 1; i < 9; i++) {
			//System.out.println(i);
			testSq = new Squarelotron(i);
			//System.out.println("The number of rings possible here is: " + testSq.numRings());
			// j is the ring size
			for (int j = 1; j <= testSq.numRings(); j++) {
				//System.out.println("i = " + i + " and j = " + j);
				resultSq = testSq.upsideDownFlip(j);
				//resultSq.printMatrixSquarelotron();
				//testSq.printMatrixSquarelotron();
	
/*
				if (j == 1) {
					assertTrue(Arrays.equals(resultSq.squarelotron[0], testSq.squarelotron[testSq.size - 1]));
					assertTrue(Arrays.equals(resultSq.squarelotron[resultSq.size - 1], testSq.squarelotron[0]));
					// Test that the "inner elements" of the other rows are unchanged
					//for (int k = j; k <= Math.floor((resultSq.size - 1) / 2.0); k++) {
					for (int k = j; k <= resultSq.numRings(); k++) {
						newArr1 = Arrays.copyOfRange(resultSq.squarelotron[k], j, resultSq.size - 2);
						newArr2 = Arrays.copyOfRange(testSq.squarelotron[k], j, resultSq.size - 2);
						assertTrue(Arrays.equals(newArr1, newArr2));
					}
				}
				if (j == 2) {
					//assertTrue(Arrays.equals(resultSq.squarelotron, a2))
				}
*/
				
/*				
				for (int k = j - 1; k < j; k++) {
					if ((k == j - 1) || ()) {
						// Then this is the row where the whole row within the ring was flipped.
						newArr1 = Arrays.copyOfRange(resultSq.squarelotron[k], k, resultSq.size - j);
						newArr2 = Arrays.copyOfRange(testSq.squarelotron[size - j], k, resultSq.size - j);
						assertTrue(Arrays.equals(newArr1, newArr2));
					}
					else {
						newArr1 = Arrays.copyOfRange(resultSq.squarelotron[k], k, resultSq.size - j);
						newArr2 = Arrays.copyOfRange(testSq.squarelotron[k], k, resultSq.size - j);
						assertTrue(Arrays.equals(newArr1, newArr2));
					}

				}
*/
				
				
				for (int k = j - 1; k < testSq.numRings(); k++) {
					for (int l = j - 1; l < testSq.size - j; l++) {
						// Don't need (k == resultSq.size - j) because k won't get to those values 
						if ((k == j - 1) || (l == j - 1) || (l == testSq.size - j)) {
							// Then this is the row where the whole row within the ring was flipped.
							assertTrue(resultSq.squarelotron[k][l] == testSq.squarelotron[testSq.size - 1 - k][l]);
//							newArr1 = Arrays.copyOfRange(resultSq.squarelotron[k], k, resultSq.size - j);
//							newArr2 = Arrays.copyOfRange(testSq.squarelotron[testSq.size - j], k, testSq.size - j);
//							assertTrue(Arrays.equals(newArr1, newArr2));
						}
						else {
							assertTrue(resultSq.squarelotron[k][l] == testSq.squarelotron[k][l]);
//							newArr1 = Arrays.copyOfRange(resultSq.squarelotron[k], k, resultSq.size - j);
//							newArr2 = Arrays.copyOfRange(testSq.squarelotron[k], k, testSq.size - j);
//							assertTrue(Arrays.equals(newArr1, newArr2));
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
		//int[] newArr1, newArr2;
		
		// i is the size of the Squarelotron
		for (int i = 1; i < 9; i++) {
			//System.out.println(i);
			testSq = new Squarelotron(i);
			//System.out.println("The number of rings possible here is: " + testSq.numRings());
			// j is the ring size
			for (int j = 1; j <= testSq.numRings(); j++) {
				//System.out.println("i = " + i + " and j = " + j);
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

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

}
