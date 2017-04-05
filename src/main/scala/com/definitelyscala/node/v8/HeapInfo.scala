package com.definitelyscala.node.v8

import scala.scalajs.js
import com.definitelyscala.node.v8.V8.DoesZapCodeSpaceFlag

@js.native
trait HeapInfo extends js.Object {
  var total_heap_size: Double = js.native
  var total_heap_size_executable: Double = js.native
  var total_physical_size: Double = js.native
  var total_available_size: Double = js.native
  var used_heap_size: Double = js.native
  var heap_size_limit: Double = js.native
  var malloced_memory: Double = js.native
  var peak_malloced_memory: Double = js.native
  var does_zap_garbage: DoesZapCodeSpaceFlag = js.native
}