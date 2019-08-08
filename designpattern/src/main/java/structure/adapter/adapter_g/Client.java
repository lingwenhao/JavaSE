package structure.adapter.adapter_g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("list-element-1");
        list.add("list-element-2");
        list.add("list-element-3");
        CollectionUtils.list(list);
        System.out.println("-----------------------");
        Collection<String> set = new HashSet<>();
        set.add("set-element-1");
        set.add("set-element-2");
        set.add("set-element-3");
        CollectionUtils.list(set);
    }
}
