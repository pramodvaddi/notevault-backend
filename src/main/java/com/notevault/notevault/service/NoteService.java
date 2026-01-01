package com.notevault.notevault.service;

import com.notevault.notevault.entity.Note;

import java.util.List;

// This interface is for loose coupling
public interface NoteService {

    // Create a new note
    Note createNote(Note note);

    // Fetch all notes
    List<Note> getAllNotes();
}
