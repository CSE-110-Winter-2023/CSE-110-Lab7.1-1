package edu.ucsd.cse110.sharednotes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.ucsd.cse110.sharednotes.model.Note;
import edu.ucsd.cse110.sharednotes.model.NoteAPI;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class testing {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test() {
        NoteAPI API2 = NoteAPI.provide();
        String str = "asdf";
        Note note = new Note(str, "Ken and Kainoas note");
        var results1 = API2.put(note);
        var results2 = API2.get(str);
        Note note2 = new Note(str, "Changed content");
        var results3 = API2.put(note2);
        var results4 = API2.get(str);
    }
}