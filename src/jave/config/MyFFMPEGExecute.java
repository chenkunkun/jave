package jave.config;

import it.sauronsoftware.jave.FFMPEGLocator;

public class MyFFMPEGExecute extends FFMPEGLocator{
	protected String getFFMPEGExecutablePath() {  
		//ffmpeg路径 用于执行命令
        String path = "E:\\线上项目\\jave\\src\\jave\\test\\ffmpeg.exe";  
        return path;  
    }  
}
