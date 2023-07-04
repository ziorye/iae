package day0608.vars.e;

/**
 * 练习：可变形参的方法
 *
 * n个字符串进行拼接，每一个字符串之间使用某字符进行分割-=，如果没有传入字符串，那么返回空字符串""
 */
public class StringConcat {
    public static void main(String[] args) {
        // hello-world-dfdfd
    }

    /*
    public String concat(String operator,String ... strs){
        String result = "";

        for (int i = 0;i < strs.length;i++){
            if(i == 0){
                result += strs[i];
            }else{
                result += (operator + strs[i]);
            }
        }

        return result;
    }
     */
}
