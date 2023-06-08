
一、package关键字的使用

1. 说明
- package:包
- package用于指明该文件中定义的类、接口等结构所在的包
- 一个源文件只能有一个声明包的package语句
- package语句作为Java源文件的第一条语句出现。若缺省该语句，则指定为无名包。
- 包名，属于标识符，满足标识符命名的规则和规范（全部小写）、见名知意
    - 包通常使用所在公司域名的倒置：com.abc.xxx。
    - 大家取包名时不要使用"`java.xx`"包
- 包对应于文件系统的目录，package语句中用 “.” 来指明包(目录)的层次，每.一次就表示一层文件目录。
- 同一个包下可以声明多个结构（类、接口），但是不能定义同名的结构（类、接口）。不同的包下可以定义同名的结构（类、接口）


2. 包的作用
- 包可以包含类和子包，划分`项目层次`，便于管理
- 帮助`管理大型软件`系统：将功能相近的类划分到同一个包中。比如：MVC的设计模式
- 解决`类命名冲突`的问题
- 控制`访问权限`


3. JDK中主要的包

`java.lang`----包含一些Java语言的核心类，如String、Math、Integer、 System和Thread，提供常用功能
`java.net`----包含执行与网络相关的操作的类和接口。
`java.io`   ----包含能提供多种输入/输出功能的类。
`java.util`----包含一些实用工具类，如定义系统特性、接口的集合框架类、使用与日期日历相关的函数。
`java.text`----包含了一些java格式化相关的类
`java.sql`----包含了java进行JDBC数据库编程的相关类/接口
`java.awt`----包含了构成抽象窗口工具集（abstract window toolkits）的多个类，这些类被用来构建和管理应用程序的图形用户界面(GUI)。


二、import关键字的使用
- import : 导入
- import语句来显式引入指定包下所需要的类。相当于`import语句告诉编译器到哪里去寻找这个类`。
- import语句，声明在包的声明和类的声明之间。
- 如果需要导入多个类或接口，那么就并列显式多个import语句即可
- 如果使用`a.*`导入结构，表示可以导入a包下的所有的结构。举例：可以使用java.util.*的方式，一次性导入util包下所有的类或接口。
- 如果导入的类或接口是java.lang包下的，或者是当前包下的，则可以省略此import语句。
- 如果已经导入java.a包下的类，那么如果需要使用a包的子包下的类的话，仍然需要导入。
- 如果在代码中使用不同包下的同名的类，那么就需要使用类的全类名的方式指明调用的是哪个类。
- （了解）`import static`组合的使用：调用指定类或接口下的静态的属性或方法


