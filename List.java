import java.util.*;

public class List {
    public static void main ( String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Set<String> listSet = new HashSet<>();
        HashSet<String> listHashSet = new HashSet<>();
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        //Помещаем данный в карточку
        hashMap.put("Vaska", 0);

        //Получаем набор элементов
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

        //Отобразим набор
        for (Map.Entry<String, Integer> me : set) {
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }



        list.add("Hello");
        System.out.println(list);

        listSet.add("Privet");
        System.out.println(listSet);

        listHashSet.add("Czesc");
        System.out.println(listHashSet);



    }
}
