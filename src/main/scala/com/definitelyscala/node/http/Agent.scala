package com.definitelyscala.node.http

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("http.Agent")
class Agent protected () extends js.Object {
  def this(opts: AgentOptions = js.native) = this()
  var maxSockets: Double = js.native
  var sockets: js.Any = js.native
  var requests: js.Any = js.native
  /**
   * Destroy any sockets that are currently in use by the agent.
   * It is usually not necessary to do this. However, if you are using an agent with KeepAlive enabled,
   * then it is best to explicitly shut down the agent when you know that it will no longer be used. Otherwise,
   * sockets may hang open for quite a long time before the server terminates them.
   */
  def destroy(): Unit = js.native
}