package W02.chap05;

public class E5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                {'`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String src = "abc123";
        String result = "";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if (!Character.isDigit(ch)) {
                for (int j = 0; j < abcCode.length; j++) {
                    if (ch == abcCode[j]) {
                        result = "" + ch;
                    }
                }
            } else {
                for (int j = 0; j < numCode.length; j++) {
                    if (ch == numCode[j]) {
                        result = "" + ch;
                    }
                }
            }
        }

        System.out.println("src: " + src);
        System.out.println("result: " + result);
    }
}
