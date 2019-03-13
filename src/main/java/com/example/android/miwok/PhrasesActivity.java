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

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ListView;
        import android.widget.Toast;

        import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        // words.add("one");
        // Word w = new Word("one", "uno");
        //words.add(w);
        words.add(new Word("Where are you going?", "¿Dónde vas?"));
        words.add(new Word("What is your name?", "¿Cómo te llamas?"));
        words.add(new Word("My name is...", "Mi nombre es..."));
        words.add(new Word("How are you feeling?", "¿Cómo te sientes?"));
        words.add(new Word("I’m feeling good.", "Estoy bien."));
        words.add(new Word("Are you coming?", "¿vienes?"));
        words.add(new Word("Yes, I’m coming.", "Si, estoy viniendo."));
        words.add(new Word("I’m coming.", "Estoy viniendo"));
        words.add(new Word("Let’s go.", "Vamos"));
        words.add(new Word("Come here.", "Ven aquí."));

        // LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);

        //WordAdapter adapter = new WordAdapter(this, words);
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

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