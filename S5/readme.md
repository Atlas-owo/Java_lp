# 5 字符串
## 5.1 String类
char 类		——只能表示单个字符

String类	——可以表示单个或多个字符

由双引号""包围的部分都是字符串
### 5.1.1 声明字符串（变量）
```
	String str = [null];
```
### 5.1.2 用数组来创建String对象
用整个数组创建String对象
```
	char a[] = {'a','p','e'};
	String s1 = new String(a);
```

用数组的一部分创建String对象

String s = new String (char a[],int offsent,int length);	//其中offsent表示起始截取的位置，length表示截取的长度。
```
	char b[] = {'a','p','p','l','e'};
	String s2 = new String(a,0,3);
```
## 5.2 获取字符串信息
### 5.2.1 获取字符串长度
```
	str.length();
```
### 5.2.2 字符串查找
```
	str.indexOf(substr)
	E: int postion = str.indexOf(app);
```
