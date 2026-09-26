// demo1
/*public class BasicGrammar{
       public static void main(String[] args){
              byte a=127;
              System.out.println(a);
        }
}
// demo2
public class BasicGrammar{
       public static void main(String[] args){
              boolean a=true;
              System.out.println(a);
       }
}
// demo3 
public class BasicGrammar{
       public static void main(String[] args){
              double height=1.68;
              double weight=53.0;
              double BMI=weight/(height*height);
              System.out.println(BMI);
       }
}*/
// demo4
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              int num1=sc.nextInt();
              System.out.println(num1);

              sc.close();
       }
}*/
// demo5
/*public class BasicGrammar{
       public static void main(String[] args){
              int seconds=7285;
              int hours=seconds/3600;
                            System.out.println(hours);
              int  minutes=seconds%3600/60;
                            System.out.println(minutes);

              int second=seconds%3600%60;
                            System.out.println(second);

       }
}*/
// demo6
/*public class BasicGrammar{
       public static void main(String[] args){
              char a='Z';
              char aa=(char)(a+32);
              System.out.println(aa);
       }
}*/
// demo7
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              double height=sc.nextDouble();
              System.out.println(height);
              sc.close();
       }
}*/
// demo8
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              int number=sc.nextInt();

              boolean result=number>1&number<10;
              System.out.println(result);
              sc.close();
       }
}*/
// demo9
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              double Celsius=sc.nextDouble();

              if(Celsius>38){
                     System.out.println("体温过高");
              }else{
                     System.out.println("正常");
              }
              sc.close();
       }
}*/
// demo10
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              double score=sc.nextDouble();

              if(score>=0 && score<=100){
              System.out.println("成绩在合理范围内");
                if(score>=60){
                     System.out.println("考试合格");
                }else{
                     System.out.println("挂科");
                }

              }else{
              System.out.println("成绩不合理");
              }

              sc.close();
       }
}*/
// demo11
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              double price=sc.nextDouble();

              double B;
              B=0.9*price;
              double M;
              if(price>=30){
                     M=price-10;
              }else{
                     M=price;
              }

              if(B==M){
                     System.out.println("一样划算",+B);
              }else if(B>M){
                     System.out.println("美单 更划算",+M);
              }else{
                     System.out.println("饱了吗 更划算",+B);
              }
              sc.close();
       }
}*/
// demo12
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              double  x=sc.nextDouble();
              double y=sc.nextDouble();

              if(x==0&&y==0){
                     System.out.println("在原点处");
              }else if(y!=0){
                     if(x==0){
                            System.out.println("在y轴上");
                     }else if(x>0&&y>0){
                            System.out.println("在第一象限");
                     }else if(x>0&&y<0){
                            System.out.println("在第四象限");
                     }else if(x<0&&y>0){
                            System.out.println("在第二象限");
                     }else if(x<0&&y<0){
                            System.out.println("在第三象限");
                     }
              }else if(y==0&&x!=0){
                     System.out.println("在x轴上");
              }
              sc.close();
       } 
}*/
//  demo13
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              int month=sc.nextInt();
              switch(month){
                     case 1:
                     case 2:
                     case 12:System.out.println("冬季");
                            break;
                     case 3:
                     case 4:
                     case 5:System.out.println("春季");
                           break;
                     case 6:
                     case 7:
                     case 8:System.out.println("夏季");
                           break;
                     case 9:
                     case 10:
                     case 11:System.out.println("秋季");
                           break;
                     default:
                            System.out.println("没有这个季节");
                           break;
              } 
              sc.close();
       }
}*/
// demo14
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              double a=sc.nextDouble();
              double b=sc.nextDouble();
              String operator=sc.next();
              double result=switch (operator){
                     case"+" -> a+b;
                     case"-" -> a-b;
                     case"*" -> a*b;
                     case"/" -> a/b;
                     default -> 0;
              };
             System.out.println(result);
              sc.close();
       }
      
}*/
// demo15
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              int num1=sc.nextInt();
              int num2=sc.nextInt();
              int max=num1>num2?num1:num2;
              int min=num1<num2?num1:num2;
              int count=0;
              for(int i=min;i<=max;i++){
                     if(i%3==0&&i%5==0){
                            count++;
                     }
              }
              System.out.println(count);
              if(count==0){
                     System.out.println("在"+min+"~"+max+"之间没有要找的数字");
              }
              sc.close();
       }
}*/
// demo16
/*public class BasicGrammar{
       public static void main(String[] args){
              int money=100000;
              int year=0;
              double t=0.0;
              while(money<200000){
                     t=money*1.7*0.01;
                     money+=t;
                     year++;
              }
              System.out.println(year);

       }
}*/
// demo17
/*public class BasicGrammar{
       public static void main(String[] args){
              double t=0;
              double depth=0.1;
              int i=0;
              while(depth<8848860){
                     t=Math.pow(2,i);
                     depth=0.1*t;
                     i++;
              }
              System.out.println(i-1);
       }
}
循环体写成这样也可以，单个人认为用函数比较高效（depth=depth*2;count++）*/
// demo18
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              int num=sc.nextInt();

              int sum=0;
              int t=0;
              if(num<0) num=-num;
              while(num>0){
                     t=num%10;
                     sum+=t;
                     num/=10;
              }
              System.out.println(sum);
              sc.close();
       } 
}*/
// demo19
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              int num;
       while(true){
              num=sc.nextInt();
              if(num>=2){
                     break;
              }else{
                     System.out.println("输入的数字不符合要求");
              }
       }
              boolean isPrime=true;
              double t=Math.sqrt(num);
              for(int i=2;i<=t;i++){
                     if(num%i==0){
                            isPrime=false;
                            break;
                     }
              }
              if(isPrime){
                     System.out.println(num+"是一个质数");
              }else{
                     System.out.println(num+"不是一个质数");    
              }
              sc.close();
       }
}*/
// demo20
/*import java.util.Random;
import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Random  r=new Random();
              int num=r.nextInt(1,101);
              System.out.println(num);

       int countA=0;//小保底
       int countB=0;//大保底
while(true){
              Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              countA++;
              countB++;

              if(countB==10){
                 n=num;//若10次没猜中直接触发大保底机制，用技术手段来弥补用户体验干的缺失
              }
              if(n==num) {
                     System.out.println("恭喜你猜对了！");
                     break;
              }else if(n<num){
                     System.out.println("你猜的数字太小了");
              }else{
                     System.out.println("你猜的数字太大了");

              }
              sc.close();
}
              if(countA%3==0){
              System.out.println("触发小保底机制，随机数字的范围"+（num-5)+"~"(num+5));
              }
       }
}
       加入大保底和小保底业务，提高猜中随机数的一个效率*/
// demo21
/*public class BasicGrammar{
       public static void main(String[] args){
              for(int i=1;i<=4;i++){
                     for(int j=1;j<=5;j++){
                            System.out.print("*");
                     }
                     System.out.println();
              }
       }
}*/
// demo22
// 九九乘法表
/*public class BasicGrammar{
       public static  void main(String[] args){
              for(int i=1;i<=9;i++){
                     for(int j=1;j<=i;j++){
                            int sum=i*j;
                            System.out.print(i+"*"+j+"="+sum+"     ");
                     }
                     System.out.println();
              }
       }
}*/
// demo23
// 打印呈现出三角形分布的星号
/*public class BasicGrammar{
       public static void main(String[] args){
              for(int i=1;i<=5;i++){
                     for(int j=1;j<=i;j++){
                            System.out.print("*");
                     }
                     System.out.println();
              }
               for(int i=5;i>=1;i--){                    //注意：这块的条件控制语句是i--，写成i++直接导致死循环电脑运行直接崩了！！
                     for(int j=1;j<=i;j++){
                            System.out.print("*");
                     }
                     System.out.println();
              }
       }
       
}*/
// demo24
// 打印梯形
/*public class BasicGrammar{
       public static void main(String[] args){
              for(int i=1;i<=3;i++){
                     for(int k=i;k<=2;k++){
                            System.out.print(" ");
                     }
                     for(int j=1;j<=2*i+1;j++){
                            System.out.print("*");
                     }
                     System.out.println();
              }
       }
}*/
// demo25
// 打印菱形:一半一半打印
/*public class BasicGrammar{
       public static void main(String[] args){
              for(int i=0;i<4;i++){
                     for(int j=0;j<3-i;j++){
                            System.out.print(" ");
                     }
                     for(int k=0;k<2*i+1;k++){
                            System.out.print("*");
                     }
                     System.out.println();
              }
              for(int i=0;i<3;i++){
                     for(int j=0;j<i+1;j++){
                            System.out.print(" ");
                     }
                     for(int k=5;k>=2*i+1;k--){
                            System.out.print("*");
                     }
                     System.out.println();
              }
       }
}*/
// demo26
// 打印空的菱形
/*public class BasicGrammar{
       public static void main(String[] args){
              for(int i=0;i<4;i++){
                     for(int j=0;j<3-i;j++){
                            System.out.print(" ");
                     }
                     for(int k=0;k<2*i+1;k++){
                            if(k==0||k==2*i){
                            System.out.print("*");
                            }else{
                            System.out.print(" ");
                            }
                     }
                     System.out.println();
              }
              for(int i=0;i<3;i++){
                     for(int j=0;j<i+1;j++){
                            System.out.print(" ");
                     }
                     int len=5-2*i;
                     for(int k=0;k<len;k++){
                            if(k==0||k==len-1){
                                   System.out.print("*");
                            }else{
                                   System.out.print(" ");
                            }
                     }
                     System.out.println();
              }

       }

}*/
// demo27
// 数组动态初始化及输出
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              int []arr=new int[5];
              Scanner sc=new Scanner(System.in);

              for(int i=0;i<arr.length;i++){
                     int num=sc.nextInt();
                     arr[i]=num;  
                     System.out.println(num);  
              }
              sc.close();
       }
}*/
// demo28
// 键盘录入一个数字去和已经存在的数组元素比较，有就输出数组元素所对应的索引
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              int [] arr={33,5,10,12,33};
              Scanner sc=new Scanner(System.in);
              int num=sc.nextInt();

              boolean find=false;
              for(int i=0;i<arr.length;i++){
                     if(num==arr[i]){
                            System.out.println(i);
                            find=true;
                            continue;
                     }
              }
              if(!find){
                     System.out.println("数组元素中没有找到该数字");
              }
              sc.close();
       }
}*/
// demo29
// 找数组元素中的最大值
/*public class BasicGrammar{
       public static void main(String[] args){
              int [] arr={22,20,29,15,0};
              int max=arr[0];
              for(int i=0;i<arr.length;i++){
                     if(arr[i]>max){
                            max=arr[i];
                     }
              }
              System.out.println(max);
       }
}*/
// demo30
// 利用随机生成的索引打乱数组中已有的元素排序
/*import java.util.Random;
public class BasicGrammar{
       public static void main(String[] args){
              int [] arr={1 ,2, 3, 4, 5, 6, 7, 8, 9};
              Random sc=new Random();
              for(int i=0;i<arr.length;i++){

              int RandomIndex=sc.nextInt(arr.length);
              int t=arr[i];
              arr[i]=arr[RandomIndex];
              arr[RandomIndex]=t;

              }

              for(int i=0;i<arr.length;i++){
                     System.out.println(arr[i]);
              }
       }
}*/
// demo31
// 在数组中去除重复元素
/*import java.util.Random;
public class BasicGrammar{
       public static void main(String[] args){
              int []arr=new int[10];
              Random r=new Random();
              for(int i=0;i<arr.length;){                    //i++写在下边是为了让条件判断后再进行下一次
                     int num=r.nextInt(100)+1;

                     int count=0;
                     for(int j=0;j<arr.length;j++){
                            if(num==arr[j]){
                                   count++;
                                   break;
                            }
                     }
                     if(count==0){
                            arr[i]=num;
                            i++;
                     }
              }
              for(int i=0;i<arr.length;i++){
                     System.out.print(arr[i]+" ");
              }
              System.out.println();
       }
}*/
// demo32
// 快慢指针存数据，慢指针默认指向0索引的位置（数据应存入的位置），快指针默认指向1索引的位置（找后边与慢指针所指不重复的数据）；
//若两个数据一样的，则快指针舍弃当前所指数据指向下一位；
//如果数据不一样，则把快指针的数据存入慢指针先自增再把数据放进去的位置；
/*public class BasicGrammar{
       public static void main(String[] args){
              int []arr={1,1,2,2,2,2,3,3,3,3};

              int fast=1;
              int slow=0;

              while(fast<arr.length){
                     if(arr[slow]==arr[fast]){
                            fast++;
                     }else{
                            slow++;
                            arr[slow]=arr[fast];
                            fast++;
                     }
              }
              for(int i=0;i<=slow;i++){          //这块限制范围是小于slow，而不是小于arr.length,否则会输出原数组的信息而不是重新排布的不重复的信息；
                     System.out.println(arr[i]);
              }
       }
}*/
// demo33
// 键盘录入一个数组长度给定数组中的元素，再给一个目标值，遍历数组两次循环，找数组中两个数之和为目标值所对应的索引，以序偶形式输出；
//目前存在一个bug 会交换着出现两相同元素，若有序输出则不算集合里元素的重复，反之是集合的重复；
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              int target=sc.nextInt();
              int len=sc.nextInt();
              int []nums=new int[len];
              for(int i=0;i<nums.length;i++){
                     nums[i]=sc.nextInt();
              }
              for(int i=0;i<nums.length;i++){
                     for(int j=1;j<nums.length;j++){
                            if(nums[i]+nums[j]==target){
                                    System.out.println(i+","+j);
                                          break;
                            }
                     }
              }
              sc.close();
       }
}*/
// demo34
//合并两个有序数组
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              int len1=sc.nextInt();
              int []arr1=new int [len1];
              for(int i=0;i<arr1.length;i++){
                     arr1[i]=sc.nextInt();
              }

              int len2=sc.nextInt();
              int []arr2=new int [len2];
              for(int i=0;i<arr2.length;i++){
                     arr2[i]=sc.nextInt();
              }

              int i=0;int j=0;int k=0;
              int[] arr3=new int [arr1.length+arr2.length];
              while(i<arr1.length&&j<arr2.length){
                     if(arr1[i]<arr2[j]){
                            arr3[k]=arr1[i];
                            i++;
                     }else{
                            arr3[k]=arr2[j];
                            j++;
                     }
                     k++;
              }
              while(i<arr1.length){
                     arr3[k++]=arr1[i++];
              }
              while(j<arr2.length){
                     arr3[k++]=arr2[j++];
              }
              for(int num:arr3){
              System.out.print(num+" ");
              }
              sc.close();
       }
}*/
// demo35
// 初步封装：求和函数；
/*import java.util.Scanner;
public class BasicGrammar{
       public static  long getSum(long a,long b){
                            long sum=a+b;
                            return sum;
                     }
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              long a=sc.nextLong();
              long b=sc.nextLong();
              long sum=0;
              sum=getSum(a,b);
              System.out.println(sum);
              sc.close();


       }
              
}*/
// demo36
// 用方法的思想去写遍历并且输出数组中的元素；
/*import java.util.Scanner;
public class BasicGrammar{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              int len=sc.nextInt();
              int [] arr=new int [len];
              for(int i=0;i<arr.length;i++){
                     arr[i]=sc.nextInt();
              }
              printArr(arr);
              sc.close();
       }
       public static void printArr(int []arr){
              System.out.print("[");
              for(int i=0;i<arr.length;i++){
                     if(i==arr.length-1){
                            System.out.print(arr[i]);
                     }else{
                            System.out.print(arr[i]+",");
                     }
              }
              System.out.print("]");
       }
}*/
// demo37
