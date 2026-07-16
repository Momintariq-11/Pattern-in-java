//Task 7: Power Plug Adapter
//You have a USPlug class that only has a method connectToUSSocket(). It works fine, but only for US style sockets.
//Your new system expects everything to work with a Plug interface that has a single method plugIn().

//What to build
//USPlug class with method connectToUSSocket() that just prints something like "Connected to US socket"
//Plug interface with method plugIn()
//PlugAdapter class that implements Plug, but internally holds a USPlug object and calls its connectToUSSocket() method when plugIn() is called
//A driver main method that creates a USPlug, wraps it in a PlugAdapter, and calls plugIn() on it
//
//The point to notice
//Your driver code should only ever call plugIn(). It should never call connectToUSSocket() directly. That's the whole trick, one interface method quietly forwards to a completely different method name underneath.
//
//Bonus
//Add a second class EUPlug with a method called insertIntoEUSocket() (different name, on purpose) and build a second adapter for it, EUPlugAdapter, so both US and EU plugs can be used through the same Plug interface.

interface plug{
    void plugin();
}
class USPlug {
    public void connectToUSSocket(){
        System.out.println("Connected to USSocket");
    }
}
//bonus class
class EUPlug {
    public void connectToEUSocket(){
        System.out.println("Connected to EUSocket");
    }
}
class USPlugAdapter implements plug {
    USPlug usPlug;
    public USPlugAdapter(USPlug usPlugDevice) {
        this.usPlug = usPlugDevice;
    }
    public void plugin() {
    usPlug.connectToUSSocket();}
}
class EUPlugAdapter implements plug {
    EUPlug euPlug;
    public EUPlugAdapter (EUPlug euPlugDevice) {
        this.euPlug = euPlugDevice;
    }
    public void plugin() {
        euPlug.connectToEUSocket();
    }

}
public class adapter {
    public static void main(String[] args) {
        USPlug rawusPlug = new USPlug();
        plug usAdapter  = new USPlugAdapter(rawusPlug);
        usAdapter.plugin();
        EUPlug raweuPlug = new EUPlug();
       plug euAdapter = new EUPlugAdapter(raweuPlug);
euAdapter.plugin();
    }
}
