# JAVASE学习代码及笔记

### ----------------------------------------------day01------------------------------------------------

##### 能够说出Object类的特点:

​	所有类的父类,任意的类都直接或者间接的继承了Object类,都可以使用Object类的方法

##### 能够重写Object类的toString方法

​	alt+insert,选择toString()

##### 能够重写Object类的equals方法

​	alt+insert,选择equals and hashCode(使用HashSet集合/HashMap集合)

##### 能够使用日期类输出当前日期

​	Date date = new Date();
​	sout(date);

##### 能够使用将日期格式化为字符串的方法

​	

```
SimpleDateFormat sdf = new SimpleDateFormat("模式:yyyy-MM-dd HH:mm:ss");
	String s = sdf.format(new Date());
	sout(s);//2018-08-24 08:36:33
```



##### 能够使用将字符串转换成日期的方法

```
	main throws xxxException(
		SimpleDateFormat sdf = new SimpleDateFormat("模式:yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse("2018-06-01 08:36:33");
		sout(date);
	)
```



##### 能够使用System类的数组复制方法

​	static void arraycopy(源数组,源数组的起始索引,目标数组,目标数组的起始索引,复制元素个数);

##### 能够使用System类获取当前毫秒时刻值

​	

```
long s = System.currentTimeMillis();
	sout(s);1527731875729L
```



##### 能够说出使用StringBuilder类可以解决的问题

​	提高字符串的效率,在内存中始终操作的是一个数组(一个字符串),占用内存小,效率高

##### 能够使用StringBuilder进行字符串拼接操作

​	bu.append("a").append("b").append("c");

##### 能够说出8种基本类型对应的包装类名称

###### 	 基本的数据类型:4类8种

​	    

```
byte short  int long    float   double  boolean char
```



###### 	 对应的包装类:java.lang中

​	   

```
 Byte Short  Integer Long    Float   Double  Boolean Character
```



##### 能够说出自动装箱、自动拆箱的概念

​	基本类型的数据和包装类之间可以自动的相互转换

##### 能够将字符串转换为对应的基本类型

###### 	使用包装类中的静态方法parseXXX("数值的的字符串");

​        Integer类:static int parseInt(String s)
​        Double类:static double parseDouble(String s)

##### 能够将基本类型转换为对应的字符串

​	基本类型的值+""



### ----------------------------------------------day02------------------------------------------------

##### 能够说出集合与数组的区别

###### 	数组:

​		1.长度是固定的
​		2.可以存储任意类型的数据
​			int[]  Student[]

###### 	集合:

​		1.长度是可以改变的
​		2.只能存储对象(引用类型的数据) ArrayList<String>  ArrayList<Integer>

##### 说出Collection集合的常用功能

- ​	public boolean add(E e)：  把给定的对象添加到当前集合中 。
- ​	public void clear() :清空集合中所有的元素。
- ​	public boolean remove(E e): 把给定的对象在当前集合中删除。
- ​	public boolean contains(E e): 判断当前集合中是否包含给定的对象。
- ​	public boolean isEmpty(): 判断当前集合是否为空。
- ​	public int size(): 返回集合中元素的个数。
- ​	public Object[] toArray(): 把集合中的元素，存储到数组中。

##### 能够使用迭代器对集合进行取元素

###### 	1.创建一个集合对象

​	Collection<集合的数据类型> coll = new ArrayList<>();

###### 	2.使用集合对象中的方法iterator获取迭代器对象

​	Iterator<集合的数据类型> it= coll.iterator();

###### 	3.使用迭代器中的方法hasNext和next依次取出集合中的元素

​	while(it.hasNext()){//判断是否有下一个元素

​			集合的数据类型 变量名 = it.next();//取出下一个元素
​	}

##### 能够说出集合的使用细节

​	1.会使用集合存储元素(add)

​	2.会取出集合中的元素(迭代器,增强for)

##### 能够使用集合存储自定义类型

```
	ArrayList<Person> list = new ArrayList<Person>();
	list.add(new Person("貂蝉",18));
	list.add(new Person("西施",19));
	list.add(new Person("王昭君",18));
	list.add(new Person("杨贵妃",20));
```

##### 能够使用foreach循环遍历集合

​	

```
for(集合/数组的数据类型 变量名 : 集合名/数组名){
            sout(变量名);
    }
	for(Person p : list){
		sout(p));
	}
```

​	快捷键:list.for

##### 能够使用泛型定义集合对象

```
	ArrayList<Person> list = new ArrayList<Person>();
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<String> list = new ArrayList<String>();
```



##### 能够理解泛型上下限

​	泛型上限限定:? extends E 代表使用的泛型只要是E类型的子类/本身即可

​	泛型下限限定:? super E   代表使用的泛型只要是E类型的父类/本身即可

##### 能够阐述泛型通配符的作用

​	泛型通配符:?

​	可以接收任意的数据类型(只能作为参数使用)



### ----------------------------------------------day03------------------------------------------------

##### 能够说出List集合特点

​	有序,允许重复,有索引

##### 能够说出常见的数据结构

- ​	堆栈:先进后出

- ​	队列:先进先出

- ​	数组:查询快,增删慢

- ​	链表:查询慢,增删快

- ​	红黑树(趋近平衡二叉树):查找的速度特别快

  ##### 能够说出数组结构特点

  ​	查询快,增删慢

  ##### 能够说出栈结构特点

  ​	先进后出

  ##### 能够说出队列结构特点

  ​	先进先出

  ##### 能够说出单向链表结构特点

  ​	查询慢,增删快

  ##### 能够说出Set集合的特点

  ​	不允许重复

  ​	没有索引,不能使用普通for

  ##### 能够说出哈希表的特点

  1. ​	JDK1.7:数组+链表:查询快,增删快

  2. ​	JDK1.8:数组+链表+红黑树:提高查询的效率

     ###### 使用HashSet集合存储自定义元素

     ​	要求:保证同名同年龄的人是同一个人,自定义类型必须重写hashCode和equals方法(快捷键)

     ​	

     ```
     HashSet<Person> set = new HashSet<Person>();
     ```

     ##### 能够使用集合工具类

     ​	

     ```
     public static void shuffle(List<?> list)://打乱集合顺序。
     public static <T> void sort(List<T> list)://将集合中元素按照默认规则排序。
     public static <T> void sort(List<T> list，Comparator<? super T> )://将集合中元素按照指定规则排序。
     ```

     ##### 能够使用Comparator比较器进行排序

     ​	升序排列/降序排列的口诀：

     ​		升序就是o1-o2,降序反之





### ----------------------------------------------day04------------------------------------------------

##### 能够说出Map集合特点

​	  是一个双列集合

​	1.key不允许重复,value可以重复

​	2.一个key只能对应一个value(一夫一妻)

​	3.key和value数据类型,可以相同,也可以不同

##### 使用Map集合添加方法保存数据

​	map.put(key,value);

​	key重复返回被替换的值

​	key不重复返回null

##### 使用”键找值”的方式遍历Map集合

​	使用Map集合中的方法keySet,把所有的key存储到Set集合中

​	遍历Set集合,获取Map集合的每一个key

​	使用Map中的方法get(key),获取value

##### 使用”键值对”的方式遍历Map集合

​	使用Map集合中的方法entrySet,把所有Entry对象(健和值的映射关系,结婚证)存储到Set集合中

​	遍历存储Entry对象的Set集合,获取每一个Entry对象

​	使用Entry对象中的方法getKey和getValue获取健和值

##### 能够使用HashMap存储自定义键值对的数据

​	自定义类型作为值:不需要重写hashCode和equals方法,值可以重复(同名,同年龄)

​	自定义类型作为健:需要重写hashCode和equals方法,保证健(同名,同年龄)视为同一个人

##### 能够使用可变参数

​	底层就是一个数组,会根据传递的参数个数不同,而创建长度不同的数组,来接收这些参数

​	修饰符 返回值类型 方法名(参数类型... 形参名){  }

​	public void show(int...a){}

##### 能够使用HashMap编写斗地主洗牌发牌案例

