package window;

import java.io.*;
import java.util.*;
import simulate.*;

public class GenerateController {
	public static GenerateController GC = new GenerateController();
	
	public void Generate(int type,String parameter,String Num) throws IOException {
		int num = Integer.parseInt(Num);
		String[] p = parameter.split(",");
		if(type>6) {
			RealDisFactory rd = new RealDisFactory();
			AbstractRealDistribution r =  rd.CreateDis(type-6, p);
			double[] out=r.sample(num);
			File f = new File(GetTime());
	        FileOutputStream fop = new FileOutputStream(f);
	        // 构建FileOutputStream对象,文件不存在会自动新建
	 
	        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
	        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
	        for(int i = 0; i < num; i++) { 
	        	if(i == num - 1) {
	        		writer.append(String.valueOf(out[i]));
	        		break;
	        	}
	        	writer.append(String.valueOf(out[i])+","); 
	        	}
	        // 写入到缓冲区
	        writer.close();
	        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
	        fop.close();
	        System.gc();
		}else {
			IntegerDisFactory id = new IntegerDisFactory();
			AbstractIntegerDistribution a = id.CreateDis(type,p);
			int[] out=a.sample(num);
			File f = new File(GetTime());
	        FileOutputStream fop = new FileOutputStream(f);
	        // 构建FileOutputStream对象,文件不存在会自动新建
	 
	        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
	        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
	        for(int i = 0; i < num; i++) { 
	        	if(i == num - 1) {
	        		writer.append(String.valueOf(out[i]));
	        		break;
	        	}
	        	writer.append(String.valueOf(out[i])+","); 
	        	}
	        // 写入到缓冲区
	        writer.close();
	        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
	        fop.close();
	        System.gc();
		}
	}
	
	public String GetTime() {
		//创建Calendar对象
		  Calendar cal=Calendar.getInstance();
		  
		  //用Calendar类提供的方法获取年、月、日、时、分、秒
		  int year  =cal.get(Calendar.YEAR);   //年
		  int month =cal.get(Calendar.MONTH)+1;  //月  默认是从0开始  即1月获取到的是0
		  int day   =cal.get(Calendar.DAY_OF_MONTH);  //日，即一个月中的第几天
		  int hour  =cal.get(Calendar.HOUR_OF_DAY);  //小时
		  int minute=cal.get(Calendar.MINUTE);   //分
		  int second=cal.get(Calendar.SECOND);  //秒
		  
		  //拼接成字符串输出
		  return year+"-"+month+"-"+day+"_"+hour+"."+minute+"."+second+".txt";
	}
}
