package com.definitelyscala.node.stream.internal

import scala.scalajs.js

@js.native
trait ReadableOptions extends js.Object {
  var encoding: String = js.native
  var read: js.Function1[Double, Any] = js.native
}
