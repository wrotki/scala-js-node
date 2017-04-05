package com.definitelyscala.node.dgram

import scala.scalajs.js

@js.native
trait RemoteInfo extends js.Object {
  var address: String = js.native
  var family: String = js.native
  var port: Double = js.native
}