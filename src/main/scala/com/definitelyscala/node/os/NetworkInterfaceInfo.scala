package com.definitelyscala.node.os

import scala.scalajs.js

@js.native
trait NetworkInterfaceInfo extends js.Object {
  var address: String = js.native
  var netmask: String = js.native
  var family: String = js.native
  var mac: String = js.native
  var internal: Boolean = js.native
}