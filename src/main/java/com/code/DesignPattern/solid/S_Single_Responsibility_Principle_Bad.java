package com.code.DesignPattern.solid;

/**
 * @author prem chand shah on 10-05-2018
 * @project myJava
 */

/**
 * Example
 Let's assume we need an object to keep an email message. We are going to use the IEmail interface from the below sample.
 At the first sight everything looks just fine. At a closer look we can see that our IEmail interface and Email class have 2 responsibilities (reasons to change).
 One would be the use of the class in some email protocols such as pop3 or imap. If other protocols must be supported the objects should be serialized in another manner and code should be added to support new protocols.
 Another one would be for the Content field. Even if content is a string maybe we want in the future to support HTML or other formats.

 If we keep only one class, each change for a responsibility might affect the other one:

 Adding a new protocol will create the need to add code for parsing and serializing the content for each type of field.
 Adding a new content type (like html) make us to add code for each protocol implemented.*/

public class S_Single_Responsibility_Principle_Bad {
    // single responsibility principle - bad example

    interface IEmail {
        public void setSender(String sender);

        public void setReceiver(String receiver);

        public void setContent(String content);
    }

    class Email implements IEmail {
        public void setSender(String sender) {
            // set sender;
        }

        public void setReceiver(String receiver) {
            // set receiver;
        }

        public void setContent(String content) {
            // set content;
        }
    }
}
