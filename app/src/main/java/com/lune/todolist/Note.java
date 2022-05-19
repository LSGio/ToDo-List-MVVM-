package com.lune.todolist;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int mId;

    @ColumnInfo(name = "title")
    private String mTitle;

    @ColumnInfo(name = "content")
    private String mContent;

    @ColumnInfo(name = "priority")
    private int mPriority;

    public Note(String title, String content, int priority) {
        this.mTitle = mTitle;
        this.mContent = mContent;
        this.mPriority = mPriority;
    }

    public int getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getContent() {
        return mContent;
    }

    public int getPriority() {
        return mPriority;
    }

    public void setmId(int id) {
        this.mId = mId;
    }
}
