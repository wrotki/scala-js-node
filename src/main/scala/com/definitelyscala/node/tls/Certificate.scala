package com.definitelyscala.node.tls

import scala.scalajs.js

@js.native
trait Certificate extends js.Object {
  /**
   * Country code.
   */
  var C: String = js.native
  /**
   * Street.
   */
  var ST: String = js.native
  /**
   * Locality.
   */
  var L: String = js.native
  /**
   * Organization.
   */
  var O: String = js.native
  /**
   * Organizational unit.
   */
  var OU: String = js.native
  /**
   * Common name.
   */
  var CN: String = js.native
}