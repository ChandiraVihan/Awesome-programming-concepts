public class Singleton{

	private volatile static Singleton uniqueInstance;

	private Singleton(){}

	public static Singleton getInstance(){

	if (uniqueInstance == null){
	synchronized(Singleton.class){  //Double checked locking
	if (uniqueInstance == null){
	uniqueInstance = new Singleton();
	}
	}
	}
	return uniqueInstance;
	}
