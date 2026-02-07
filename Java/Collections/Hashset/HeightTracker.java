import java.util.HashSet;
import java.util.Set;

public class HeightTracker {

	 private Set<Double> uniqueHeights = new HashSet<>();
    
    // A HashSet is used to store only unique value

    public void addHeight(double height) {
    
    
        uniqueHeights.add(height);

        //
    }

    public void displayHeights() {
        System.out.println("Unique heights: " + uniqueHeights);
    }

  	 public static void main(String[] args) {

        //  Create an INSTANCE of HeightTracker to work with.
        HeightTracker tracker = new HeightTracker();

        System.out.println("Adding heights...");
        // Now, call the methods ON THE INSTANCE.
        tracker.addHeight(131.5);
        tracker.addHeight(132.5);
        tracker.addHeight(131.5); // This duplicate will be ignored by the HashSet.
        tracker.addHeight(140.0);

        // Display the final set of unique heights.
        tracker.displayHeights();
    }
}
