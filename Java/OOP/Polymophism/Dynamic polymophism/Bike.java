public class Bike extends Vehicle{


    public String name;
    public String color;
    public int year;

    public Bike() {
    }

    
    public Bike(String name, String color, int year){
        this.name = name;
        this.color = color;
        this.year = year;

    }

    public void info(){
        System.out.println();
        System.out.println(name);
        System.out.println(color);
        System.out.println(year);
    }
}
