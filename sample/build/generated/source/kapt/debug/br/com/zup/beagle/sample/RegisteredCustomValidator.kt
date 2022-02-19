@file:Suppress("OverridingDeprecatedMember", "DEPRECATION", "UNCHECKED_CAST", "UNUSED_EXPRESSION")

package br.com.zup.beagle.sample

import br.com.zup.beagle.android.components.form.core.Validator
import br.com.zup.beagle.android.components.form.core.ValidatorHandler
import kotlin.Any
import kotlin.String
import kotlin.Suppress

public final object RegisteredCustomValidator : ValidatorHandler {
  public override fun getValidator(name: String): Validator<Any, Any>? = when(name) {
     
     else -> null
  }

}
