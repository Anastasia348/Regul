import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Obed {

        public static void Obed(String input) {

            Pattern pattern = Pattern.compile("(2[0-3]|[0-1]\\d):[0-5]\\d");
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }

