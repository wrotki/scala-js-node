package com.definitelyscala.node._debugger

import scala.scalajs.js

@js.native
trait Response extends Message {
  var request_seq: Double = js.native
  var success: Boolean = js.native
  /** Contains error message if success === false. */
  var message: String = js.native
  /** Contains message body if success === true. */
  var body: js.Any = js.native
}