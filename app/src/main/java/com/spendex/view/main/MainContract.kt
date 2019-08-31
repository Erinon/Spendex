package com.spendex.view.main

import com.spendex.view.ScopedPresenter

interface MainContract {

    interface View

    interface Presenter : ScopedPresenter<View>
}
