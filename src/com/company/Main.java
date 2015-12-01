package com.company;

import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject("{p:3}");

        System.out.println(jsonObject.get("p"));
    }
}
