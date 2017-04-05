package com.definitelyscala.node

import scala.scalajs.js

@js.native
trait ErrnoException extends Error {
  var errno: Double = js.native
  var code: String = js.native
  var path: String = js.native
  var syscall: String = js.native
}
