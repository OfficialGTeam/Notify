package com.adjepg.notifybackend.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImp implements NoteService{
    @Autowired
    private NoteRepository repository;

    @Override
    public List<Note> getListNote() {
        return repository.findAll();
    }

    @Override
    public Note getNote(int id) {
        return repository.findOne(id);
    }

    @Override
    public Note addNote(Note note) {
        return repository.save(note);
    }

    @Override
    public Note editNote(Note note) {
        return null;
    }

    @Override
    public void deleteNote(int id) {
        repository.delete(id);
    }
}
