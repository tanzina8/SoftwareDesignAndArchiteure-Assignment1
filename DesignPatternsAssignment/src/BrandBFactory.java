public class BrandBFactory implements SmartDeviceFactory {
    @Override
    public SmartBulb createBulb() {
        BrandBBulb bulb = new BrandBBulb();
        bulb.setUsage(15);
        return bulb;
    }

    @Override
    public SmartLock createLock() {
        BrandBLock lock = new BrandBLock();
        lock.setUsage(80);
        return lock;
    }
}
