import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneList {
    private HashMap<String, ArrayList<Phone>> list;

    public PhoneList() {
        this.list = new HashMap<>();
    }

    public HashMap<String, ArrayList<Phone>> getList() {
        return list;
    }

    public void addPhone(String name, Phone phone) {
        if (this.list.containsKey(name)) {
            ArrayList<Phone> listPhone = this.list.get(name);
            listPhone.add(phone);
        } else {
            this.list.put(name, new ArrayList<>(Arrays.asList(phone)));
        }
    }

    public ArrayList<Phone> isFind(String name) {
        return this.list.get(name);
    }
}
