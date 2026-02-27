package design_patterns.behavioural_design_patterns.Memento;

public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setContent("Hey!");
        caretaker.saveState(editor);

        editor.setContent("Hello!");
        caretaker.saveState(editor);

        editor.setContent("Sup!");
        caretaker.saveState(editor);

        // undo() -> undo the last change
        caretaker.undo(editor);

        System.out.println(editor.getContent()); // Hello!
    }
}
