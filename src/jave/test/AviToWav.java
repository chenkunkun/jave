package jave.test;

import java.io.File;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;

public class AviToWav {
	//AVI中提取音频信息并将它们存储在纯WAV文件中
	public static void main(String[] args) throws IllegalArgumentException, InputFormatException, EncoderException {
		File source = new File("media\\source.avi");
		File target = new File("media\\avi2wav.wav");
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("pcm_s16le");
		EncodingAttributes attrs = new EncodingAttributes();
		attrs.setFormat("wav");
		attrs.setAudioAttributes(audio);
		Encoder encoder = new Encoder();
		encoder.encode(source, target, attrs);
	}
}
