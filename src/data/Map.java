package data;

public class Map {
    private Block[][] content;
    private int  width;
    private int height;

    public Map(int _width, int  _height) {
        this.width = _width;
        this.height = _height;

        this.content =  new Block[_height][_width];
        for(int y = 0; y < _height; y++) {
            for(int x = 0; x < _width; x++) {
                this.content[y][x] = new Block();
            }
        }
    }

    public void displayOnOut() {
        for(int y = 0; y < this.height; y++) {
            for(int x = 0; x < this.width; x++) {
                System.out.print(this.content[y][x].display());
            }
            System.out.println();
        }
    }

    private boolean notInBoundires(int row, int col) {
        return row >= this.height || row < 0 || col >= this.width || col < 0;
    }

    public void changeCell(int row, int col) {
        if(this.notInBoundires(row, col)) {
            System.out.println("Invalid row or col, outside of the map");
            return;
        }

        this.content[row][col] = new Block('A');
    }

    public void swapBelow(int row, int col) {
        if(row == this.height - 1) {
            System.out.println("Invalid row, already on the bottom of the map");
            return;
        }

        // Swaps the target block with the block below
        Block target = this.content[row][col];
        this.content[row][col] = this.content[row + 1][col];
        this.content[row + 1][col] = target;
    }

    public void insertAtCoords(int row, int col) {
        if(this.notInBoundires(row, col)) {
            System.out.println("Invalid row or col, outside of the map");
            return;
        }

        this.changeCell(row, col);

        if(this.content[row][col].getFallsWithGravity()) {
            int target_row = row;
            while(true) {
                if(this.notInBoundires(target_row-1, col) || !this.content[target_row-1][col].getFallThrough()) {
                    return;
                }
                swapBelow(target_row, col);
                target_row++;
            }
        }
    }

    public void insertOnTop(int col) {
        this.insertAtCoords(0, col);
    }

}
