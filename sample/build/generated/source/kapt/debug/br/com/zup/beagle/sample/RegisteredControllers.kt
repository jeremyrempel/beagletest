@file:Suppress("UNCHECKED_CAST")

package br.com.zup.beagle.sample

import br.com.zup.beagle.android.navigation.BeagleControllerReference
import br.com.zup.beagle.android.view.BeagleActivity
import java.lang.Class
import kotlin.String
import kotlin.Suppress

public final class RegisteredControllers : BeagleControllerReference {
  public override fun classFor(id: String?): Class<BeagleActivity> =
      br.com.zup.beagle.android.view.ServerDrivenActivity::class.java as Class<BeagleActivity>
}
