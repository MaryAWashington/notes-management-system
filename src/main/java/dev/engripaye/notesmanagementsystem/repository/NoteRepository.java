package dev.engripaye.notesmanagementsystem.repository;

import dev.engripaye.notesmanagementsystem.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    // FIND NOTE BY TITLE
    List<Note> findByTitleContainingIgnoreCase(String title);

    // FIND NOTES BY USER ID
    List<Note> findByUserId(Long userId);
}
