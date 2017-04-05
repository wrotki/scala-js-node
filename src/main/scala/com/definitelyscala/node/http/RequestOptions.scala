package com.definitelyscala.node.http

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait RequestOptions extends js.Object {
  var protocol: String = js.native
  var host: String = js.native
  var hostname: String = js.native
  var family: Double = js.native
  var port: Double = js.native
  var localAddress: String = js.native
  var socketPath: String = js.native
  var method: String = js.native
  var path: String = js.native
  var headers: js.Dictionary[js.Any] = js.native
  var auth: String = js.native
  var agent: Agent | Boolean = js.native
  var timeout: Double = js.native
}