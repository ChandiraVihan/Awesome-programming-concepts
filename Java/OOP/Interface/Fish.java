public class Fish implements Prey, Predator{

        @Override
    public void flee(){
        System.out.println("The fish was hunterd by bigger fish");
    }

        @Override
    public void hunt(){
        System.out.println("Sharks are the hunter in the ocean");
    }
}