package com.definitelyscala.node.https

import scala.scalajs.js
import com.definitelyscala.node.http

@js.native
@js.annotation.JSGlobal("https.Agent")
class Agent protected () extends http.Agent {
  def this(options: AgentOptions = js.native) = this()
}