package com.definitelyscala.node.util

import scala.scalajs.js

@js.native
trait InspectOptions extends js.Object {
  var showHidden: Boolean = js.native
  var depth: Double = js.native
  var colors: Boolean = js.native
  var customInspect: Boolean = js.native
}