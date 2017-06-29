package model.json;


import java.util.Date;
import java.util.List;

public class Entry {
    int id;
    Date date;
    String subject;
    String content;
    List<Comment> comments;

    public int getId() {
        return id;
    }

    public Entry(String title) {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return subject;
    }

    public void setTitle(String title) {
        this.subject = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Entry() {

    }
}
