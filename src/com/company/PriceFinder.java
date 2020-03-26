package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

final class PriceFinder {
    private HashMap<MyKey, Integer> map = new HashMap<>();

    void addList(List<Integer> list) {
        List<String> months = new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");
        months.add("Jun");
        months.add("Jul");
        months.add("Aug");
        months.add("Sep");
        months.add("Oct");
        months.add("Nov");
        months.add("Dec");

        int prod = 1;
        int j = 0;

        for(int i = 0; i < list.size(); i++) {
            map.put(new MyKey(months.get(j), prod), list.get(i));
            if(months.get(j).equals("Dec")) {
                prod++;
                j = 0;
            } else {
                j++;
            }
        }
    }

    public int findPrice(String month, int prod) {
        System.out.println(map.get(new MyKey(month, prod)));
        return map.get(new MyKey(month, prod));
    }
}
