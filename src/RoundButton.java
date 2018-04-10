public class RoundButton extends Button {

    public RoundButton(int xPosition, int yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    public void draw(){
        System.out.println("*********\n" +"RoundButton\n" +"*********");
    }

    @Override
    public String toString() {
        return "ToString RoundButton";
    }

    @Override
    public void print() {
        System.out.println(super.getxPosition() + ", " + super.getyPosition() + ", " + super.getWidth() + ", " + super.getHeight() + ", " + super.getText());
    }
}