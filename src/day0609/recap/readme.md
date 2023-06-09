1. 面向过程 vs 面向对象

- 不管是面向过程、面向对象，都是程序设计的思路。
- 面向过程：以函数为基本单位，适合解决简单问题
- 面向对象：以类为基本单位，适合解决复杂问题

### 2. 类、对象

- 类：抽象的，概念上的定义
- 对象：具体的，类的一个一个的实例。
- 面向对象完成具体功能的操作的三步流程

```
步骤1：创建类，并设计类的内部成员（属性、方法）
步骤2：创建类的对象。比如：Phone p1 = new Phone();
步骤3：通过对象，调用其内部声明的属性或方法，完成相关的功能
```

- 对象的内存解析
    - ...
- Java中内存结构的划分
    - Java中内存结构划分为：`虚拟机栈、堆、方法区`；程序计数器、本地方法栈
    - 虚拟机栈：以栈帧为基本单位，有入栈和出栈操作；每个栈帧入栈操作对应一个方法的执行；方法内的局部变量会存储在栈帧中。
    - 堆空间：new 出来的结构（数组、对象）：① 数组，数组的元素在堆中 ② 对象的成员变量在堆中。
    - 方法区：加载的类的模板结构。

### 3. 类的成员之一：属性（或成员变量）

- 属性 vs 局部变量
    - 声明的位置
    - 内存中存放的位置
    - 作用域
    - 权限修饰符
    - 初始化值
    - 生命周期
- state field ...

### 4. 类的成员之二：方法

- 方法的声明：权限修饰符 返回值类型 方法名(形参列表){// 方法体}
    - 重点：返回值类型、形参列表
- return关键字的使用

### 5. 方法的一些细节

#### 5.1 方法的重载(overload)

- 方法的重载的要求：同类、同名、不同参数列表
- 调用方法时，如何确定调用的是某个指定的方法呢？① 方法名 ② 形参列表

#### 5.2 可变个数形参的方法

- 格式：(int ... args)

#### 5.3 方法的参数传递机制：值传递(重点、难点)

```
> 如果形参是基本数据类型的变量，则将实参保存的数据值赋给形参。
> 如果形参是引用数据类型的变量，则将实参保存的地址值赋给形参。
```

#### 5.4 递归方法

- 递归方法构成了隐式的循环
- 对比：相较于循环结构，递归方法效率稍低，内存占用偏高。

### 6. 对象数组

- String[] ；Person[] ; Customer[]

### 7. package、import关键字的使用

- package：指明声明的类所属的包。
- import：当前类中，如果使用其它包下的类（除java.lang包），原则上就需要导入。

### 8. oop的特征之一：封装性

```
Java规定了4种权限修饰，分别是：private、缺省、protected、public。
我们可以使用4种权限修饰来修饰类及类的内部成员。当这些成员被调用时，体现可见性的大小。
```

举例：

```
> 场景1：私有化(private)类的属性，提供公共(public)的get和set方法，对此属性进行获取或修改
> 场景2：将类中不需要对外暴露的方法，设置为private
> 场景3：单例模式中构造器private的了，避免在类的外部创建实例。
```

程序设计的原则之一

```
-`高内聚`：类的内部数据操作细节自己完成，不允许外部干涉；
    Java程序通常以类的形态呈现，相关的功能封装到方法中。
-`低耦合`：仅暴露少量的方法给外部使用，尽量方便外部调用。
    给相关的类、方法设置权限，把该隐藏的隐藏起来，该暴露的暴露出去
```

### 9. 类的成员之三：构造器

- 如何定义：权限修饰符 类名(形参列表){}
- 构造器的作用：① 搭配上new，用来创建对象 ② 初始化对象的成员变量

### 10. 类的实例变量的赋值过程

```
1. 在类的属性中，可以有哪些位置给属性赋值？
① 默认初始化；
② 显式初始化；
③ 构造器中初始化；
**********************************
④ 通过"对象.方法"的方式赋值；
⑤ 通过"对象.属性"的方式赋值；

2. 这些位置执行的先后顺序是怎样？
① - ② - ③ - ④/⑤
```

## 二、企业真题

### 2.1 类与对象

#### 1. 谈谈对面向对象，面向过程的理解？



#### 2. Java 的引用类型有哪几种

类、数组、接口；枚举、注解、记录

#### 3. 类和对象的区别

### 2.2 Java内存结构

#### 1. Java虚拟机中内存划分为哪些区域，详细介绍一下



#### 2. 对象存在Java内存的哪块区域里面？

stack vs heap

### 2.3 权限修饰符（封装性）

#### 1. private 、缺省、protected、public 作用区域


#### 2. main方法的public能不能换成private？为什么？



### 2.4 构造器

#### 1. 构造方法和普通方法的区别

声明格式、作用都不同。

#### 2. 构造器Constructor是否可被overload?

#### 3. 无参构造器和有参构造器的的作用和应用