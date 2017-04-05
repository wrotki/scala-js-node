package com.definitelyscala.node.repl

import scala.scalajs.js
import com.definitelyscala.node.{ReadableStream, WritableStream}

@js.native
trait ReplOptions extends js.Object {
  var prompt: String = js.native
  var input: ReadableStream = js.native
  var output: WritableStream = js.native
  var terminal: Boolean = js.native
  var eval: js.Function = js.native
  var useColors: Boolean = js.native
  var useGlobal: Boolean = js.native
  var ignoreUndefined: Boolean = js.native
  var writer: js.Function = js.native
  var completer: js.Function = js.native
  var replMode: js.Any = js.native
  var breakEvalOnSigint: js.Any = js.native
}
