例：

1、写一个名为Account的类模拟银行账户。
该类包括的属性：账号id，余额balance，年利率annualInterestRate；
包含的构造器：自定义
包含的方法：访问器方法（getter和setter方法），取款方法withdraw()，存款方法deposit()。

提示：在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。


2、创建Customer类。
- 声明三个私有对象属性：firstName、lastName和account。
- 声明一个公有构造器，这个构造器带有两个代表对象属性的参数（f和l）
- 声明两个公有 getter 来访问该对象属性，方法getFirstName和getLastName返回相应的属性。
- 声明setAccount 方法来对account属性赋值。
- 声明getAccount 方法以获取account属性。

3、写一个测试程序。
- 创建一个Customer ，名字叫"小富", 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
- 做如下操作
存入 100 元，再取出960元。再取出2000元。

输出例子：
成功存入 ：100.0
成功取出：960.0
余额不足，取款失败

打印出"小富"的基本信息：
Customer [小富] 有一个账户: id=1000, annualInterestRate=1.23％, balance=1140.0