package otus.gpb.homework.viewandresources

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button

class ContactsActivity : AppCompatActivity() {

    private lateinit var autoCompleteTextViewSelect : AutoCompleteTextView
    private lateinit var autoCompleteTextViewState : AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        initAutoCompleteTextView()
    }

    private fun initAutoCompleteTextView(){
        autoCompleteTextViewSelect = findViewById(R.id.actv_select)
        autoCompleteTextViewState = findViewById(R.id.actv_state)

        val selects = arrayOf("Select 1", "Select 2", "Select 3")

        val adapter1 = ArrayAdapter<String>(
            this, android.R.layout.simple_spinner_dropdown_item, selects
        )
        autoCompleteTextViewSelect.setAdapter(adapter1)

        val states = arrayOf("State 1", "State 2", "State 3")

        val adapter2 = ArrayAdapter<String>(
            this, android.R.layout.simple_spinner_dropdown_item, states
        )
        autoCompleteTextViewState.setAdapter(adapter2)

        findViewById<Button>(R.id.buttonRegister).setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.tolbar_contacts, menu)
        return super.onCreateOptionsMenu(menu)
    }
}