package br.edu.up.rgm35883928.util

import android.content.Context
import androidx.startup.Initializer
import com.google.firebase.BuildConfig
import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore

class FirestoreInitializer : Initializer<FirebaseFirestore> {

    // The host '10.0.2.2' is a special IP address to let the
    // Android emulator connect to 'localhost'.
    private val FIRESTORE_EMULATOR_HOST = "10.0.2.2"
    private val FIRESTORE_EMULATOR_PORT = 8080

    override fun create(context: Context): FirebaseFirestore {
        val firestore = Firebase.firestore
        // Use emulators only in debug builds
        if (BuildConfig.DEBUG) {
            firestore.useEmulator(FIRESTORE_EMULATOR_HOST, FIRESTORE_EMULATOR_PORT)
        }
        return firestore
    }


    // No dependencies on other libraries
    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()
}