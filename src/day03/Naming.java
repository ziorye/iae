package day03;

/**
 * 每种编程语言都有自己的一套命名规则和约定，Java 编程语言也不例外
 * <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html">variables</a>
 *
 * Java开发手册
 *
 * Next
 * @see VariableBasic
 */
public class Naming {
    public static void main(String[] args) {
        /*
        大小写敏感 case-sensitive
        identifier 标识符
          - an unlimited-length sequence of Unicode letters and digits
            - beginning with a letter, the dollar sign "$" or the underscore character "_"
              - The convention, however, is to always begin your variable names with a letter, not "$" or "_".
          - don't start with digits
        White space is not permitted.
        When choosing a name for your variables, use full words instead of cryptic abbreviations. Doing so will make your code easier to read and understand.
        The name you choose must not be a keyword or reserved word. https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
         */
        int age = 8;
        int size = 8;

        // 可以，但不建议
        int $i = 9;
        int _i = 9;

        // 不能以数字开头
        //int 2a = 8;

        //空格不允许
        //int c d = 5;

        //关键字
        //int public = 0;
        //int goto = 8;
        // true, false, null
        //int null = 4;
    }
}
