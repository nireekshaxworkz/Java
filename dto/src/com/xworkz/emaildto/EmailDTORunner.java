package com.xworkz.emaildto;

import java.util.ArrayList;
import java.util.Collection;

public class EmailDTORunner {
    public static void main(String[] args) {
        EmailDTO emailDTO1=new EmailDTO("nireeksha055@gmail.com","raksha123@gmail.com","job","full stack java development");
        EmailDTO emailDTO2=new EmailDTO("raksha034@gmail.com","megha237@gmail.com","course","mobile app development");
        EmailDTO emailDTO3=new EmailDTO("nancy125@gmail.com","rakshitha140@gmail.com","course","AIML");
        EmailDTO emailDTO4=new EmailDTO("leelzz129@gmail.com","uttam297@gmail.com","learning","CAD");
        EmailDTO emailDTO5=new EmailDTO("anu472@gmail.com","harshi328@gmail.com","job","web development");
        Collection<EmailDTO> collection=new ArrayList<EmailDTO>();
        //add all
        EmailDTO.add(emailDTO1);
        EmailDTO.add(emailDTO2);
        EmailDTO.add(emailDTO3);
        EmailDTO.add(emailDTO4);
        EmailDTO.add(emailDTO5);
        //remove
        EmailDTO emailDTO=new EmailDTO("nireeksha055@gmail.com","raksha123@gmail.com","job","full stack java development");
        boolean removed=collection.remove(emailDTO);
        //print the size
        System.out.println("Size of collection:"+emailDTO.size());
        //contains
        System.out.println(emailDTO.contains("emailDTO1"));
        //clear
        emailDTO.clear();
    }
}
