package com.notevault.notevault.repository;

import com.notevault.notevault.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
    // JPA repository gives crud operations automatically

}
