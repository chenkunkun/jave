package jave.test;

import java.io.File;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;
import it.sauronsoftware.jave.VideoAttributes;

public class AviToAviAndLowMp3 {
	//解码通用AVI文件，并创建另一个与源相同的视频流和重新编码的低质量MP3音频流
	public static void main(String[] args) throws IllegalArgumentException, InputFormatException, EncoderException {
		File source = new File("media\\source.avi");
		File target = new File("media\\aviToAviLowMp3.avi");
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("libmp3lame");
		audio.setBitRate(new Integer(56000));
		audio.setChannels(new Integer(1));
		audio.setSamplingRate(new Integer(22050));
		VideoAttributes video = new VideoAttributes();
		video.setCodec(VideoAttributes.DIRECT_STREAM_COPY);
		EncodingAttributes attrs = new EncodingAttributes();
		attrs.setFormat("avi");
		attrs.setAudioAttributes(audio);
		attrs.setVideoAttributes(video);
		Encoder encoder = new Encoder();
		encoder.encode(source, target, attrs);
	}

}
