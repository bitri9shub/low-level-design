package design_patterns.behavioural_design_patterns.Memento;

public class TextEditor {
    private String content;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // save the current state of editor
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    // restore (memento -> update the state of current content)
    public void restore(EditorMemento momento) {
        content = momento.getContent();
    }
}
