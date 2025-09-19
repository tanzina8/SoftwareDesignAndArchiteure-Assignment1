public class BrandBFactory implements SmartDeviceFactory {
    @Override
    public SmartBulb createBulb() {
        BrandBBulb bulb = new BrandBBulb();
        bulb.setUsage(15); // Simulated value
        return bulb;
    }

    @Override
    public SmartLock createLock() {
        BrandBLock lock = new BrandBLock();
        lock.setUsage(250); // Simulated value
        return lock;
    }
}
