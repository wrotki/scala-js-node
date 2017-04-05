package com.definitelyscala.node.http

import scala.scalajs.js
import com.definitelyscala.node.net
import com.definitelyscala.node.net

@js.native
trait Server extends net.Server {
  def setTimeout(msecs: Double, callback: js.Function): Unit = js.native
  var maxHeadersCount: Double = js.native
  var timeout: Double = js.native
  var listening: Boolean = js.native
}