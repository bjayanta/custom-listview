package com.maxsop.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Started.");
        listView = findViewById(R.id.listView);

        // create fruit object
        Fruit mango = new Fruit("mango", "Mango", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Fruit apricot = new Fruit("apricot", "Apricot", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Fruit banana = new Fruit("banana", "Banana", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Fruit berries = new Fruit("berries", "Berries", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Fruit carambola = new Fruit("carambola", "Carambola", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Fruit cherries = new Fruit("cherries", "Cherries", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Fruit apple = new Fruit("apple", "Apple", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Fruit guava = new Fruit("guava", "Guava", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Fruit orange = new Fruit("orange", "Orange", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Fruit pineapple = new Fruit("pineapple", "Pineapple", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.");

        // add the fruit object to an ArrayList
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        fruitArrayList.add(mango);
        fruitArrayList.add(apricot);
        fruitArrayList.add(banana);
        fruitArrayList.add(berries);
        fruitArrayList.add(carambola);
        fruitArrayList.add(cherries);
        fruitArrayList.add(apple);
        fruitArrayList.add(guava);
        fruitArrayList.add(orange);
        fruitArrayList.add(pineapple);

        FruitListAdapter adapter = new FruitListAdapter(this, R.layout.row, fruitArrayList);
        listView.setAdapter(adapter);

    }
}
