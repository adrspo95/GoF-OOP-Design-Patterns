package adrspo.design.patterns.creational.factory;

public abstract class Notification {

    private String title;
    private String content;

    public abstract void notify(String to, String address);

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
