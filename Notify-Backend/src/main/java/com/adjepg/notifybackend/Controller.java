package com.adjepg.notifybackend;

import com.adjepg.notifybackend.note.Note;
import com.adjepg.notifybackend.note.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/notes"})
public class Controller {
    @Autowired
    NoteService service;

    public List<Note> getListNote() {
        return service.getListNote();
    }
}
