class Professor {
    private String name;
    private String subject;
    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void display() {
        System.out.println("  Professor Name: " + name + ", Subject: " + subject);
    }
}

public class University {
	private String name;
	private Professor[] professors; //not created in the whole because of the weal relationship


	public University(String name, Professor[] professors){
		this.name = name;
		this.professors = professors;
		}

    public void displayDetails() {
        System.out.println("University: " + name);
        System.out.println("Professors:");
        for (Professor p : professors) {
            p.display();
        }
    }
}

