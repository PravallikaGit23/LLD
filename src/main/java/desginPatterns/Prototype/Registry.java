package desginPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    Map<String, Student> registry = new HashMap<>();

    public void register(String registryName, Student student){
        registry.put(registryName,student);
    }

    public Student getPrototype(String name){
        return registry.get(name);
    }

}
