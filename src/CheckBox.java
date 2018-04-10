public class CheckBox extends Button {
    public CheckBox(int xPosition, int yPosition, int width, int height, String text, boolean checked) {
        super(xPosition, yPosition, width, height, text);
        this.checked = checked;
    }

    private boolean checked;

    public boolean isChecked() {
        if (checked) {
            return true;
        } else {
            return false;
        }
    }

    public void draw() {
        System.out.println("**************\n" + "Button |" + (isChecked() ? "+" : "-") + "|\n" + "**************");
    }

    @Override
    public String toString() {
        return "ToString CheckBox!";
    }

    @Override
    public void print() {
        System.out.println(super.getxPosition() + ", " + super.getyPosition() + ", " + super.getWidth() + ", " + super.getHeight() + ", " + super.getText());
    }

    @Override
    public void click(){
        checked = isChecked() ? false : true;
    }
}