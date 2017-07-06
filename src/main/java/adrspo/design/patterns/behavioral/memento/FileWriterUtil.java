package adrspo.design.patterns.behavioral.memento;

public class FileWriterUtil {

    private StringBuilder content;

    public FileWriterUtil() {
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        this.content.append(str);
    }

    public Memento createMemento() {
        return new Memento(new StringBuilder(content));
    }

    public void restoreFromMemento(Memento memento) {
        this.content = memento.getContent();
    }

}
