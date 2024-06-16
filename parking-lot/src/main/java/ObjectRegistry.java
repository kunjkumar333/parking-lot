import java.util.HashMap;
import java.util.Map;

/*this we created to store objects and give objects, if wwe were using spring boot then it is not required bcz spring boot handles these things internallu*/
public class ObjectRegistry {
    private Map<String, Object> objects = new HashMap<>();

    public void register(String name, Object obj){
        objects.put(name,obj);
    }

    public Object get(String name){
        return objects.get(name);
    }
}
