public class MainClass {
    public static void main(String[] args){
        Component comp = new Component(1,2,2,2,"complol");
        System.out.println(comp.toString());
        comp.print();
        comp.draw(1,1,2,2,"Draw Component");

        System.out.println("=======================================================================");

        Label label = new Label(1,1,2,2,"lablol");
        System.out.println(label.toString());
        label.print();
        label.draw(1,1,1,1,"Draw Label");

        System.out.println("=======================================================================");

        Button button = new Button(1,1,2,2,"butlol");
        System.out.println(button.toString());
        button.print();
        button.draw();
        button.click();

        System.out.println("=======================================================================");

        RoundButton round = new RoundButton(1,1,1,1,"roundlol");
        round.draw();
        System.out.println(round.toString());
        round.print();

        System.out.println("=======================================================================");

        CheckBox check = new CheckBox(1,1,1,1,"checklol",true);
        System.out.println(check.toString());
        check.print();
        check.draw();
        check.click();
        check.draw();
        check.click();
        check.draw();
        check.click();
        check.draw();

    }
}
/* class CheckBox
   - добавить private поле checked // тип boolean, кот. означает нажата или нет
   - добавить метод boolean isChecked() // кот. возвращает значение нажата или нет
   - реализовать метод draw();
    кот. рисует нажатую кнопку так
     **************
      Button |+|
     **************
    и не нажатую
     **************
      Button |-|
     **************
   - переопределить методы toString() и print();
   - переопределить метод click(); // который при нажатии переводит статус кнопки в состояние нажата, при повторном нажатие в состояние не нажата (т. е. меняте поле isChecked)*/