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

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

//        // Create an array of words
//        String[] words = new String[10];
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//        words[3] = "four";
//        words[4] = "five";
//        words[5] = "six";
//        words[6] = "seven";
//        words[7] = "eight";
//        words[8] = "nine";
//        words[9] = "ten";
//
//        System.out.println(words);
//        // Show Log
//        Log.v("NumbersActivity","Word at index 0: " + words[0]);
//        Log.v("NumbersActivity","Word at index 1: " + words[1]);
//        Log.v("NumbersActivity","Word at index 2: " + words[2]);
//        Log.v("NumbersActivity","Word at index 3: " + words[3]);
//        Log.v("NumbersActivity","Word at index 4: " + words[4]);
//        Log.v("NumbersActivity","Word at index 5: " + words[5]);
//        Log.v("NumbersActivity","Word at index 6: " + words[6]);
//        Log.v("NumbersActivity","Word at index 7: " + words[7]);
//        Log.v("NumbersActivity","Word at index 8: " + words[8]);
//        Log.v("NumbersActivity","Word at index 9: " + words[9]);
//        // Easy show Log
//        for (int i= 0; i< words.length; i++ ){
//            Log.v("NumbersActivity","Word at index "+ i +": "+ words[i]);
//        }


        //EXTRA
//        ArrayList<String> restaurantsToTry = new ArrayList<String>();
//        restaurantsToTry.add("Morning Cafe");
//        restaurantsToTry.add("BBQ Time");
//
//        System.out.println(restaurantsToTry);
//
//        restaurantsToTry.remove("Morning Cafe");
//
//        System.out.println(restaurantsToTry);
//
//        int numberOfRestaurants =  restaurantsToTry.size();
//
//        System.out.println(numberOfRestaurants);

        //ArrayList
        ArrayList<Word> words = new ArrayList<>();


        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("nine", "wo’e", R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten));
        System.out.println(words);


//        //Show Log method 1
//        System.out.println(words);
//
//        //Show Log method 2
//        for (int i = 0; i < words.size(); i++) {
//            Log.v("M2 NumbersActivity", "Word at index "+ i + ": " + words.get(i));
//        }
//
//        //Show Log method 3
////        for (String word: words) {
////            Log.v("M3 NumbersActivity", "Word at index " +words.indexOf(word) + ": " + word);
////        }
//
//        //Show Log method 4
//        for (int index = 0; index < words.size(); index ++){
//            Log.v("M4 NumbersActivity", "Index: "+ index + " Value: "+ words.get(index));
//        }
//
//        // Show Log method 5
//        int index = 0;
//        while (index < 10) {
//            Log.v("M5 NumbersActivity", "Word at index " + index + ": " + words.get(index));
//            index ++;
//        }


        // Show the Array in a TextView
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

//        //Show M1
//        index = 0;
//        while (index < 10) {
//            //make box
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//            //add one
//            index++;
//        }

//        // Show M2
//        for (index = 0; index < words.size(); index++) {
//            // show it
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//        }

        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
