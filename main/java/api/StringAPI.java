package api;

public class StringAPI {

    /**
     * @author Jahiudl Islam
     * Read String JDK 8 API documantation to be read and String source code to be viewed
     * Demonastrate your understanding on String after reading the documentation
     * You are free to document your understanding using comment
     * Reason to comment is to keep documentation so that next developer can get highlevel understaning of your implementation
     * by reading your comments/documents
     *
     * Ans-----
     * // ANS---
     * /** String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.
     * // Construct a new String by decoding the byte array. It uses the char_set for decoding.
     * EXC----byte[] b_arr = {71, 101, 101, 107, 115};
     * Charset cs = Charset.defaultCharset();
     * String s_byte_char = new String(b_arr, cs);
     * As with any other object, you can create String objects by using the new keyword and a constructor. The String class has 11 constructors that allow you to provide the initial value of the string using different sources, such as an array of characters.
     * Note &minus; The String class is immutable, so that once it is created a String object cannot be changed. If there is a necessity to make a lot of modifications to Strings of characters, then you should use String Buffer & String Builder Classes.
     * */
}
