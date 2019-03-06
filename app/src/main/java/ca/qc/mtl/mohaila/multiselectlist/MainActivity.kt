package ca.qc.mtl.mohaila.multiselectlist

import android.app.ListActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class MainActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, words)
    }

    companion object {
        val words = arrayOf("I am", "You are", "He is", "She is", "It is", "We are", "You are", "They are")
    }
}
