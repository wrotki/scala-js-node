package com.definitelyscala.node.tls

import scala.scalajs.js

@js.native
trait CipherNameAndProtocol extends js.Object {
  /**
   * The cipher name.
   */
  var name: String = js.native
  /**
   * SSL/TLS protocol version.
   */
  var version: String = js.native
}