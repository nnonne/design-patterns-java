public class Main {

    public static void main(String[] args) {

        Codec codec_mp4 = new MPEG4CompressionCodec();

        String fileName = "youtubevideo.ogg";

        VideoFile videoFile = new VideoFile(fileName,
                new Buffer("Byte buffer of video"),
                new Buffer("Byte buffer of audio"));

        videoFile.play(codec_mp4); // програємо файл не правильним кодеком

        Facade facade = new Facade();
        VideoFile videoFileConverted = facade.convert(videoFile, codec_mp4);
        videoFileConverted.play(codec_mp4);
    }
}
