inferface Light{        
	void turnOn(); 
	} // interface for light products

interface SecurityCamera{
	void startRecording();
	}// interface for camera products

//abstract factory
interface SmartDevicefactory{
	//factory methods
	Light createLight();
	SecurityCamera createSecurityCamera();
	}

//concrete products
class BrandALight implements Light{
	@Override 
    public void turnOn(){
    System.out.println("BrandA light is turned on");
    }

class BrandASecurityCamera implements SecurityCamera{
	@Override 
    public void startRecording(){
    System.out.println("BrandA Securit camera is now recording")
    }

class BrandBLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("BrandB light is turned on.");
    }
}

class BrandBSecurityCamera implements SecurityCamera {
    @Override
    public void startRecording() {
        System.out.println("BrandB security camera is now recording.");
    }
}


//concrete factories
// Concrete Factory for BrandA
class BrandAFactory implements SmartDeviceFactory {
    @Override
    public Light createLight() {
        return new BrandALight();
    }

    @Override
    public SecurityCamera createSecurityCamera() {
        return new BrandASecurityCamera();
    }
}

// Concrete Factory for BrandB
class BrandBFactory implements SmartDeviceFactory {
    @Override
    public Light createLight() {
        return new BrandBLight();
    }

    @Override
    public SecurityCamera createSecurityCamera() {
        return new BrandBSecurityCamera();
    }
}








public class SmartHomeController {

 public static void main(String[] args) {

 // Create factory objects for BrandA and BrandB
 SmartDeviceFactory brandAFactory = new BrandAFactory();
 SmartDeviceFactory brandBFactory = new BrandBFactory();

 // Create devices for BrandA
 Light brandALight = brandAFactory.createLight();
 SecurityCamera brandACamera = brandAFactory.createSecurityCamera();

 // Create devices for BrandB
 Light brandBLight = brandBFactory.createLight();
 SecurityCamera brandBCamera = brandBFactory.createSecurityCamera();

 // Operate BrandA devices
 brandALight.turnOn();
 brandACamera.startRecording();

 // Operate BrandB devices
 brandBLight.turnOn();
 brandBCamera.startRecording();
 }
}


