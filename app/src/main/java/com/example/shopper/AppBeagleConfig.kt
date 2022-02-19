package com.example.shopper

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.BeagleConfig
import br.com.zup.beagle.android.setup.Cache
import br.com.zup.beagle.android.setup.Environment

@BeagleComponent
class AppBeagleConfig(
    override val baseUrl: String = "",
    override val cache: Cache = Cache(false, 0, 0),
    override val environment: Environment = Environment.DEBUG,
    override val isLoggingEnabled: Boolean = true
) : BeagleConfig