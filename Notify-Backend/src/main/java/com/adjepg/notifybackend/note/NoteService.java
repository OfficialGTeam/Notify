package com.adjepg.notifybackend.note;

import com.adjepg.notifybackend.note.Note;

import java.util.List;

public interface NoteService {
    List<Note> getListNote();
    Note getNote(int id);
    Note addNote(Note note);
    Note editNote(Note note);
    void deleteNote(int id);
}
