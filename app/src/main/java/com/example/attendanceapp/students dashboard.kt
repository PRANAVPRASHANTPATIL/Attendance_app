import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StudentActivity : AppCompatActivity() {
    private var fingerprintButton: Button? = null
    private var fingerprintHandler: FingerprintHandler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        fingerprintButton = findViewById<Button>(R.id.fingerprint_button)
        fingerprintHandler = FingerprintHandler(this)

        fingerprintButton.setOnClickListener(View.OnClickListener { fingerprintHandler.authenticate() })
    }
}