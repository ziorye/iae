# 多态 polymorphism

## Java 中多态性的体现:
   子类对象的多态性：父类的引用指向子类的对象。（或子类的对象赋给父类的引用）
   比如:Person p = new Student();

## 多态性的底层：
   多态性的底层：虚方法调用

在多态的场景下，调用方法时。
编译时，认为方法是左边声明的父类的类型的方法（即被重写的方法）
执行式，实际执行的是子类重写父类的方法。
编译看左边，运行看右边。

command + click

## 多态性的使用前提
- 要有继承关系
- 要有方法的重写
- 父类引用指向子类对象

## 多态的适用性
- 适用于方法，不适用于属性。

## 多态的弊端与好处
### 弊端：
   在多态的场景下，我们创建了子类的对象，也加载了子类特有的属性和方法。
   但是由于声明为父类的引用，导致我们没有办法直接调用子类特有的属性和方法。

### 好处：
极大的减少了代码的冗余，不需要定义多个重载的方法。

## instanceof
### 向上转型：多态
满足前提
### 向下转型：强转
可能报错
为了代码的健壮性，在向下转型之前应该用 instanceof 进行判断，避免出现类型转换异常
格式： a instanceof A : 判断对象a是否是类A的实例
如果 a instanceOf A 返回 true，则：
    a instanceOf superA 返回也是true。其中，A 是 superA 的子类。

/*
* 1. 建议在向下转型之前，使用instanceof进行判断，避免出现类型转换异常
* 2. 格式： a instanceOf A : 判断对象a是否是类A的实例。
* 3. 如果a instanceOf A 返回true，则：
*       a instanceOf superA 返回也是true。其中，A 是superA的子类。
* */
