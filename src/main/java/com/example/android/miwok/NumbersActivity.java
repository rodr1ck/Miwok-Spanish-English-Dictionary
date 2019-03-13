/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
       // words.add("one");
       // Word w = new Word("one", "uno");
        //words.add(w);
        words.add(new Word("one", "uno", R.drawable.number_one));
        words.add(new Word("two", "dos", R.drawable.number_two));
        words.add(new Word("three", "tres",R.drawable.number_three));
        words.add(new Word("four", "cuatro", R.drawable.number_four));
        words.add(new Word("five", "cinco", R.drawable.number_five));
        words.add(new Word("six", "seis", R.drawable.number_six));
        words.add(new Word("seven", "siete", R.drawable.number_seven));
        words.add(new Word("eight", "ocho", R.drawable.number_eight));
        words.add(new Word("nine", "nueve", R.drawable.number_nine));
        words.add(new Word("ten", "diez", R.drawable.number_ten));

       // LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);

        //WordAdapter adapter = new WordAdapter(this, words);
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

      // GridView gridView = (GridView) findViewById(R.id.list);
       //gridView.setAdapter(itemsAdapter);


        //  int index=0;

        /*
        for (int i = 0; i < words.size(); i++) {
        TextView wordView = new TextView(this);
        wordView.setText(words.get(i));
        rootView.addView(wordView);
        } */


/*
        for (int i = 0; i < words.size(); i++) {
            Log.v("NumbersActivity", "Word at index " + i + ": " + words.get(i));
        } */

        /*
        String[] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        for (int i = 0; i < words.length; i++) {
            Log.v("NumbersActivity", "Word at index " + i + ": " + words[i]);
        } */

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();

    }
}


/*
class NumbersClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();}
}
*/