package com.example.recyclerview.Model;

public class Note {

    public String headLine;
    public String body;
    private boolean liked = false;

    public Note(String headLine, String body) {
        this.headLine = headLine;
        this.body = body;
    }

    public void toogledLike(){
        liked = !liked;
    }

    public boolean getLiked() {
        return liked;
    }
}
