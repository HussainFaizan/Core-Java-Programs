import javax.sound.sampled.*;
// import javax.sound.sampled.AudioFileFormat;
// import javax.sound.sampled.AudioFormat;
// import javax.sound.sampled.AudioInputStream;
// import javax.sound.sampled.AudioSystem;
// import javax.sound.sampled.DataLine;
// import javax.sound.sampled.LineUnavailableException;
// import javax.sound.sampled.TargetDataLine;

import java.io.*;

public class JavaSoundRecorder {
    static final long RECORD_TIME = 6000;
    File wavFile = new File("RecordAudio.wav");

    AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;

    TargetDataLine line;

    AudioFormat getAudioFormat() {
        final float sampleRate = 8000.0F;
        final int sampleSizeInBits = 16;
        final int channels = 1;
        final boolean signed = true;
        final boolean bigEndian = true;
        final AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits, channels, signed, bigEndian);
        return format;
    }

    void start() {
        try {
            final AudioFormat format = getAudioFormat();
            final DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

            if (!AudioSystem.isLineSupported(info)) {
                System.out.println("Line not supported");
                System.exit(0);
            }
            line = (TargetDataLine) AudioSystem.getLine(info);
            line.open(format);
            line.start();
            System.out.println("Sart capturing...");
            final AudioInputStream ais = new AudioInputStream(line);
            System.out.println("start recordind...");
            AudioSystem.write(ais, fileType, wavFile);

        } catch (final LineUnavailableException ex) {
            ex.printStackTrace();
        } catch (final IOException ioe) {
            ioe.printStackTrace();
        }
    }

    void finish() {
        line.stop();
        line.close();
        System.out.println("Finished");
    }

    public static void main(final String[] args) {
        final JavaSoundRecorder recorder = new JavaSoundRecorder();
        final Thread stopper = new Thread(new Runnable() {

            public void run() {
                try {
                    Thread.sleep(RECORD_TIME);

                } catch (final InterruptedException ex) {
                    ex.printStackTrace();
                }
                recorder.finish();
            }
        });
        stopper.start();
        recorder.start();
    }
}