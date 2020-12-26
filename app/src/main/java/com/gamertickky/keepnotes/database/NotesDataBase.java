package com.gamertickky.keepnotes.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.gamertickky.keepnotes.dao.NoteDao;
import com.gamertickky.keepnotes.entities.Note;

@Database(entities = Note.class,version = 1,exportSchema = false)
public abstract class NotesDataBase extends RoomDatabase {

    private static NotesDataBase notesDataBase;

    public static synchronized NotesDataBase getDataBase(Context context) {
        if (notesDataBase == null){
            notesDataBase = Room.databaseBuilder(
                    context,
                    NotesDataBase.class,
                    "notes_db"
            ).build();
        }
        return notesDataBase;
    }
    public abstract NoteDao noteDao();
}
