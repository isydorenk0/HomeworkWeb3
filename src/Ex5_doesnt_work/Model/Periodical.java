package Ex5_doesnt_work.Model;

//import javax.xml.bind.annotation.*;


public class Periodical {
    private String title;
    private String type;
    private boolean color;
    private boolean gloss;
    private int pages;
    private String index;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public boolean isGloss() {
        return gloss;
    }

    public void setGloss(boolean gloss) {
        this.gloss = gloss;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Periodical{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", color=" + color +
                ", gloss=" + gloss +
                ", pages=" + pages +
                ", index='" + index + '\'' +
                '}';
    }
}
