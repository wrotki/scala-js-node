package com.definitelyscala.node.tty

import scala.scalajs.js
@js.native
@js.annotation.JSGlobal("tty")
object Tty extends js.Object {
  // import * as net from "net";
  def isatty(fd: Double): Boolean = js.native
}