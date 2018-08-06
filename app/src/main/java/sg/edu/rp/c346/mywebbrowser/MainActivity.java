package sg.edu.rp.c346.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText edURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edURL = findViewById(R.id.editText);
        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);

        wvMyPage.setWebViewClient(new WebViewClient());


        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wvMyPage.loadUrl(edURL.getText().toString());
                wvMyPage.getSettings().setJavaScriptEnabled(true);
                wvMyPage.getSettings().setAllowFileAccess(false);
                wvMyPage.getSettings().setBuiltInZoomControls(true);
            }
        });

    }



}
