package com.example.shopper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.view.ServerDrivenActivity
import br.com.zup.beagle.scaffold.BeagleIntent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(BeagleIntent(this).toSample())
//        startActivity(newServerDrivenIntent<ServerDrivenActivity>("https://usebeagle.io/start/welcome"))
    }
}