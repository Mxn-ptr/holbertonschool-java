import java.io.*;
import java.util.List;

public class SerializeStudents<T extends Serializable> {
    private String filename;

    public SerializeStudents(String filename) {
        this.filename = filename;
    }

    public void serialize(List<T> students) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))){
            objectOutputStream.writeObject(students);
        } catch (Exception e) {
            System.out.println("Unable to serialize");
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> deserialize() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<T>) objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println("Unable to deserialize");
            return List.of();
        }
    }
}
