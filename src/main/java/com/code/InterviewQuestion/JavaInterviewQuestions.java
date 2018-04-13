package com.code.InterviewQuestion;

/**
 * Created by prem on 5/2/2017.
 */
public class JavaInterviewQuestions {
    /*
10. What is Singleton? is it better to make whole method synchronized or only critical section synchronized ?

11.  Can you write critical section code for singleton?

12. . When do you override hashcode and equals() ?
Whenever necessary especially if you want to do equality check or want to use your object as key in HashMap.

14. What will be the problem if you don't override hashcode() method ?
You will not be able to recover your object from hash Map if that is used as key in HashMap.

15. Is it better to synchronize critical section of getInstance() method or whole getInstance() method ?
Answer is critical section because if we lock whole method than every time some one call this method will have to wait even though we are not creating any object)

16. What is the difference when String is gets created using literal or new() operator ?
When we create string with new() its created in heap and not added into string pool while String created using literal are created in String pool itself which exists in Perm area of heap.


17. Does not overriding hashcode() method has any performance implication ?
This is a good question and open to all , as per my knowledge a poor hashcode function will result in frequent collision in HashMap which eventually increase time for adding an object into Hash Map.

18. 18. What’s wrong using HashMap in multithreaded environment? When get() method go to infinite loop ?
Another good question. His answer was during concurrent access and re-sizing.

19.  What do you understand by thread-safety ? Why is it required ? And finally, how to achieve thread-safety in Java Applications ?

Java Memory Model defines the legal interaction of threads with the memory in a real computer system. In a way, it describes what behaviors are legal in multi-threaded code. It determines when a Thread can reliably see writes to variables made by other threads. It defines semantics for volatile, final & synchronized, that makes guarantee of visibility of memory operations across the Threads.

Let's first discuss about Memory Barrier which are the base for our further discussions. There are two type of memory barrier instructions in JMM - read barriers and write barrier.

A read barrier invalidates the local memory (cache, registers, etc) and then reads the contents from the main memory, so that changes made by other threads becomes visible to the current Thread.
A write barrier flushes out the contents of the processor's local memory to the main memory, so that changes made by the current Thread becomes visible to the other threads.
JMM semantics for synchronized
When a thread acquires monitor of an object, by entering into a synchronized block of code, it performs a read barrier (invalidates the local memory and reads from the heap instead). Similarly exiting from a synchronized block as part of releasing the associated monitor, it performs a write barrier (flushes changes to the main memory)
Thus modifications to a shared state using synchronized block by one Thread, is guaranteed to be visible to subsequent synchronized reads by other threads. This guarantee is provided by JMM in presence of synchronized code block.

JMM semantics for Volatile  fields
Read & write to volatile variables have same memory semantics as that of acquiring and releasing a monitor using synchronized code block. So the visibility of volatile field is guaranteed by the JMM. Moreover afterwards Java 1.5, volatile reads and writes are not reorderable with any other memory operations (volatile and non-volatile both). Thus when Thread A writes to a volatile variable V, and afterwards Thread B reads from variable V, any variable values that were visible to A at the time V was written are guaranteed now to be visible to B.

Let's try to understand the same using the following code

Data data = null;
volatile boolean flag = false;

Thread A
-------------
data = new Data();
flag = true;  <-- writing to volatile will flush data as well as flag to main memory

Thread B
-------------
if(flag==true){ <-- as="" barrier="" data.="" flag="" font="" for="" from="" perform="" read="" reading="" volatile="" well="" will="">
use data;  <!--- data is guaranteed to visible even though it is not declared volatile because of the JMM semantics of volatile flag.
}


 20.  What will happen if you call return statement or System.exit on try or catch block ? will finally block execute?
This is a very popular tricky Java question and its tricky because many programmer think that finally block always executed. This question challenge that concept by putting return statement in try or catch block or calling System.exit from try or catch block. Answer of this tricky question in Java is that finally block will execute even if you put return statement in try block or catch block but finally block won't run if you call System.exit form try or catch.

19. Can you override private or static method in Java ?
Another popular Java tricky question, As I said method overriding is a good topic to ask trick questions in Java.  Anyway, you can not override private or static method in Java, if you create similar method with same return type and same method arguments that's called method hiding.


20. What will happen if we put a key object in a HashMap which is already there ?
This tricky Java questions is part of How HashMap works in Java, which is also a popular topic to create confusing and tricky question in Java. well if you put the same key again than it will replace the old mapping because HashMap doesn't allow duplicate keys.


21. If a method throws NullPointerException in super class, can we override it with a method which throws RuntimeException?
One more tricky Java questions from overloading and overriding concept. Answer is you can very well throw super class of RuntimeException in overridden method but you can not do same if its checked Exception.

22. What is the issue with following implementation of compareTo() method in Java

public int compareTo(Object o){
   Employee emp = (Employee) emp;
   return this.id - o.id;
}

23. How do you ensure that N thread can access N resources without deadlock
If you are not well versed in writing multi-threading code then this is real tricky question for you. This Java question
can be tricky even for experienced and senior programmer, who are not really exposed to deadlock and race conditions. Key point here is order, if you acquire resources in a particular order and release resources in reverse order you can prevent deadlock.

24. What is difference between CyclicBarrier and CountDownLatch in Java
Relatively newer Java tricky question, only been introduced form Java 5. Main difference between both of them is that you can reuse CyclicBarrier even if Barrier is broken but you can not reuse CountDownLatch in Java. See CyclicBarrier vs CountDownLatch in Java for more differences.

25. Can you access non static variable in static context?
Another tricky Java question from Java fundamentals. No you can not access static variable in non static context in Java. Read why you can not access non-static variable from static method to learn more about this tricky Java questions.

4
    * */
}
