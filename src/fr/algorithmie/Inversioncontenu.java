//exercice 2
package fr.algorithmie;

public class Inversioncontenu {

	public static void main(String[] args) {
//q1
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int [] arrayCopy = new int [array.length];
		for (int i = array.length-1;i>=0;i--);
		int j = array.length-1-i;
		arrayCopy[j]=array[i];
		
		
	}

}
