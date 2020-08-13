package com.example.ucboyutlucanavar.ImportantStuff.Adapter;

import java.io.Serializable;

public class Picture implements Serializable {
    private String picture;

    public Picture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
