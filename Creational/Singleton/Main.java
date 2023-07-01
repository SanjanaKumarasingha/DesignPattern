import java.util.HashMap;
import java.util.Map;

class ConfigManager {
    private Map<String, Object> settings = new HashMap<>();
    private static ConfigManager instance = new ConfigManager();

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        return instance;
    }

    public void set(String key, Object value){
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }
}

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Sanjana");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));        
    }
}
