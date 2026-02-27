package design_patterns.behavioural_design_patterns.Memento;

//Memento Class: Stores the internal state of the TextEditor
public class EditorMemento {
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
