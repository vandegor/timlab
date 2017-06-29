package rs;

import model.json.Comment;
import model.json.Entry;
import model.json.Test;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("blog/entry")
public class BlogService {

    @GET
    @Path("/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Test test(@PathParam("a") String a, @PathParam("b") String b) {
        Test test = new Test ();
        test.setA (a);
        test.setB (b);

        return test;

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void postEntry(Entry entry) {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    // – zwraca wszystkie wpisy
    public List<Entry> getEntries() {
        return new ArrayList<Entry> (Arrays.asList (new Entry ()));
    }

    @GET
    @Path("/{entryId}")
    @Produces(MediaType.APPLICATION_JSON)
    ///{id} – zwraca wpis o podanym id
    public Entry getEntry(@PathParam("entryId") String entryId) {
        return new Entry ();
    }

    @PUT
    @Path("/{entryId}")
    @Consumes(MediaType.APPLICATION_JSON)
    ///{id} – modyfikuje wpis o podanym id
    public void putEntry(@PathParam("entryId") String entryId, Entry entry) {
    }

    @DELETE
    @Path("/{entryId}")
    ///{id} – usuwa wpis o podanym id
    public boolean deleteEntry(@PathParam("entryId") String entryId) {
        return true;
    }

    @DELETE
    // – usuwa wszystkie wpisy
    public boolean deleteEntries() {
        return true;
    }

    @PUT
    @Path("/{entryId}/comment")
    @Consumes(MediaType.APPLICATION_JSON)
    ///{id}/comment – dodaje komentarz do wpisu
    public void putEntryComment(@PathParam("entryId") String entryId, Comment comment) {
    }

    @GET
    @Path("/{entryId}/comment")
    @Produces(MediaType.APPLICATION_JSON)
    ///{id}/comment – wyświetla komentarze do wpisu
    public List<Comment> getEntryComments(@PathParam("entryId") String entryId) {
        return null;
    }


    @DELETE
    @Path("/{entryId}/comment/{commentId}")
    ///{id}/comment/{id} – usuwa komentarz o podanym id dla wskazanego wpisu
    public boolean deleteEntryComment(@PathParam("entryId") String entryId, @PathParam("commentId") String commentId) {
        return true;
    }


}