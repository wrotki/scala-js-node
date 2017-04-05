package com.definitelyscala.node.child_process

import scala.scalajs.js

@js.native
trait ExecOptionsWithBufferEncoding extends ExecOptions {
  var encoding: String = js.native
}
