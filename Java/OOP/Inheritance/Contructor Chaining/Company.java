public class Company{

    public static void main(String[] args) {
        Manager m = new Manager();
        AreaManager mm = new AreaManager();
    }
}

class Employee{

    public Employee(){
        System.out.println("Constructor Employee called");
    }
}



class Manager extends Employee{

    public Manager(){
        System.out.println("Then Manager!");
    }
}

class AreaManager extends Manager{

    public AreaManager(){
        System.out.println("Finally Area Manager!");
    }
}