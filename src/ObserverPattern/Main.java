package ObserverPattern;


public class Main {

    public static void main(String[] args) {
        PostOffice postoffice = new PostOffice();
        Person person1 = new Person("Person1");
        Person person2 = new Person("Person2");
        Mail mail = new Mail("Person1", "Address1", "You've got mail");

        postoffice.Attach(person1);
        postoffice.Attach(person2);

        postoffice.addMail(mail);
    }
}