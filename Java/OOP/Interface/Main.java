public class Main{
	public static void main(String[] args){

		Deer deer = new Deer();
		Lion lion = new Lion();
		Fish fish = new Fish();

		deer.flee();
		lion.hunt();
		fish.flee();
		fish.hunt();
		
}
}