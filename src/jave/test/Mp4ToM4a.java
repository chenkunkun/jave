package jave.test;

import java.io.File;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;
import it.sauronsoftware.jave.VideoAttributes;
import jave.config.MyFFMPEGExecute;

public class Mp4ToM4a {

	public static void main(String[] args) throws IllegalArgumentException, InputFormatException, EncoderException {
		//源文件
		File source = new File("‪media\\source.mp4");
		//目标文件
		File target = new File("‪media\\mp42m4a.m4a");
		
		//音频编码属性
		AudioAttributes audio = new AudioAttributes();
		//它设置将用于音频流转码的编码解码器的名称
		audio.setCodec("libmp3lame");
		
		//它为新的重新编码的音频流设置比特率值
		audio.setBitRate(new Integer(64000));
		
		//它设置将在重新编码的音频流中使用的音频通道的数量（1 =单声道，2 =立体声）。如果没有设置通道值，编码器将选择一个默认值。
		audio.setChannels(new Integer(1));
		
		//它为新的重新编码的音频流设置采样率。如果未设置采样率值，则编码器会选取默认值。
		audio.setSamplingRate(new Integer(22050));
		
		VideoAttributes video = new VideoAttributes();
		video.setCodec(VideoAttributes.DIRECT_STREAM_COPY);
		
		//编码属性
		EncodingAttributes attrs = new EncodingAttributes();
		//它设置将用于新编码文件的流容器的格式
		attrs.setFormat("mp3");
		//设置音频编码属性
		attrs.setAudioAttributes(audio);
		attrs.setVideoAttributes(video);
		
		Encoder encoder = new Encoder(new MyFFMPEGExecute());
		encoder.encode(source, target, attrs);
		
	}

}
