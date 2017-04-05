package com.definitelyscala.node.net

import scala.scalajs.js

@js.native
trait ListenOptions extends js.Object {
  var port: Double = js.native
  var host: String = js.native
  var backlog: Double = js.native
  var path: String = js.native
  var exclusive: Boolean = js.native
}