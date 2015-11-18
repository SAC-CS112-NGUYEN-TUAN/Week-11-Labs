
public class Dices {
		
	int Dices(int max) {
		
		int randomnum;
		randomnum = 0 + (int) (Math.random()*max);
		
		return randomnum;
	}
	
	int Throw(){
		int randomnum;
		randomnum = 0 + (int) (Math.random()*6);
		return randomnum;
		
	}
	
	int Value(){
		int Val = Throw();
		return Val;
		
	}
}
