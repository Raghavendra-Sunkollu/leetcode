package networkprogramming;
import java.net.*;
import java.io.*;
public class url {
	public static void main(String[] args) throws Exception {
	URL obj3=new URL("http://www.infiniteskills.com");
	System.out.println();
	System.out.println("Protocol="+obj3.getProtocol());
	System.out.println("Port no="+obj3.getPort());
	System.out.println("Host="+obj3.getHost());
	URLConnection theConn=obj3.openConnection();
	//to see if there is content 
	long contentlength=theConn.getContentLengthLong();
	System.out.println(contentlength);
	long c;
	if(contentlength==0) {
		System.out.println(" the contents of this site is empty");
	}
	else {
		System.out.println("contents=");
		System.out.println("");
		InputStream urlInput=theConn.getInputStream();
		while((c=urlInput.read())!=-1) {
			System.out.println((char) c);
		}
		urlInput.close();
	}
	}
	
}
