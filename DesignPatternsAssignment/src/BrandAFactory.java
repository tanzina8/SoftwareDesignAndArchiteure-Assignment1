public class BrandAFactory implements SmartDeviceFactory {
    @Override
    public SmartBulb createBulb() {
        BrandABulb bulb = new BrandABulb();
        bulb.setUsage(10); // Simulated value (could be read from file)
        return bulb;
    }

    @Override
    public SmartLock createLock() {
        BrandALock lock = new BrandALock();
        lock.setUsage(200); // Simulated value (could be read from file)
        return lock;
    }
}
