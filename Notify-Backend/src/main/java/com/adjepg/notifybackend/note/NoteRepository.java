package com.adjepg.notifybackend.note;

import com.adjepg.notifybackend.note.Note;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface NoteRepository extends Repository<Note, Integer> {
    List<Note>findAll();
    Note findOne(int id);
    Note save(Note note);
    void delete(int id);
}
