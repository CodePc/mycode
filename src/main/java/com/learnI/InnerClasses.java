package com.learnI;

/**
 * Created by prem on 5/14/2017.
 */

/*Inner classes are those which are wrapped inside a class. They are also called as nested classes.
There are static inner classes, we can also call them as Static nested classes.
Inner classes are regular members of a class. They are just like methods and variables declared in a class. Remember Inner classes are also regular members of the outer class.
Because Inner classes are members of outer class, we can apply all the access modifiers to inner class. That means we can declare the inner class as public, protected, default or private.
If you notice the difference here you can see that we can apply all the access modifiers to Inner classes whereas for normal class, only public and default access modifiers are applicable.
Then, With respect to non-access modifiers, we can apply static, final, abstract and strictFp.*/

public class InnerClasses {
    // inner class are regular member of class
    // we can have all the assess modifiers with inner class
    // we can have static, final , abstract and strictfp non access modifier with innerclass
    // type of inner class
    // - normal inner class
    // - method local inner class
    // - Anonymous innerclass

    String base;

    private class innerClassLOne {
        String one;

        public class innerClassLTwo {
            String two;

            public class innerClassLThree {
                String three;

                public void three(String three) {
                    this.three = three;
                }

            }
        }
    }

}
