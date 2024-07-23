class FingerprintHandler {
    import android.content.Context
    import androidx.biometric.BiometricManager
    import androidx.biometric.BiometricPrompt
    import androidx.core.content.ContextCompat
    import androidx.fragment.app.FragmentActivity
    import java.util.concurrent.Executor

    class FingerprintHandler(context: Context) {
        private val biometricPrompt: BiometricPrompt
        private val promptInfo: BiometricPrompt.PromptInfo

        init {
            val executor: Executor = ContextCompat.getMainExecutor(context)
            biometricPrompt = BiometricPrompt(context as FragmentActivity, executor, object : BiometricPrompt.AuthenticationCallback() {
                override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                    super.onAuthenticationError(errorCode, errString)
                    // Handle error
                }

                override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                    super.onAuthenticationSucceeded(result)
                    // Handle success
                }

                override fun onAuthenticationFailed() {
                    super.onAuthenticationFailed()
                    // Handle failure
                }
            })

            promptInfo = BiometricPrompt.PromptInfo.Builder()
                .setTitle("Fingerprint Authentication")
                .setSubtitle("Authenticate to take attendance")
                .setNegativeButtonText("Cancel")
                .build()
        }

        fun authenticate() {
            biometricPrompt.authenticate(promptInfo)
        }
    }

}