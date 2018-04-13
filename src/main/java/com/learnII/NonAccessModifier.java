package com.learnII;

/**
 * Created by Prem Chand on 9/24/2016.
 * - final >> cna be applied to class, variable and instance variable
 * - class marked as final >> it cannot be extended
 * - method final >> cannot be overridden
 * - primitive/object data type >> value will not be changed, and will not leave that object will not refer to any other object
 *
 * static(vvi) >> when we mark a variable/method as static it belongs to class file not to object/instance variable
 *  - can be applied to both variable/method
 *  - static member should be access using class name not instance variable, class name give access to static member
 *  - if any method does same same job, so we don't need to call them by creating different instance of class each time better
 *  marked that method as static and call it vai class name because creation of object takes memory on RAM and which will slow our application
 *  - static variable/methods are called class member and non static variable/methods are member of object
 *  - method marked as static can access only other static method and variable directly.
 *  - static variable can be changed using instance variable but it will check the value for all other object because it changes the .class file not a object as it belows to class
 *  - member marked as static can be Final
 *
 * abstract >> abstract variable should be in abstract class
 * - It can be applied to only classes and method no member/variable and method ends with semi colon not curly braces
 * - Abstract class be have non-abstract method but abstract method should be in abstract class
 * - abstract class cannot have object or cannot be initiated
 * - abstract cannot be marked as final they can only be inherited so create instance on subclass and use it.
 * - abstract cannot be static
 * - abstract method cannot be private as it has to have implementation in sub class
 *
 * strictfp >>
 * native
 * synchronized
 * transient
 * volatile
 */
public class NonAccessModifier {
}
