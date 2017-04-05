package com.definitelyscala.node.tls

import scala.scalajs.js
import com.definitelyscala.node.stream.{internal => stream}

@js.native
trait ClearTextStream extends stream.Duplex {
  var authorized: Boolean = js.native
  var authorizationError: Error = js.native
  def getPeerCertificate(): js.Dynamic = js.native
  var getCipher: js.Any = js.native
  var address: js.Any = js.native
  var remoteAddress: String = js.native
  var remotePort: Double = js.native
}