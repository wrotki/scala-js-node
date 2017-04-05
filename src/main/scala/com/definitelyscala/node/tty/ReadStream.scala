package com.definitelyscala.node.tty

import scala.scalajs.js
import com.definitelyscala.node.net
import com.definitelyscala.node.net

@js.native
trait ReadStream extends net.Socket {
  var isRaw: Boolean = js.native
  def setRawMode(mode: Boolean): Unit = js.native
}
