package com.definitelyscala.node.child_process

import scala.scalajs.js
import com.definitelyscala.node.Node.BufferEncoding

@js.native
trait ExecOptionsWithStringEncoding extends ExecOptions {
  var encoding: BufferEncoding = js.native
}
