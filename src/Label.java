public class Label extends Component {

    public Label(int xPosition, int yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    public void draw(int xPosition, int yPosition, int width, int height) {
        for (int i = 0; i < yPosition; i++)
            System.out.println();
        for (int i = 0; i < xPosition; i++)
            System.out.print(" ");
        System.out.println("| Label |");
    }

    @Override
    public String toString() {
        return "ToString Label!";
    }

    @Override
    public void print() {
        System.out.print(super.getxPosition() + ", " + super.getyPosition() + ", " + super.getWidth() + ", " + super.getHeight() + ", " + super.getText());
    }

}