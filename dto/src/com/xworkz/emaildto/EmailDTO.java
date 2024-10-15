package com.xworkz.emaildto;

import java.util.Objects;

public class EmailDTO {
    private String from;
    private String to;
    private String subject;
    private String message;
    EmailDTO(String from,String to,String subject,String message){
        this.from=from;
        this.to=to;
        this.subject=subject;
        this.message=message;
    }

    public static void add(EmailDTO emailDTO2) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailDTO emailDTO = (EmailDTO) o;
        return Objects.equals(from, emailDTO.from) && Objects.equals(to, emailDTO.to) && Objects.equals(subject, emailDTO.subject) && Objects.equals(message, emailDTO.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, subject, message);
    }

    public String size() {
        return 0;
    }

    public boolean contains(String emailDTO1) {
        return 0;
    }
}
