
public class Main {

	public static void main(String[] args) {
	
	Dices roll = new Dices();
	Dices toss = new Dices();
	Dices currentdice = new Dices();
	
	//week 10
	int totalroll = (roll.Dices(6)+roll.Dices(12)+roll.Dices(18));
	System.out.println("3 dices roll : "+totalroll);
	
	//week 11
	toss.Throw();
	System.out.println(currentdice.Value());
	
	System.out.println(toss.Throw(2));
	
	
	}
	

}
