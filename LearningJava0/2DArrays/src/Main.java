
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] cars = {
				{"Ford","BMW","Ferrari"},
				{"Hammer","Bentley","GTR"},
				{"Toyota","Cardilac","Rollsroyce"}
		};
		
		//Using for loop to uotput the 2D array data
		System.out.println("The following are the best cars in Town");
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}

	}

}
