package com.example.soymilk.myapplication.models;

import com.example.soymilk.myapplication.models.User;

public class GameObject {

    public User userA = new User();
    public User userB = new User();
    public String passcode = "";

    public GameObject(String passcode) {
        this.passcode = passcode;
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }



    /* public boolean isEndedA() {
        return EndedA;
    }

    public boolean isEndedB() {
        return EndedB;
    }

    public String[] getA2bList() {
        return a2bList;
    }

    public String[] getaList() {
        return aList;
    }

    public String[] getB2aList() {
        return b2aList;
    }

    public String[] getbList() {
        return bList;
    } */

}
