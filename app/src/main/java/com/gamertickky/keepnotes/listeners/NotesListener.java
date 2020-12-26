package com.gamertickky.keepnotes.listeners;

import com.gamertickky.keepnotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
