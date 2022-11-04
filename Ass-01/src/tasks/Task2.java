package tasks;


public class Task2 {
    public Boolean check(String str){

        if(str.startsWith("1")) {
            return 1 < str.chars().filter(ch -> ch == '1').count();
        }
        else if(str.startsWith("0")) {
            return 1 < str.chars().filter(ch -> ch == '0').count();
        }
        return false;
    }
}
