

import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public class Utility {

    public static final Charset UTF8 = Charset.forName("UTF-8");
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final long ZERO = 0l;
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static String toUtf8(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        return new String(bytes, UTF8);
    }

    public static String toString(byte[] bytes) {
        return toUtf8(bytes);
    }

    public static byte[] toBytes(String utf8) {
        return utf8 != null && !"".equals(utf8.trim()) ? utf8.getBytes(UTF8) : EMPTY_BYTE_ARRAY;
    }
}
