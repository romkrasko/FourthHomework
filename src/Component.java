public class Component {
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
    private String text;

    public Component(int xPosition, int yPosition, int width, int height, String text) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getText() {
        return text;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPorition(int yPorition) {
        this.yPosition = yPorition;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return "ToString Component";
    }

    public void print(){
        System.out.print("Print - "+getxPosition()+", "+getyPosition()+", "+getWidth()+
                ", "+getHeight()+", "+getText());
    }

    public void draw(int xPosition,int yPosition,int width,int height,String text){
        for(int i=0;i<yPosition;i++)
            System.out.println();
        for(int i=0;i<xPosition;i++)
            System.out.print(" ");
        System.out.println(text);
    }
}
