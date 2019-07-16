package com.bawei.test;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;

import com.bawei.utils.StreamUtil;

public class Tests {
   
	  private String message;

	@Test
	  public void fun1() throws FileNotFoundException{
		  Closeable closeables=null;
		StreamUtil.closeAll(closeables);
		
	  }
	  
	  @Test
	  public void fun2() throws IOException{
		 InputStream src=null;
		OutputStream out=null;
		boolean isCloseInputStream = false;
		boolean isCloseOutputStream=false;
		StreamUtil.copy(src, out, isCloseInputStream, isCloseOutputStream);
	  }
	  
	  @Test
	  public void fun3() throws FileNotFoundException, IOException{
		  File txtFile=null;
		StreamUtil.readTextFile(txtFile);
	  }
	 
	  @Test
	  public void fun4() throws IOException{
		  InputStream src=null;
		HttpServletRequest request=null;
		StreamUtil.readTextFile(src, request);
	  }
	  
	  @Test
	  public void fun5(){
		  StreamUtil.readStringFromSystemIn(message);
	  }
	  
	  @Test
	  public void fun6(){
		  StreamUtil.readIntFromSystemIn(message);
	  }
}
