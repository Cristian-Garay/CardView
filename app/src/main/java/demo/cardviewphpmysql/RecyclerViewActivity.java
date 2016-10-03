package demo.cardviewphpmysql;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity {

    private List<Person> persons;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recyclerview_activity);

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        persons = new ArrayList<>();
//        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.emma));
//        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.lavery));
//        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.lillie));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(this,persons);
        rv.setAdapter(adapter);
    }
}