package com.definitelyscala.node.http

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait AgentOptions extends js.Object {
  /**
   * Keep sockets around in a pool to be used by other requests in the future. Default = false
   */
  var keepAlive: Boolean = js.native
  /**
   * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
   * Only relevant if keepAlive is set to true.
   */
  var keepAliveMsecs: Double = js.native
  /**
   * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
   */
  var maxSockets: Double = js.native
  /**
   * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
   */
  var maxFreeSockets: Double = js.native
}