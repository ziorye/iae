member 3：

constructor 构造器、构造方法

作用
  - new 实例化、创建对象
  - 同时，为 state 赋值

细节
- 声明的格式：权限修饰符 类名(形参列表){}
- 创建类以后，在没有显示提供任何构造器的情况下，系统会默认提供一个空参的构造器，且构造器的权限
与类声明的权限相同。check by class viewer
- 一旦类中显示声明了构造器，则系统不再提供默认的空参的构造器。
- 一个类中可以声明多个构造器，彼此之间构成重载。

API String