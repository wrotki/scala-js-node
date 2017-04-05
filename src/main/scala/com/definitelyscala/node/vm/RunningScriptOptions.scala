package com.definitelyscala.node.vm

import scala.scalajs.js

@js.native
trait RunningScriptOptions extends js.Object {
  var filename: String = js.native
  var lineOffset: Double = js.native
  var columnOffset: Double = js.native
  var displayErrors: Boolean = js.native
  var timeout: Double = js.native
}