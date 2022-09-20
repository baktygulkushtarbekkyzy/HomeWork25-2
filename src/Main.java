import java.util.*;

public class Main {
    public static void main(String[] args) {
        City city1=new City(123,"Bishkek");
        City city2=new City(456,"Talas");
        City city3=new City(789,"Naryn");
        City city4=new City(112,"Batken");
        City city5=new City(345,"Jalal-Abad");

        Map<Integer ,City>map=new HashMap<>();
        map.put(1,city1);
        map.put(2,city2);
        map.put(3,city3);
        map.put(4,city4);
        map.put(5,city5);

        Set<Integer> treeSet=new TreeSet<>(Comparator.reverseOrder());
        for (City city:map.values()) {
            if (city.getCode()%2!=0){
                treeSet.add(city.getCode());
            }else{
                System.out.println(city);
            }
        }
        System.out.println();
        for (Integer e:treeSet) {
            System.out.println("Kodu tak shaarlar: "+e);
        }

    }
}