package com.definitelyscala.node.tls

import scala.scalajs.js
import com.definitelyscala.node.net
import com.definitelyscala.node.events.{internal => events}
import com.definitelyscala.node.net

@js.native
trait Server extends net.Server {
  def addContext(hostName: String, credentials: js.Any): Unit = js.native
  /**
   * events.EventEmitter
   * 1. tlsClientError
   * 2. newSession
   * 3. OCSPRequest
   * 4. resumeSession
   * 5. secureConnection
   */
}
