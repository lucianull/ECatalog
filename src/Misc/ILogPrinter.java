
package Misc;

import CSVLogs.CSVReaderWriter;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public interface ILogPrinter {
    
    default void PrintLog(String log) {
        Instant instant = Instant.now();
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
        String timestamp = zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        CSVReaderWriter.getInstance().WriteToFile(log + ',' + timestamp);
    }
}
