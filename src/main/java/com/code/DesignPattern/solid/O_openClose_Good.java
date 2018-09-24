package com.code.DesignPattern.solid;

/**
 * @author prem chand shah on 09-05-2018
 * @project myJava
 * <p>
 * Bellow is a example which supports the Open Close Principle. In the new design we use abstract draw() method in GraphicEditor for drawing objects,
 * while moving the implementation in the concrete shape objects. Using the Open Close Principle the problems from the previous design are avoided,
 * because GraphicEditor is not changed when a new shape class is added:
 * no unit testing required.
 * no need to understand the sourcecode from GraphicEditor.
 * since the drawing code is moved to the concrete shape classes, it's a reduced risk to affect old functionallity when new functionallity is a
 * <p>
 * Bellow is a example which supports the Open Close Principle. In the new design we use abstract draw() method in GraphicEditor for drawing objects,
 * while moving the implementation in the concrete shape objects. Using the Open Close Principle the problems from the previous design are avoided,
 * because GraphicEditor is not changed when a new shape class is added:
 * no unit testing required.
 * no need to understand the sourcecode from GraphicEditor.
 * since the drawing code is moved to the concrete shape classes, it's a reduced risk to affect old functionallity when new functionallity is a
 */


/**
 * Bellow is a example which supports the Open Close Principle. In the new design we use abstract draw() method in GraphicEditor for drawing objects,
 * while moving the implementation in the concrete shape objects. Using the Open Close Principle the problems from the previous design are avoided,
 * because GraphicEditor is not changed when a new shape class is added:
 * no unit testing required.
 * no need to understand the sourcecode from GraphicEditor.
 * since the drawing code is moved to the concrete shape classes, it's a reduced risk to affect old functionallity when new functionallity is a
 */


/**
 * Conclusion
 Like every principle OCP is only a principle. Making a flexible design involves additional time and effort spent for it and it introduce new level of abstraction increasing the complexity of the code.
 So this principle should be applied in those area which are most likely to be changed.

 There are many design patterns that help us to extend code without changing it. For instance the Decorator pattern help us to follow Open Close principle.
 Also the Factory Method or the Observer pattern might be used to design an application easy to change with minimum changes in the existing code.*/

public class O_openClose_Good {

    class GraphicEditor {
        public void drawShape(Shape s) {
            s.draw();
        }

        public void edit(Shape s) {
            s.edit();
        }
    }

    abstract class Shape {
        abstract void draw();

        abstract void edit();
    }

    class Rectangle extends Shape {
        public void draw() {
            // draw the rectangle
        }

        public void edit() {
            // draw the rectangle
        }
    }

    class Circle extends Shape {
        public void draw() {
            // draw the rectangle
        }

        public void edit() {
            // draw the rectangle
        }
    }

    public void run() {
        Rectangle rectangle = new Rectangle();
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(rectangle);
        graphicEditor.edit(rectangle);
    }

}
