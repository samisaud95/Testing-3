//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
//Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

    }
    public static String testFormatoDataOra(ZonedDateTime dateTime){
        OffsetDateTime data1= OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String date1String = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        System.out.println("Data1 " + date1String);
        return date1String;
    }



    public static String formatoMedium(ZonedDateTime date){
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }

}