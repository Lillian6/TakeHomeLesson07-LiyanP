package com.example.pengbuding.takehomelesson07_liyanp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private ArrayList<Animal> animals;
    RecyclerView recyclerView;
    AnimalAdapter animalAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        animalAdapter = new AnimalAdapter(animals, this);
        recyclerView.setAdapter(animalAdapter);



    }

    private void initialData(){
        animals = new ArrayList<>();
        animals.add(new Animal("Elephant", "Average Age: 100", R.drawable.elephant_100));
        animals.add(new Animal("Rabbit", "Average Age: 7", R.drawable.rabbit_7));
        animals.add(new Animal("Wolf", "Average Age: 20", R.drawable.wolf_20));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_recycler, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                animals.add(getRandomAnimal());
                animalAdapter.notifyDataSetChanged();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private Animal getRandomAnimal(){
        int num = (int) (Math.random() * 3);
        if (num == 0){
            return new Animal("Elephant", "Average Age: 100", R.drawable.elephant_100);
        }else if(num == 1){
            return new Animal("Rabbit", "Average Age: 7", R.drawable.rabbit_7);
        }else{
            return new Animal("Wolf", "Average Age: 20", R.drawable.wolf_20);
        }
    }
}
