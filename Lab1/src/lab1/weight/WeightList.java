package lab1.weight;
import java.util.ArrayList;

public class WeightList {
	
	public static void weightList() {
		ArrayList<Double> weights = new ArrayList<Double>();
		weights.add((double) 100);
		weights.add((double) 60);
		weights.add((double) 55);
		
		for (int i = 0; i < weights.size(); i++) {
			System.out.printf("\n\n");
			System.out.printf("Your weight on Earth is: %.1f kg", (weights.get(i)));
			System.out.printf("\n");
			System.out.printf("Your weight on Mars is: %.1f kg", (weights.get(i) * 0.38));
		}
	}
	
}
