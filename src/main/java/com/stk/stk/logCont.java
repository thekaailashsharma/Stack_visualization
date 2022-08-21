package com.stk.stk;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
import com.stk.stk.HelloApplication;
public class logCont {
    @FXML
    private TextField email;

    @FXML
    private TextField name;

    @FXML
    private ImageView image;

    @FXML
    private Label pw;

    @FXML
    public void sendEmail() {
        image.setVisible(true);
        pw.setVisible(true);
        final String username = "kailashps.1011@gmail.com";
        final String password = "vycoxhjffonxnjkn";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("kailashps.1011@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email.getText())
            );
            message.setSubject("Welcome " + name.getText() + " ");
            message.setContent("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" style=\"width:100%;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0\"><head><meta charset=\"UTF-8\"><meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"><meta name=\"x-apple-disable-message-reformatting\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><meta content=\"telephone=no\" name=\"format-detection\"><title>New message</title><!--[if (mso 16)]><style type=\"text/css\">     a {text-decoration: none;}     </style><![endif]--><!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--><!--[if gte mso 9]><xml> <o:OfficeDocumentSettings> <o:AllowPNG></o:AllowPNG> <o:PixelsPerInch>96</o:PixelsPerInch> </o:OfficeDocumentSettings> </xml><![endif]--><style type=\"text/css\">.section-title {\tpadding:5px 10px;\tbackground-color:#f6f6f6;\tborder:1px solid #dfdfdf;\toutline:0;}#outlook a {\tpadding:0;}.ExternalClass {\twidth:100%;}.ExternalClass,.ExternalClass p,.ExternalClass span,.ExternalClass font,.ExternalClass td,.ExternalClass div {\tline-height:100%;}.es-button {\tmso-style-priority:100!important;\ttext-decoration:none!important;}a[x-apple-data-detectors] {\tcolor:inherit!important;\ttext-decoration:none!important;\tfont-size:inherit!important;\tfont-family:inherit!important;\tfont-weight:inherit!important;\tline-height:inherit!important;}.es-desk-hidden {\tdisplay:none;\tfloat:left;\toverflow:hidden;\twidth:0;\tmax-height:0;\tline-height:0;\tmso-hide:all;}[data-ogsb] .es-button {\tborder-width:0!important;\tpadding:10px 35px 10px 35px!important;}@media only screen and (max-width:600px) {p, ul li, ol li, a { line-height:150%!important } h1, h2, h3, h1 a, h2 a, h3 a { line-height:120% } h1 { font-size:30px!important; text-align:center } h2 { font-size:26px!important; text-align:center } h3 { font-size:20px!important; text-align:center } .es-header-body h1 a, .es-content-body h1 a, .es-footer-body h1 a { font-size:30px!important } .es-header-body h2 a, .es-content-body h2 a, .es-footer-body h2 a { font-size:26px!important } .es-header-body h3 a, .es-content-body h3 a, .es-footer-body h3 a { font-size:20px!important } .es-menu td a { font-size:16px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:16px!important } .es-content-body p, .es-content-body ul li, .es-content-body ol li, .es-content-body a { font-size:16px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:16px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:block!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0!important } .es-m-p0r { padding-right:0!important } .es-m-p0l { padding-left:0!important } .es-m-p0t { padding-top:0!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } tr.es-desk-hidden, td.es-desk-hidden, table.es-desk-hidden { width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } tr.es-desk-hidden { display:table-row!important } table.es-desk-hidden { display:table!important } td.es-desk-menu-hidden { display:table-cell!important } .es-menu td { width:1%!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } a.es-button, button.es-button { font-size:20px!important; display:block!important; border-left-width:0px!important; border-right-width:0px!important } .es-m-p5 { padding:5px!important } .es-m-p5t { padding-top:5px!important } .es-m-p5b { padding-bottom:5px!important } .es-m-p5r { padding-right:5px!important } .es-m-p5l { padding-left:5px!important } .es-m-p10 { padding:10px!important } .es-m-p10t { padding-top:10px!important } .es-m-p10b { padding-bottom:10px!important } .es-m-p10r { padding-right:10px!important } .es-m-p10l { padding-left:10px!important } .es-m-p15 { padding:15px!important } .es-m-p15t { padding-top:15px!important } .es-m-p15b { padding-bottom:15px!important } .es-m-p15r { padding-right:15px!important } .es-m-p15l { padding-left:15px!important } .es-m-p20 { padding:20px!important } .es-m-p20t { padding-top:20px!important } .es-m-p20r { padding-right:20px!important } .es-m-p20l { padding-left:20px!important } .es-m-p25 { padding:25px!important } .es-m-p25t { padding-top:25px!important } .es-m-p25b { padding-bottom:25px!important } .es-m-p25r { padding-right:25px!important } .es-m-p25l { padding-left:25px!important } .es-m-p30 { padding:30px!important } .es-m-p30t { padding-top:30px!important } .es-m-p30b { padding-bottom:30px!important } .es-m-p30r { padding-right:30px!important } .es-m-p30l { padding-left:30px!important } .es-m-p35 { padding:35px!important } .es-m-p35t { padding-top:35px!important } .es-m-p35b { padding-bottom:35px!important } .es-m-p35r { padding-right:35px!important } .es-m-p35l { padding-left:35px!important } .es-m-p40 { padding:40px!important } .es-m-p40t { padding-top:40px!important } .es-m-p40b { padding-bottom:40px!important } .es-m-p40r { padding-right:40px!important } .es-m-p40l { padding-left:40px!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; max-height:inherit!important } }</style></head>\n" +
                    "<body style=\"width:100%;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol';padding:0;Margin:0\"><div class=\"es-wrapper-color\" style=\"background-color:#F6F6F6\"><!--[if gte mso 9]><v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\"> <v:fill type=\"tile\" color=\"#f6f6f6\"></v:fill> </v:background><![endif]--><table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top\"><tr style=\"border-collapse:collapse\"><td valign=\"top\" style=\"padding:0;Margin:0\"><table cellpadding=\"0\" cellspacing=\"0\" class=\"es-header\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top\"><tr style=\"border-collapse:collapse\"><td align=\"center\" style=\"padding:0;Margin:0\"><table bgcolor=\"#ffffff\" class=\"es-header-body\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;width:600px\"><tr style=\"border-collapse:collapse\"><td align=\"left\" style=\"Margin:0;padding-bottom:10px;padding-top:20px;padding-left:20px;padding-right:20px\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td class=\"es-m-p0r\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:560px\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"center\" style=\"padding:0;Margin:0;font-size:0px\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;text-decoration:underline;color:#134F5C;font-size:14px\"><img src=\"https://wzenru.stripocdn.email/content/guids/CABINET_49dfe12d15540c5305189b31261e3827/images/78951610119749548.png\" alt=\"Logo\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"150\" title=\"Logo\" height=\"54\"></a></td>\n" +
                    "</tr></table></td></tr></table></td></tr></table></td>\n" +
                    "</tr></table><table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%\"><tr style=\"border-collapse:collapse\"><td align=\"center\" style=\"padding:0;Margin:0\"><table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#dee2e6;width:600px\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" bgcolor=\"#dee2e6\"><tr style=\"border-collapse:collapse\"><td align=\"left\" style=\"padding:0;Margin:0\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;width:600px\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"center\" style=\"padding:0;Margin:0;font-size:0px\"><img class=\"adapt-img\" src=\"https://wzenru.stripocdn.email/content/guids/CABINET_49dfe12d15540c5305189b31261e3827/images/19771615363902605.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"600\" height=\"30\"></td>\n" +
                    "</tr></table></td></tr></table></td>\n" +
                    "</tr><tr style=\"border-collapse:collapse\"><td align=\"left\" style=\"padding:20px;Margin:0\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"left\" style=\"padding:0;Margin:0;width:560px\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"left\" class=\"es-m-p20l es-m-txt-l\" style=\"padding:0;Margin:0;padding-top:10px\"><h1 style=\"Margin:0;line-height:40px;mso-line-height-rule:exactly;font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol';font-size:40px;font-style:normal;font-weight:normal;color:#333333\">WELCOME " + name.getText() + "&nbsp;</h1></td>\n" +
                    "</tr><tr style=\"border-collapse:collapse\"><td align=\"left\" class=\"es-m-p20l\" style=\"padding:0;Margin:0;padding-top:10px;padding-bottom:10px\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol';line-height:17px;color:#333333;font-size:14px\">Data Structure Visualizer is a software that helps u learn and understand data structures in an effective way.&nbsp;</p></td></tr></table></td></tr></table></td>\n" +
                    "</tr><tr style=\"border-collapse:collapse\"><td align=\"left\" style=\"padding:0;Margin:0\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr class=\"es-mobile-hidden\" style=\"border-collapse:collapse\"><td align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;width:600px\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"center\" style=\"padding:0;Margin:0;font-size:0px\"><img class=\"adapt-img\" src=\"https://wzenru.stripocdn.email/content/guids/CABINET_49dfe12d15540c5305189b31261e3827/images/64791615363894061.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"600\" height=\"30\"></td></tr></table></td></tr></table></td>\n" +
                    "</tr></table></td>\n" +
                    "</tr></table><table cellpadding=\"0\" cellspacing=\"0\" class=\"es-content\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%\"><tr style=\"border-collapse:collapse\"><td align=\"center\" style=\"padding:0;Margin:0\"><table bgcolor=\"#ffffff\" class=\"es-content-body\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;width:600px\"><tr style=\"border-collapse:collapse\"><td class=\"es-m-p10t\" align=\"left\" style=\"Margin:0;padding-bottom:10px;padding-top:20px;padding-left:20px;padding-right:20px;background:linear-gradient(0deg, #DEE2E6 59%, #FFFFFF 59%)\"><!--[if mso]><table style=\"width:560px\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"width:176px\" valign=\"top\"><![endif]--><table cellpadding=\"0\" cellspacing=\"0\" align=\"left\" class=\"es-left\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left\"><tr style=\"border-collapse:collapse\"><td class=\"es-m-p20b\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;width:176px\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"center\" style=\"padding:0;Margin:0;font-size:0px\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;text-decoration:underline;color:#134F5C;font-size:14px\"><img src=\"https://wzenru.stripocdn.email/content/guids/CABINET_0089e649c7dd3b863b54d013fb76cd62/images/create_with_kailash.jpg\" alt=\"Brianna Riley Butler\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"176\" title=\"Brianna Riley Butler\" height=\"125\"></a></td>\n" +
                    "</tr></table></td></tr></table><!--[if mso]></td><td style=\"width:20px\"></td>\n" +
                    "<td style=\"width:364px\" valign=\"top\"><![endif]--><table cellpadding=\"0\" cellspacing=\"0\" class=\"es-right\" align=\"right\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right\"><tr style=\"border-collapse:collapse\"><td align=\"left\" style=\"padding:0;Margin:0;width:364px\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"left\" class=\"es-m-txt-c\" style=\"padding:0;Margin:0;padding-bottom:5px\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol';line-height:17px;color:#333333;font-size:14px\">Developer</p></td>\n" +
                    "</tr><tr style=\"border-collapse:collapse\"><td align=\"left\" class=\"es-m-txt-c\" style=\"padding:0;Margin:0\"><h3 style=\"Margin:0;line-height:29px;mso-line-height-rule:exactly;font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol';font-size:24px;font-style:normal;font-weight:normal;color:#333333\">Kailash Sharma</h3></td>\n" +
                    "</tr><tr style=\"border-collapse:collapse\"><td style=\"padding:0;Margin:0\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"es-menu\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr class=\"links-images-left\" style=\"border-collapse:collapse\"><td align=\"left\" valign=\"top\" width=\"100%\" style=\"Margin:0;padding-left:5px;padding-right:5px;padding-top:5px;padding-bottom:5px;border:0\"><a target=\"_blank\" href=\"mailto:brianna_rilley@mail.com\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;text-decoration:none;display:block;font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol';color:#134F5C;font-size:14px\"><img src=\"https://wzenru.stripocdn.email/content/guids/CABINET_49dfe12d15540c5305189b31261e3827/images/13561615363445462.png\" alt=\"kailashps.1011@gmail.com\" title=\"kailashps.1011@gmail.com\" align=\"absmiddle\" width=\"14\" height=\"14\" style=\"display:inline-block !important;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;padding-right:15px\">kailashps.1011@gmail.com</a></td>\n" +
                    "</tr></table></td>\n" +
                    "</tr><tr style=\"border-collapse:collapse\"><td style=\"padding:0;Margin:0\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"es-menu\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr class=\"links-images-left\" style=\"border-collapse:collapse\"><td align=\"left\" valign=\"top\" width=\"100%\" style=\"Margin:0;padding-left:5px;padding-right:5px;padding-top:5px;padding-bottom:5px;border:0\"><a target=\"_blank\" href=\"https://viewstripo.email\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;text-decoration:none;display:block;font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol';color:#134F5C;font-size:14px\"><img src=\"https://wzenru.stripocdn.email/content/guids/CABINET_49dfe12d15540c5305189b31261e3827/images/3821615363445442.png\" alt=\"https://github.com/kailash1011\" title=\"https://github.com/kailash1011\" align=\"absmiddle\" width=\"14\" height=\"14\" style=\"display:inline-block !important;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;padding-right:15px\">https://github.com/kailash1011</a></td>\n" +
                    "</tr></table></td></tr></table></td></tr></table><!--[if mso]></td></tr></table><![endif]--></td>\n" +
                    "</tr><tr style=\"border-collapse:collapse\"><td align=\"left\" background=\"https://wzenru.stripocdn.email/content/guids/CABINET_49dfe12d15540c5305189b31261e3827/images/38081615362904632.png\" style=\"padding:0;Margin:0;background-image:url(https://wzenru.stripocdn.email/content/guids/CABINET_49dfe12d15540c5305189b31261e3827/images/38081615362904632.png);background-repeat:no-repeat;background-position:right top\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;width:600px\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"right\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-left:20px;padding-right:20px;font-size:0\"><table cellpadding=\"0\" cellspacing=\"0\" class=\"es-table-not-adapt es-social\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;padding-right:25px\"><a target=\"_blank\" href=\"https://twitter.com/creatorkailash\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;text-decoration:underline;color:#134F5C;font-size:14px\"><img title=\"Twitter\" src=\"https://wzenru.stripocdn.email/content/assets/img/social-icons/logo-black/twitter-logo-black.png\" alt=\"Tw\" width=\"24\" height=\"24\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\"></a></td>\n" +
                    "<td align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;padding-right:25px\"><a target=\"_blank\" href=\"https://www.instagram.com/thekaailashsharma/\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;text-decoration:underline;color:#134F5C;font-size:14px\"><img title=\"Instagram\" src=\"https://wzenru.stripocdn.email/content/assets/img/social-icons/logo-black/instagram-logo-black.png\" alt=\"Inst\" width=\"24\" height=\"24\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\"></a></td>\n" +
                    "<td align=\"center\" valign=\"top\" style=\"padding:0;Margin:0\"><a target=\"_blank\" href=\"https://www.linkedin.com/in/creatorkailash/\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;text-decoration:underline;color:#134F5C;font-size:14px\"><img title=\"Linkedin\" src=\"https://wzenru.stripocdn.email/content/assets/img/social-icons/logo-black/linkedin-logo-black.png\" alt=\"In\" width=\"24\" height=\"24\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\"></a></td></tr></table></td></tr></table></td></tr></table></td></tr></table></td>\n" +
                    "</tr></table><table cellpadding=\"0\" cellspacing=\"0\" class=\"es-footer\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top\"><tr style=\"border-collapse:collapse\"><td align=\"center\" style=\"padding:0;Margin:0\"><table bgcolor=\"#ffffff\" class=\"es-footer-body\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;width:600px\"><tr style=\"border-collapse:collapse\"><td align=\"left\" bgcolor=\"#ffffff\" style=\"padding:20px;Margin:0;background-color:#ffffff\"><!--[if mso]><table style=\"width:560px\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"width:270px\" valign=\"top\"><![endif]--><table cellpadding=\"0\" cellspacing=\"0\" class=\"es-left\" align=\"left\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left\"><tr style=\"border-collapse:collapse\"><td class=\"es-m-p20b\" align=\"left\" style=\"padding:0;Margin:0;width:270px\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"center\" style=\"padding:0;Margin:0;display:none\"></td>\n" +
                    "</tr></table></td></tr></table><!--[if mso]></td><td style=\"width:20px\"></td><td style=\"width:270px\" valign=\"top\"><![endif]--><table cellpadding=\"0\" cellspacing=\"0\" class=\"es-right\" align=\"right\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right\"><tr style=\"border-collapse:collapse\"><td align=\"left\" style=\"padding:0;Margin:0;width:270px\"><table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr style=\"border-collapse:collapse\"><td align=\"center\" style=\"padding:0;Margin:0;display:none\"></td></tr></table></td></tr></table><!--[if mso]></td></tr></table><![endif]--></td></tr></table></td>\n" +
                    "</tr></table></td></tr></table></td></tr></table></td></tr></table></td></tr></table></div></body></html>\n", "text/html");
            Transport.send(message);
            System.out.println("Done");
            image.setVisible(true);
            pw.setVisible(false);
            email.setDisable(true);
            name.setDisable(true);
            PauseTransition p1 = new PauseTransition();
            p1.setDuration(Duration.seconds(7));
            p1.setOnFinished(E -> {
                email.getScene().getWindow().hide();
                Stage signup = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Scene scene1 = new Scene(root);
                signup.setScene(scene1);
                signup.setResizable(false);
                signup.show();
                signup.setOnCloseRequest(e->{
                    Stage signup = new Stage();
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    Scene scene1 = new Scene(root);
                    signup.setScene(scene1);
                    signup.setResizable(false);
                    signup.show();
                });

            });
            p1.play();
        } catch (MessagingException e) {
            email.setDisable(true);
            name.setDisable(true);
            pw.setText("Incorrect Email Id");
            image.setVisible(false);
            pw.setVisible(true);
            PauseTransition p1 = new PauseTransition();
            p1.setDuration(Duration.seconds(3));
            p1.setOnFinished(E -> {
                pw.setVisible(false);
                email.setDisable(false);
                name.setDisable(false);
                email.clear();
                name.clear();
                email.requestFocus();
            });
            p1.play();
        }
    }
}

