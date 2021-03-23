# 【Java学习笔记】

这是我个人学习Java时留下的笔记，仅包含一些常用的类，以及这些类的一些常用方法，文中有对应的举例。

学习时使用的是IDEA，打开IDEA后，选择open即可打开本项目，取消main文件中的注释，即可测试不同类的功能。

使用到了JDK 11 的中文文档：<https://www.runoob.com/java/java-tutorial.html>

目录
=================

* [System类](https://github.com/HoteUMing/Java_Basic_Demo#System类)
* [Scanner类](https://github.com/HoteUMing/Java_Basic_Demo#Scanner类)
* [Math类](https://github.com/HoteUMing/Java_Basic_Demo#Math类)
* [Random类](https://github.com/HoteUMing/Java_Basic_Demo#Random类)
* [String类](https://github.com/HoteUMing/Java_Basic_Demo#String类)
* [StringBuilder类](https://github.com/HoteUMing/Java_Basic_Demo#StringBuilder类)
* [Date类](https://github.com/HoteUMing/Java_Basic_Demo#Date类)
* [SimpleDateFormat类](https://github.com/HoteUMing/Java_Basic_Demo#SimpleDateFormat类)
* [Collection接口类](https://github.com/HoteUMing/Java_Basic_Demo#Collection接口类)
* [ArrayList类](https://github.com/HoteUMing/Java_Basic_Demo#ArrayList类)
* [LinkedList类](https://github.com/HoteUMing/Java_Basic_Demo#LinkedList类)
* [HashSet类](https://github.com/HoteUMing/Java_Basic_Demo#HashSet类)
* [LinkedHashSet类](https://github.com/HoteUMing/Java_Basic_Demo#LinkedHashSet类)
* [HashMap类](https://github.com/HoteUMing/Java_Basic_Demo#HashMap类)
* [LinkedHashMap类](https://github.com/HoteUMing/Java_Basic_Demo#LinkedHashMap类)
* [Iterator接口](https://github.com/HoteUMing/Java_Basic_Demo#Iterator接口)
* [Arrays工具类](https://github.com/HoteUMing/Java_Basic_Demo#Arrays工具类)
* [Collections工具类类](https://github.com/HoteUMing/Java_Basic_Demo#Collections工具类类)
* [Properties类](https://github.com/HoteUMing/Java_Basic_Demo#Properties类)
* [File类](https://github.com/HoteUMing/Java_Basic_Demo#File类)
* [FileFilter类](https://github.com/HoteUMing/Java_Basic_Demo#FileFilter类)
* [FileOutputStream类](https://github.com/HoteUMing/Java_Basic_Demo#FileOutputStream类)
* [FileInputStream类](https://github.com/HoteUMing/Java_Basic_Demo#FileInputStream类)
* [FileWriter类](https://github.com/HoteUMing/Java_Basic_Demo#FileWriter类)
* [FileReader类](https://github.com/HoteUMing/Java_Basic_Demo#FileReader类)
* [Thread类](https://github.com/HoteUMing/Java_Basic_Demo#Thread类)
* [ExecutorService类](https://github.com/HoteUMing/Java_Basic_Demo#ExecutorService类)
* [Socket类](https://github.com/HoteUMing/Java_Basic_Demo#Socket类)
* [ServerSocket类](https://github.com/HoteUMing/Java_Basic_Demo#ServerSocket类)

# System类

字段摘要

| 数据类型           | 字段名称 | 描述             |
| ------------------ | -------- | ---------------- |
| static PrintStream | err      | “标准”错误输出流 |
| static InputStream | in       | “标准”输入流     |
| static PrintStream | out      | “标准”输出流     |

常用方法摘要

| 返回值类型  | 方法名              | 描述                                                         |
| ----------- | ------------------- | ------------------------------------------------------------ |
| static long | currentTimeMillis() | 返回以毫秒为单位的当前时间                                   |
| static void | gc()                | 运行垃圾回收器                                               |
| static void | exit(int status)    | 终止当前运行的Java虚拟机【参数为0表示正常退出，非0则表示非正常退出】 |

举例

``` java
long time = System.currentTimeMillis();
System.out.println("System.currentTimeMillis：" + time);
//System.currentTimeMillis : 1611669529003

System.gc();
System.exit(0);
```

# Scanner类

常用构造方法

| 构造方法                    | 描述                                                   |
| --------------------------- | ------------------------------------------------------ |
| Scanner(InputStream source) | 构造一个新的 Scanner，它生成的值是从指定的输入流扫描的 |

常用方法摘要

| 返回值类型 | 方法名        | 描述                                         |
| ---------- | ------------- | -------------------------------------------- |
| Scanner    | reset()       | 重置此扫描仪                                 |
| boolean    | hasNext()     | 如果此扫描器的输入中有另一个标记，则返回true |
| String     | nextLine()    | 使此扫描器前进超过当前行并返回跳过的输入     |
| String     | next()        | 查找并返回来自此扫描器的下一个完整标记       |
| boolean    | nextBoolean() | 扫描解释为一个布尔值的输入标记并返回该值     |
| byte       | nextByte()    | 将输入信息的下一个标记扫描为一个 byte        |
| double     | nextDouble()  | 将输入信息的下一个标记扫描为一个 double      |
| float      | nextFloat()   | 将输入信息的下一个标记扫描为一个 float       |
| int        | nextInt()     | 将输入信息的下一个标记扫描为一个 int         |
| long       | nextLong()    | 将输入信息的下一个标记扫描为一个 long        |
| short      | nextShort()   | 将输入信息的下一个标记扫描为一个 short       |
| void       | close()       | 关闭此扫描器                                 |

举例

``` java
Scanner sc = new Scanner(System.in);
sc.reset();

//输入：hasNext & nextLine
boolean b = sc.hasNext();
System.out.println("sc.hasNext()：" + b);
//sc.hasNext()：true

String line = sc.nextLine();
System.out.println("nextLine(): " + line);
//nextLine(): hasNext & nextLine

//输入：next
String str = sc.next();
System.out.println("next(): " + str);
//next(): next

//输入：true
boolean bl = sc.nextBoolean();
System.out.println("nextBoolean(): " + bl);
//nextBoolean(): true

//输入：1
byte bt = sc.nextByte();
System.out.println("nextByte(): " + bt);
//nextByte(): 1

//输入：2.00
double db = sc.nextDouble();
System.out.println("nextDouble(): " + db);
//nextDouble(): 2.0

//输入：3.0
float f = sc.nextFloat();
System.out.println("nextFloat(): " + f);
//nextFloat(): 3.0

//输入：4
int num = sc.nextInt();
System.out.println("nextInt(): " + num);
//nextInt(): 4

//输入：5
long l = sc.nextLong();
System.out.println("nextLong(): " + l);
//nextLong(): 5

//输入：6
short s = sc.nextShort();
System.out.println("nextShort(): " + s);
//nextShort(): 6

sc.close();
```

# Math类

字段摘要

| 数据类型      | 字段名称 | 描述                                                        |
| ------------- | -------- | ----------------------------------------------------------- |
| static double | E        | 比任何其他值都更接近 e（即自然对数的底数）的 double 值      |
| static double | PI       | 比任何其他值都更接近 pi（即圆的周长与直径之比）的 double 值 |

常用方法摘要

| 返回值类型    | 方法名                   | 描述                                                         |
| ------------- | ------------------------ | ------------------------------------------------------------ |
| static double | abs(double a)            | 返回 double 值的绝对值                                       |
| static double | exp(double a)            | 返回欧拉数 e 的 double 次幂的值                              |
| static double | sqrt(double a)           | 返回正确舍入的 double 值的正平方根                           |
| static double | cbrt(double a)           | 返回 double 值的立方根                                       |
| static double | pow(double a, double b)  | 返回第一个参数的第二个参数次幂的值                           |
| static double | ceil(double a)           | 返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数【向上取整】 |
| static double | floor(double a)          | 返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数【向下取整】 |
| static double | rint(double a)           | 返回与 double值最接近的 double值，该值等于数学整数【优先选择偶数】 |
| static double | round(double a)          | 返回最接近参数的 long【四舍五入】                            |
| static double | sin(double a)            | 返回角的三角正弦                                             |
| static double | cos(double a)            | 返回角的三角余弦                                             |
| static double | tan(double a)            | 返回角的三角正切                                             |
| static double | asin(double a)           | 返回值的反正弦值; 返回的角度在-pi / 2到pi / 2的范围内        |
| static double | acos(double a)           | 返回值的反余弦值; 返回的角度在0.0到pi的范围内                |
| static double | atan(double a)           | 返回值的反正切值; 返回的角度在-pi / 2到pi / 2的范围内        |
| static double | log(double a)            | 返回 double 值的自然对数（底数是 e）                         |
| static double | log10(double a)          | 返回 double 值的底数为 10 的对数                             |
| static double | max(double a, double b)  | 返回两个 double 值中较大的一个                               |
| static double | min(double a, double b)  | 返回两个 double 值中较小的一个                               |
| static double | toDegrees(double angrad) | 将用弧度表示的角转换为近似相等的用角度表示的角               |
| static double | toRadians(double angdeg) | 将用角度表示的角转换为近似相等的用弧度表示的角               |
| static double | random()                 | 返回带有正号的 double值，大于或等于 0.0且小于 1.0            |

举例

``` java
double E = Math.E;
System.out.println("E : " + E);
//E : 2.718281828459045

double PI = Math.PI;
System.out.println("PI : " + PI);
//PI : 3.141592653589793

double abs = Math.abs(-1.00);
System.out.println("abs(-1.00): " + abs);
//abs(-1.00): 1.0

double exp = Math.exp(1.00);
System.out.println("exp(1.00): " + exp);
//exp(1.00): 2.718281828459045

double sqrt = Math.sqrt(4.00);
System.out.println("sqrt(4.00): " + sqrt);
//sqrt(4.00): 2.0

double cbrt = Math.cbrt(-8.00);
System.out.println("cbrt(-8.00): " + cbrt);
//cbrt(-8.00): -2.0

double pow = Math.pow(2.00, 3.00);
System.out.println("pow(2.00, 3.00): " + pow);
//pow(2.00, 3.00): 8.0

double ceil = Math.ceil(3.50);
System.out.println("ceil(3.50): " + ceil);
//ceil(3.50): 4.0

double floor = Math.floor(4.50);
System.out.println("floor(4.50): " + floor);
//floor(4.50): 4.0

double rint = Math.rint(5.50);
System.out.println("rint(5.50): " + rint);
//rint(5.50): 6.0

long round = Math.round(6.50);
System.out.println("round(6.50): " + round);
//round(6.50): 7

double sin = Math.sin(Math.PI / 4);
System.out.println("sin(Math.PI / 4): " + sin);
//sin(Math.PI / 4): 0.7071067811865475

double cos = Math.cos(Math.PI / 4);
System.out.println("cos(Math.PI / 4): " + cos);
//cos(Math.PI / 4): 0.7071067811865476

double tan = Math.tan(Math.PI / 4);
System.out.println("tan(Math.PI / 4): " + tan);
//tan(Math.PI / 4): 0.9999999999999999

double asin = Math.asin(1.00);
System.out.println("asin(1.00): " + asin);
//asin(1.00): 1.5707963267948966

double acos = Math.acos(1.00);
System.out.println("acos(1.00): " + acos);
//acos(1.00): 0.0

double atan = Math.atan(1.00);
System.out.println("atan(1.00): " + atan);
//atan(1.00): 0.7853981633974483

double log = Math.log(Math.E);
System.out.println("log(Math.E): " + log);
//log(Math.E): 1.0

double log10 = Math.log10(100);
System.out.println("log10(100): " + log10);
//log10(100): 2.0

double max = Math.max(-7.00, 7.00);
System.out.println("max(-7.00, 7.00): " + max);
//max(-7.00, 7.00): 7.0

double min = Math.min(-8.00, 8.00);
System.out.println("min(-8.00, 8.00): " + min);
//min(-8.00, 8.00): -8.0

double toD = Math.toDegrees(Math.PI);
System.out.println("toDegrees(Math.PI): " + toD);
//toDegrees(Math.PI): 180.0

double toR = Math.toRadians(180);
System.out.println("toRadians(180): " + toR);
//toRadians(180): 3.141592653589793

double random = Math.random();
System.out.println("random(): " + random);
//random(): 0.5316715523775751
```

# Random类

> 在多线程设计中考虑使用ThreadLocalRandom

常用构造方法

| 构造方法 | 描述                     |
| -------- | ------------------------ |
| Random() | 创建一个新的随机数生成器 |

常用方法摘要

| 返回值类型 | 方法名                  | 描述                                                         |
| ---------- | ----------------------- | ------------------------------------------------------------ |
| boolean    | nextBoolean()           | 返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 boolean 值 |
| void       | nextBytes(byte[] bytes) | 生成随机字节并将它们放入用户提供的字节数组中                 |
| double     | nextDouble()            | 返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 double 值 |
| float      | nextFloat()             | 返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 float 值 |
| double     | nextGaussian()          | 返回下一个伪随机数，它是取自此随机数生成器序列的、呈高斯（“正态”）分布的 double 值，其平均值是 0.0，标准差是 1.0 |
| int        | nextInt()               | 返回下一个伪随机数，从该随机数生成器的序列中均匀分布 int值   |
| int        | nextInt(int n)          | 返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值 |
| long       | nextLong()              | 返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 long 值 |

举例

``` java
Random r = new Random();

boolean b = r.nextBoolean();
System.out.println("nextBoolean(): " + b);
//nextBoolean(): false

byte[] bytes = new byte[5];
r.nextBytes(bytes);
System.out.println("nextBytes(bytes)" + Arrays.toString(bytes));
//nextBytes(bytes)[4, -18, 20, 61, 73]

double db = r.nextDouble();
System.out.println("nextDouble(): " + db);
//nextDouble(): 0.8192964378293072

float f = r.nextFloat();
System.out.println("nextFloat(): " + f);
//nextFloat(): 0.27216375

double g = r.nextGaussian();
System.out.println("nextGaussian(): " + g);
//nextGaussian(): 2.0332856781737765

int i = r.nextInt();
System.out.println("nextInt(): " + i);
//nextInt(): -296402314

int num = r.nextInt(10);
System.out.println("nextInt(10): " + num);
//nextInt(10): 8

long l = r.nextLong();
System.out.println("nextLong(): " + l);
//nextLong(): -5008595948936808178
```

# String类

常用构造方法

| 构造方法                                     | 描述                                                         |
| -------------------------------------------- | ------------------------------------------------------------ |
| String()                                     | 初始化一个新创建的 String 对象，使其表示一个空字符序列【通常不使用，而是直接赋值】 |
| String(byte[] bytes)                         | 通过使用平台的默认字符集解码指定的字节数组构造新的 String    |
| String(byte[] bytes, int offset, int length) | 通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String |
| String(char[] value)                         | 分配新的 String ，使其表示当前包含在字符数组参数中的字符序列 |
| String(char[] value, int offset, int count)  | 分配一个新的 String ，其中包含字符数组参数的子数组中的字符   |

常用方法摘要

| 返回值类型    | 方法名                                  | 描述                                                         |
| ------------- | --------------------------------------- | ------------------------------------------------------------ |
| char          | charAt(int index)                       | 返回指定索引处的 char 值                                     |
| String        | concat(String str)                      | 将指定字符串连接到此字符串的结尾                             |
| boolean       | contains(CharSequence s)                | 当且仅当此字符串包含指定的 char 值序列时，返回 true          |
| boolean       | equals(Object anObject)                 | 将此字符串与指定的对象比较                                   |
| boolean       | equalsIgnoreCase(String anotherString)  | 将此 String 与另一个 String 比较，不考虑大小写               |
| boolean       | startsWith(String prefix)               | 测试此字符串是否以指定的前缀开头                             |
| boolean       | endsWith(String suffix)                 | 测试此字符串是否以指定的后缀结尾                             |
| byte[]        | getBytes()                              | 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中 |
| char[]        | toCharArray()                           | 将此字符串转换为一个新的字符数组                             |
| int           | indexOf(int ch)                         | 返回指定字符第一次出现的字符串中的索引                       |
| int           | indexOf(String str)                     | 返回指定子字符串在此字符串中第一次出现处的索引               |
| int           | lastIndexOf(int ch)                     | 返回指定字符最后一次出现的字符串中的索引                     |
| int           | lastIndexOf(String str)                 | 返回指定子字符串在此字符串中最右边出现处的索引               |
| boolean       | isEmpty()                               | 当且仅当 length() 为 0 时返回 true                           |
| boolean       | isBlank()                               | 如果字符串为空或仅包含 white space代码点，则返回 true ，否则 false |
| int           | length()                                | 返回此字符串的长度                                           |
| String        | repeat(int count)                       | 返回一个字符串，其值为此字符串的串联重复 count次             |
| String        | replace(char oldChar, char newChar)     | 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的 |
| String[]      | split(String regex)                     | 根据给定正则表达式的匹配拆分此字符串                         |
| String        | substring(int beginIndex)               | 返回一个新的字符串，它是此字符串的一个子字符串【从包含begin开始到末尾】 |
| String        | substring(int beginIndex, int endIndex) | 返回一个新字符串，它是此字符串的一个子字符串【包含begin，不包含end】 |
| String        | trim()                                  | 返回一个字符串，其值为此字符串，删除了所有前导和尾随空格，其中space被定义为其代码点小于或等于 'U+0020' （空格字符）的任何字符 |
| static String | valueOf(int i)                          | 返回 int 参数的字符串表示形式                                |

举例

``` java
String str1 = "测试a";
System.out.println(str1);
//测试a

String str2 = new String(new byte[]{97, 98, 99, 100, 101});
System.out.println(str2);
//abcde

String str3 = new String(new byte[]{97, 98, 99, 100, 101}, 1, 3);
System.out.println(str3);
//bcd

String str4 = new String(new char[]{'a', 'b', 'c', 'd', 'e'});
System.out.println(str4);
//abcde

String str5 = new String(new char[]{'a', 'b', 'c', 'd', 'e'}, 1, 3);
System.out.println(str5);
//bcd

char ca = str1.charAt(0);
System.out.println("charAt(0): " + ca);
//charAt(0): 测

str1 = str1.concat(".测试b");
System.out.println("concat(\".测试b\"): " + str1);
//concat(".测试b"): 测试a.测试b

boolean b1 = str1.contains("测试");
System.out.println("contains(\"测试\"): " + b1);
//contains("测试"): true

boolean b2 = str1.equals("测试A.测试B");
System.out.println("equals(\"测试A.测试B\"): " + b2);
//equals("测试A.测试B"): false

boolean b3 = str1.equalsIgnoreCase("测试A.测试B");
System.out.println("equalsIgnoreCase(\"测试A.测试B\"): " + b3);
//equalsIgnoreCase("测试A.测试B"): true

boolean b4 = str1.startsWith("测试");
System.out.println("startsWith(\"测试\"): " + b4);
//startsWith("测试"): true

boolean b5 = str1.endsWith("测试");
System.out.println("endsWith(\"测试\"): " + b5);
//endsWith("测试"): false

byte[] bt = str1.getBytes();
System.out.println("getBytes(): " + Arrays.toString(bt));
//getBytes(): [-26, -75, -117, -24, -81, -107, 97, 46, -26, -75, -117, -24, -81, -107, 98]

char[] chars = str1.toCharArray();
System.out.println("toCharArray(): " + Arrays.toString(chars));
//toCharArray(): [测, 试, a, ., 测, 试, b]

int index1 = str1.indexOf('a');
System.out.println("indexOf('a'): " + index1);
//indexOf('a'): 2

int index2 = str1.indexOf("测试");
System.out.println("indexOf(\"测试\"): " + index2);
//indexOf("测试"): 0

int index3 = str1.lastIndexOf('a');
System.out.println("lastIndexOf('a'): " + index3);
//lastIndexOf('a'): 2

int index4 = str1.lastIndexOf("测试");
System.out.println("lastIndexOf(\"测试\"): " + index4);
//lastIndexOf("测试"): 4

boolean b6 = str1.isEmpty();
System.out.println("isEmpty(): " + b6);
//isEmpty(): false

boolean b7 = str1.isBlank();
System.out.println("isBlank(): " + b7);
//isBlank(): false

int length = str1.length();
System.out.println("length(): " + length);
//length(): 7

str1 = str1.repeat(2);
System.out.println("repeat(2): " + str1);
//repeat(2): 测试a.测试b测试a.测试b

str1 = str1.replace("测试", "测验");
System.out.println("replace(\"测试\", \"测验\"): " + str1);
//replace("测试", "测验"): 测验a.测验b测验a.测验b

String[] strs = str1.split("\\.");
System.out.println("str1.split(\"\\\\.\"): " + Arrays.toString(strs));
//str1.split("\\."): [测验a, 测验b测验a, 测验b]

str1 = str1.substring(1);
System.out.println("substring(1): " + str1);
//substring(1): 验a.测验b测验a.测验b

str1 = str1.substring(1, 4);
System.out.println("substring(1, 4): " + str1);
//substring(1, 4): a.测

str1 = str1.trim();
System.out.println("trim(): " + str1);
//trim(): a.测

String str6 = String.valueOf(123456789);
System.out.println("valueOf : " + str6);
//valueOf : 123456789
```

# StringBuilder类

> StringBuilder实例不适合多线程使用。 如果需要这样的同步，则建议使用StringBuffer
>
> StringBuilder 相较于 StringBuffer 有速度优势

常用构造方法

| 构造方法                  | 描述                                                       |
| ------------------------- | ---------------------------------------------------------- |
| StringBuilder()           | 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符 |
| StringBuilder(String str) | 构造一个初始化为指定字符串内容的字符串构建器               |

常用方法摘要

| 返回值类型    | 方法名                                  | 描述                                                         |
| ------------- | --------------------------------------- | ------------------------------------------------------------ |
| int           | capacity()                              | 返回当前容量                                                 |
| StringBuilder | append(String str)                      | 将指定的字符串追加到此字符序列                               |
| char          | charAt(int index)                       | 返回此序列中指定索引处的 char 值                             |
| StringBuilder | delete(int start, int end)              | 移除此序列的子字符串中的字符                                 |
| StringBuilder | deleteCharAt(int index)                 | 移除此序列指定位置上的 char                                  |
| int           | indexOf(String str)                     | 返回指定子字符串第一次出现的字符串中的索引                   |
| int           | lastIndexOf(String str)                 | 返回指定子字符串最后一次出现的字符串中的索引                 |
| StringBuilder | insert(int offset, String str)          | 将字符串插入此字符序列中                                     |
| int           | length()                                | 返回长度（字符数）                                           |
| void          | setLength(int newLength)                | 设置字符序列的长度                                           |
| StringBuilder | replace(int start, int end, String str) | 使用给定 String 中的字符替换此序列的子字符串中的字符         |
| void          | setCharAt(int index, char ch)           | 指定索引处的字符设置为 ch                                    |
| StringBuilder | reverse()                               | 将此字符序列用其反转形式取代                                 |
| String        | substring(int start)                    | 返回一个新的 String ，其中包含此字符序列中当前包含的字符的子序列 |
| String        | substring(int start, int end)           | 返回一个新的 String ，其中包含当前包含在此序列中的字符的子序列 |
| void          | trimToSize()                            | 尝试减少用于字符序列的存储空间                               |

举例

``` java
StringBuilder sb = new StringBuilder();
StringBuilder sb2 = new StringBuilder("01234567");

int capacity = sb.capacity();
System.out.println("capacity(): " + capacity);
//capacity(): 16

sb2.append("89");
System.out.println("append(\"89\"): " + sb2);
//append("89"): 0123456789

char ca = sb2.charAt(0);
System.out.println("charAt(0): " + ca);
//charAt(0): 0

sb2.delete(1, 3);
System.out.println("delete(1, 3): " + sb2);
//delete(1, 3): 03456789

sb2.deleteCharAt(0);
System.out.println("deleteCharAt(0): " + sb2);
//deleteCharAt(0): 3456789

int index1 = sb2.indexOf("89");
System.out.println("indexOf(\"89\"): " + index1);
//indexOf("89"): 5

int index2 = sb2.lastIndexOf("89");
System.out.println("lastIndexOf(\"89\"): " + index2);
//lastIndexOf("89"): 5

sb2.insert(1, "a");
System.out.println("insert(1, \"a\"): " + sb2);
//insert(1, "a"): 3a456789

sb2.setLength(12);
int length = sb2.length();
System.out.println("length(): " + length);
//length(): 12

sb2.replace(0, 2, "test");
System.out.println("replace(0, 2, \"test\"): " + sb2);
//replace(0, 2, "test"): test456789

sb2.setCharAt(0, 'b');
System.out.println("setCharAt(0,'b'): " + sb2);
//setCharAt(0,'b'): best456789

sb2.reverse();
System.out.println("reverse(): " + sb2);
//reverse():     987654tseb

String str1 = sb2.substring(5);
System.out.println("substring(5): " + str1);
//substring(3): 87654tseb

String str2 = sb2.substring(0, 6);
System.out.println("substring(0, 6): " + str2);
//substring(0, 6):     98

sb2.trimToSize();
System.out.println("trimToSize(): " + sb2);
//trimToSize():     987654tseb
```

# Date类

常用构造方法

| 构造方法        | 描述                                                         |
| --------------- | ------------------------------------------------------------ |
| Date()          | 分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒） |
| Date(long date) | 分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数 |

常用方法摘要

| 返回值类型 | 方法名               | 描述                                                         |
| ---------- | -------------------- | ------------------------------------------------------------ |
| boolean    | after(Date when)     | 测试此日期是否在指定日期之后                                 |
| boolean    | before(Date when)    | 测试此日期是否在指定日期之前                                 |
| boolean    | equals(Object obj)   | 比较两个日期的相等性                                         |
| int        | compareTo(Date date) | 比较当调用此方法的Date对象和指定日期。两者相等时候返回0。调用对象在指定日期之前则返回负数。调用对象在指定日期之后则返回正数 |
| void       | setTime(long time)   | 将此 Date对象设置为表示格林尼治标准时间1970年1月1日00:00:00之后的 time毫秒的时间点 |
| long       | getTime()            | 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数 |

举例

``` java
Date date1 = new Date();
System.out.println("date1: " + date1);
//date1: Wed Feb 17 22:58:36 CST 2021

Date date2 = new Date(1579583281187L);
System.out.println("date2: " + date2);
//date2: Tue Jan 21 13:08:01 CST 2020

boolean b1 = date1.after(date2);
System.out.println("after(date2): " + b1);
//after(date2): true

boolean b2 = date1.before(date2);
System.out.println("before(date2): " + b2);
//before(date2): false

boolean b3 = date1.equals(date2);
System.out.println("equals(date2): " + b3);
//equals(date2): false

int compare = date1.compareTo(date2);
System.out.println("compareTo(date2): " + compare);
//compareTo(date2): 1

date1.setTime(1579583281187L);
System.out.println("setTime(1579583281187L): " + date1);
//setTime(1579583281187L): Tue Jan 21 13:08:01 CST 2020

long l = date1.getTime();
System.out.println("getTime(): " + l);
//getTime(): 1579583281187
```

# SimpleDateFormat类

> y   年
> M   年中的月份
> d   月份中的天数
> D   年中的天数
> E   星期中的天数
> a   Am/pm 标记
> H   一天中的小时数（0-23）
> k   一天中的小时数（1-24）
> h   am/pm 中的小时数（1-12）
> K   am/pm 中的小时数（0-11）
> m   小时中的分钟数
> s   分钟中的秒数
> S   毫秒数
> z   时区

常用构造方法

| 构造方法                         | 描述                                                         |
| -------------------------------- | ------------------------------------------------------------ |
| SimpleDateFormat(String pattern) | 用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat |

常用方法摘要

| 返回值类型 | 方法名               | 描述                                       |
| ---------- | -------------------- | ------------------------------------------ |
| String     | format(Date date)    | 将一个 Date 格式化为日期/时间字符串        |
| Date       | parse(String source) | 从给定字符串的开始解析文本，以生成一个日期 |

举例

``` java
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH-mm-ss:SS");
String str = sdf.format(new Date(1579583281187L));
System.out.println("format(new Date(1579583281187L)): " + str);
//format(new Date(1579583281187L)): 2020-01-21 下午 13-08-01:187

try {
	Date date = sdf.parse(str);
	System.out.println("parse(str): " + date);
    //parse(str): Tue Jan 21 13:08:01 CST 2020
} catch (ParseException e) {
	System.out.println("error : " + e);
}
```

# Collection接口类

常用方法摘要

| 返回值类型  | 方法名                            | 描述                                                         |
| ----------- | --------------------------------- | ------------------------------------------------------------ |
| boolean     | add(E e)                          | 确保此 collection 包含指定的元素（可选操作）                 |
| boolean     | addAll(Collection<? extends E> c) | 将指定集合中的所有元素添加到此集合中（可选操作）             |
| boolean     | contains(Object o)                | 如果此 collection 包含指定的元素，则返回 true                |
| boolean     | containsAll(Collection<?> c)      | 如果此集合包含指定集合中的所有元素，则返回 true              |
| boolean     | isEmpty()                         | 如果此 collection 不包含元素，则返回 true                    |
| boolean     | remove(Object o)                  | 从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作） |
| boolean     | removeAll(Collection<?> c)        | 删除此集合的所有元素，这些元素也包含在指定的集合中（可选操作） |
| boolean     | retainAll(Collection<?> c)        | 仅保留此集合中包含在指定集合中的元素（可选操作）             |
| int         | size()                            | 返回此 collection 中的元素数                                 |
| void        | clear()                           | 移除此 collection 中的所有元素（可选操作）                   |
| Iterator<E> | iterator()                        | 返回在此 collection 的元素上进行迭代的迭代器                 |

# ArrayList类

> 从JDK 1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的
> 泛型只能用引用类型，不能是基本类型

常用构造方法

| 构造方法                       | 描述                             |
| ------------------------------ | -------------------------------- |
| ArrayList()                    | 构造一个初始容量为 10 的空列表   |
| ArrayList(int initialCapacity) | 构造一个具有指定初始容量的空列表 |

常用方法摘要

| 返回值类型 | 方法名                    | 描述                                                         |
| ---------- | ------------------------- | ------------------------------------------------------------ |
| boolean    | add(E e)                  | 将指定的元素添加到此列表的尾部                               |
| void       | add(int index, E element) | 将指定的元素插入此列表中的指定位置                           |
| boolean    | contains(Object o)        | 如果此列表中包含指定的元素，则返回 true                      |
| E          | get(int index)            | 返回此列表中指定位置上的元素                                 |
| int        | indexOf(Object o)         | 返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1 |
| int        | lastIndexOf(Object o)     | 返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1 |
| boolean    | isEmpty()                 | 如果此列表中没有元素，则返回 true                            |
| E          | remove(int index)         | 移除此列表中指定位置上的元素                                 |
| boolean    | remove(Object o)          | 移除此列表中首次出现的指定元素（如果存在）                   |
| E          | set(int index, E element) | 用指定的元素替代此列表中指定位置上的元素                     |
| int        | size()                    | 返回此列表中的元素数                                         |
| void       | trimToSize()              | 将此 ArrayList实例的容量调整为列表的当前大小                 |
| void       | clear()                   | 移除此列表中的所有元素                                       |

举例

``` java
ArrayList<String> list1 = new ArrayList<>();
ArrayList<String> list2 = new ArrayList<>(20);

boolean b1 = list1.add("a");
System.out.println("add(\"a\"): " + b1);
//add("a"): true

list1.add(0, "b");
System.out.println("add(0, \"b\"): " + list1);
//add(0, "b"): [b, a]

boolean b2 = list1.contains("c");
System.out.println("contains(\"c\"): " + b2);
//contains("c"): false

String str = list1.get(0);
System.out.println("get(0): " + str);
//get(0): b

int index1 = list1.indexOf("a");
System.out.println("indexOf(\"a\"): " + index1);
//indexOf("a"): 1

int index2 = list1.lastIndexOf("b");
System.out.println("lastIndexOf(\"b\"): " + index2);
//lastIndexOf("b"): 0

boolean b3 = list1.isEmpty();
System.out.println("isEmpty(): " + b3);
//isEmpty(): false

String rstr = list1.remove(0);
System.out.println("remove(0): " + rstr);
//remove(0): b

boolean b4 = list1.remove("b");
System.out.println("remove(\"b\"): " + b4);
//remove("b"): false

String sstr = list1.set(0, "test");
System.out.println("set(0, \"test\"): " + sstr);
//set(0, "test"): a

list1.trimToSize();
int size = list1.size();
System.out.println("size(): " + size);
//size(): 1

list1.clear();
```

# LinkedList类

常用构造方法

| 构造方法     | 描述           |
| ------------ | -------------- |
| LinkedList() | 构造一个空列表 |

常用方法摘要

| 返回值类型 | 方法名                    | 描述                                                         |
| ---------- | ------------------------- | ------------------------------------------------------------ |
| boolean    | add(E e)                  | 将指定的元素追加到此列表的末尾【建议使用addLast(E e)】       |
| void       | add(int index, E element) | 在此列表中指定的位置插入指定的元素                           |
| void       | addFirst(E e)             | 将指定元素插入此列表的开头                                   |
| void       | addLast(E e)              | 将指定元素添加到此列表的结尾                                 |
| boolean    | contains(Object o)        | 如果此列表包含指定元素，则返回 true                          |
| E          | element()                 | 检索但不删除此列表的头部（第一个元素）【建议使用getFirst()】 |
| E          | peek()                    | 检索但不删除此列表的头部（第一个元素）【建议使用getFirst()】 |
| E          | get(int index)            | 返回此列表中指定位置处的元素                                 |
| E          | getFirst()                | 返回此列表的第一个元素                                       |
| E          | getLast()                 | 返回此列表的最后一个元素                                     |
| int        | indexOf(Object o)         | 返回此列表中首次出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1 |
| int        | lastIndexOf(Object o)     | 返回此列表中最后出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1 |
| E          | pop()                     | 从此列表所表示的堆栈处弹出一个元素                           |
| void       | push(E e)                 | 将元素推入此列表所表示的堆栈                                 |
| E          | remove()                  | 检索并删除此列表的头部（第一个元素）【建议使用removeFirst()】 |
| E          | remove(int index)         | 删除此列表中指定位置的元素                                   |
| E          | removeFirst()             | 移除并返回此列表的第一个元素                                 |
| E          | removeLast()              | 移除并返回此列表的最后一个元素                               |
| int        | size()                    | 返回此列表的元素数                                           |
| E          | set(int index, E element) | 将此列表中指定位置的元素替换为指定的元素                     |
| boolean    | isEmpty()                 | 如果列表不包含元素，则返回 true                              |
| void       | clear()                   | 从此列表中移除所有元素                                       |

举例

``` java
LinkedList<String> linked = new LinkedList<>();

boolean b1 = linked.add("a");
System.out.println("add(\"a\"): " + b1);
//add("a"): true

linked.add(0, "b");
System.out.println("add(0,\"b\"): " + linked);
//add(0,"b"): [b, a]

linked.addFirst("c");
System.out.println("addFirst(\"c\"): " + linked);
//addFirst("c"): [c, b, a]

linked.addLast("d");
System.out.println("addLast(\"d\"): " + linked);
//addLast("d"): [c, b, a, d]

boolean b2 = linked.contains("a");
System.out.println("contains(\"a\"): " + b2);
//contains("a"): true

String str1 = linked.element();
System.out.println("element(): " + str1);
//element(): c

String str2 = linked.peek();
System.out.println("peek(): " + str2);
//peek(): c

String str3 = linked.get(1);
System.out.println("get(1): " + str3);
//get(1): b

String first = linked.getFirst();
System.out.println("getFirst(): " + first);
//getFirst(): c

String last = linked.getLast();
System.out.println("getLast(): " + last);
//getLast(): d

int index1 = linked.indexOf("a");
System.out.println("indexOf(\"a\"): " + index1);
//indexOf("a"): 2

int index2 = linked.lastIndexOf("b");
System.out.println("lastIndexOf(\"b\"): " + index2);
//lastIndexOf("b"): 1

String pop = linked.pop();
System.out.println("pop(): " + pop);
//pop(): c

linked.push("e");
System.out.println("push(\"e\"): " + linked);
//push("e"): [e, b, a, d]

String set = linked.set(1, "f");
System.out.println("set(1, \"f\"): " + set);
//set(1, "f"): b

String r1 = linked.remove();
System.out.println("remove(): " + r1);
//remove(): e

String r2 = linked.remove(1);
System.out.println("remove(1): " + r2);
//remove(1): a

String r3 = linked.removeFirst();
System.out.println("removeFirst(): " + r3);
//removeFirst(): f

String r4 = linked.removeLast();
System.out.println("removeLast(): " + r4);
//removeLast(): d

int size = linked.size();
System.out.println("size(): " + size);
//size(): 0

boolean b3 = linked.isEmpty();
System.out.println("isEmpty(): " + b3);
//isEmpty(): true

linked.clear();
```

# HashSet类

常用构造方法

| 构造方法                     | 描述                                                         |
| ---------------------------- | ------------------------------------------------------------ |
| HashSet()                    | 构造一个新的空集; 支持HashMap实例具有默认初始容量（16）和加载因子（0.75） |
| HashSet(int initialCapacity) | 构造一个新的空集; 支持HashMap实例具有指定的初始容量和默认加载因子（0.75） |

常用方法摘要

| 返回值类型 | 方法名             | 描述                                         |
| ---------- | ------------------ | -------------------------------------------- |
| boolean    | add(E e)           | 如果指定的元素尚不存在，则将其添加到此集合中 |
| boolean    | contains(Object o) | 如果此set包含指定的元素，则返回 true         |
| boolean    | isEmpty()          | 如果此集合不包含任何元素，则返回 true        |
| boolean    | remove(Object o)   | 如果存在，则从该集合中移除指定的元素         |
| int        | size()             | 返回此集合中的元素数（基数）                 |
| void       | clear()            | 从该集中删除所有元素                         |

举例

``` java
HashSet<String> hashSet1 = new HashSet<>();
HashSet<String> hashSet2 = new HashSet<>(20);

boolean b1 = hashSet1.add("a");
System.out.println("add(\"a\"): " + b1);
//add("a"): true

boolean b2 = hashSet1.add("a");
System.out.println("add(\"a\"): " + b2);
//add("a"): false

boolean b3 = hashSet1.contains("a");
System.out.println("contains(\"a\"): " + b3);
//contains("a"): true

boolean b4 = hashSet1.isEmpty();
System.out.println("isEmpty(): " + b4);
//isEmpty(): false

boolean b5 = hashSet1.remove("a");
System.out.println("remove(\"a\"): " + b5);
//remove("a"): true

int size = hashSet1.size();
System.out.println("size(): " + size);
//size(): 0

hashSet1.clear();
```

# LinkedHashSet类

> HashSet的子类，方法继承，LinkedHashSet自身有序

常用构造方法

| 构造方法                           | 描述                                                         |
| ---------------------------------- | ------------------------------------------------------------ |
| LinkedHashSet()                    | 使用默认初始容量（16）和加载因子（0.75）构造一个新的空链接哈希集 |
| LinkedHashSet(int initialCapacity) | 使用指定的初始容量和默认加载因子（0.75）构造一个新的空链接哈希集 |

举例

``` java
HashSet<String> hashSet = new HashSet<>();
hashSet.add("c");
hashSet.add("b");
hashSet.add("a");
System.out.println("hashSet: " + hashSet);
//hashSet: [a, b, c]

LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>(20);
linkedHashSet1.add("c");
linkedHashSet1.add("b");
linkedHashSet1.add("a");
System.out.println("linkedHashSet1: " + linkedHashSet1);
//linkedHashSet1: [c, b, a]
```

# HashMap类

> 自定义类型时key类型需重写hashCode和equals

常用构造方法

| 构造方法                     | 描述                                                         |
| ---------------------------- | ------------------------------------------------------------ |
| HashMap()                    | 构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap |
| HashMap(int initialCapacity) | 使用指定的初始容量和默认加载因子（0.75）构造一个空 HashMap   |

常用方法摘要

| 返回值类型 | 方法名                      | 描述                                                         |
| ---------- | --------------------------- | ------------------------------------------------------------ |
| V          | put(K key, V value)         | 在此映射中关联指定值与指定键                                 |
| V          | get(Object key)             | 返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回 null |
| boolean    | containsKey(Object key)     | 如果此映射包含对于指定键的映射关系，则返回 true              |
| boolean    | containsValue(Object value) | 如果此映射将一个或多个键映射到指定值，则返回 true            |
| int        | size()                      | 返回此映射中的键-值映射关系数                                |
| boolean    | isEmpty()                   | 如果此映射不包含键-值映射关系，则返回 true                   |
| V          | remove(Object key)          | 从此映射中移除指定键的映射关系（如果存在）                   |
| void       | clear()                     | 从此映射中移除所有映射关系                                   |

举例

``` java
Map<Integer, String> map1 = new HashMap<>();
Map<Integer, String> map2 = new HashMap<>(20);

String put = map1.put(0, "a");
System.out.println("put(0, \"a\"): " + put);
//put(0, "a"): null

String get = map1.get(0);
System.out.println("get(0): " + get);
//get(0): a

boolean b1 = map1.containsKey(0);
System.out.println("containsKey(0): " + b1);
//containsKey(0): true

boolean b2 = map1.containsValue("a");
System.out.println("containsValue(\"a\"): " + b2);
//containsValue("a"): true

int size = map1.size();
System.out.println("size(): " + size);
//size(): 1

boolean b3 = map1.isEmpty();
System.out.println("isEmpty(): " + b3);
//isEmpty(): false

String remove = map1.remove(0);
System.out.println("remove(0): " + remove);
//remove(0): a

map1.clear();
```

# LinkedHashMap类

> HashMap的子类，方法继承，LinkedHashMap自身有序

常用构造方法

| 构造方法                           | 描述                                                         |
| ---------------------------------- | ------------------------------------------------------------ |
| LinkedHashMap()                    | 使用默认初始容量（16）和加载因子（0.75）构造一个空的插入排序 LinkedHashMap实例 |
| LinkedHashMap(int initialCapacity) | 构造一个具有指定初始容量和默认加载因子（0.75）的空插入排序 LinkedHashMap实例 |

举例

``` java
HashMap<Integer, String> hashMap = new HashMap<>();
hashMap.put(2, "c");
hashMap.put(1, "b");
hashMap.put(0, "a");
System.out.println("hashMap: " + hashMap);
//hashMap: {0=a, 1=b, 2=c}

LinkedHashMap<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
LinkedHashMap<Integer, String> linkedHashMap2 = new LinkedHashMap<>(20);
linkedHashMap1.put(2, "c");
linkedHashMap1.put(1, "b");
linkedHashMap1.put(0, "a");
System.out.println("linkedHashMap1: " + linkedHashMap1);
//linkedHashMap1: {2=c, 1=b, 0=a}
```

# Iterator接口

常用方法摘要

| 返回值类型 | 方法名    | 描述                              |
| ---------- | --------- | --------------------------------- |
| boolean    | hasNext() | 如果仍有元素可以迭代，则返回 true |
| E          | next()    | 返回迭代的下一个元素              |

举例

``` java
Collection<String> list = new ArrayList<>();

list.add("a");
list.add("b");
list.add("c");
list.add("d");

Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
	System.out.println("iterator.next(): " + iterator.next());
	//iterator.next(): a
	//iterator.next(): b
	//iterator.next(): c
	//iterator.next(): d
}
```

# Arrays工具类

常用方法摘要

| 返回值类型    | 方法名                                             | 描述                                                 |
| ------------- | -------------------------------------------------- | ---------------------------------------------------- |
| static void   | sort(int[] a)                                      | 对指定的 int 型数组按数字升序进行排序                |
| static void   | sort(int[] a, int fromIndex, int toIndex)          | 按升序对数组的指定范围进行排序                       |
| static void   | fill(int[] a, int val)                             | 将指定的int值分配给指定的int数组的每个元素           |
| static void   | fill(int[] a, int fromIndex, int toIndex, int val) | 将指定的int值分配给指定的int数组的指定范围的每个元素 |
| static String | toString(int[] a)                                  | 返回指定数组内容的字符串表示形式                     |

举例

``` java
int[] num = new int[]{8, 9, 4, 7, 6, 3, 2, 5, 1, 0};
System.out.println("num: " + Arrays.toString(num));
//num: [8, 9, 4, 7, 6, 3, 2, 5, 1, 0]

Arrays.sort(num, 0, 5);
System.out.println("Arrays.sort(num,0,5): " + Arrays.toString(num));
//Arrays.sort(num,0,5): [4, 6, 7, 8, 9, 3, 2, 5, 1, 0]

Arrays.sort(num);
System.out.println("Arrays.sort(num): " + Arrays.toString(num));
//Arrays.sort(num): [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

Arrays.fill(num, 0, 5, 0);
System.out.println("Arrays.fill(num,0,5,0): " + Arrays.toString(num));
//Arrays.fill(num,0,5,0): [0, 0, 0, 0, 0, 5, 6, 7, 8, 9]

Arrays.fill(num, 1);
System.out.println("Arrays.fill(num,1): " + Arrays.toString(num));
//Arrays.fill(num,1): [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

# Collections工具类类

常用方法摘要

| 返回值类型                                    | 方法名                                         | 描述                                        |
| --------------------------------------------- | ---------------------------------------------- | ------------------------------------------- |
| static <T> boolean                            | addAll(Collection<? super T> c, T... elements) | 将所有指定元素添加到指定 collection 中      |
| static void                                   | shuffle(List<?> list)                          | 使用默认随机源对指定列表进行置换            |
| static void                                   | reverse(List<?> list)                          | 反转指定列表中元素的顺序                    |
| static <T> boolean                            | replaceAll(List<T> list, T oldVal, T newVal)   | 用列表替换列表中所有出现的指定值            |
| static void                                   | rotate(List<?> list, int distance)             | 按指定距离旋转指定列表中的元素              |
| static <T extends Comparable<? super T>> void | sort(List<T> list)                             | 根据元素的自然顺序 对指定列表按升序进行排序 |
| static <T> void                               | fill(List<? super T> list, T obj)              | 用指定的元素替换指定列表的所有元素          |

举例

``` java
List<String> list = new ArrayList<>();

Collections.addAll(list, "a", "b", "c", "d", "e");
System.out.println("Collections.addAll(list, \"a\", \"b\",\"c\",\"d\"): " + list);
//Collections.addAll(list, "a", "b","c","d"): [a, b, c, d, e]

Collections.shuffle(list);
System.out.println("Collections.shuffle(list): " + list);
//Collections.shuffle(list): [a, d, e, c, b]

Collections.reverse(list);
System.out.println("Collections.reverse(list): " + list);
//Collections.reverse(list): [b, c, e, d, a]

Collections.replaceAll(list, "a", "f");
System.out.println("Collections.replaceAll(list, \"a\", \"f\"): " + list);
//Collections.replaceAll(list, "a", "f"): [b, c, e, d, f]

Collections.rotate(list, 2);
System.out.println("Collections.rotate(list,2): " + list);
//Collections.rotate(list,2): [d, f, b, c, e]

Collections.sort(list);
System.out.println("Collections.sort(list): " + list);
//Collections.sort(list): [b, c, d, e, f]

Collections.fill(list, "g");
System.out.println("Collections.fill(list,\"g\"): " + list);
//Collections.fill(list,"g"): [g, g, g, g, g]
```

# Properties类

常用构造方法

| 构造方法                        | 描述                                                         |
| ------------------------------- | ------------------------------------------------------------ |
| Properties()                    | 创建一个没有默认值的空属性列表                               |
| Properties(int initialCapacity) | 创建一个没有默认值的空属性列表，并且初始大小容纳指定数量的元素，而无需动态调整大小 |

常用方法摘要

| 返回值类型  | 方法名                                   | 描述                                                         |
| ----------- | ---------------------------------------- | ------------------------------------------------------------ |
| Object      | setProperty(String key, String value)    | 调用 Hashtable方法 put                                       |
| String      | getProperty(String key)                  | 在此属性列表中搜索具有指定键的属性                           |
| void        | store(OutputStream out, String comments) | 将此 Properties表中的此属性列表（键和元素对）以适合使用 load(InputStream)方法加载到 Properties表的格式写入输出流 |
| void        | store(Writer writer, String comments)    | 将此 Properties表中的此属性列表（键和元素对）以适合使用 load(Reader)方法的格式写入输出字符流 |
| void        | load(InputStream inStream)               | 从输入字节流中读取属性列表（键和元素对）                     |
| void        | load(Reader reader)                      | 以简单的面向行的格式从输入字符流中读取属性列表（键和元素对） |
| Set<String> | stringPropertyNames()                    | 从此属性列表返回一组不可修改的键，其中键及其对应的值是字符串，如果尚未从主属性列表中找到相同名称的键，则包括默认属性列表中的不同键 |

举例

``` java
try {
	Properties properties1 = new Properties();
	Properties properties2 = new Properties(10);
	properties1.setProperty("0", "a");
	properties1.setProperty("1", "b");
	properties1.setProperty("2", "c");
	System.out.println("properties1: " + properties1.toString());
	//properties1: {0=a, 1=b, 2=c}

	File file = new File("prop.txt");
	FileWriter writer = new FileWriter(file);
	properties1.store(writer, "sava data");
	writer.close();

	FileReader reader = new FileReader("prop.txt");
	properties2.load(reader);
	Set<String> set = properties2.stringPropertyNames();
	for (String key : set) {
		String value = properties2.getProperty(key);
		System.out.println("properties2.getProperty(" + key + "): " + value);
		//properties2.getProperty(0): a
		//properties2.getProperty(1): b
		//properties2.getProperty(2): c
	}
	reader.close();
	file.delete();
} catch (Exception e) {
	System.out.println("Error: " + e.getMessage());
}
```

# File类

> 绝对路径：是一个完整的路径。以盘符开始的路径，如“D:IdeaProjects\shungyuan\a.txt”
> 相对路径：是一个简化的路径。相对于当前项目的根目录，如“a.txt”
> 1、路径是不区分大小写
> 2、反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠

字段摘要

| 数据类型      | 字段名称      | 描述                                     |
| ------------- | ------------- | ---------------------------------------- |
| static String | pathSeparator | 与系统有关的路径分隔符【windows是;】     |
| static String | separator     | 与系统有关的默认名称分隔符【windows是\】 |

常用构造方法

| 构造方法                          | 描述                                                         |
| --------------------------------- | ------------------------------------------------------------ |
| File(String pathname)             | 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例 |
| File(URI uri)                     | 通过将给定的 file: URI转换为抽象路径名来创建新的 File实例    |
| File(File parent, String child)   | 从父抽象路径名和子路径名字符串创建新的 File实例              |
| File(String parent, String child) | 从父路径名字符串和子路径名字符串创建新的 File实例            |

常用方法摘要

| 返回值类型 | 方法名                                               | 描述                                                         |
| ---------- | ---------------------------------------------------- | ------------------------------------------------------------ |
| boolean    | createNewFile()                                      | 当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件 |
| boolean    | exists()                                             | 测试此抽象路径名表示的文件或目录是否存在                     |
| boolean    | canExecute()                                         | 测试应用程序是否可以执行此抽象路径名表示的文件               |
| boolean    | canRead()                                            | 测试应用程序是否可以读取此抽象路径名表示的文件               |
| boolean    | canWrite()                                           | 测试应用程序是否可以修改此抽象路径名表示的文件               |
| String     | getAbsolutePath()                                    | 返回此抽象路径名的绝对路径名字符串                           |
| File       | getAbsoluteFile()                                    | 返回此抽象路径名的绝对路径名形式                             |
| String     | getName()                                            | 返回由此抽象路径名表示的文件或目录的名称                     |
| String     | getPath()                                            | 将此抽象路径名转换为一个路径名字符串                         |
| boolean    | isAbsolute()                                         | 测试此抽象路径名是否为绝对路径                               |
| boolean    | isDirectory()                                        | 测试此抽象路径名表示的文件是否是一个目录                     |
| boolean    | isFile()                                             | 测试此抽象路径名表示的文件是否是一个标准文件                 |
| boolean    | isHidden()                                           | 测试此抽象路径名指定的文件是否为隐藏文件                     |
| long       | lastModified()                                       | 返回上次修改此抽象路径名表示的文件的时间                     |
| long       | length()                                             | 返回由此抽象路径名表示的文件的长度                           |
| String[]   | list()                                               | 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录 |
| String[]   | list(FilenameFilter filter)                          | 返回一个字符串数组，用于命名由此抽象路径名表示的目录中的文件和目录，以满足指定的过滤器 |
| File[]     | listFiles()                                          | 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件 |
| File[]     | listFiles(FileFilter filter)                         | 返回一个抽象路径名数组，表示此抽象路径名表示的目录中满足指定过滤器的文件和目录 |
| boolean    | mkdir()                                              | 创建此抽象路径名指定的目录                                   |
| boolean    | mkdirs()                                             | 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录     |
| boolean    | renameTo(File dest)                                  | 重命名此抽象路径名表示的文件                                 |
| boolean    | delete()                                             | 删除此抽象路径名表示的文件或目录                             |
| boolean    | setExecutable(boolean executable)                    | 一种方便的方法，用于设置此抽象路径名的所有者执行权限         |
| boolean    | setExecutable(boolean executable, boolean ownerOnly) | 设置此抽象路径名的所有者或每个人的执行权限                   |
| boolean    | setLastModified(long time)                           | 设置此抽象路径名指定的文件或目录的上次修改时间               |
| boolean    | setReadable(boolean readable)                        | 一种方便的方法，用于设置此抽象路径名的所有者读取权限         |
| boolean    | setReadable(boolean readable, boolean ownerOnly)     | 设置此抽象路径名的所有者或每个人的读取权限                   |
| boolean    | setReadOnly()                                        | 标记此抽象路径名指定的文件或目录，以便仅允许读取操作         |
| boolean    | setWritable(boolean writable)                        | 一种方便的方法，用于设置此抽象路径名的所有者写入权限         |
| boolean    | setWritable(boolean writable, boolean ownerOnly)     | 设置此抽象路径名的所有者或每个人的写入权限                   |

举例

``` java
String ps = File.pathSeparator;
System.out.println("File.pathSeparator: " + ps);
//File.pathSeparator: ;

String se = File.separator;
System.out.println("File.separator: " + se);
//File.separator: \

try {
	File file = new File("test.txt");

	boolean b1 = file.createNewFile();
	System.out.println("createNewFile(): " + b1);
    //createNewFile(): true

	boolean b2 = file.exists();
	System.out.println("exists(): " + b2);
    //exists(): true

	boolean b3 = file.canExecute();
	System.out.println("canExecute(): " + b3);
    //canExecute(): true

	boolean b4 = file.canWrite();
	System.out.println("canWrite(): " + b4);
    //canWrite(): true

	boolean b5 = file.canRead();
	System.out.println("canRead(): " + b5);
    //canRead(): true

	String ap = file.getAbsolutePath();
	System.out.println("getAbsolutePath(): " + ap);
    //getAbsolutePath(): D:\JetBrains\Project\Java_Basic_Demo\test.txt

	File af = file.getAbsoluteFile();
	System.out.println("getAbsoluteFile(): " + af);
    //getAbsoluteFile(): D:\JetBrains\Project\Java_Basic_Demo\test.txt

	String name = file.getName();
	System.out.println("getName(): " + name);
    //getName(): test.txt

	String path = file.getPath();
	System.out.println("getPath(): " + path);
    //getPath(): test.txt

	boolean b6 = file.isAbsolute();
	System.out.println("isAbsolute(): " + b6);
    //isAbsolute(): false

	boolean b7 = file.isDirectory();
	System.out.println("isDirectory(): " + b7);
    //isDirectory(): false

	boolean b8 = file.isFile();
	System.out.println("isFile(): " + b8);
    //isFile(): true

	boolean b9 = file.isHidden();
	System.out.println("isHidden(): " + b9);
    //isHidden(): false

	long lm = file.lastModified();
	System.out.println("lastModified(): " + lm);
    //lastModified(): 1613811260910

	long l = file.length();
	System.out.println("length(): " + l);
    //length(): 0

	String[] list = file.list();
	System.out.println("list(): " + Arrays.toString(list));
    //list(): null

	File[] filelist = file.listFiles();
	System.out.println("listFiles(): " + Arrays.toString(filelist));
    //listFiles(): null

	boolean b10 = file.mkdir();
	System.out.println("mkdir(): " + b10);
    //mkdir(): false

	boolean b11 = file.mkdirs();
	System.out.println("mkdirs(): " + b11);
    //mkdirs(): false

	File file1 = new File("demo.txt");
	boolean b12 = file.renameTo(file1);
	System.out.println("renameTo(file1): " + b12);
    //renameTo(file1): true

	boolean b13 = file1.delete();
	System.out.println("delete(): " + b13);
    //delete(): true
} catch (Exception e) {
	System.out.println("Error: " + e.getMessage());
}
```

# FileFilter类

常用方法摘要

| 返回值类型 | 方法名                | 描述                                         |
| ---------- | --------------------- | -------------------------------------------- |
| boolean    | accept(File pathname) | 测试指定的抽象路径名是否应包含在路径名列表中 |

举例

``` java
public void start() {
	try {
		File file1 = new File("demo");
		File file2 = new File(file1, "text.txt");
		File file3 = new File("demo\\", "demo.txt");
		file1.mkdir();
		file2.createNewFile();
		file3.createNewFile();

		File[] listFiles = file1.listFiles(new FileFilterImpl());
		for (File f : listFiles) {
			System.out.println("file1.listFiles(): " + f);
			//file1.listFiles(): demo\text.txt
		}

		file3.delete();
		file2.delete();
		file1.delete();
	} catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	}
}

public static class FileFilterImpl implements FileFilter {
	@Override
	public boolean accept(File pathname) {
		if (pathname.getName().toLowerCase().startsWith("demo")) {
			System.out.println(pathname.getName() + " startsWith(\"demo\"),return false");
			//demo.txt startsWith("demo"),return false
			return false;
		} else {
			return true;
		}
	}
}
```

# FileOutputStream类

> append：追加写开关，ture时，创建对象不会覆盖原文件，继续在文件的末尾追加写数据

常用构造方法

| 构造方法                                      | 描述                                                     |
| --------------------------------------------- | -------------------------------------------------------- |
| FileOutputStream(String name, boolean append) | 创建一个向具有指定 name 的文件中写入数据的输出文件流     |
| FileOutputStream(File file, boolean append)   | 创建一个向指定 File 对象表示的文件中写入数据的文件输出流 |

常用方法摘要

| 返回值类型 | 方法名                            | 描述                                                         |
| ---------- | --------------------------------- | ------------------------------------------------------------ |
| void       | close()                           | 关闭此文件输出流并释放与此流有关的所有系统资源               |
| void       | flush()                           | 刷新此输出流并强制写出任何缓冲的输出字节                     |
| void       | write(byte[] b)                   | 将 b.length 个字节从指定 byte 数组写入此文件输出流中         |
| void       | write(byte[] b, int off, int len) | 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流 |
| void       | write(int b)                      | 将指定字节写入此文件输出流                                   |

举例

``` java
try {
	File file = new File("text.txt");
	file.createNewFile();

	FileOutputStream fos = new FileOutputStream(file, true);
	byte[] bytes = new byte[]{97, 98, 99, 100, 101, 102, 103};
	fos.write("title\r\n".getBytes());
	fos.write(bytes, 0, bytes.length);
	System.out.println("write(bytes, 0, bytes.length): " + Arrays.toString(bytes));
	//write(bytes, 0, bytes.length): [97, 98, 99, 100, 101, 102, 103]

	fos.flush();
	fos.close();
	file.delete();
} catch (Exception e) {
	System.out.println("Error: " + e.getMessage());
}
```

# FileInputStream类

常用构造方法

| 构造方法                     | 描述                                                         |
| ---------------------------- | ------------------------------------------------------------ |
| FileInputStream(String name) | 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定 |
| FileInputStream(File file)   | 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定 |

常用方法摘要

| 返回值类型 | 方法名                           | 描述                                                         |
| ---------- | -------------------------------- | ------------------------------------------------------------ |
| void       | close()                          | 关闭此文件输入流并释放与此流有关的所有系统资源               |
| int        | read()                           | 从此输入流中读取一个数据字节                                 |
| int        | read(byte[] b)                   | 从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中 |
| int        | read(byte[] b, int off, int len) | 从此输入流中将最多 len 个字节的数据读入一个 byte 数组中      |
| long       | skip(long n)                     | 跳过并从输入流中丢弃 n字节的数据                             |

举例

``` java
try {
	File file = new File("text.txt");
	file.createNewFile();
	FileOutputStream fos = new FileOutputStream("text.txt", true);
	byte[] bytes1 = new byte[]{97, 98, 99, 100, 101, 102, 103};
	fos.write("title\r\n".getBytes());
	fos.write(bytes1, 0, bytes1.length);
	fos.flush();
	fos.close();

	FileInputStream fis = new FileInputStream(file);
	int chr = 0;
	while ((chr = fis.read()) != -1) {
		System.out.print((char) chr);
		//title
		//abcdefg
	}
	System.out.print("\n");

	FileInputStream fis2 = new FileInputStream(file);
	byte[] bytes2 = new byte[1024];
	int len = 0;
	while ((len = fis2.read(bytes2)) != -1) {
		System.out.println("read byte[] length : " + len);
		//read byte[] length : 14
		System.out.print(new String(bytes2, 0, len));
		//title
		//abcdefg
	}

	fis.close();
	fis2.close();
	file.delete();
} catch (Exception e) {
	System.out.println("Error: " + e.getMessage());
}
```

# FileWriter类

> 将数据写入到内存缓冲区中，等待flush将数据刷新到文件中

常用构造方法

| 构造方法                                    | 描述                                                         |
| ------------------------------------------- | ------------------------------------------------------------ |
| FileWriter(String fileName, boolean append) | 根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象 |
| FileWriter(File file, boolean append)       | 根据给定的 File 对象构造一个 FileWriter 对象                 |

常用方法摘要

| 返回值类型 | 方法名                               | 描述                   |
| ---------- | ------------------------------------ | ---------------------- |
| void       | close()                              | 关闭此流，但要先刷新它 |
| void       | flush()                              | 刷新该流的缓冲         |
| void       | write(char[] cbuf, int off, int len) | 写入字符数组的某一部分 |
| void       | write(String str)                    | 写入字符串             |

举例

``` java
try {
	File file = new File("text.txt");
	file.createNewFile();

	FileWriter fw = new FileWriter("text.txt", true);
	char[] chars = new char[]{'t', 'e', 's', 't'};
	fw.write("title\r\n");
	fw.write(chars, 0, chars.length);
	System.out.println("write(chars, 0, chars.length): " + Arrays.toString(chars));
    //write(chars, 0, chars.length): [t, e, s, t]

	fw.flush();
	fw.close();
} catch (Exception e) {
	System.out.println("Error: " + e.getMessage());
}
```

# FileReader类

> BufferedReader方法 与 FileReader方法 类似
>
> new BufferedReader.readLine();//读取一个文本行。

常用构造方法

| 构造方法                    | 描述                                                    |
| --------------------------- | ------------------------------------------------------- |
| FileReader(String fileName) | 在给定从中读取数据的文件名的情况下创建一个新 FileReader |
| FileReader(File file)       | 在给定从中读取数据的 File 的情况下创建一个新 FileReader |

常用方法摘要

| 返回值类型     | 方法名            | 描述                             |
| -------------- | ----------------- | -------------------------------- |
| int            | read()            | 读取单个字符                     |
| int            | read(char[] cbuf) | 将字符读入数组                   |
| abstract  void | close()           | 关闭该流并释放与之关联的所有资源 |

举例

``` java
try {
	File file = new File("text.txt");
	file.createNewFile();
	FileWriter fw = new FileWriter(file, true);
	char[] chars1 = new char[]{'t', 'e', 's', 't'};
	fw.write("title\r\n");
	fw.write(chars1, 0, chars1.length);
	fw.flush();
	fw.close();

	FileReader fr = new FileReader(file);
	int ascll = 0;
	while ((ascll = fr.read()) != -1) {
		System.out.print((char) ascll);
		//title
		//test
	}
	System.out.print("\n");

	FileReader fr2 = new FileReader(file);
	char[] chars2 = new char[1024];
	int length = 0;
	while ((length = fr2.read(chars2)) != -1) {
		System.out.println("read char[] length : " + length);
		//read char[] length : 11
		System.out.println(new String(chars2, 0, length));
		//title
		//test
	}

	fr.close();
	fr2.close();
	file.delete();
} catch (Exception e) {
	System.out.println("Error: " + e.getMessage());
}
```

# Thread类

常用构造方法

| 构造方法                             | 描述                |
| ------------------------------------ | ------------------- |
| Thread()                             | 分配新的 Thread对象 |
| Thread(String name)                  | 分配新的 Thread对象 |
| Thread(Runnable target)              | 分配新的 Thread对象 |
| Thread(Runnable target, String name) | 分配新的 Thread对象 |

常用方法摘要

| 返回值类型    | 方法名                       | 描述                                                         |
| ------------- | ---------------------------- | ------------------------------------------------------------ |
| static Thread | currentThread()              | 返回对当前正在执行的线程对象的引用                           |
| long          | getId()                      | 返回此Thread的标识符                                         |
| String        | getName()                    | 返回此线程的名称                                             |
| int           | getPriority()                | 返回此线程的优先级                                           |
| void          | setName(String name)         | 将此线程的名称更改为等于参数 name                            |
| void          | setPriority(int newPriority) | 更改此线程的优先级                                           |
| static void   | sleep(long millis)           | 导致当前正在执行的线程休眠（暂时停止执行）指定的毫秒数，具体取决于系统计时器和调度程序的精度和准确性 |
| void          | run()                        | 如果此线程是使用单独的Runnable运行对象构造的，则调用该Runnable对象的run方法; 否则，此方法不执行任何操作并返回 |
| void          | start()                      | 导致此线程开始执行; Java虚拟机调用此线程的run方法            |

举例

``` java
public void start() {
	Thread thread = Thread.currentThread();

	int priority = thread.getPriority();
	System.out.println("getPriority(): " + priority);
    //getPriority(): 5

	thread.setPriority(5);
	System.out.println("setPriority(5): " + thread.getPriority());
    //setPriority(5): 5

	thread.setName("main-0");
	System.out.println("setName(\"main-0\"): " + thread);
    //setName("main-0"): Thread[main-0,5,main]

	MyThread1 mt1 = new MyThread1();
	mt1.start();
    //getId(): 14
    //getName(): Thread-0

	MyThread1 mt2 = new MyThread1("testThread-0");
	mt2.start();
    //getId(): 15
    //getName(): testThread-0

	MyThread2 mt3 = new MyThread2();
	new Thread(mt3).start();
    //Thread.currentThread(): Thread[Thread-1,5,main]
	new Thread(mt3, "testThread-1").start();
    //Thread.currentThread(): Thread[testThread-1,5,main]
}

public static class MyThread1 extends Thread {
	public MyThread1() {
	}

	public MyThread1(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			long id = this.getId();
			System.out.println("getId(): " + id);
			sleep(1000);
			String name = this.getName();
			System.out.println("getName(): " + name);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

public static class MyThread2 implements Runnable {
	@Override
	public void run() {
		synchronized (this) {
			Run();
		}
	}

	public synchronized void Run() {
		Thread thread = Thread.currentThread();
		System.out.println("Thread.currentThread(): " + thread);
	}
}
```

# ExecutorService类

常用方法摘要

| 返回值类型 | 方法名                | 描述                                                         |
| ---------- | --------------------- | ------------------------------------------------------------ |
| Future<?>  | submit(Runnable task) | 提交Runnable任务以执行并返回表示该任务的Future。             |
| void       | shutdown()            | 启动有序关闭，其中先前提交的任务将被执行，但不会接受任何新任务。 |
| boolean    | isShutdown()          | 如果此执行程序已关闭，则返回 true 。                         |
| boolean    | isTerminated()        | 如果关闭后所有任务都已完成，则返回 true 。                   |

举例

``` java
public void start() {
ExecutorService es = Executors.newFixedThreadPool(2);

	es.submit(new MyThread());
    //Thread.currentThread(): Thread[pool-1-thread-2,5,main]
	es.submit(new MyThread());
    //Thread.currentThread(): Thread[pool-1-thread-1,5,main]
	es.submit(new MyThread());
    //Thread.currentThread(): Thread[pool-1-thread-1,5,main]

	es.shutdown();

	boolean b1 = es.isShutdown();
	System.out.println("isShutdown(): " + b1);
    //isShutdown(): true

	boolean b2 = es.isTerminated();
	System.out.println("isTerminated(): " + b2);
    //isTerminated(): true
}

public static class MyThread implements Runnable {
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println("Thread.currentThread(): " + thread);
	}
}
```

# Socket类

> 配合ServerSocket类使用

常用构造方法

| 构造方法                      | 描述                                             |
| ----------------------------- | ------------------------------------------------ |
| Socket()                      | 创建一个未连接的套接字，系统默认类型为SocketImpl |
| Socket(String host, int port) | 创建流套接字并将其连接到指定主机上的指定端口号   |

常用方法摘要

| 返回值类型    | 方法名                   | 描述                                                  |
| ------------- | ------------------------ | ----------------------------------------------------- |
| boolean       | isConnected()            | 返回套接字的连接状态                                  |
| SocketAddress | getLocalSocketAddress()  | 返回此套接字绑定的端点的地址                          |
| SocketAddress | getRemoteSocketAddress() | 返回此套接字连接到的端点的地址，如果未连接则返回 null |
| InetAddress   | getInetAddress()         | 返回套接字连接的地址                                  |
| InetAddress   | getLocalAddress()        | 获取套接字绑定的本地地址                              |
| int           | getLocalPort()           | 返回此套接字绑定的本地端口号                          |
| int           | getPort()                | 返回此套接字连接的远程端口号                          |
| InputStream   | getInputStream()         | 返回此套接字的输入流                                  |
| boolean       | isInputShutdown()        | 返回套接字连接的读半部分是否已关闭                    |
| void          | shutdownInput()          | 将此套接字的输入流放在“流结束”                        |
| OutputStream  | getOutputStream()        | 返回此套接字的输出流                                  |
| boolean       | isOutputShutdown()       | 返回套接字连接的写半部分是否已关闭                    |
| void          | shutdownOutput()         | 禁用此套接字的输出流                                  |
| boolean       | isClosed()               | 返回套接字的关闭状态                                  |
| void          | close()                  | 关闭此套接字                                          |

举例

``` java
public static void main(String[] args) {
	try {
		Socket socket = new Socket("127.0.0.1", 8888);

		boolean b1 = socket.isConnected();
		System.out.println("isConnected(): " + b1);
		//isConnected(): true

		SocketAddress localSocketAddress = socket.getLocalSocketAddress();
		System.out.println("getLocalSocketAddress(): " + localSocketAddress.toString());
		//getLocalSocketAddress(): /127.0.0.1:65510

		SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
		System.out.println("getRemoteSocketAddress(): " + remoteSocketAddress.toString());
		//getRemoteSocketAddress(): /127.0.0.1:8888

		InetAddress inetAddress = socket.getInetAddress();
		System.out.println("getInetAddress(): " + inetAddress.toString());
		//getInetAddress(): /127.0.0.1

		InetAddress localAddress = socket.getLocalAddress();
		System.out.println("getLocalAddress(): " + localAddress.toString());
		//getLocalAddress(): /127.0.0.1

		int localPort = socket.getLocalPort();
		System.out.println("getLocalPort(): " + localPort);
		//getLocalPort(): 65510

		int port = socket.getPort();
		System.out.println("getPort(): " + port);
		//getPort(): 8888

		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("我是客户端".getBytes());
		boolean b2 = socket.isOutputShutdown();
		System.out.println("isOutputShutdown(): " + b2);
		//isOutputShutdown(): false
		socket.shutdownOutput();

		InputStream inputStream = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int length = 0;
		while ((length = inputStream.read(bytes)) != -1) {
			System.out.println(new String(bytes, 0, length));
		}
		boolean b3 = socket.isInputShutdown();
		System.out.println("isInputShutdown(): " + b3);
		//isInputShutdown(): false
		socket.shutdownInput();

		boolean b4 = socket.isClosed();
		System.out.println("isClosed(): " + b4);
		//isClosed(): false

		inputStream.close();
		outputStream.close();
		socket.close();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
```

# ServerSocket类

> 配合Socket类使用

常用构造方法

| 构造方法               | 描述                             |
| ---------------------- | -------------------------------- |
| ServerSocket()         | 创建未绑定的服务器套接字         |
| ServerSocket(int port) | 创建绑定到指定端口的服务器套接字 |

常用方法摘要

| 返回值类型    | 方法名                  | 描述                         |
| ------------- | ----------------------- | ---------------------------- |
| Socket        | accept()                | 侦听对此套接字的连接并接受它 |
| SocketAddress | getLocalSocketAddress() | 返回此套接字绑定的端点的地址 |
| InetAddress   | getInetAddress()        | 返回此服务器套接字的本地地址 |
| int           | getLocalPort()          | 返回此套接字正在侦听的端口号 |
| boolean       | isClosed()              | 返回ServerSocket的关闭状态   |
| void          | close()                 | 关闭此套接字                 |

举例

``` java
public static void main(String[] args) {
	try {
		ServerSocket serverSocket = new ServerSocket(8888);

		SocketAddress localSocketAddress = serverSocket.getLocalSocketAddress();
		System.out.println("getLocalSocketAddress(): " + localSocketAddress.toString());
		//getLocalSocketAddress(): 0.0.0.0/0.0.0.0:8888

		InetAddress inetAddress = serverSocket.getInetAddress();
		System.out.println("getInetAddress(): " + inetAddress);
		//getInetAddress(): 0.0.0.0/0.0.0.0

		int localPort = serverSocket.getLocalPort();
		System.out.println("getLocalPort(): " + localPort);
		//getLocalPort(): 8888

		boolean b1 = serverSocket.isClosed();
		System.out.println("isClosed(): " + b1);
		//isClosed(): false

		ExecutorService es = Executors.newFixedThreadPool(5);
		while (true) {
			Socket socket = serverSocket.accept();
			es.submit(new Thread() {
				@Override
				public void run() {
					try {
						InputStream inputStream = socket.getInputStream();
						byte[] bytes = new byte[1024];
						int length = 0;
						while ((length = inputStream.read(bytes)) != -1) {
							System.out.println(new String(bytes, 0, length));
						}
						socket.shutdownInput();

						OutputStream outputStream = socket.getOutputStream();
						outputStream.write("我是服务器".getBytes());
						socket.shutdownOutput();

						inputStream.close();
						outputStream.close();
						socket.close();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			});
		}
//            es.shutdownNow();
//            serverSocket.close();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
```
