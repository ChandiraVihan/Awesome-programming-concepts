public class Computer{
    private Processor processor;
    private Memory memory;
    private String brand;

    public Computer(String brand, String processorModel, int memorySize){
        this.brand=brand;
        processor = new Processor(processorModel);
        memory = new Memory(memorySize);
    }

    public void displayComputerDetails(){
        System.out.println("Computer Brand: " + brand);
        processor.displayProcessor();
        memory.displayMemory();
    }
}


