# Object类
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/package-summary.html

## Object类的说明
- java.lang.Object
- 任何一个Java类（除Object类）都直接或间接的继承于Object类
- Object类称为Java类的根父类
- Object类中声明的结构（属性、方法等）就具有通用性
- Object类中没有声明属性
- Object类提供了一个空参的构造器

## 主要方法
- equals()、toString()
- clone()、finalize()
- getClass()、hashCode()、notify()、notifyAll()、wait()、wait(xx)、wait(xx, yy)

### equals()的使用

#### 适用性：
任何引用数据类型都可以使用。

#### java.lang.Object类中equals()的定义
public boolean equals(Object obj) {
    return (this == obj);
}

#### 子类使用说明：
- 自定义的类在没有重写Object中equals()方法的情况下，调用的就是Object类中声明的equals()，比较两个
对象的引用地址是否相同（或比较两个对象是否指向了堆空间中的同一个对象实体）

- 对于像String、File、Date和包装类等，它们都重写了Object类中的equals()方法，用于比较两个对象的
实体内容是否相等。

#### 开发中使用说明
- 实际开发中，针对于自定义的类，常常会判断两个对象是否equals()，而此时主要是判断两个对象的属性值是否相等。
所以：我们要重写Object类的equals()方法。
- 如何重写:
- 手动自己实现
- 调用IDEA自动实现（推荐）

#### 高频面试题： 区分 == 和 equals()

==：运算符
1. 使用范围：基本数据类型、引用数据类型
2. 基本数据类型：判断数据值是否相等

int i1 = 10;
int i2 = 10;
sout(i1 == i2);

char c1 = 'A';
int i3 = 65;
sout(c1 == i3);

引用数据类型变量：比较两个引用变量的地址值是否相等（或比较两个引用是否指向同一个对象实体）

equals()：方法
- 使用范围：只能使用在引用数据类型上。
- 具体使用：对于类来说，重写equals()和不重写equals()的区别。


### toString()的使用

#### Object类中toString()的定义：
public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}

#### 开发中的使用场景
- 平时我们在调用System.out.println()打印对象引用变量时，其实就调用了对象的toString()

#### 子类使用说明：
- 自定义的类，在没有重写Object类的toString()的情况下，默认返回的是当前对象的地址值。
- 像String、File、Date或包装类等Object的子类，它们都重写了Object类的toString()，在调用toString()时，
返回当前对象的实体内容。

#### 开发中使用说明
- 习惯上，开发中对于自定义的类在调用toString()时，也希望显示其对象的实体内容，而非地址值。这时候，就需要重写Object
类中的toString()方法
