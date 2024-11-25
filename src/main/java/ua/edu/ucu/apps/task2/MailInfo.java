package ua.edu.ucu.apps.task2;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class MailInfo {

    private final Client client;
    private final MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
    }

    
}
