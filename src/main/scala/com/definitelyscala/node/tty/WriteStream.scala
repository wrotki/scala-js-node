package com.definitelyscala.node.tty

import scala.scalajs.js
import com.definitelyscala.node.net
import com.definitelyscala.node.net

@js.native
trait WriteStream extends net.Socket {
  var columns: Double = js.native
  var rows: Double = js.native
}
