//Task 1: Singleton — Config Manager
//Build a ConfigManager class that loads app settings (e.g. maxRetries, apiUrl) once and is accessible from anywhere without creating multiple instances.
//Enforce only one instance ever exists (private constructor, static access method)
//Prove it in your driver code: create two references to it and show both point to the same object (same hash code or use ==)
import java.util.Map;
import java.util.HashMap;
class ConfigManager {
    private static ConfigManager instance;
    private Map<String, String> settings;
    private ConfigManager() {
        this.settings = new HashMap<>(); // Allocation
        this.settings.put("Server_Address", "127.0.0.1");
        this.settings.put("Server_Port", "8080");
        this.settings.put("Client_Address", "127.0.0.8");
        this.settings.put("Client_Port", "0786");
        this.settings.put("SIGN_IN", "EMAIL ADDRESS");
        this.settings.put("MaxRetries", "10");
        this.settings.put("Url", "https:kolonx.com");
        this.settings.put("Change_Theme", "THEME CHANGE FROM BLACK WHITE AND ORANGE TO BLACK WHITE AND BLUE ");
        this.settings.put("Change_Email", "EMAIL ADDRESS");
        this.settings.put("Change_Password", "CHANGE PASSWORD");
        this.settings.put("Change_Username", "USERNAME");
        this.settings.put("Change_PhoneNumber", "PHONE NUMBER");
        this.settings.put("Erase_Data", "DELETE TOTAL DATA");
    }
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }
   public String getSetting(String key) {
        return this.settings.get(key);
   }
}
public class Main {
    public static void main(String[] args) {
        ConfigManager configManager1 = ConfigManager.getInstance();
        ConfigManager configManager2 = ConfigManager.getInstance();

        System.out.println("ConfigManager1 Hash Code: " + System.identityHashCode(configManager1));
        System.out.println("ConfigManager2 Hash Code: " + System.identityHashCode(configManager2));
        System.out.println("Are both references identical (==)? " + (configManager1 == configManager2));
        System.out.println("--- Settings Values ---");
        System.out.println("SERVER ADDRESS: " + configManager1.getSetting("Server_Address"));
        System.out.println("SERVER PORT: " + configManager1.getSetting("Server_Port"));
        System.out.println("CLIENT ADDRESS: " + configManager1.getSetting("Client_Address"));
        System.out.println("CLIENT PORT: " + configManager1.getSetting("Client_Port"));
        System.out.println("SIGN IN: " + configManager1.getSetting("SIGN_IN"));
        System.out.println("Max Retries: " + configManager1.getSetting("MaxRetries"));
        System.out.println("API URL: " + configManager1.getSetting("Url"));
        System.out.println("Theme Option: " + configManager1.getSetting("Change_Theme"));
        System.out.println("Email Address: " + configManager1.getSetting("Change_Email"));
        System.out.println("Password Option: " + configManager1.getSetting("Change_Password"));
        System.out.println("User NAME: " + configManager1.getSetting("Change_Username"));
        System.out.println("Phone Number Option: " + configManager1.getSetting("Change_PhoneNumber"));
        System.out.println("Erase Data: " + configManager1.getSetting("Erase_Data"));
    }
}
