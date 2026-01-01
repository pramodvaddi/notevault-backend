package com.notevault.notevault.service.impl;

import com.notevault.notevault.entity.Note;
import com.notevault.notevault.repository.NoteRepository;
import com.notevault.notevault.service.NoteService;
import org.springframework.stereotype.Service;

import java.util.List;

// Marks this class as service layer
@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    // Constructor Injection
    public NoteServiceImpl(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }
}
