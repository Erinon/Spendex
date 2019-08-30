package com.spendex.view

interface ScopedPresenter<View> {

    fun setView(view: View)

    fun activate()

    fun deactivate()
}
