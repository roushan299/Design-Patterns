package structure.facade.media_library;

public class CodeFactory {

    public static Codec extract(VideoFile file){
        String type = file.getCodecType();
        if(type.equals("mp4")){
            System.out.println("CodeFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }else {
            System.out.println("CodeFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
