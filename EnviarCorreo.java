import java.util.*;
import java.io.*;
import javax.mail.*;
import javax.mail.event.*;
import javax.mail.internet.*;

public class EnviarCorreo {

    private static String USER_NAME = "";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = ""; // GMail password
    private static String RECIPIENT = "";
    private static String SUBJECT = "";
    private static String BODY = "<!DOCTYPE html> <html> <head> <meta name='viewport' content='width=device-width, initial-scale=1.0'> <meta charset='UTF-8'> <title></title> <style> .text-center { text-align: center !important; } .text-dark { color: #343a40 !important; } .letraVerdePantone{ color: #017550; font-weight: bold; } .tablaDatos{ border: 5px solid #017550; width: 60%; }  </style></head> <body paddingwidth='0' paddingheight='0' offset='0' toppadding='0' leftpadding='0'> <div class='container'> <div class='row'> <div class='col-sm-12'> <table bgcolor='#ffffff' width='100%' border='0' cellspacing='0' cellpadding='0' class='tableContent' align='center' style='font-family: Helvetica, Arial, serif;'> <tbody> <tr> <td> <table width='72%' border='0' cellspacing='0' cellpadding='0' align='center' bgcolor='#ffffff' class='MainContainer'> <tbody> <tr> <td><table width='100%' border='0' cellspacing='0' cellpadding='0'> <tbody> <tr> <td> <table width='100%' border='0' cellspacing='0' cellpadding='0'> <tbody> <!-- =============================== Header ====================================== --><!-- =============================== Body ====================================== --><tr> <td class='movableContentContainer ' valign='top'> <div class='movableContent' style='border: 0px; padding-top: 0px; position: relative;'> <table width='100%' border='0' cellspacing='0' cellpadding='0'> <tbody> <tr> <td height='20'></td> </tr> <tr> <td><table width='100%' border='0' cellspacing='0' cellpadding='0'> <tbody> <tr> <td valign='top' align='center'> <img width='125px' src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAYAAABw4pVUAAAACXBIWXMAAAsSAAALEgHS3X78AAAEUUlEQVR4nO2dPUwUQRTHR2NlCImJEj4kIRY0WJkjsfIjVCYG6UiksTJwhY1YUGihhQVSaCIQKI0aEgs+TKyISmWBViQChZKgiAQ0nGh75l2yZNiZWWb2dvfe3fx/3c3OTWb3n/fm7byZ2SPFYrEoABuOQgpeQBBmQBBmQBBmQBBmHNN1Z3xqTAy+f6OUx+F6a5uYGHpSEw/r5sNb4sX6mlIeh0cXr4j+3gHln7AQZkAQZkAQZmjHEB3k8+LQ3NBcMw/r6vkuce7MhlJug+2YbC2IbgDyje7L12Lfsa0gcFnMgCDMgCDMgCDMgCDMsI6yDmNxaVFcGH1wSK1k6WttE5NDjw+0eVg//o3OKGW293dp9P7+73f5eyJ3NqfUKxdYCDMSs5BaZO/vH7H8daV0Zytry5ncIQSJgMSQ3dTe6Ky5ckLAZTEDFhJic/uH+Lb5vVS4s7tdyucE0MCu43Rji2g82aS54k5mgsjRjUskNDY1Lm4nlCyzYXp+en/eKZxcq8t3a1swJZvioBWkp6tH5Do6lXIQHwqTZciqdGgFIfNLygSrDUoXBG6q+cSpUjo7QHZfMjYpBtt3Fq0gPkNT7ME0e/hlEFGWh8BCIiA/L2dKZfdF42wabh2CREAPXI6e5CiLgp40BIHLYgYsxAHZfZnC1nKBIA5ksdDDe0HCy2azCG2jwBjCDAjCDO9dljxvR0koObRNK00bhfeCcJu3g8tihpcWErXxRo6yZPeVZM4jClgIM7wfQ8KY0rRZ4aUglJadUErV/Ecloiy4LGZ477JolQktbCB2Cr8PpGnr6+qV+mnjvSC05AdzWcBIYhZC5t1nWJVRTt2WhiZj3famVqXMpe2gvmk1SSXAeVnMgMtiRmIuS166nxXkbtrb2ln2Iy6JCUIPIWq9bhrodlBx6Udc4LKYAUGYAUGYAUGYkdnUicvLmsz67i+xUCgo5dXeDxOZCRI3CqEdVAsJ7qDi0g8TcFnMgCDMgCDMgCDMgCDM8C5jeDwf/9zELICFMMP7nLorC/m7qS4NgoUwAxbiyPCrCVE/9+zAnyi3f+fGYCLtQxBH5rZ+Kn/oU0ri450gcc9czOpUIowhzKiIhayurYrhl0+V8oCk8tPVSEUEKewVxHPDhhliUinxB7gsZkAQZmhdlnwQZEC5b6cUpey3v7OlXDfV/fTls3K9GgnvzDIdnKkVRD4IMqDcZfouIWOWh15mhbwzS0RsIoXLYgYEYQYEYQYEYYZ2UI8DRQ0jlp/WoyhreOmjUh5g2w7trgrj0g8XOjtyYsRQX9ePuCQmCIVwA739SrkOCgGjBLFtR4dLP1ygsD+LPetwWcyAIMyoyORiWn6+FqiIIGn5+VoALosZEIQZ1i5LPojeBfq2RjlfWebE7NsZsbEV7/PdtlgLYvv56TB0bEWtCPL6w7zxaMCkgMtiBgRhBgRhBk4DYgYshBkQhBkQhBkQhBkQhBNCiP9pu0U5VglCEwAAAABJRU5ErkJggg=='/> </td> </tr> </tbody> </table></td> </tr> </tbody> </table> </div> <div style='border: 0px; padding-top: 0px; position: relative; height: 15px;'> </div> <div style='border: 0px; padding-top: 0px; position: relative;'> <table width='100%' border='0' cellspacing='0' cellpadding='0' align='center'> <tr> <td align='left'> <div> <div align='left'> <p style='color: black;'> Estimado(a) <b>#{nombre}</b> </p> </div> </div> </td> </tr> <tr> <td align='left'> <div> <div align='center'> <p class='text-dark' style='text-align: justify; text-justify: inter-word; padding: 0px;'> A continuaci&oacute;n se muestran sus credenciales para ingresar al POS Móvil MI QR Comercios: </p> </div> </div> </td> </tr> <tr> <td align='center'> <table class='tablaDatos' cellspacing='0' cellpadding='0'> <thead> <tr style='padding-top: 8px; line-height: 10px;'> <td colspan='2' align='center'><p>Credenciales de acceso</p></td> </tr> </thead> <tbody align='center' cellspacing='0' cellpadding='0'> <tr style='padding-top: 8px; line-height: 10px;'> <td><p>ID Comercio:</p></td> <td><p class='letraVerdePantone'>#{codigoComercio}</p></td> </tr> <tr style='padding-top: 8px; line-height: 10px; '> <td ><p>Usuario:</p></td> <td ><p class='letraVerdePantone'>#{usuario}</p></td> </tr> <tr style='padding-top: 8px; line-height: 10px;'> <td><p>Clave Provisional:</p></td> <td><p class='letraVerdePantone'>#{claveC}</p></td> </tr> </tbody> </table> </td> </tr> </table> <div> <div class='contentEditable' align='center'> <p class='text-dark' style='text-align: justify; text-justify: inter-word;'> Ahora puedes ingresar a la aplicaci&oacute;n y establecer una nueva contrase&ntilde;a para poder trabajar en el comercio #{nombreComercio}. </p> </div> </div><div class='movableContent' style='border: 0px; padding-top: 0px; position: relative;'> <table width='100%' border='0' cellspacing='0' cellpadding='0'> <tbody> <tr> <td> <p> <h4 style='font-weight: normal;'> <i>Si necesitas apoyo, consulta a nuestro Call Center 2221-3333 </i> </h4> </p> </td> </tr> </tbody> </table> </div> <!-- =============================== footer ====================================== --> </td> </tr> </tbody> </table></td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </td> </tr> </tbody> </table> </div> </div> </div> </body> </html>";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido/a al enviador SMTP - Gmail");
        while(USER_NAME == ""){
            System.out.println("Ingrese el correo de enviador (SENDER/FROM)");
            USER_NAME = in.nextLine();
        }

        while(PASSWORD == ""){
            System.out.println("Ingrese la contraseña del correo");
            PASSWORD = in.nextLine();
        }

        while(RECIPIENT == ""){
            System.out.println("Ingrese el correo de destinatario (RECEIPT/TO)");
            RECIPIENT = in.nextLine();
        }

        while(SUBJECT == ""){
            System.out.println("Ingrese el asunto del correo");
            SUBJECT = in.nextLine();
        }
        System.out.println();
        System.out.println("Enviando correo, espere por favor...");

        String from = USER_NAME;
        String pass = PASSWORD;
        String[] to = { RECIPIENT }; // list of recipient email addresses
        String subject = SUBJECT;
        String body = BODY;

        sendFromGMail(from, pass, to, subject, body);
    }

    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
        System.out.println();
        System.out.println("Para: " + to[0]);
        System.out.println("De: " + from);
        System.out.println("Asunto: " + subject);
        System.out.println();

        System.out.println("================================");
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setContent(body, "text/html");
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Correo enviado con exito a " + RECIPIENT);
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}