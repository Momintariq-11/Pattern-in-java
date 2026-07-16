//Task 8: Facade — Smart Home Controller
//You have separate subsystems: LightSystem, ThermostatSystem, SecuritySystem, each with multiple methods.
//Build a SmartHomeFacade with a single method leaveHome() that internally turns off lights, sets thermostat to eco mode, and arms security
//The client just calls facade.leaveHome() instead of managing three subsystems manually
class LightSystem{
    void off() {
        System.out.println("Lights off");
    }
}
class Doors{
    void lock(){
        System.out.println("Doors lock");
    }
}
class AC {
    void off(){
        System.out.println("AC off");
    }
}
class Securitysystem{
    void arm(){
        System.out.println("Securitysystem Armed");
    }
}
class ThermostatSystem{
    void eco(){
        System.out.println("Thermostat set to ECO");
    }
}
class SmartHomeFacade{
    LightSystem lightSystem = new LightSystem();
    Doors doors = new Doors();
    AC ac = new AC();
    Securitysystem securitysystem = new Securitysystem();
    ThermostatSystem thermostatSystem = new ThermostatSystem();
    public void leavehome(){
        lightSystem.off();
        doors.lock();
        ac.off();
        securitysystem.arm();
        thermostatSystem.eco();

    }
}
public class fasad {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();
        home.leavehome();
    }
}
