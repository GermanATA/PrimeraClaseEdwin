package german.dccomics.preference

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import german.dccomics.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}