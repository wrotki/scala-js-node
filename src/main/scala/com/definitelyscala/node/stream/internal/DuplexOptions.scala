package com.definitelyscala.node.stream.internal

import scala.scalajs.js

@js.native
trait DuplexOptions extends ReadableOptions with WritableOptions {
  var allowHalfOpen: Boolean = js.native
  var readableObjectMode: Boolean = js.native
  var writableObjectMode: Boolean = js.native
}