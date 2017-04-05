package com.definitelyscala.node.dgram

import scala.scalajs.js

@js.native
trait SocketOptions extends js.Object {
  var `type`: String = js.native
  var reuseAddr: Boolean = js.native
}