import java.util.*;

public class Magic {
    private static ArrayList<Card> getCards(){
        ArrayList<Card> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cards \n Ace = 1 , jack = 11, Queen = 12, King = 13 \n Club = C, " +
                "Dimond = D, Herts = H, Spade = S\n For ex- for Ace of Heart  = 1 H \n");
        for (int i = 1; i < 5; i++) {

            System.out.println("Enter The "+ i + " Card");
            Integer number = sc.nextInt();
            String suit= sc.next();
            list.add(new Card(new Type(suit.toUpperCase(Locale.ROOT)),number));
        }
        return list;
    }
    private static String getSequence(ArrayList<Card> list){
        ArrayList<Card> temp = new ArrayList(list);
        temp.remove(0);
        temp.sort(Card::compareTo);
        int pos1 = temp.indexOf(list.get(1));
        int pos2 = temp.indexOf(list.get(2));
        int pos3 = temp.indexOf(list.get(3));
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"L");
        map.put(1,"M");
        map.put(2,"S");
        return map.get(pos1)+map.get(pos2)+map.get(pos3);
    }

    public static void main(String[] args) {
        ArrayList<Card> cardlist = getCards();
        System.out.println(cardlist);
        Map<String,Integer> map = new HashMap<>();
        String seq = getSequence(cardlist);
        map.put("LMS",1);
        map.put("LSM",2);
        map.put("MLS",3);
        map.put("MSL",4);
        map.put("SLM",5);
        map.put("SML",6);
        String sequence = getSequence(cardlist);
        System.out.println(sequence);
        Integer Toadd = map.get(sequence);
        System.out.println();
        Type magicCardType = new Type(cardlist.get(0).getType().getCardsuit());

        Card magicCard = new Card(magicCardType,(cardlist.get(0).getValue()+Toadd)%13);
        System.out.println( magicCard.toString());
    }
}
