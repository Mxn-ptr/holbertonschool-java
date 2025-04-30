import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneList {
    private HashMap<String, HashSet<Phone>> list;

    public PhoneList() {
        this.list = new HashMap<>();
    }

    public HashMap<String, HashSet<Phone>> getList() {
        return list;
    }

    public HashSet<Phone> addPhone(String name, Phone phone) {
        for (String otherName : this.list.keySet()) {
            HashSet<Phone> phones = list.get(otherName);
            if (phones != null && phones.contains(phone)) {
                if (otherName.equals(name)) {
                    throw new RuntimeException("Phone already exists for this person");
                } else {
                    throw new RuntimeException("Phone already belongs to another person");
                }
            }
        }
        this.list.putIfAbsent(name, new HashSet<>());
        list.get(name).add(phone);
        return list.get(name);
    }

    public HashSet<Phone> isFind(String name) {
        return this.list.get(name);
    }
}
