
import java.util.Scanner;

public class Squarelotron {
	/**
	 * Software Development Fundamentals edX class
	 * Module 2 Homework Assignment
	 * Author: James Peterson
	 * The Squarelotron
	 * 
	 * @param args
	 */
	
	int[][] squarelotron;
	int size;
	
	public Squarelotron(int n) {
		squarelotron = new int[n][n];
		size = n;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				squarelotron[i][j] = size*i + (j + 1);
			}
		}
	}
	
	public int numRings() {
		return (int) Math.ceil(this.size / 2.0);
	}
	
	
	
	public Squarelotron upsideDownFlip(int ring) {
		// Check to see if the ring value passed in is a valid value.
		boolean validRingValue = this.validateRingValue(ring);
		int temp;
		
		if (!validRingValue) {
			// if the ring value is invalid, then just return the original Squarelotron
			System.out.println("That ring value is invalid! Returning the original Squarelotron.");
			return this;
		}
		
		// Create a local copy of the class variable squarelotron
		Squarelotron localSq = new Squarelotron(this.size);
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				localSq.squarelotron[i][j] = this.squarelotron[i][j];
			}
		}
		
		// Perform the upsideDownFlip
		for (int i= ring - 1; i <= Math.floor((this.size - 1) / 2.0); i++) {
			for (int j = ring - 1; j <= (this.size - ring); j++) {
				if ((i == ring - 1) || (i == size - ring) || (j == ring - 1) || (j == size - ring)) {
					temp = localSq.squarelotron[i][j];
					localSq.squarelotron[i][j] = localSq.squarelotron[(size - 1) - i][j];
					localSq.squarelotron[(size - 1) - i][j] = temp;
				}
			}
		}
		
		//localSq.printMatrixSquarelotron();
		// Return the local copy
		return localSq;
	}
	
	public Squarelotron mainDiagonalFlip(int ring) {
		// Check to see if the ring value passed in is a valid value.
		boolean validRingValue = this.validateRingValue(ring);
		int temp;
		
		if (!validRingValue) {
			// if the ring value is invalid, then just return the original Squarelotron
			System.out.println("That ring value is invalid! Returning the original Squarelotron.");
			return this;
		}
		
		// Create a local copy of the class variable squarelotron
		Squarelotron localSq = new Squarelotron(this.size);
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				localSq.squarelotron[i][j] = this.squarelotron[i][j];
			}
		}
		
		// Perform the mainDiagonalFlip
		for (int i= ring - 1; i <= this.size - ring; i++) {
			for (int j = ring - 1; j <= i; j++) {
				if ((i != j) && (( j == ring - 1) || (i == this.size - ring))) {
					temp = localSq.squarelotron[i][j];
					localSq.squarelotron[i][j] = localSq.squarelotron[j][i];
					localSq.squarelotron[j][i] = temp;
				}
			}
		}
		
		
		// Return the local copy
		return localSq;
		
	}
	
	public void rotateRight(int numberOfTurns) {
		//System.out.println("Here in rotateRight!");
		int[][] temp = new int[this.size][this.size];
		int counter = 0;
		
		while (counter < Math.abs(numberOfTurns)) {
			for (int i = 0; i < this.size; i++) {
				for (int j = 0; j < this.size; j++) {
					if (numberOfTurns > 0) {
						temp[j][(this.size - 1) - i] = this.squarelotron[i][j];
					}
					else {
						temp[(this.size - 1) - j][i] = this.squarelotron[i][j];
					}
				}
			}
			
			for (int i = 0; i < this.size; i++) {
				for (int j = 0; j < this.size; j++) {
					this.squarelotron[i][j] = temp[i][j];
				}
			}
			
			counter++;
		}
	}
	
	
	public void printSquarelotron() {
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				System.out.println("(" + i + ", " + j + "): " + this.squarelotron[i][j]);
			}
		}
	}
	
	
	public void printMatrixSquarelotron() {
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				System.out.print(this.squarelotron[i][j] + "\t" + "|" + "\t");
			}
			System.out.println();
		}
	}
	
	private boolean validateRingValue(int ring) {
		boolean validValue = true;
		int numberOfPossibleRings = this.numRings();
		
		if ((ring < 1) || (ring > numberOfPossibleRings)) {
			validValue = false;
		}
		
		return validValue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new Squarelotron
		//Squarelotron sq = new Squarelotron(5);
		//Squarelotron sq = new Squarelotron(4);
		//Squarelotron sq = new Squarelotron(6);
		//Squarelotron sq = new Squarelotron(8);
		//Squarelotron sq = new Squarelotron(3);
		Squarelotron newSq;
		//Squarelotron sq = new Squarelotron(9);
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("What size Squarelotron would you like to create?  Please enter an integer between 0 and 9.");
		int specifiedSize = scn.nextInt();
		Squarelotron sq = new Squarelotron(specifiedSize);
		
		// Print out the squarelotron
//		for (int i = 0; i < sq.size; i++) {
//			for (int j = 0; j < sq.size; j++) {
//				System.out.println("(" + i + ", " + j + "): " + sq.squarelotron[i][j]);
//			}
//		}
		//sq.printSquarelotron();
		
		//System.out.println("The number of rings in this squarelotron is: " + sq.numRings());
		
//		// Just testing out some thoughts, not part of the actual program.
//		for (int i = 2; i <= 2; i++) {
//			for (int j = 2; j <= 2; j++) {
//				System.out.println("Here I am at i = " + i + " and j = " + j + ".");
//			}
//		}
		
//		newSq = sq.upsideDownFlip(1);
//		System.out.println();
//		newSq = sq.upsideDownFlip(2);
//		System.out.println();
//		newSq = sq.upsideDownFlip(3);
//		newSq = sq.upsideDownFlip(4);
//		newSq.printMatrixSquarelotron();
		
//		newSq = sq.mainDiagonalFlip(1);
//		newSq.printMatrixSquarelotron();
//		System.out.println();
//		newSq = sq.mainDiagonalFlip(2);
//		newSq.printMatrixSquarelotron();
//		System.out.println();
//		newSq = sq.mainDiagonalFlip(3);
//		newSq.printMatrixSquarelotron();
//		System.out.println();
//		newSq = sq.mainDiagonalFlip(4);
//		newSq.printMatrixSquarelotron();
		
		
//		sq.rotateRight(1);
//		sq.printMatrixSquarelotron();
//		System.out.println();
//		
//		sq.rotateRight(-1);
//		sq.printMatrixSquarelotron();
//		System.out.println();
//		
//		sq.rotateRight(-1);
//		sq.printMatrixSquarelotron();
//		System.out.println();
//		
//		sq.rotateRight(3);
//		sq.printMatrixSquarelotron();
//		System.out.println();
//		
//		sq.rotateRight(-4);
//		sq.printMatrixSquarelotron();
//		System.out.println();
//		
//		sq.rotateRight(2);
//		sq.printMatrixSquarelotron();
//		System.out.println();
		
		//char choice = 'a';
		int choice = 0;
		String message = "Please select a choice from the following menu:\n";
		/*
		message += "Enter u to select an upsideDownFlip operation.\n";
		message += "Enter d to select an mainDiagonalFlip operation.\n";
		message += "Enter r to select a rotateRight operation.\n";
		message += "Enter q to quit.\n";
		*/
		message += "Enter 1 to select an upsideDownFlip operation.\n";
		message += "Enter 2 to select an mainDiagonalFlip operation.\n";
		message += "Enter 3 to select a rotateRight operation.\n";
		message += "Enter -1 to quit.\n";
		String ringMessage = "Please enter an integer indicating the ring on which you would like to perform the operation.";
		String turnsMessage = "Please enter an integer indicating the number of rotations you would like to perform.";
		int ringsOrTurns;
		boolean exitLoop = false;
		//while (choice != 'q') {
		while (choice != -1) {
			System.out.println(message);
			/*
			//choice = (char) scn.nextByte();
			switch(choice) {
			case 'u':
			case 'U':
				System.out.println(ringMessage);
				ringsOrTurns = scn.nextInt();
				newSq = sq.upsideDownFlip(ringsOrTurns);
				newSq.printMatrixSquarelotron();
				break;
			case 'd':
			case 'D':
				System.out.println(ringMessage);
				ringsOrTurns = scn.nextInt();
				newSq = sq.mainDiagonalFlip(ringsOrTurns);
				newSq.printMatrixSquarelotron();
				break;
			case 'r':
			case 'R':
				System.out.println(turnsMessage);
				ringsOrTurns = scn.nextInt();
				sq.rotateRight(ringsOrTurns);
				sq.printMatrixSquarelotron();
				break;
			case 'q':
			case 'Q':
			default:
				exitLoop = true;
				//break;
			*/
			choice = scn.nextInt();
			switch(choice) {
				case 1:
					System.out.println(ringMessage);
					ringsOrTurns = scn.nextInt();
					newSq = sq.upsideDownFlip(ringsOrTurns);
					newSq.printMatrixSquarelotron();
					break;
				case 2:
					System.out.println(ringMessage);
					ringsOrTurns = scn.nextInt();
					newSq = sq.mainDiagonalFlip(ringsOrTurns);
					newSq.printMatrixSquarelotron();
					break;
				case 3:
					System.out.println(turnsMessage);
					ringsOrTurns = scn.nextInt();
					sq.rotateRight(ringsOrTurns);
					sq.printMatrixSquarelotron();
					break;
				case -1:
				default:
					exitLoop = true;
					//break;	
			}
			if (exitLoop) {
				break;
			}
					
		}
		scn.close();
		
	}

}
