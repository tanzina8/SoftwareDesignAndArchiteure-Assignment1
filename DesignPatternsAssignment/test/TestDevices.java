 public class TestDevices {
    public static void main(String[] args) {
        SmartDeviceFactory factoryA = new BrandAFactory();
        SmartBulb bulbA = factoryA.createBulb();
        bulbA.showSpecs();

        SmartDeviceFactory factoryB = new BrandBFactory();
        SmartLock lockB = factoryB.createLock();
        lockB.showSpecs();
    }
}
