@file:Suppress("OverridingDeprecatedMember", "DEPRECATION", "UNCHECKED_CAST", "UNUSED_EXPRESSION")

package br.com.zup.beagle.sample

import br.com.zup.beagle.android.widget.WidgetView
import java.lang.Class
import kotlin.Suppress
import kotlin.collections.List

public final object RegisteredWidgets {
  public fun registeredWidgets(): List<Class<WidgetView>> {
    val registeredWidgets = listOf<Class<WidgetView>>(
       	br.com.zup.beagle.sample.widgets.Text::class.java as Class<WidgetView>,
    	br.com.zup.beagle.sample.widgets.Input::class.java as Class<WidgetView>,
    	br.com.zup.beagle.sample.widgets.MutableText::class.java as Class<WidgetView>,

    )
    return registeredWidgets
  }
}
