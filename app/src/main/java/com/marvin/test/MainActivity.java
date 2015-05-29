package com.marvin.test;

import pl.droidsonroids.gif.GifImageView;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class MainActivity extends ActionBarActivity {

    private GifImageView mGif;
    private ImageView mImageView;
    private RequestQueue mRequestQueue;
    private Jsoup jsoup;

    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        mGif = (GifImageView)this.findViewById(R.id.iv_gif);
        mGif.setImageResource(R.drawable.mouse);

        mImageView = (ImageView) this.findViewById(R.id.iv_normal);
        mImageView.setImageResource(R.drawable.mouse);

        mRequestQueue = Volley.newRequestQueue(this);

        Document doc = Jsoup.parse("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\" />\n" +
                "<!--<meta name=\"viewport\" content=\"width=device-width, user-scalable=no\">-->\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n" +
                "<meta name=\"description\" content=\"宅微店手机版\" />\n" +
                "<meta name=\"keywords\" content=\"宅微店手机版\" />\n" +
                "<meta name=\"author\" content=\"宅微店\" />\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"index.css\">\n" +
                "<title>宅微店手机版</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<section class=\"container\">\n" +
                "<aside>\n" +
                "\t<section class=\"error\">\n" +
                "    \t<div class=\"errorpic\"><span class=\"csa wifi-ico\"></span></div>\n" +
                "        <div class=\"errorbut wifi\"><span class=\"prompt nonet\">数据加载失败</span></div>\n" +
                "        <div class=\"errorbut wifi\"><span class=\"prompt refresh\">请检查网络后，点击刷新重新加载</span></div>\n" +
                "    \t<div class=\"errorbut\"><a href=\"javascript:window.android.refresh()\" class=\"refresh\">刷新</a></div>\n" +
                "    </section>\n" +
                "</aside>\n" +
                "</section>\n" +
                "</body>\n" +
                "</html>");
    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("Marvin");
        setSupportActionBar(mToolbar);

        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.action_settings:
                        Toast.makeText(MainActivity.this, "action_settings", Toast.LENGTH_SHORT).show();
                        Button btHello = (Button) findViewById(R.id.bt_hello);
                        btHello.setText("hello android");
                        break;
                    case R.id.action_share:
                        Toast.makeText(MainActivity.this, "action_share", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawer_open,R.string.drawer_close);
        mDrawerToggle.syncState();
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        Button btHello = (Button) this.findViewById(R.id.bt_hello);
        btHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("hello android");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Button btHello = (Button) this.findViewById(R.id.bt_hello);
            btHello.setText("hello android");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
