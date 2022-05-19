package com.lune.todolist;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface NoteDao {

    @Insert
    void create(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);


}
