package round2task3;

public class CheckMailbox {

    public static boolean checkMailbox(String s) {
        //正则表达式来源： https://blog.csdn.net/fatherican/article/details/8853062
        return s.matches(    "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$");
    }
}
