package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    private static final int NUM=10;
    public static final String b="";
    public static final int aa = 0;

    public static final String bb="cc";
    public static final int ee =1;

    /*
    * 客户id
    */
    private int id=1;
    
    /*
    *客户名称
    */
    private String name="离骚";

     public static void main(String[] args) {
         System.out.println("项目，模块！！");
         System.out.println("sout:快捷输出内容");
         System.out.println("HelloWorld.main");
         System.out.println("args = " + args);
         int num=10;
         System.out.println("num = " + num);
         System.out.println("args = [" + args + "]");

         String[] arr = new String[]{"lilei","jon","lili"};
         for (int i = 0; i < arr.length; i++) {
             System.out.println("i = " + i);
             System.out.println("arr = " + arr[i]);
         }

         for (String s : arr) {
             System.out.println("s = " + s);
         }

         for (int i = 0; i < arr.length; i++) {
             String s = arr[i];
             System.out.println("s = " + s);
         }

         List<String> list = new ArrayList<String>();
         list.add("不要总是一山望着另一山高");
         list.add("补充自己的大型项目经验");
         list.add("7，8，9，10，11,12,今年我还有6个月，这6个月预计完成2个大型项目");
         list.add("项目做的过程当中遇到的问题要积极去解决");
         for (String s : list) {

         }
         for (int i = 0; i < list.size(); i++) {
             
         }
         for (int i = list.size() - 1; i >= 0; i--) {
             
         }
         if (list == null) {
             System.out.println("list is null");
         }
         if (list != null) {
             System.out.println("list is not null");
         }
         if (list != null) {
             System.out.println("nn is not null");
         }
         if (list == null) {
             System.out.println("null is null");
         }

         //3

    }

    public void testMethod(){
        System.out.println("自定义一个模板：测试方法模板");
    }
}
