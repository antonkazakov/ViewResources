package otus.gpb.homework.viewandresources

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        findViewById<Button>(R.id.buttonPay).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.tolbar_cart, menu)
        return super.onCreateOptionsMenu(menu)
    }
}