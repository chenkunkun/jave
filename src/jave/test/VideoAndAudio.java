package jave.test;

import java.io.File;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;
import it.sauronsoftware.jave.VideoAttributes;

public class VideoAndAudio {
	//生成带有MPEG 4 / DivX视频和OGG Vorbis音频的AVI
	public static void main(String[] args) throws IllegalArgumentException, InputFormatException, EncoderException {
		File source = new File("source.avi");
		File target = new File("target.avi");
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("libvorbis");
		VideoAttributes video = new VideoAttributes();
		video.setCodec("mpeg4");
		video.setTag("DIVX");
		video.setBitRate(new Integer(160000));
		video.setFrameRate(new Integer(30));
		EncodingAttributes attrs = new EncodingAttributes();
		attrs.setFormat("mpegvideo");
		attrs.setAudioAttributes(audio);
		attrs.setVideoAttributes(video);
		Encoder encoder = new Encoder();
		encoder.encode(source, target, attrs);
	}

}
