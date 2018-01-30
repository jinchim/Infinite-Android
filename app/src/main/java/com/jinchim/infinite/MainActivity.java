package com.jinchim.infinite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

//    InfiniteClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        client = InfiniteClient.getInstance();
//        client.connect("192.168.80.107", 9999);
//        client.notify("test", new StringMessage("你好啊，金子"));
//        client.on("test", message -> {
//            StringMessage stringMessage = (StringMessage) message;
//            Log.i("jinchim", "test => " + stringMessage.getMessage());
//        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        client.release();
    }

}
