package br.com.zup.beagle.android.registrar

import kotlin.Pair
import kotlin.String
import kotlin.collections.List

public final object PropertiesRegistrarf9e596d9c4a940dea71d11b85498b6d0 {
  public fun registeredProperties(): List<Pair<String, String>> {
    val registeredProperties = listOf<Pair<String, String>>(
       	Pair("deepLinkHandler", """br.com.zup.beagle.sample.AppDeepLinkHandler()"""),
    	Pair("httpClientFactory", """br.com.zup.beagle.sample.config.HttpClientFactoryDefault()"""),
    	Pair("designSystem", """br.com.zup.beagle.sample.AppDesignSystem()"""),
    	Pair("logger", """br.com.zup.beagle.sample.config.BeagleLoggerDefault()"""),
    	Pair("config", """br.com.zup.beagle.sample.AppBeagleConfig()"""),

    )
    return registeredProperties
  }
}
