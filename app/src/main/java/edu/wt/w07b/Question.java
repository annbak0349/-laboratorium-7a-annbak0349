package edu.wt.w07b;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

public class Question {
    public String name;
    public String summary;

   // @SerializedName("question_id")
   // public long id;

    @Override
    public String toString() {
        return(name);
    }

    public Question() {
    }

    public Question(String name, String link, long id) {
        this.setTitle(name);
        this.setLink(link);
    //    this.setId(id);
    }
/*
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
*/
    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public String getLink() {
        return summary;
    }

    public void setLink(String link) {
        this.summary = link;
    }
}
