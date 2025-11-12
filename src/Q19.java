interface ConnectTable{
    public void connectToWiFi(String networkName);

    public void disconnect();
}

abstract class SmartDevice{
    public void deviceName(){}

    public void status(){}

    public void showDeviceInfo(){}
}

class SmartLight implements ConnectTable{

    public void connectToWifi("bhv"){
        System.out.println("implementation of connect to Wifi");
    }
}

public class Q19 {
}
