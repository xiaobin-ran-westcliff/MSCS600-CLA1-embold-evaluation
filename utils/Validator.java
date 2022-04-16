package utils;

import java.util.regex.Pattern;
public final class Validator {
    private static final Pattern MILLITARY_TIME_PATTERN = Pattern.compile("^[0-1][0-9][0-5][0-9]|2[0-3][0-5][0-9]$");
    private final Pattern ANYTHING;

    public Validator() {
        ANYTHING = Pattern.compile(".*");
    }

    public static boolean isValidMillitaryTime__LocalPatternCompile(String time) {
        Pattern localMillitaryTimePattern = Pattern.compile("^[0-1][0-9][0-5][0-9]|2[0-3][0-5][0-9]$");
        return localMillitaryTimePattern.matcher(time).matches();
    }

    public static boolean isValidMillitaryTime__GlobalPatternCompile(String time) {
        return MILLITARY_TIME_PATTERN.matcher(time).matches();
    }
}