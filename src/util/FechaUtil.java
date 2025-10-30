package util;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechaUtil {
    public static final DateTimeFormatter FECHA_HORA_FORMATO = DateTimeFormatter.ofPattern("dd MMM yyyy, H:mm",
            new Locale("es", "EC"));

    private FechaUtil() {}
}
