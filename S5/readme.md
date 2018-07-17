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
	E: int postion = str.indexOf(app);	//返回该字符串首次出现的位置，若没有出现，则返回-1
```
```
	str.lastIndexOf(substr)		//返回该字符串最后一次出现的位置，若没有则返回-1
```
### 5.2.3 获取指定位置的字符
```
	str.charAt(int index)
```
## 5.3 字符串操作
### 5.3.1 获取子字符串
```
	str.substring(int beginIndex)				//返回从指定的位置到结尾的字符串的子串
	str.substring(int beginIndex,int endIndex)	//返回从指定位置开始到指定位置结束的子串
```
### 5.3.2 去掉空格
```
	str.trim();
```
### 5.3.3 字符串替换
```
	str.replace(char oldChar,char newChar)		//oldChar、newChar为字符或字符串。全部替换。
```
### 5.3.4 判断字符串的开始与结尾
```
	str.startsWith(String prefix)		//String prefix为前置的字符或字符串
	str.endsWith(String suffix)
	//返回均为boolean型
```
### 5.3.5 判断字符串是否相等
```
	str.equals(String1 String2)				//区分大小写
	str.equalsIgnoreCase(String1 String2)	//不区分大小写
	//返回值均为boolean型
```
### 5.3.6 按字典顺序比较两个字符串（？）
```
	str.compareTo(String1 String2)
```
### 5.3.7 字母大小写切换
```
	str.toLowerCase()
	str.toUpperCase()
```
### 5.3.8 字符串分割
```
	str.spilt(String sign)				//其中sign为分割字符串的分隔符，
	str.spilt(String sign,int limit)	//其中limit为限制的切割次数
```
## 5.4 格式化字符串
```
	str.format(String format,Object...args)
```

### 5.4.1 日期与时间字符格式化

