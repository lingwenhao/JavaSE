package structure.adapter.adapter_g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        PropertiesUtils.list(list);
        Collection<String> set = new HashSet<>();
        PropertiesUtils.list(set);
    }
}
