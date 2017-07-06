package adrspo.design.patterns.behavioral.memento;

public class MementoTest {

    public static void main(String args[]) {

        WriterCaretaker caretaker = new WriterCaretaker();

        FileWriterUtil writer = new FileWriterUtil();
        writer.write("Pierwszy wpis. \n");

        caretaker.addMemento(writer.createMemento());

        writer.write("Drugi wpis ");
        caretaker.addMemento(writer.createMemento());

        writer.write("i trzeci wpis. \n");
        caretaker.addMemento(writer.createMemento());

        System.out.println("Ca�y tekst: ");
        System.out.println(writer.toString());

        writer.restoreFromMemento(caretaker.getMemento(0));
        System.out.println("Po dw�ch cofni�ciach");
        System.out.println(writer.toString());
    }

}
