package com.krishanshamod.simple_android_application_4

import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class RobolectricTest {

    @Test
    fun check_activity_text() {
        val activity = Robolectric.buildActivity(Activity::class.java).create().get()
        val textViewActivity : TextView = activity.findViewById(R.id.textViewActivity)

        assertEquals("Hello World!", textViewActivity.text)
    }

    @Test
    fun check_fragment_text(){
        val activity = Robolectric.buildActivity(Activity::class.java).create().get()
        val fragment = Fragment()

        val fragmentManager: FragmentManager = activity.supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(fragment, null)
        fragmentTransaction.commit()

        val textViewFragment : TextView = activity.findViewById(R.id.textViewFragment)
        assertEquals("Hello World!", textViewFragment.text)
    }
}