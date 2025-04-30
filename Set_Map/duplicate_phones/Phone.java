import java.util.Objects;

public class Phone {
    private String areaCode;
    private String number;

    public Phone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return '(' + areaCode + ") " + number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj.getClass() != this.getClass())
            return false;
        Phone other = (Phone)obj;
        return this.areaCode.equals(other.areaCode) && this.number.equals(other.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.areaCode, this.number);
    }
}
