package com.definitelyscala.node.dgram

import scala.scalajs.js

@js.native
trait BindOptions extends js.Object {
  var port: Double = js.native
  var address: String = js.native
  var exclusive: Boolean = js.native
}