import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var createClassButton: Button? = null
    private var classListView: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//change 1
        createClassButton = findViewById<Button>(R.id.create_class_button)
        classListView = findViewById<ListView>(R.id.class_list)

        createClassButton.setOnClickListener(View.OnClickListener {
            // Handle class creation (e.g., open a dialog to enter class name)
        })

        // Load existing classes from the database
    }
}