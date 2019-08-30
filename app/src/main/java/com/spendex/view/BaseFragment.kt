package com.spendex.view

import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment<View> : Fragment() {

    abstract fun getPresenter(): ScopedPresenter<View>

    override fun onStart() {
        super.onStart()

        getPresenter().activate()
    }

    override fun onStop() {
        getPresenter().deactivate()

        super.onStop()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getPresenter().setView(this as View)
    }
}
