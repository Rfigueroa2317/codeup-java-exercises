package Warmups;

import java.util.ArrayList;

public class CollectionsLecture {

    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>();

        stringArr.add("Ricardo");

        System.out.println(stringArr);
        System.out.printf("Current ArrayList size: %s", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        stringArr.add("Ricardo");
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr.get(0));
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        stringArr.remove(1);
        System.out.println(stringArr.hashCode());

    }
}
