package ua.edu.ucu.apps.task2;

public class BirthdayMailCode implements MailCode {

    @Override
    public String generate(Client client) {
        return String.format("Happy Birthday, %s! You are now %d years old!", client.getName(), client.getAge());
    }
}
