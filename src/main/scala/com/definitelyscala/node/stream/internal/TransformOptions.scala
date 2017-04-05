package com.definitelyscala.node.stream.internal

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import scala.scalajs.js.|

@js.native
trait TransformOptions extends DuplexOptions {
  var transform: js.Function3[String | Buffer, String, js.Function, Any] = js.native
  var flush: js.Function1[js.Function, Any] = js.native
}