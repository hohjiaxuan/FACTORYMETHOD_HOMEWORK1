package org.example;

import com.google.gson.Gson;

public class JSONSerialize implements SerializeInterface{

    @Override
    public void perpareData(StudentInfo studentInfo) {
        Gson gson = new Gson();
        String json = gson.toJson(studentInfo);

        System.out.println("---------------JSON---------------");
        System.out.println(json);
    }
}
