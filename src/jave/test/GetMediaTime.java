package jave.test;

import java.io.File;

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.MultimediaInfo;

public class GetMediaTime {

	public static void main(String[] args) {
		 File source = new File("media\\avi2wav.wav");
	        Encoder encoder = new Encoder();
	        try {
	            MultimediaInfo m = encoder.getInfo(source);
	            long ls = m.getDuration();
	            System.out.println("此视频时长为:" + ls / 60000 + "分" + ls / 1000 + "秒！");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
