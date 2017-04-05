package com.definitelyscala.node.v8

import scala.scalajs.js

@js.native
trait HeapSpaceInfo extends js.Object {
  var space_name: String = js.native
  var space_size: Double = js.native
  var space_used_size: Double = js.native
  var space_available_size: Double = js.native
  var physical_space_size: Double = js.native
}