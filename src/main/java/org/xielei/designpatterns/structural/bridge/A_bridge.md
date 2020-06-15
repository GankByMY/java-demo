## 桥接模式的定义与特点

在现实生活中，某些类具有两个或多个维度的变化，如图形既可按形状分，又可按颜色分。如何设计类似于 Photoshop 这样的软件，能画不同形状和不同颜色的图形呢？如果用继承方式，m 种形状和 n 种颜色的图形就有 m×n 种，不但对应的子类很多，而且扩展困难。

### 桥接（Bridge）模式的定义

将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。

### 桥接（Bridge）模式的作用

* 由于抽象与实现分离，所以扩展能力强
* 其实现细节对客户透明。

缺点是：

* 由于聚合关系建立在抽象层，要求开发者针对抽象化进行设计与编程，这增加了系统的理解与设计难度
* 桥接模式的结构与实现
* 可以将抽象化部分与实现化部分分开，取消二者的继承关系，改用组合关系

## 模式的结构与实现

可以将抽象化部分与实现化部分分开，取消二者的继承关系，改用组合关系。

### 桥接（Bridge）模式的结构

* 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用
* 扩展抽象化（Refined    Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法
* 实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用
* 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实

### 桥接（Bridge）模式的实现

其结构如图所示：

![](http://c.biancheng.net/uploads/allimg/181115/3-1Q115125253H1.gif)桥接模式的应用场景

## 桥接模式应用场景

* 当一个类存在两个独立变化的维度，且这两个维度都需要进行扩展时
* 当一个系统不希望使用继承或因为多层次继承导致系统类的个数急剧增加时
* 当一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性时

## 桥接模式模式的扩展

在软件开发中，有时桥接（Bridge）模式可与适配器模式联合使用。当桥接（Bridge）模式的实现化角色的接口与现有类的接口不一致时，可以在二者中间定义一个适配器将二者连接起来，其具体结构图如图所示

![](http://c.biancheng.net/uploads/allimg/181115/3-1Q1151255004c.gif)