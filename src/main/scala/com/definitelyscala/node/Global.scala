package com.definitelyscala.node

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait Global extends js.Object {
  var GLOBAL: Global = js.native
  var Promise: js.Function = js.native
  var Symbol: js.Function = js.native
  var Uint8ClampedArray: js.Function = js.native
  var clearImmediate: js.Function1[js.Any, Unit] = js.native
  var clearInterval: js.Function1[Timer, Unit] = js.native
  var clearTimeout: js.Function1[Timer, Unit] = js.native
  var escape: js.Function1[String, String] = js.native
  var global: Global = js.native
  var process: Process = js.native
  var root: Global = js.native
  var setImmediate: js.Function = js.native
  var setInterval: js.Function = js.native
  var setTimeout: js.Function = js.native
  var unescape: js.Function1[String, String] = js.native
  var gc: js.Function0[Unit] = js.native
  var v8debug: js.Any = js.native
}