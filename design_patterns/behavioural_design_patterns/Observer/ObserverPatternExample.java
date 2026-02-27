package design_patterns.behavioural_design_patterns.Observer;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(float temperature);
}

// Subject Interface
interface Subject {
    void attach(Observer obs);

    void detach(Observer obs);

    void notifyObservers();
}

// Weather Station
class WeatherStation implements Subject {
    private float temperature;
    private List<Observer> observerList;

    WeatherStation() {
        observerList = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observerList) {
            obs.update(temperature); // runtime polymorphism
        }
    }
}

class DisplayDevice implements Observer {
    private String name;

    public DisplayDevice(String deviceName) {
        this.name = deviceName;
    }

    @Override
    public void update(float temperature) {
        System.out.println("Temperature on device: " + temperature);
    }
}

class MobileDevice implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Temperature on mobile: " + temperature);
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer device = new DisplayDevice("chi_device_osafi");
        Observer mobile = new MobileDevice();

        weatherStation.attach(device);
        weatherStation.attach(mobile);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(27);
        weatherStation.setTemperature(30);
    }
}
