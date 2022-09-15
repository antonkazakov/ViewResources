package otus.gpb.homework.viewandresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.widget.Toolbar

class ContactsActivity : AppCompatActivity() {

    lateinit var textSelect:AutoCompleteTextView
    lateinit var textState:AutoCompleteTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        val toolbar = findViewById<Toolbar>(R.id.toolbar_contacts)
        setSupportActionBar(toolbar)

        textSelect = findViewById(R.id.text_phoneSelect)
        setAdapterSelect()

        textState=findViewById(R.id.text_stateSelect)
        setAdapterState()
    }

    private fun setAdapterSelect(){
        val items = resources.getStringArray(R.array.contacts_select)
        val adapter = ArrayAdapter(this, R.layout.list_contacts_select_item, items)
        textSelect.setAdapter(adapter)
    }

    private fun setAdapterState(){
        val states= mutableListOf<String>()
        addState(states)
        val adapter = ArrayAdapter(this, R.layout.list_contacts_select_item, states)
        textState.setAdapter(adapter)
    }

    private fun addState(states:MutableList<String>):MutableList<String>{
        for(i in 1..10){
            states.add("$i")
        }
        return states
    }
}