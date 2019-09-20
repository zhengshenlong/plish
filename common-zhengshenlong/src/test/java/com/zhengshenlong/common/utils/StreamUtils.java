package com.zhengshenlong.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: StreamUtils
 * @Description: TODO
 * @author:郑申龙
 * @date: 2019年9月20日 上午8:33:13
 */
public class StreamUtils {

	public static void closeAll(String s) throws IOException {
		// 创建一个对象
		File file = new File("F://a.txt");

		FileInputStream fis = null;

		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);

			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 关闭流
		fos.close();
		fis.close();

	}

	public static String readTextFile(InputStream src) {
		   
		    return readTextFile(src);
	}

	
	
	public static String readTextFile(File txtFile){
		    
		        File f = new File("F://");
		        
		        new InputStream() {
					
					@Override
					public int read() throws IOException {
						// TODO Auto-generated method stub
						return 0;
					}
				};
		      
		      return  readTextFile(txtFile);
		}

}
