package com.definitelyscala.node.stream.internal

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import scala.scalajs.js.|

@js.native
trait WritableOptions extends js.Object {
  var highWaterMark: Double = js.native
  var decodeStrings: Boolean = js.native
  var objectMode: Boolean = js.native
  var write: js.Function3[String | Buffer, String, js.Function, Any] = js.native
  var writev: js.Function2[js.Array[js.Any], js.Function, Any] = js.native
}