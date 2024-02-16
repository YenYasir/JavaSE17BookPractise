package classdemo.ch10;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Download {
    //openStream 可以指定http網址 http請求後取得回應 傳回InputStream    可用dump進一步處理
    public static InputStream openStream(String uri) throws Exception {
        // Java 11 新增的 HttpClient API
        return HttpClient
                .newHttpClient()
                .send(
                        HttpRequest.newBuilder(URI.create(uri)).build(),
                        HttpResponse.BodyHandlers.ofInputStream()
                )
                .body();
    }

    public static void main(String[] args) throws Exception {
        var src = openStream(args[0]);
        var dest = new FileOutputStream(args[1]);
        IO.dump(src, dest);
    }
}