package designPatterns.memento_undo;

public class Main {

    public static void main(String[] args) {
     Originator editor = new Originator();
     Caretaker caretaker = new Caretaker();
     editor.setContent("26");
     caretaker.push(editor.createState());

     editor.setContent("77");
     caretaker.push(editor.createState());

     editor.setContent("99");
     editor.restore(caretaker.pop());

     System.out.println(editor.getContent());
    }
}
