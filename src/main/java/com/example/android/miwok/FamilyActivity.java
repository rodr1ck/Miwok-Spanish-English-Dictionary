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

public class FamilyActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        // words.add("one");
        // Word w = new Word("one", "uno");
        //words.add(w);
        words.add(new Word("father", "padre", R.drawable.family_father));
        words.add(new Word("mother", "madre", R.drawable.family_mother));
        words.add(new Word("son", "hijo", R.drawable.family_son));
        words.add(new Word("daughter", "hija", R.drawable.family_daughter));
        words.add(new Word("older brother", "hermano mayor", R.drawable.family_older_brother));
        words.add(new Word("younger brother", "hermano menor", R.drawable.family_younger_brother));
        words.add(new Word("older sister", "hermana mayour", R.drawable.family_older_sister));
        words.add(new Word("younger sister", "hermana menor", R.drawable.family_younger_sister));
        words.add(new Word("grandmother", "abuela", R.drawable.family_grandmother));
        words.add(new Word("grandfather", "abuelo", R.drawable.family_grandfather));

        // LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);

       // WordAdapter adapter = new WordAdapter(this, words);
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

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