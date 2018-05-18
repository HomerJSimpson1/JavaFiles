public class SquarelotronOld {
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
       
       public Squarelotron upsideDownFlip(int ring) {              
              // Create a local copy of the class variable squarelotron
              Squarelotron localSq = new Squarelotron(this.size);
              for (int i = 0; i < this.size; i++) {
                     for (int j = 0; j < this.size; j++) {
                           localSq.squarelotron[i][j] = this.squarelotron[i][j];
                     }
              }
              
              // Perform the upsideDownFlip
              
              
              // Return the local copy
              return localSq;
       }
       
       public Squarelotron mainDiagonalFlip(int ring) {
              // Create a local copy of the class variable squarelotron
              Squarelotron localSq = new Squarelotron(this.size);
              for (int i = 0; i < this.size; i++) {
                     for (int j = 0; j < this.size; j++) {
                           localSq.squarelotron[i][j] = this.squarelotron[i][j];
                     }
              }
              
              // Perform the mainDiagonalFlip
              
              
              // Return the local copy
              return localSq;
              
       }
       
       public void rotateRight(int numberOfTurns) {
              
       }
       
       public static void main(String[] args) {
              // TODO Auto-generated method stub
              // Create a new Squarelotron
              Squarelotron sq = new Squarelotron(5);
              
              // Print out the squarelotron
              for (int i = 0; i < sq.size; i++) {
                     for (int j = 0; j < sq.size; j++) {
                           System.out.println("(" + i + ", " + j + "): " + sq.squarelotron[i][j]);
                     }
              }
       }

}
