package com.marvin.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        String yourText = "BounceListViewActivity.java\n" +
                "\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.List;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "import android.app.Activity;\n" +
                "import android.widget.ArrayAdapter;\n" +
                "import com.example.bouncelistview.BounceListView;\n" +
                "\n" +
                "public class BounceListViewActivity extends Activity {\n" +
                "\n" +
                " @Override\n" +
                " public void onCreate(Bundle savedInstanceState) {\n" +
                "  super.onCreate(savedInstanceState);\n" +
                "  setContentView(R.layout.activity_main);\n" +
                "\n" +
                "  BounceListView mBounceLv = (BounceListView) findViewById(R.id.list);\n" +
                "  mBounceLv.setAdapter(new ArrayAdapter<String>(this,\n" +
                "    android.R.layout.simple_list_item_1, getData()));\n" +
                " }\n" +
                "\n" +
                " private List<String> getData() {\n" +
                "\n" +
                "  List<String> data = new ArrayList<String>();\n" +
                "  data.add(\"abc\");\n" +
                "  data.add(\"dsdsd\");\n" +
                "  data.add(\"dsds\");\n" +
                "  data.add(\"dff\");\n" +
                "  data.add(\"hghg\");\n" +
                "  data.add(\"jhj\");\n" +
                "  data.add(\"kjk\");\n" +
                "  data.add(\"abrerec\");\n" +
                "  data.add(\"afdfbc\");\n" +
                "  data.add(\"fdf\");\n" +
                "  data.add(\"abdsdc\");\n" +
                "  data.add(\"sds\");\n" +
                "  data.add(\"wewe\");\n" +
                "  data.add(\"sfsf\");\n" +
                "  data.add(\"dfggrfg\");\n" +
                "  data.add(\"fdfdvdvd\");\n" +
                "  data.add(\"vdvdv\");\n" +
                "  data.add(\"abdvdvc\");\n" +
                "  data.add(\"abdvdvc\");\n" +
                "  data.add(\"dvdvdv\");\n" +
                "  data.add(\"bbbfb\");\n" +
                "  data.add(\"avdvdvbc\");\n" +
                "  data.add(\"vdvdv\");\n" +
                "  return data;\n" +
                " }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "BounceListView.java \n" +
                "\n" +
                "\n" +
                "import android.content.Context;\n" +
                "import android.util.AttributeSet;\n" +
                "import android.util.DisplayMetrics;\n" +
                "import android.widget.ListView;\n" +
                "\n" +
                "public class BounceListView extends ListView {\n" +
                " private static final int MAX_Y_OVERSCROLL_DISTANCE = 200;\n" +
                "\n" +
                " private Context mContext;\n" +
                " private int mMaxYOverscrollDistance;\n" +
                "\n" +
                " public BounceListView(Context context) {\n" +
                "  super(context);\n" +
                "  mContext = context;\n" +
                "  initBounceListView();\n" +
                " }\n" +
                "\n" +
                " public BounceListView(Context context, AttributeSet attrs) {\n" +
                "  super(context, attrs);\n" +
                "  mContext = context;\n" +
                "  initBounceListView();\n" +
                " }\n" +
                "\n" +
                " public BounceListView(Context context, AttributeSet attrs, int defStyle) {\n" +
                "  super(context, attrs, defStyle);\n" +
                "  mContext = context;\n" +
                "  initBounceListView();\n" +
                " }\n" +
                "\n" +
                " private void initBounceListView() {\n" +
                "  // get the density of the screen and do some maths with it on the max\n" +
                "  // overscroll distance\n" +
                "  // variable so that you get similar behaviors no matter what the screen\n" +
                "  // size\n" +
                "\n" +
                "  final DisplayMetrics metrics = mContext.getResources()\n" +
                "    .getDisplayMetrics();\n" +
                "  final float density = metrics.density;\n" +
                "\n" +
                "  mMaxYOverscrollDistance = (int) (density * MAX_Y_OVERSCROLL_DISTANCE);\n" +
                " }\n" +
                "\n" +
                " @Override\n" +
                " protected boolean overScrollBy(int deltaX, int deltaY, int scrollX,\n" +
                "   int scrollY, int scrollRangeX, int scrollRangeY,\n" +
                "   int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {\n" +
                "  // This is where the magic happens, we have replaced the incoming\n" +
                "  // maxOverScrollY with our own custom variable mMaxYOverscrollDistance;\n" +
                "  return super.overScrollBy(deltaX, deltaY, scrollX, scrollY,\n" +
                "    scrollRangeX, scrollRangeY, maxOverScrollX,\n" +
                "    mMaxYOverscrollDistance, isTouchEvent);\n" +
                " }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "activity_main.xml\n" +
                "\n" +
                "\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    android:layout_width=\"fill_parent\"\n" +
                "    android:layout_height=\"fill_parent\"\n" +
                "    android:orientation=\"vertical\" >\n" +
                "\n" +
                "    <TextView\n" +
                "        android:layout_width=\"fill_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"@string/app_name\" />\n" +
                "\n" +
                "    <com.example.bouncelistview.BounceListView\n" +
                "        android:id=\"@+id/list\"\n" +
                "        android:layout_width=\"fill_parent\"\n" +
                "        android:layout_height=\"wrap_content\" />\n" +
                "\n" +
                "</LinearLayout>";

        TextView textView = (TextView) this.findViewById(R.id.text_view);
        textView.setText(yourText);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, R.anim.pop_down_out);
    }
}
