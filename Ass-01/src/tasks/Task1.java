package tasks;

import java.util.regex.Pattern;

public class Task1 {
    public Boolean check(String str){
        return Pattern.matches("^(?![^0\\n]*0[^0\\n]*(?:0[^0\\n]*0)*[^0\\n]*$)(?![^1\\n]*1[^1\\n]*(?:1[^1\\n]*1)*[^1\\n]*$)[10]*$",str);
    }
}
