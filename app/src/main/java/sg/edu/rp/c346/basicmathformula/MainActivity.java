package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMath;
    ArrayList<MathItem> alMathList;
    CustomAdapter caMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMath = findViewById(R.id.listViewFormula);
        alMathList = new ArrayList<>();

        MathItem item1 = new MathItem("Area of rectangle", "Length x Length","Formula type is: Area");
        MathItem item2 = new MathItem("Area of triangle", "(Length of base x Length) / 2", "Formula type is: Area");
        MathItem item3 = new MathItem("Volume of cube", "Length x Length x Length", "Formula type is: Volume");

        alMathList.add(item1);
        alMathList.add(item2);
        alMathList.add(item3);

        caMath = new CustomAdapter(this, R.layout.math_item, alMathList);

        lvMath.setAdapter(caMath);
    }
}
