public class Card implements Comparable<Card>{
    private Type type;
    private Integer value;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Card(Type type, Integer value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public int compareTo(Card o) {
        if(this.value != o.value) return Integer.compare(o.value,this.value);
        else  return o.type.compareTo(this.type);
    }

    @Override
    public String toString() {
        return "Card{" +
                "type=" + type +
                ", value=" + value +
                '}';
    }


}
