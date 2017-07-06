package adrspo.design.patterns.creational.abstractfactory;

public abstract class Dialog {

    private String title;
    private String content;

    public abstract void display();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
