package com.oracle.test;
import java.util.Arrays;
public class My0{
	public static void main(String[] args){
		/*
		long num1=500;
		int num2=(int)num1;//��int�����ż��������Ϳ�ǿ�и�ֵ������С������
			System.out.println(num2);
		int num3=101;
		float num4=num3;//float�����ȸ�����
			System.out.println(num4);
		float num5=1.5f;//float��ֵת�������ͺ���Ҫ�淶��f
		double num6=num5;
		double d=num6+num5;
			System.out.println(num6);
			System.out.println(d);
		double num7=5.15;//double������ǿת���ͺ�ȥ����С����������
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
		
		
			
		//if�������������ĳ�������Ļ�����ִ��ĳ������
		//�����������һ���Ҿ�Ҫ�Ժ�����
	/*	int i=0;//i=1������һ���Ժ�����
		//if(�������){����飨����������Ҫִ�еĲ�����}
		if(i==1){
			System.out.println("�Ժ�����");
		}
		//�����������һ���Ҿ�Ҫ�Ժ�����,�����ҳ����
		//��������ĳ�������Ļ�����ִ��ĳ������������ִ������һ������
		//if(�������){����飨����������Ҫִ�еĲ�����}else{������һ����}
		if(i==1){
			System.out.println("�Ժ�����");
		}else{
			System.out.println("�����");
		}
		//if(�������){����飨����������Ҫִ�еĲ�����}else if(){}else if(){}...else{������һ����}
		if(i==1){
			System.out.println("�Ժ�����");
		}else if(i==2){
			System.out.println("����");
		}else if(i==3){
			System.out.println("��ţ��");
		}else{
			System.out.println("�����");
		}
		
	*/	

	
		/*
		Scanner sb=new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int abc=sb.nextInt();
		if(abc==1){
			System.out.println("ȥһ¥");
		}else if(abc==2){
			System.out.println("ȥ��¥");
		}else{
			System.out.println("�ؽ���");
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
				
				
		
		/*	System.out.println("�ƺ���");
			System.out.println("�ƺ���");
			System.out.println("�ƺ���");
			System.out.println("�ƺ���");
			System.out.println("�ƺ���");
			System.out.println("�ƺ���");
			System.out.println("�ƺ���");
			System.out.println("�ƺ���");
			System.out.println("�ƺ���");
			System.out.println("�ƺ���");
		ѭ���ṹ  ѭ������  ѭ����
		���������Ϊtrueʱ������ѭ���壬
		��ִ����ѭ���������ּ���������������жϣ�
		ֱ���������Ϊfalseʱ��ֱ�ӽ���ѭ��
		while��������䣩��ѭ���壩				
		whileֻ��Ϊteue���Եģ���false����ģ�*//*
		int i=0;
		while(i<10){	
			i++;
			System.out.println(i);
			
			System.out.println("�ƺ���");
			
		}*//*
		int a=0;
		while(a<100){
			a++;//����a=a+1��a=a+2......
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
		int sum=0;//sum��ʾ����һ���ͣ�������ѭ��a���еĺ��Ƕ���
		while(a<11){
			System.out.println(a);
			//b=b+a;
			sum=sum+a;
			a++;
			
		}
		System.out.println(sum);*/
		//���1-1000֮�䣬����3������Ϊ2��
		//���ҳ���7������Ϊ5
		/*
		int a=1;	
		int sum=0;		
		while(a<=1000){			
			if(a%3==2&&a%7==5){
				System.out.println(a+"�ҷ�������");	
				sum++;
			}			
				a++;
		}
				System.out.println("һ��"+sum);
		*/
		/*		
		int i=1;
		do{			
			if(i%2!=1){
				System.out.println("������"+i);
			}
			i++;
			}while(i<100);
		}*/
		//forѭ��������������������������Χ������++
		//�ȿ���������������㣬����ֱ��ִ�����i��Ȼ��ִ��i++��
		//��ѭ��ִ�У�ֱ���������������
		//forѭ���б����Ķ��壬���÷�Χֻ����ѭ����{}��
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
			System.out.println("����i���ҵ�ֵ��"+i);
			for(int j=0;j<3;j++){
				System.out.println("����jjjjj����==============="+j);			
			}
		}	
	*/	
		
		
				
		/*
		//String �������ͺ��ַ�������
		String myMoney =("100");
			System.out.println(myMoney);
		
		*/
		
		
	/*	
		
		
		//���飺������ͬ�������͵�Ԫ�ص�һ������	
		//����һ��int���͵ı������������ͣ�
		//int a=23;
		//int a=24;
		//����[]����һ������
		//����һ���������͵ı�����Ҳ���������ͣ�
		//��̬��ʼ�����Ѿ�ȷ���ģ�
		int[] ages={23,25,18,20};	
		System.out.println("��������е�����Ԫ���ǣ�"+ages[2]);
		//Ҫ�ҳ������е�����Ԫ�ص�����
		//����������[�±�]������Ǳ�ʾ�����е�ĳ��Ԫ��ֵ
		
			
			
		//number����Ľṹ�������ڴ��е�һ����ֵַ
		int[] number=new int[3];
			System.out.println(number);
			System.out.println(number[0]);
			System.out.println(number[1]);
			System.out.println(number[2]);
		//�ı�ڶ���Ԫ�ص�ֵ����Ϊ1
		number[1]=1;
			System.out.println("�ı���ֵ="+number[1]);
		
		double[] sum={1.5,2.5,3.5};
		
			System.out.println(sum[0]);
			System.out.println(sum[1]); 
			System.out.println(sum[2]);
		//sum[]��һ��ѭ���й��ɵı�������������ѭ�����	
		for(int i=0;i<3;i++){
			System.out.println(sum[i]);
		}
		
		double[] sum1=new double[3];
		sum1[0]=1.5;
		sum1[1]=2.5;
		sum1[2]=3.5;
			System.out.println("�ı���ֵ="+sum1[0]);
			System.out.println("�ı���ֵ="+sum1[1]);
			System.out.println("�ı���ֵ="+sum1[2]);
			for(int i=0;i<sum1.length;i++){
				System.out.println("�ı���ֵ="+sum1[i]);
			}
			System.out.println("����ĳ���Ϊ��"+sum1.length);
		//����ĳ��ȣ�������.length	
		//��̬����ĵڶ���		
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
		//�±�����ֵ��length-1�����鳤�ȼ�һ��
		//����Խ�籨�� ArrayIndexOutOfBoundsException:
			System.out.println("����ĳ���Ϊ��"+arr1.length);
		
		//String���͵�Ĭ��ֵ��null��	
		//������������Ĭ��ֵ����null	
		String[] ss=new String[3];
		//ss=null;�����ָ���쳣 NullPointerException
		//ʹ��������߱����������ȳ�ʼ��
		System.out.println(ss[1]);
	
	
	
	*/
	
	
	
	/*
	
	
	
		//��ȡarr����������ֵ
		int[] arr=new int[]{22,5,67,93};
		int max=arr[0];
		for(int i=1;i<arr.length;i++){		
			int a=arr[i];//ȡ���������е�Ԫ��
		//����ǰ����Ԫ�ص�ֵ�������ֵ����max��
		//�������ֵ���������ֵ����max
			System.out.println("a:"+a);
			if(max<a){
				max=a;		
			}
			
		}	
			System.out.println("����������ֵ"+max);
		
	
	*/
	
	
	
		//1.��������һ�����֣��鿴�������Ƿ�����������
		//�����ڣ���������ڣ�������ʾ�������룬ֱ��
		//������ڵ�ֵ�Ž�����
		
		//��һ��������
		//�ڶ�����ʵ����Scanner����
		//������������һ������
		//���Ĳ���

	/*
		Scanner xx=new Scanner(System.in);
		System.out.println("������һ�����֣�");
		while(true){				
			int i=xx.nextInt();
			boolean bb=false;
			int[] sum=new int[]{11,22,33,44,55};
			for(int j=0;j<sum.length;j++){
				int a=sum[j];			
				if(i==a){
					bb=true;
					System.out.println("����");
					break;
						
				}		
			}
			if(bb){
				break;
			}else{
				System.out.println("����������");
			}
			
			
		}
		
	*/

	
	
	

	
		//2.����ĳԪ�أ��������д��ڵĴ�����
	
	
	
	
	
	
	
	
	
	
	
		//ð������
	/*
		int[] arr=new int[]{22,23,100,5,6,30};
		
		for(int j=0;j<arr.length-1;j++){
			for(int i=0;i<arr.length-1-j;i++){					
				int temp;
				if(arr[i]>arr[i+1]){ //arr[i]�ߵ���
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
	
		//��������������a,b,c��ͬʱ��c��ʼ��������a��bû��ʼ��
	/*
		int[] a,b,c=new int[]{2,3,5};
			a=b=c;//c��ֵ��a��b
			System.out.println(a[0]);
		
	*/
	/*
	
		//ð������
		int[] arr=new int[]{5,12,9,6,8};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				//j��j+1�����ڵ�����λ�ã�j+1��������λ��
				//�������λ��j+1��ֵС��ǰ���jʱ������ֵ����
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
		//ѡ������
		//�����������õ�һԪ�ظ�����Ԫ�����ζԱȣ�
		//�ҳ���С��Ԫ�أ�������ʼλ�ã�һ������
		int[] arr=new int[]{5,12,9,6,8};
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					//int����һ����ʱ�ռ������е�������j�ȷ���temp��ʱ�ռ�				
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
		//��������
		//����֪���飬�Ӻ���ǰ�Ƚϣ���ǰ���С���򽻻�
		//���ȵڶ�λ����һλ�ȣ�����һλ���ڵڶ�λ��
		//����λ��֮ǰ��Ԫ�رȣ�ֱ����������С��
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
		
		//��ά����
		//int[][] arr3=new int[index][index2];
		//
		int[] arr1={1,3,5};
		int[] arr2={4,2,6};
		int[][] arr3=new int[2][];
		arr3[0]=arr1;
		arr3[1]=arr2;
		//System.out.println(arr3[1][2]);
		//�Ѷ�ά������ÿ��һά�����е�ÿ��Ԫ�ش�ӡ����
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