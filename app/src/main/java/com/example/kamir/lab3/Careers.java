package com.example.kamir.lab3;

/**
 * Created by kamir on 10/24/2017.
 */

public class Careers {
    //private variables
    int _cid;
    String _cname;

    public Careers(){}
    public Careers(int id, String name){
        this._cid = id;
        this._cname = name;
    }
    public Careers(String name){
        this._cname = name;
    }

    public int getCID() {
        return _cid;
    }

    public void setCID(int _cid) {
        this._cid = _cid;
    }

    public String getCName() {
        return _cname;
    }

    public void setCName(String _cname) {
        this._cname = _cname;
    }

}


