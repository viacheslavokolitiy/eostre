package io.github.eostre.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presenter = MainActivityPresenter()
        presenter.onCreatePresenter(this)
    }

    override fun showSnackbar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
