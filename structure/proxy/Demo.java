package structure.proxy;

import structure.proxy.downloader.YouTubeDownloader;
import structure.proxy.proxy.YoutubeCacheProxy;
import structure.proxy.some_cool_media_library.ThirdPartyYouTubeClass;

public class Demo {

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching proxy "+(naive - smart)+ "ms");
    }

    private static long test(YouTubeDownloader downloader) {

        long startTime = System.currentTimeMillis();

        downloader.renderPopularVideos();;
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");

        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: "+estimatedTime+"ms\n");
        return estimatedTime;
    }


}
