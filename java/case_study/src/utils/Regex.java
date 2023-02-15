package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public final String CODE_VILLA_SERVICE_REGEX = "^SVVL-\\d{4}$";
    public final String CODE_ROOM_SERVICE_REGEX = "^SVRO-\\d{4}$";
    public final String CODE_DAY_REGEX="^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
    public Pattern pattern;
    public Matcher matcher;

    public boolean checkCodeVillaServiceRegex(String codeVillaService) {
        pattern = Pattern.compile(CODE_VILLA_SERVICE_REGEX);
        matcher = pattern.matcher(codeVillaService);
        return matcher.matches();
    }

    public boolean checkCodeRoomServiceRegex(String codeRoomService) {
        pattern = Pattern.compile(CODE_ROOM_SERVICE_REGEX);
        matcher = pattern.matcher(codeRoomService);
        return matcher.matches();
    }
    public boolean checkCodeDay(String codeDay){
        pattern= Pattern.compile(CODE_DAY_REGEX);
        matcher= pattern.matcher(String.valueOf(codeDay));
        return matcher.matches();
    }
}