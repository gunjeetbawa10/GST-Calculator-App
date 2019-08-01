package wingcompiler.gstcalculator;



import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_about);

        Typeface mOdin = Typeface.createFromAsset(getAssets(), "odin.otf");
        Typeface mDosisSemiBold = Typeface.createFromAsset(getAssets(), "dosis-semibold.ttf");

        TextView mABT = (TextView) findViewById(R.id.tv_about);
        mABT.setTypeface(mOdin);
        TextView mABTInfo = (TextView) findViewById(R.id.tv_dev);
        mABTInfo.setTypeface(mDosisSemiBold);
    }
}