package structure.facade;

import structure.facade.facade.VideoConversionFacade;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
