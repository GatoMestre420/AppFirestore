package br.edu.up.rgm35883928.viewmodel


import androidx.lifecycle.ViewModel
import br.edu.up.rgm35883928.Filters


/**
 * ViewModel for [com.google.firebase.example.fireeats.MainActivity].
 */

class MainActivityViewModel : ViewModel() {

    var isSigningIn: Boolean = false
    var filters: Filters = Filters.default
}
