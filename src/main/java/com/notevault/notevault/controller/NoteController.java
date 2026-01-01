package com.notevault.notevault.controller;

import com.notevault.notevault.entity.Note;
import com.notevault.notevault.service.NoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService){
        this.noteService = noteService;
    }

    // POST API to create a new note
    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody Note note){
        Note savedNote = noteService.createNote(note);
        return new ResponseEntity<>(savedNote, HttpStatus.CREATED);
    }

    // GET API to fetch all notes
    @GetMapping
    public ResponseEntity<List<Note>> getAllNotes() {
        // Fetch notes from service layer
        List<Note> notes = noteService.getAllNotes();

        return new ResponseEntity<>(notes, HttpStatus.OK);
    }



}
