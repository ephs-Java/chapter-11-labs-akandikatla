package dice;

//This class simulates rolling a pair of dice 10,000 times and
//counts the number of times doubles of are rolled for each
//different pair of doubles.
public class DiceSimulation {
	public static void main(String[] args) {
		final int NUMBER = 10000; // the number of times to roll the dice
		
		// create 2 Dice objects, die1 and die2
	
		
		int count = 0; // number of times the dice were rolled
		int snakeEyes = 0; // number of times snake eyes is rolled
		int twos = 0; // number of times double two is rolled
		int threes = 0; // number of times double three is rolled
		int fours = 0; // number of times double four is rolled
		int fives = 0; // number of times double five is rolled
		int sixes = 0; // number of times double six is rolled

		// create 2 dice, roll them 10000 times, and keep track of the doubles.
		int c = 0;
		
		

		Dice d = new Dice();
		Dice d1 = new Dice();
		
		for(int y = 0; y<200000000;y++){
			d.roll();
			d1.roll();
			if(d.isEquals(d1)){
				
				if(d.spots==1){
					snakeEyes++;
				}
				if(d.spots==2){
					twos++;		
				}if(d.spots==3){
					threes++;
				}if(d.spots==4){
					fours++;
				}if(d.spots==5){
					fives++;
				}if(d.spots==6){
					sixes++;
				}
				c++;
			} 

		}
		System.out.println("Number of doubles "+c);

		// what method(s) do you need to write in the Dice class to make this work?
		
		//System.out.println(d.numDoubs(10000));
		
		//formatted output to be used after the 1000000000 rolls above.
		int co = 100000;
		System.out.println("You rolled snake eyes " + snakeEyes + " out of " + co + " rolls.");
		System.out.println("You rolled double twos " + twos + " out of " + co + " rolls.");
		System.out.println("You rolled double threes " + threes + " out of " + co + " rolls.");
		System.out.println("You rolled double fours " + fours + " out of " + co + " rolls.");
		System.out.println("You rolled double fives " + fives + " out of " + co + " rolls.");
		System.out.println("You rolled double sixes " + sixes + " out of " + co + " rolls.");
	}
}
