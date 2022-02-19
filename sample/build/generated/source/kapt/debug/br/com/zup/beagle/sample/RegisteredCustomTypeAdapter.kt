@file:Suppress("OverridingDeprecatedMember", "DEPRECATION", "UNCHECKED_CAST", "UNUSED_EXPRESSION")

package br.com.zup.beagle.sample

import br.com.zup.beagle.android.`data`.serializer.adapter.generic.BeagleTypeAdapter
import br.com.zup.beagle.android.`data`.serializer.adapter.generic.ParameterizedTypeFactory
import br.com.zup.beagle.android.`data`.serializer.adapter.generic.TypeAdapterResolver
import java.lang.reflect.Type
import kotlin.Suppress

public final object RegisteredCustomTypeAdapter : TypeAdapterResolver {
  public override fun <T> getAdapter(type: Type): BeagleTypeAdapter<T>? = when(type) {
     
     else -> null
  }

}
