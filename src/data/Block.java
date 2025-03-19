package data;

public class Block {
    private char content;
    final private char def = '.';
    private boolean falls_with_gravity;
    private boolean fall_through;

    public Block() {
        this.content = this.def;
        this.falls_with_gravity = false;
        this.fall_through = true;
    }

    public Block(char _content) {
        this.content = _content;
        this.falls_with_gravity = true;
        this.fall_through = false;
    }

    public char display() {
        return content;
    }

    public boolean getFallsWithGravity() {
        return this.falls_with_gravity;
    }

    public boolean getFallThrough() {
        return this.fall_through;
    }

}