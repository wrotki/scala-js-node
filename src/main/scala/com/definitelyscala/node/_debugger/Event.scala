package com.definitelyscala.node._debugger

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait Event extends Message {
  var event: String = js.native
  var body: js.Any = js.native
}