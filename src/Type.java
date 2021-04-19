public class Type  implements Comparable<Type>{
   private String cardsuit;

    public Type(String cardsuit) {
        this.cardsuit = cardsuit;
    }

    @Override
    public String toString() {
        return "Type{" +
                "cardsuit='" + cardsuit + '\'' +
                '}';
    }

    public String getCardsuit() {
        return cardsuit;
    }

    public void setCardsuit(String cardsuit) {
        this.cardsuit = cardsuit;
    }

    @Override
    public int compareTo(Type o) {
        return this.cardsuit.compareTo(o.cardsuit);
    }
}
