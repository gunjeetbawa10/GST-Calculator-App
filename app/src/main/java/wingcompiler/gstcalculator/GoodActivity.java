package wingcompiler.gstcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;



public class GoodActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner _Products;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_good);
        _Products = findViewById(R.id.sp_listproducts);
        ArrayAdapter<CharSequence> mAdapter = ArrayAdapter.createFromResource(this,
                R.array.products, android.R.layout.simple_spinner_item);
        mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        _Products.setAdapter(mAdapter);

        _Products.setOnItemSelectedListener(this);



        }






    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String Text= adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(),Text,Toast.LENGTH_LONG).show();
        if (i == 1){
            startActivity(new Intent(GoodActivity.this,camera.class));

        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
