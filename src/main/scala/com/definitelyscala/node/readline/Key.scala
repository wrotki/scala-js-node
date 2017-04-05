package com.definitelyscala.node.readline

import scala.scalajs.js

@js.native
trait Key extends js.Object {
  var sequence: String = js.native
  var name: String = js.native
  var ctrl: Boolean = js.native
  var meta: Boolean = js.native
  var shift: Boolean = js.native
}