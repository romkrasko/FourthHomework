public class Button extends Component {

    public Button(int xPosition, int yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    public void draw(){
        System.out.println("*******\n" +"Button\n" +"*******");
    }
    @Override
    public String toString() {
        return "ToString Button!";
    }

    @Override
    public void print() {
        System.out.println(super.getxPosition() + ", " + super.getyPosition() + ", " + super.getWidth() + ", " + super.getHeight() + ", " + super.getText());
    }

    public void click(){
        System.out.println("I,m Button and I clicked!");
    }
}
