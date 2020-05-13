public class StringTest {

    // 对于一个UTF-16编码的扩展字符，它以4个字节来表示
    // Java的字符在内部以UTF-16编码方式来表示，String.length返回的是Code Unit的长度，而不再是Unicode中字符的长度。
    // 对于传统的BMP平面的代码点，String.length和我们传统理解的字符的数量是一致的，
    // 对于扩展的字符，String.length可能是我们理解的字符长度的两倍。
    public static void main(String[] args) {
//        String s = "helloworld中国";
//        System.out.println(s.charAt(10));

        // 中文常见字
        String s = "你好";
        System.out.println("1. string length =" + s.length());
        System.out.println("1. string bytes length =" + s.getBytes().length);
        System.out.println("1. string char length =" + s.toCharArray().length);
        System.out.println(s.charAt(0));
        System.out.println(s.codePointAt(0));
        System.out.println(s.codePointAt(1));
        System.out.println(s.codePointCount(0, s.length()));
        System.out.println();
        // emojis
        s = "👦👩";
        System.out.println("2. string length =" + s.length());
        System.out.println("2. string bytes length =" + s.getBytes().length);
        System.out.println("2. string char length =" + s.toCharArray().length);
        System.out.println(s.charAt(0));
        System.out.println(s.codePointAt(0));
        System.out.println(s.codePointAt(1));
        System.out.println(s.codePointAt(2));
        System.out.println(s.codePointAt(3));
        System.out.println(s.codePointCount(0, s.length()));
        System.out.println();
        // 中文生僻字
        s = "𡃁妹";
        System.out.println("3. string length =" + s.length());
        System.out.println("3. string bytes length =" + s.getBytes().length);
        System.out.println("3. string char length =" + s.toCharArray().length);
        System.out.println(s.charAt(0));
        System.out.println(s.codePointAt(0));
        System.out.println(s.codePointAt(1));
        System.out.println(s.codePointCount(0, s.length()));
        System.out.println();
    }
}
