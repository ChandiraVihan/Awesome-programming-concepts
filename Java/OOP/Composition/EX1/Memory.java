public class Memory{
    private int sizeGB;

    public Memory(int sizeGB){
        this.sizeGB = sizeGB;
    }

    public void displayMemory(){
        System.out.println("Memory size: " + sizeGB + "GB");
    }
}