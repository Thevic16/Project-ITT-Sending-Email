package edu.pucmm.eict;

import edu.pucmm.eict.util.EmailFallEvent;
import edu.pucmm.eict.util.EmailUtility;


public class Main {
    public static void main(String[] args) {

        String to = "victorjhoan2@gmail.com";
        String subject = "¡Se ha detectado una posible caída!";
        String content = "Usuario:Usuariodesilla1 \n Nombre:Perla \n Apellido:Gonzales";
        String photo = "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";
        double latitude = 19.4436952;
        double longitude = -70.68114969999999;

        //EmailUtility emailUtility = new EmailUtility();
        //emailUtility.sendMail( "victorjhoan2@gmail.com", "Prueba Java", "Proyecto ITT silla de ruedas inteligente" );

        EmailFallEvent emailFallEvent = new EmailFallEvent();
        emailFallEvent.sendMail( to, subject,content, photo,latitude,longitude);

    }

}








