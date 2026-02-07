public class Yacht extends Vehicle{

    
    public String name;
    public String color;
    public int year;

    public Yacht() {
    }

    
    public Yacht(String name, String color, int year){
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