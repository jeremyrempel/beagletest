package com.example.shopper

import android.app.Application
import br.com.zup.beagle.scaffold.BeagleScaffold

class ShopperApp : Application() {

    override fun onCreate() {
        super.onCreate()

        BeagleScaffold(BeagleSetup()).init(this)
    }
}