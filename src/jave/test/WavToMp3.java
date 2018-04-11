package jave.test;

import java.io.File;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;
import jave.config.MyFFMPEGExecute;

public class WavToMp3 {
	//示例需要一个音频WAV文件并生成一个128 kbit / s，立体声，44100 Hz MP3文件
	public static void main(String[] args) throws IllegalArgumentException, InputFormatException, EncoderException {
		File source = new File("‪media\\avi2wav.wav");
		File target = new File("‪media\\wav2mp3.mp3");
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("libmp3lame");
		audio.setBitRate(new Integer(128000));
		audio.setChannels(new Integer(2));
		audio.setSamplingRate(new Integer(44100));
		EncodingAttributes attrs = new EncodingAttributes();
		attrs.setFormat("mp3");
		attrs.setAudioAttributes(audio);
		Encoder encoder = new Encoder(new MyFFMPEGExecute());  
		encoder.encode(source, target, attrs);
	}

}
