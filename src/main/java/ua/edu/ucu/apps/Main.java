package ua.edu.ucu.apps;

import ua.edu.ucu.apps.task2.Client;
import ua.edu.ucu.apps.task2.MailCode;
import ua.edu.ucu.apps.task2.BirthdayMailCode;
import ua.edu.ucu.apps.task2.MailBox;
import ua.edu.ucu.apps.task2.MailInfo;
import ua.edu.ucu.apps.task3.MyImage;
import ua.edu.ucu.apps.task3.ProxyImage;

public class Main {
    public static void main(String[] args) {

        Client client1 = Client.builder()
                .name("Alice")
                .age(25)
                .sex("Female")
                .build();

        MailCode birthdayMailCode = new BirthdayMailCode();

        MailInfo mailInfo1 = new MailInfo(client1, birthdayMailCode);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo1);

        mailBox.sendAll();



        MyImage image1 = new ProxyImage("image1.jpg");

        System.out.println("Images created, but not loaded.");

        image1.display();
    }
}
