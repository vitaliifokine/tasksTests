package designPatterns.memento_undo;

public class Memento {
    private final String content;

    public Memento(String content) {
        this.content=content;
    }

    public String getContent() {
        return content;
    }
}
