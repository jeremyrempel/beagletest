@file:Suppress("OverridingDeprecatedMember", "DEPRECATION", "UNCHECKED_CAST", "UNUSED_EXPRESSION")

package br.com.zup.beagle.sample

import br.com.zup.beagle.android.operation.Operation
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Map

public final object RegisteredOperations {
  public fun registeredOperations(): Map<String, Operation> {
    val operations = mapOf<String, Operation>(
       	"isValidCpf" to br.com.zup.beagle.sample.operations.IsValidCPFOperation(), 

    )
    return operations
  }
}
