package com.definitelyscala.node.readline

import scala.scalajs.js
import com.definitelyscala.node.{ReadableStream, WritableStream}

@js.native
trait ReadLineOptions extends js.Object {
  var input: ReadableStream = js.native
  var output: WritableStream = js.native
  var completer: Completer = js.native
  var terminal: Boolean = js.native
  var historySize: Double = js.native
}
