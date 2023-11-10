package Notes;

public class Note implements Organizable {
    private String name;

    private int noteID;



    public Note(String name, int noteID) {
        this.name = name;
        this.noteID = noteID;

    }

    // Implement methods from the Organizable interface
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    public int getNoteID() {
        return noteID;
    }

    public void setNoteID(int noteID) {
        this.noteID = noteID;
    }
}