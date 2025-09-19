UML Diagram:
<img width="1492" height="988" alt="image" src="https://github.com/user-attachments/assets/cc28623f-3b71-4734-a9a6-9db981b596bb" />

Structure of Repository:
There are two folders in the DesignPatternsAssignment; src and test file

In the src folder are all the source code files.
- **src/**  
  - `SmartDevice.java` – Abstract base class for all smart devices.  
  - `SmartBulb.java` – Abstract class for bulbs.  
  - `SmartLock.java` – Abstract class for locks.  
  - `SmartDeviceFactory.java` – Interface for both factories creating bulbs and locks.  
  - `BrandAFactory.java` – Creates Brand A bulbs and locks.  
  - `BrandBFactory.java` – Creates Brand B bulbs and locks.  
  - `BrandABulb.java` – Brand A bulb implements its power value.  
  - `BrandALock.java` – Brand A lock implements its battery value.  
  - `BrandBBulb.java` – Brand B bulb implements its power value.  
  - `BrandBLock.java` – Brand B lock implements its battery value.  

- **test/**  
  - `TestDevices.java` – Test case that was used to test creating a Brand A bulb and a Brand B lock and prints their usage values.


Test Driver and Test Methods: 
The test driver `TestDevices.java` shows how the Factory Method patterns are applied to create these smart devices.
The test methods inside the `main` function are: and the 
1. factoryA.createBulb() - Checks if `BrandAFactory` correctly creates a smart bulb that is of Brand A.
2. bublA.showSpecs() - Verifies that the smart bulb of Brand A is created and that the specs are showing. 
3. factoryB.createLock() - Checks if `BrandBFactor=y` correctly creates a Brand B smart lock. 
4. lockB.showSpecs() - Verifies that the smart lcok of Brand B is created and that the specs are showing./ 

Execution of Test Driver:
<img width="2540" height="466" alt="image" src="https://github.com/user-attachments/assets/21d6c44b-9599-4e81-8892-f8241780ac53" />
