package com.oracle.test;
import java.util.Arrays;
public class My0{
	public static void main(String[] args){
		/*
		long num1=500;
		int num2=(int)num1;//（int）括号加数据类型可强行赋值给比他小的类型
			System.out.println(num2);
		int num3=101;
		float num4=num3;//float单精度浮点型
			System.out.println(num4);
		float num5=1.5f;//float赋值转其他类型后面要规范加f
		double num6=num5;
		double d=num6+num5;
			System.out.println(num6);
			System.out.println(d);
		double num7=5.15;//double浮点型强转整型后去除了小数点后面的数
			System.out.println(num7);
		int num8=(int)num7;
			System.out.println(num8);
		int i=num8+1;
			System.out.println(i);
		long num9=i*10;
			System.out.println(num9);
		byte num10=96/3*2;
			System.out.println(num10);
		int num11=55;
		int	num12=44;
		int	num13=66;
			num11=num12-24;
			num12=num11*num13+++5/8;
			System.out.println("num11="+num11);
			System.out.println("num12="+num12);
		
		
			
		//if如果，假如满足某个条件的话，就执行某个操作
		//假如今天星期一，我就要吃红烧肉
	/*	int i=0;//i=1，星期一，吃红烧肉
		//if(条件语句){代码块（满足条件需要执行的操作）}
		if(i==1){
			System.out.println("吃红烧肉");
		}
		//假如今天星期一，我就要吃红烧肉,否则，我吃青菜
		//假如满足某个条件的话，就执行某个操作，否则执行另外一个操作
		//if(条件语句){代码块（满足条件需要执行的操作）}else{做另外一件事}
		if(i==1){
			System.out.println("吃红烧肉");
		}else{
			System.out.println("吃青菜");
		}
		//if(条件语句){代码块（满足条件需要执行的操作）}else if(){}else if(){}...else{做另外一件事}
		if(i==1){
			System.out.println("吃红烧肉");
		}else if(i==2){
			System.out.println("吃鱼");
		}else if(i==3){
			System.out.println("吃牛蛙");
		}else{
			System.out.println("吃青菜");
		}
		
	*/	

	
		/*
		Scanner sb=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int abc=sb.nextInt();
		if(abc==1){
			System.out.println("去一楼");
		}else if(abc==2){
			System.out.println("去二楼");
		}else{
			System.out.println("回教室");
		} 
		
		*/
		
		
		/*	int a=10;
		int b=10;
		int c=10;
		a = b++%6;
		c = --a*6;
		b = ++a/5+b--+a;
			System.out.println("a="+a);
			System.out.println("c="+c);
			System.out.println("b="+b);
			/*  a=4
				c=18
				b=15  */
				
				
		
		/*	System.out.println("黄汗金");
			System.out.println("黄汗金");
			System.out.println("黄汗金");
			System.out.println("黄汗金");
			System.out.println("黄汗金");
			System.out.println("黄汗金");
			System.out.println("黄汗金");
			System.out.println("黄汗金");
			System.out.println("黄汗金");
			System.out.println("黄汗金");
		循环结构  循环条件  循环体
		当条件语句为true时，进入循环体，
		等执行完循环体语句后，又继续进入条件语句判断，
		直到条件语句为false时，直接结束循环
		while（条件语句）（循环体）				
		while只能为teue（对的）和false（错的）*//*
		int i=0;
		while(i<10){	
			i++;
			System.out.println(i);
			
			System.out.println("黄汗金");
			
		}*//*
		int a=0;
		while(a<100){
			a++;//或者a=a+1，a=a+2......
			System.out.println(a);
		
		}*//*
		int a=0;		
		while(a<100){
			a=a+2;
			System.out.println(a);		
		}*//*
		int a=0;
		while(a<=100){
			a++;
		if (a%2==0){
			System.out.println(a);
		}
		}*/
			/*
		int a=1;
		int b=0;
		int sum=0;//sum表示的是一个和，我来算循环a所有的和是多少
		while(a<11){
			System.out.println(a);
			//b=b+a;
			sum=sum+a;
			a++;
			
		}
		System.out.println(sum);*/
		//输出1-1000之间，除以3，余数为2，
		//并且除以7，余数为5
		/*
		int a=1;	
		int sum=0;		
		while(a<=1000){			
			if(a%3==2&&a%7==5){
				System.out.println(a+"我符合条件");	
				sum++;
			}			
				a++;
		}
				System.out.println("一共"+sum);
		*/
		/*		
		int i=1;
		do{			
			if(i%2!=1){
				System.out.println("奇数是"+i);
			}
			i++;
			}while(i<100);
		}*/
		//for循环先声明变量，再设置条件范围，变量++
		//先看条件语句满不满足，满足直接执行输出i，然后执行i++，
		//再循环执行，直到条件不满足结束
		//for循环中变量的定义，作用范围只能在循环体{}中
	//	for(int i=1;i<3;i++){
	//		System.out.println(i);
	//	}
			
	/*	int o=50;
		while(o<=200){
			if(o%2==0){
				System.out.println(o);
			}
			o++;			
		}*/
	/*	for(int o=50;o<=200;o++){
			if(o%2==0){
			System.out.println(o);	
			}					
		}*/
	/*	int o=50;
		do{
			if(o%2==0){
				System.out.println(o);				
			}
			o++;
		}while(o<=200);
		*/
		/*
		for(int i=0;i<3;i++){
			System.out.println("********"+i);
			for(int j=0;j<3;j++){
				//if(i==j){
				//	System.out.println("++++++"+j);
				//}
				System.out.println("kkkkkk"+j); 
			}
		}	
	*/	
	/*	
		for(int i=0;i<3;i++){	
			for(int j=0;j<3;j++){
				if(j==1){
					System.out.println("******");
					break;
				}
					System.out.println("++++++");
			}	
		}	
	*/	
	
	/*	for(int i=0;i<100;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	*/	
	/*	for(int i=0;i<3;i++){	
			System.out.println("我是i，我的值是"+i);
			for(int j=0;j<3;j++){
				System.out.println("我是jjjjj，我==============="+j);			
			}
		}	
	*/	
		
		
				
		/*
		//String 引用类型和字符串类型
		String myMoney =("100");
			System.out.println(myMoney);
		
		*/
		
		
	/*	
		
		
		//数组：具有相同数据类型的元素的一个集合	
		//声明一个int类型的变量（数据类型）
		//int a=23;
		//int a=24;
		//看到[]就是一个数组
		//声明一个数组类型的变量（也是数据类型）
		//静态初始化（已经确定的）
		int[] ages={23,25,18,20};	
		System.out.println("这个数组中第三个元素是："+ages[2]);
		//要找出数组中第三个元素的数据
		//变量名加上[下标]这个就是表示数组中的某个元素值
		
			
			
		//number输出的结构就是在内存中的一个地址值
		int[] number=new int[3];
			System.out.println(number);
			System.out.println(number[0]);
			System.out.println(number[1]);
			System.out.println(number[2]);
		//改变第二个元素的值，改为1
		number[1]=1;
			System.out.println("改变后的值="+number[1]);
		
		double[] sum={1.5,2.5,3.5};
		
			System.out.println(sum[0]);
			System.out.println(sum[1]); 
			System.out.println(sum[2]);
		//sum[]是一个循环有规律的变量，可以套用循环语句	
		for(int i=0;i<3;i++){
			System.out.println(sum[i]);
		}
		
		double[] sum1=new double[3];
		sum1[0]=1.5;
		sum1[1]=2.5;
		sum1[2]=3.5;
			System.out.println("改变后的值="+sum1[0]);
			System.out.println("改变后的值="+sum1[1]);
			System.out.println("改变后的值="+sum1[2]);
			for(int i=0;i<sum1.length;i++){
				System.out.println("改变后的值="+sum1[i]);
			}
			System.out.println("数组的长度为："+sum1.length);
		//数组的长度：变量名.length	
		//静态定义的第二种		
			int[] arr=new int[]{2,35,62,23};
			for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			}
		
		
			int[] arr1=new int[]{22,5,67,93};
			int[] arr2=new int[]{2,35,62,23};
			int[] arr3=arr2;
			arr3[2]=100;
			
			System.out.println(arr1[2]);
			System.out.println(arr2[2]);
			System.out.println(arr3[2]);
		//下标最大的值是length-1（数组长度减一）
		//数组越界报错 ArrayIndexOutOfBoundsException:
			System.out.println("数组的长度为："+arr1.length);
		
		//String类型的默认值是null，	
		//引用数据类型默认值都是null	
		String[] ss=new String[3];
		//ss=null;报错空指针异常 NullPointerException
		//使用数组或者变量，必须先初始化
		System.out.println(ss[1]);
	
	
	
	*/
	
	
	
	/*
	
	
	
		//获取arr数组中最大的值
		int[] arr=new int[]{22,5,67,93};
		int max=arr[0];
		for(int i=1;i<arr.length;i++){		
			int a=arr[i];//取到了数组中的元素
		//若当前数组元素的值大于最大值变量max，
		//则把它的值，赋给最大值变量max
			System.out.println("a:"+a);
			if(max<a){
				max=a;		
			}
			
		}	
			System.out.println("数组中最大的值"+max);
		
	
	*/
	
	
	
		//1.键盘输入一个数字，查看数组中是否存在这个数，
		//若存在，请输入存在，否则，提示继续输入，直到
		//输入存在的值才结束。
		
		//第一步：导包
		//第二步：实例化Scanner对象
		//第三步：定义一个数组
		//第四步：

	/*
		Scanner xx=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		while(true){				
			int i=xx.nextInt();
			boolean bb=false;
			int[] sum=new int[]{11,22,33,44,55};
			for(int j=0;j<sum.length;j++){
				int a=sum[j];			
				if(i==a){
					bb=true;
					System.out.println("存在");
					break;
						
				}		
			}
			if(bb){
				break;
			}else{
				System.out.println("请重新输入");
			}
			
			
		}
		
	*/

	
	
	

	
		//2.输入某元素，在数组中存在的次数。
	
	
	
	
	
	
	
	
	
	
	
		//冒泡排序
	/*
		int[] arr=new int[]{22,23,100,5,6,30};
		
		for(int j=0;j<arr.length-1;j++){
			for(int i=0;i<arr.length-1-j;i++){					
				int temp;
				if(arr[i]>arr[i+1]){ //arr[i]高的人
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	
	*/
	
		//声明了三个数组a,b,c，同时给c初始化，但是a，b没初始化
	/*
		int[] a,b,c=new int[]{2,3,5};
			a=b=c;//c赋值给a，b
			System.out.println(a[0]);
		
	*/
	/*
	
		//冒泡排序：
		int[] arr=new int[]{5,12,9,6,8};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				//j和j+1是相邻的两个位置，j+1代表后面的位置
				//当后面的位置j+1数值小于前面的j时，两个值互换
				if(arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
	*/
	
	/*
		//选择排序：
		//先在数组中拿第一元素跟其他元素依次对比，
		//找出最小的元素，放在起始位置，一次类推
		int[] arr=new int[]{5,12,9,6,8};
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					//int创建一个临时空间来进行调换，把j先放入temp临时空间				
					int temp=arr[i];				
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}	
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]+",");
		}
		
	*/
	
	/*		
		//插入排序：
		//在已知数组，从后往前比较，比前面的小，则交换
		//首先第二位跟第一位比，若第一位大于第二位，
		//第三位跟之前的元素比，直到遇到比它小的
		int[] arr=new int[]{5,12,9,6,8};
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}else{
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++){			
			System.out.print(arr[i]+",");
		}
	
	*/	
	/*
	
		int[] arr=new int[]{5,12,9,6,8,7,4,88,55};
		int[] aa=Arrays.copyOf(arr,5);
		System.out.println(Arrays.toString(aa));
	*/	
		
		//二维数组
		//int[][] arr3=new int[index][index2];
		//
		int[] arr1={1,3,5};
		int[] arr2={4,2,6};
		int[][] arr3=new int[2][];
		arr3[0]=arr1;
		arr3[1]=arr2;
		//System.out.println(arr3[1][2]);
		//把二维数组中每个一维数组中的每个元素打印出来
	/*	for(int i=0;i<arr3[0].length;i++){
			System.out.print(arr3[0][i]+",");
			
		}	
			System.out.println();
		for(int j=0;j<arr3[1].length;j++){
			System.out.print(arr3[1][j]+",");
		}
	*/
	
		for(int i=0;i<arr3.length;i++){
			for(int j=0;j<arr3[i].length;j++){
				System.out.print(arr3[i][j]+",");	
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}		
	
}