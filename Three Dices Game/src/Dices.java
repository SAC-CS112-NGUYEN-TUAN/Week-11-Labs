
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
	
	double Throw(int bounces){
		double avg = 0.0;
		for ( int i = 0; i < bounces;i++){
		avg += 0 + (int) (Math.random()*6);
		}
		
		avg/= bounces;
		
		double computerNum = avg;
		return computerNum;
	}
		
	static int OneThrow(){
			int randomnum;
			randomnum = 0 + (int) (Math.random()*6);
			return randomnum;
						
	}
	
	int Throw(int dices, int bounces){
		int randomnum = 0;
		for ( int e = 0; e < dices;e++){
		
		for ( int i = 0; i < bounces;i++){
			 randomnum += 0 + (int) (Math.random()*6);
			}
		}
		return randomnum;
	}
}
