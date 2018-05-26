package com.main.webview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.main.activity.R;
import com.main.utils.BaseActivity;

/**
 * 浏览器
 */
public class AutoWebView extends BaseActivity {
    private WebView auto_webview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        initView();

    }

    //初始化
    private void initView() {
        auto_webview = findViewById(R.id.auto_webview);
        auto_webview.getSettings().setJavaScriptEnabled(true);
        auto_webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        auto_webview.loadUrl("www.baidu.com");


        auto_webview.setWebChromeClient(new WebChromeClient() {

            //进度条
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
            }

            //警告框
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                return true;
            }

            //获取title
            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);

            }

            //确认框
            @Override
            public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
                return super.onJsConfirm(view, url, message, result);
            }


        });
    }

}
