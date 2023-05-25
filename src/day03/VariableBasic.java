package day03;

/**
 * 变量
 *   - 本质：容器、数据结构、内存上的一块区域/空间
 *   - 变量定义的格式：数据类型 变量名 = 变量值;
 *   - 备注：
 *      先声明，后使用
 *      作用域
 *      同作用域内，不可声明同名的变量
 *
 * Next
 * @see DataTypes
 */
public class VariableBasic {
    public static void main(String[] args) {
        // 数据类型 变量名 = 变量值
        int count = 2;
        // 变量的使用
        System.out.println(count);

        //System.out.println(size);

        //变量的声明
        int size;
        //System.out.println(size);
        //变量的赋值
        size = 1001;

        //int size = 22;
    }

    public static void otherMethod() {
        // System.out.println(count);
    }
}
