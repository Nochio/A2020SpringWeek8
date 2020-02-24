package com.example.recyclerview.Storage;

import com.example.recyclerview.Model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteStorage {

    public static ArrayList<Note> list;

    static{
        list = new ArrayList<>();
        Note note = new Note("Note 1", "Body 1");
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
    }

    public static Note getNote(int index){
        return list.get(index);
    }

    public static int getLength(){
        return list.size();
    }
}
