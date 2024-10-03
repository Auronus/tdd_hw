package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> phones = new HashMap<>();

    public int add(String phone, String name) {
        if (phones.get(phone) == null) {
            phones.put(phone, name);
            return 1;
        } else {
            return 0;
        }
    }

    public String findByNumber(String phone) {
        return phones.get(phone);
    }
}
