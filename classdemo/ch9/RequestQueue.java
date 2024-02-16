package classdemo.ch9;

import java.util.*;

interface Request {
    void execute();
}

public class RequestQueue {
    public static void main(String[] args) {
        var requests = new LinkedList();
        offerRequestTo(requests);
        process(requests);
    }

    static void offerRequestTo(Queue requests) {
        // 模擬將請求加入佇列
        for (var i = 1; i < 6; i++) {
            var request = new Request() {
                public void execute() {
                    System.out.printf("處理資料 %f%n", Math.random());
                }
            };
            //用於在佇列後端加入物件

            requests.offer(request);
        }
    }
    // 處理佇列中的請求
    static void process(Queue requests) {
        //用來取得佇列物件(但不取出
        while(requests.peek() != null) {
            //poll則是從前端取出物件
            var request = (Request) requests.poll();
            request.execute();
        }
    }
}